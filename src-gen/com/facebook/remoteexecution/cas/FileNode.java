/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.cas;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class FileNode implements TBase, java.io.Serializable, Cloneable, Comparable<FileNode> {
  private static final TStruct STRUCT_DESC = new TStruct("FileNode");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField DIGEST_FIELD_DESC = new TField("digest", TType.STRUCT, (short)2);
  private static final TField IS_EXECUTABLE_FIELD_DESC = new TField("is_executable", TType.BOOL, (short)3);

  public String name;
  public Digest digest;
  public boolean is_executable;
  public static final int NAME = 1;
  public static final int DIGEST = 2;
  public static final int IS_EXECUTABLE = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __IS_EXECUTABLE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(DIGEST, new FieldMetaData("digest", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Digest.class)));
    tmpMetaDataMap.put(IS_EXECUTABLE, new FieldMetaData("is_executable", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(FileNode.class, metaDataMap);
  }

  public FileNode() {
  }

  public FileNode(
    String name,
    Digest digest,
    boolean is_executable)
  {
    this();
    this.name = name;
    this.digest = digest;
    this.is_executable = is_executable;
    setIs_executableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileNode(FileNode other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    if (other.isSetDigest()) {
      this.digest = TBaseHelper.deepCopy(other.digest);
    }
    this.is_executable = TBaseHelper.deepCopy(other.is_executable);
  }

  public FileNode deepCopy() {
    return new FileNode(this);
  }

  @Deprecated
  public FileNode clone() {
    return new FileNode(this);
  }

  public String  getName() {
    return this.name;
  }

  public FileNode setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public Digest  getDigest() {
    return this.digest;
  }

  public FileNode setDigest(Digest digest) {
    this.digest = digest;
    return this;
  }

  public void unsetDigest() {
    this.digest = null;
  }

  // Returns true if field digest is set (has been assigned a value) and false otherwise
  public boolean isSetDigest() {
    return this.digest != null;
  }

  public void setDigestIsSet(boolean value) {
    if (!value) {
      this.digest = null;
    }
  }

  public boolean  isIs_executable() {
    return this.is_executable;
  }

  public FileNode setIs_executable(boolean is_executable) {
    this.is_executable = is_executable;
    setIs_executableIsSet(true);
    return this;
  }

  public void unsetIs_executable() {
    __isset_bit_vector.clear(__IS_EXECUTABLE_ISSET_ID);
  }

  // Returns true if field is_executable is set (has been assigned a value) and false otherwise
  public boolean isSetIs_executable() {
    return __isset_bit_vector.get(__IS_EXECUTABLE_ISSET_ID);
  }

  public void setIs_executableIsSet(boolean value) {
    __isset_bit_vector.set(__IS_EXECUTABLE_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DIGEST:
      if (value == null) {
        unsetDigest();
      } else {
        setDigest((Digest)value);
      }
      break;

    case IS_EXECUTABLE:
      if (value == null) {
        unsetIs_executable();
      } else {
        setIs_executable((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case DIGEST:
      return getDigest();

    case IS_EXECUTABLE:
      return new Boolean(isIs_executable());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAME:
      return isSetName();
    case DIGEST:
      return isSetDigest();
    case IS_EXECUTABLE:
      return isSetIs_executable();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileNode)
      return this.equals((FileNode)that);
    return false;
  }

  public boolean equals(FileNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!TBaseHelper.equalsNobinary(this.name, that.name))
        return false;
    }

    boolean this_present_digest = true && this.isSetDigest();
    boolean that_present_digest = true && that.isSetDigest();
    if (this_present_digest || that_present_digest) {
      if (!(this_present_digest && that_present_digest))
        return false;
      if (!TBaseHelper.equalsNobinary(this.digest, that.digest))
        return false;
    }

    boolean this_present_is_executable = true;
    boolean that_present_is_executable = true;
    if (this_present_is_executable || that_present_is_executable) {
      if (!(this_present_is_executable && that_present_is_executable))
        return false;
      if (!TBaseHelper.equalsNobinary(this.is_executable, that.is_executable))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FileNode other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, other.name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDigest()).compareTo(other.isSetDigest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(digest, other.digest);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIs_executable()).compareTo(other.isSetIs_executable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(is_executable, other.is_executable);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DIGEST:
          if (field.type == TType.STRUCT) {
            this.digest = new Digest();
            this.digest.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case IS_EXECUTABLE:
          if (field.type == TType.BOOL) {
            this.is_executable = iprot.readBool();
            setIs_executableIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.digest != null) {
      oprot.writeFieldBegin(DIGEST_FIELD_DESC);
      this.digest.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_EXECUTABLE_FIELD_DESC);
    oprot.writeBool(this.is_executable);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("FileNode");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getName() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getName(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("digest");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getDigest() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getDigest(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("is_executable");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isIs_executable(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

