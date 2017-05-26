/*
 * Copyright 2013-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.dalvik;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/** Tool to get stats about dalvik classes. */
public class DalvikStatsTool {

  /** Utility class: do not instantiate */
  private DalvikStatsTool() {}

  // Reasonable defaults based on dreiss's observations.
  private static final ImmutableMap<Pattern, Integer> PENALTIES =
      ImmutableMap.<Pattern, Integer>builder()
          .put(Pattern.compile("Layout$"), 1500)
          .put(Pattern.compile("View$"), 1500)
          .put(Pattern.compile("ViewGroup$"), 1800)
          .put(Pattern.compile("Activity$"), 1100)
          .build();

  // DX translates MULTIANEWARRAY into a method call that matches this (owner,name,desc)
  private static final String MULTIARRAY_OWNER = Type.getType(Array.class).getInternalName();
  private static final String MULTIARRAY_NAME = "newInstance";
  private static final String MULTIARRAY_DESC =
      Type.getMethodType(
              Type.getType(Object.class),
              Type.getType(Class.class),
              Type.getType("[" + Type.INT_TYPE.getDescriptor()))
          .getDescriptor();

  /** Stats about a java class. */
  public static class Stats {

    public static final Stats ZERO = new Stats(0, ImmutableSet.of(), ImmutableSet.of());

    /** Estimated bytes the class will contribute to Dalvik linear alloc. */
    public final int estimatedLinearAllocSize;

    /** Methods referenced by the class. */
    public final ImmutableSet<DalvikMemberReference> methodReferences;

    /** Fields referenced by the class. */
    public final ImmutableSet<DalvikMemberReference> fieldReferences;

    public Stats(
        int estimatedLinearAllocSize,
        Set<DalvikMemberReference> methodReferences,
        Set<DalvikMemberReference> fieldReferences) {
      this.estimatedLinearAllocSize = estimatedLinearAllocSize;
      this.methodReferences = ImmutableSet.copyOf(methodReferences);
      this.fieldReferences = ImmutableSet.copyOf(fieldReferences);
    }
  }

  /** CLI wrapper to run against every class in a set of JARs. */
  public static void main(String[] args) throws IOException {
    ImmutableSet.Builder<DalvikMemberReference> allFields = ImmutableSet.builder();

    for (String fname : args) {
      try (ZipFile inJar = new ZipFile(fname)) {
        for (ZipEntry entry : Collections.list(inJar.entries())) {
          if (!entry.getName().endsWith(".class")) {
            continue;
          }
          InputStream rawClass = inJar.getInputStream(entry);
          Stats stats = getEstimate(rawClass);
          System.out.println(
              stats.estimatedLinearAllocSize + "\t" + entry.getName().replace(".class", ""));
          allFields.addAll(stats.fieldReferences);
        }
      }
    }

    // Uncomment to debug fields.
    //    System.out.println();
    //
    //    for (DalvikMemberReference field : allFields.build()) {
    //      System.out.println(field);
    //    }
  }

  /**
   * Estimates the footprint that a given class will have in the LinearAlloc buffer of Android's
   * Dalvik VM.
   *
   * @param rawClass Raw bytes of the Java class to analyze.
   * @return the estimate
   */
  public static Stats getEstimate(InputStream rawClass) throws IOException {
    ClassReader classReader = new ClassReader(rawClass);
    return getEstimateInternal(classReader);
  }

  /**
   * Estimates the footprint that a given class will have in the LinearAlloc buffer of Android's
   * Dalvik VM.
   *
   * @param classReader reader containing the Java class to analyze.
   * @return the estimate
   */
  @VisibleForTesting
  static Stats getEstimateInternal(ClassReader classReader) {
    // SKIP_FRAMES was required to avoid an exception in ClassReader when running on proguard
    // output. We don't need to visit frames so this isn't an issue.
    StatsClassVisitor statsVisitor = new StatsClassVisitor(PENALTIES);
    classReader.accept(statsVisitor, ClassReader.SKIP_FRAMES);
    return new Stats(
        statsVisitor.footprint,
        statsVisitor.methodReferenceBuilder.build(),
        statsVisitor.fieldReferenceBuilder.build());
  }

  private static class StatsClassVisitor extends ClassVisitor {

    private final ImmutableMap<Pattern, Integer> penalties;
    private final MethodVisitor methodVisitor = new StatsMethodVisitor();
    private int footprint;
    private boolean isInterface;
    private ImmutableSet.Builder<DalvikMemberReference> methodReferenceBuilder;
    private ImmutableSet.Builder<DalvikMemberReference> fieldReferenceBuilder;

    @Nullable private String className;

    private StatsClassVisitor(Map<Pattern, Integer> penalties) {
      super(Opcodes.ASM5);
      this.penalties = ImmutableMap.copyOf(penalties);
      this.methodReferenceBuilder = ImmutableSet.builder();
      this.fieldReferenceBuilder = ImmutableSet.builder();
    }

    @Override
    public void visit(
        int version,
        int access,
        String name,
        String signature,
        String superName,
        String[] interfaces) {

      this.className = name;
      if ((access & (Opcodes.ACC_INTERFACE)) != 0) {
        // Interfaces don't have vtables.
        // This might undercount annotations, but they are mostly small.
        isInterface = true;
      } else {
        // Some parent classes have big vtable footprints.  We try to estimate the parent vtable
        // size based on the name of the class and parent class.  This seems to work reasonably
        // well in practice because the heaviest vtables are View and Activity, and many of those
        // classes have clear names and cannot be obfuscated.
        // Non-interfaces inherit the java.lang.Object vtable, which is 48 bytes.
        int vtablePenalty = 48;

        String[] names = new String[] {name, superName};
        for (Map.Entry<Pattern, Integer> entry : penalties.entrySet()) {
          for (String cls : names) {
            if (entry.getKey().matcher(cls).find()) {
              vtablePenalty = Math.max(vtablePenalty, entry.getValue());
            }
          }
        }
        footprint += vtablePenalty;
      }
    }

    @Override
    @Nullable
    public FieldVisitor visitField(
        int access, String name, String desc, String signature, Object value) {
      // For non-static fields, Field objects are 16 bytes.
      if ((access & Opcodes.ACC_STATIC) == 0) {
        footprint += 16;
      }

      Preconditions.checkNotNull(className, "Must not call visitField before visit");
      fieldReferenceBuilder.add(DalvikMemberReference.of(className, name, desc));

      return null;
    }

    @Override
    @Nullable
    public MethodVisitor visitMethod(
        int access, String name, String desc, String signature, String[] exceptions) {
      // Method objects are 52 bytes.
      footprint += 52;

      // For non-interfaces, each virtual method adds another 4 bytes to the vtable.
      if (!isInterface) {
        boolean isDirect =
            ((access & (Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC)) != 0) || name.equals("<init>");
        if (!isDirect) {
          footprint += 4;
        }
      }
      Preconditions.checkNotNull(className, "Must not call visitMethod before visit");
      methodReferenceBuilder.add(DalvikMemberReference.of(className, name, desc));
      return methodVisitor;
    }

    @Override
    public void visitOuterClass(String owner, String name, String desc) {
      super.visitOuterClass(owner, name, desc);
      if (name != null) {
        Preconditions.checkNotNull(className, "Must not call visitOuterClass before visit");
        methodReferenceBuilder.add(DalvikMemberReference.of(className, name, desc));
      }
    }

    private class StatsMethodVisitor extends MethodVisitor {
      @Override
      public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        super.visitFieldInsn(opcode, owner, name, desc);
        fieldReferenceBuilder.add(DalvikMemberReference.of(owner, name, desc));
      }

      public StatsMethodVisitor() {
        super(Opcodes.ASM5);
      }

      @Override
      public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.visitMethodInsn(opcode, owner, name, desc, itf);
        methodReferenceBuilder.add(DalvikMemberReference.of(owner, name, desc));
      }

      @Override
      public void visitMultiANewArrayInsn(String desc, int dims) {
        // dx translates this instruction into a method invocation on
        // Array.newInstance(Class clazz, int...dims);
        methodReferenceBuilder.add(
            DalvikMemberReference.of(MULTIARRAY_OWNER, MULTIARRAY_NAME, MULTIARRAY_DESC));
      }
    }
  }
}
