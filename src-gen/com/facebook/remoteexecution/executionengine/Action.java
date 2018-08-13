/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class Action implements org.apache.thrift.TBase<Action, Action._Fields>, java.io.Serializable, Cloneable, Comparable<Action> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Action");

  private static final org.apache.thrift.protocol.TField COMMAND_DIGEST_FIELD_DESC = new org.apache.thrift.protocol.TField("command_digest", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INPUT_ROOT_DIGEST_FIELD_DESC = new org.apache.thrift.protocol.TField("input_root_digest", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OUTPUT_FILES_FIELD_DESC = new org.apache.thrift.protocol.TField("output_files", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField OUTPUT_DIRECTORIES_FIELD_DESC = new org.apache.thrift.protocol.TField("output_directories", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField REQUIREMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("requirements", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField TIMEOUT_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout_secs", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField DO_NOT_CACHE_FIELD_DESC = new org.apache.thrift.protocol.TField("do_not_cache", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ActionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ActionTupleSchemeFactory();

  public com.facebook.remoteexecution.cas.Digest command_digest; // required
  public com.facebook.remoteexecution.cas.Digest input_root_digest; // optional
  public java.util.List<java.lang.String> output_files; // required
  public java.util.List<java.lang.String> output_directories; // required
  public Requirements requirements; // required
  public long timeout_secs; // required
  public boolean do_not_cache; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMAND_DIGEST((short)1, "command_digest"),
    INPUT_ROOT_DIGEST((short)2, "input_root_digest"),
    OUTPUT_FILES((short)3, "output_files"),
    OUTPUT_DIRECTORIES((short)4, "output_directories"),
    REQUIREMENTS((short)5, "requirements"),
    TIMEOUT_SECS((short)6, "timeout_secs"),
    DO_NOT_CACHE((short)7, "do_not_cache");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMMAND_DIGEST
          return COMMAND_DIGEST;
        case 2: // INPUT_ROOT_DIGEST
          return INPUT_ROOT_DIGEST;
        case 3: // OUTPUT_FILES
          return OUTPUT_FILES;
        case 4: // OUTPUT_DIRECTORIES
          return OUTPUT_DIRECTORIES;
        case 5: // REQUIREMENTS
          return REQUIREMENTS;
        case 6: // TIMEOUT_SECS
          return TIMEOUT_SECS;
        case 7: // DO_NOT_CACHE
          return DO_NOT_CACHE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMEOUT_SECS_ISSET_ID = 0;
  private static final int __DO_NOT_CACHE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INPUT_ROOT_DIGEST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMAND_DIGEST, new org.apache.thrift.meta_data.FieldMetaData("command_digest", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    tmpMap.put(_Fields.INPUT_ROOT_DIGEST, new org.apache.thrift.meta_data.FieldMetaData("input_root_digest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    tmpMap.put(_Fields.OUTPUT_FILES, new org.apache.thrift.meta_data.FieldMetaData("output_files", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OUTPUT_DIRECTORIES, new org.apache.thrift.meta_data.FieldMetaData("output_directories", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.REQUIREMENTS, new org.apache.thrift.meta_data.FieldMetaData("requirements", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Requirements.class)));
    tmpMap.put(_Fields.TIMEOUT_SECS, new org.apache.thrift.meta_data.FieldMetaData("timeout_secs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DO_NOT_CACHE, new org.apache.thrift.meta_data.FieldMetaData("do_not_cache", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Action.class, metaDataMap);
  }

  public Action() {
  }

  public Action(
    com.facebook.remoteexecution.cas.Digest command_digest,
    java.util.List<java.lang.String> output_files,
    java.util.List<java.lang.String> output_directories,
    Requirements requirements,
    long timeout_secs,
    boolean do_not_cache)
  {
    this();
    this.command_digest = command_digest;
    this.output_files = output_files;
    this.output_directories = output_directories;
    this.requirements = requirements;
    this.timeout_secs = timeout_secs;
    setTimeout_secsIsSet(true);
    this.do_not_cache = do_not_cache;
    setDo_not_cacheIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Action(Action other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCommand_digest()) {
      this.command_digest = new com.facebook.remoteexecution.cas.Digest(other.command_digest);
    }
    if (other.isSetInput_root_digest()) {
      this.input_root_digest = new com.facebook.remoteexecution.cas.Digest(other.input_root_digest);
    }
    if (other.isSetOutput_files()) {
      java.util.List<java.lang.String> __this__output_files = new java.util.ArrayList<java.lang.String>(other.output_files);
      this.output_files = __this__output_files;
    }
    if (other.isSetOutput_directories()) {
      java.util.List<java.lang.String> __this__output_directories = new java.util.ArrayList<java.lang.String>(other.output_directories);
      this.output_directories = __this__output_directories;
    }
    if (other.isSetRequirements()) {
      this.requirements = new Requirements(other.requirements);
    }
    this.timeout_secs = other.timeout_secs;
    this.do_not_cache = other.do_not_cache;
  }

  public Action deepCopy() {
    return new Action(this);
  }

  @Override
  public void clear() {
    this.command_digest = null;
    this.input_root_digest = null;
    this.output_files = null;
    this.output_directories = null;
    this.requirements = null;
    setTimeout_secsIsSet(false);
    this.timeout_secs = 0;
    setDo_not_cacheIsSet(false);
    this.do_not_cache = false;
  }

  public com.facebook.remoteexecution.cas.Digest getCommand_digest() {
    return this.command_digest;
  }

  public Action setCommand_digest(com.facebook.remoteexecution.cas.Digest command_digest) {
    this.command_digest = command_digest;
    return this;
  }

  public void unsetCommand_digest() {
    this.command_digest = null;
  }

  /** Returns true if field command_digest is set (has been assigned a value) and false otherwise */
  public boolean isSetCommand_digest() {
    return this.command_digest != null;
  }

  public void setCommand_digestIsSet(boolean value) {
    if (!value) {
      this.command_digest = null;
    }
  }

  public com.facebook.remoteexecution.cas.Digest getInput_root_digest() {
    return this.input_root_digest;
  }

  public Action setInput_root_digest(com.facebook.remoteexecution.cas.Digest input_root_digest) {
    this.input_root_digest = input_root_digest;
    return this;
  }

  public void unsetInput_root_digest() {
    this.input_root_digest = null;
  }

  /** Returns true if field input_root_digest is set (has been assigned a value) and false otherwise */
  public boolean isSetInput_root_digest() {
    return this.input_root_digest != null;
  }

  public void setInput_root_digestIsSet(boolean value) {
    if (!value) {
      this.input_root_digest = null;
    }
  }

  public int getOutput_filesSize() {
    return (this.output_files == null) ? 0 : this.output_files.size();
  }

  public java.util.Iterator<java.lang.String> getOutput_filesIterator() {
    return (this.output_files == null) ? null : this.output_files.iterator();
  }

  public void addToOutput_files(java.lang.String elem) {
    if (this.output_files == null) {
      this.output_files = new java.util.ArrayList<java.lang.String>();
    }
    this.output_files.add(elem);
  }

  public java.util.List<java.lang.String> getOutput_files() {
    return this.output_files;
  }

  public Action setOutput_files(java.util.List<java.lang.String> output_files) {
    this.output_files = output_files;
    return this;
  }

  public void unsetOutput_files() {
    this.output_files = null;
  }

  /** Returns true if field output_files is set (has been assigned a value) and false otherwise */
  public boolean isSetOutput_files() {
    return this.output_files != null;
  }

  public void setOutput_filesIsSet(boolean value) {
    if (!value) {
      this.output_files = null;
    }
  }

  public int getOutput_directoriesSize() {
    return (this.output_directories == null) ? 0 : this.output_directories.size();
  }

  public java.util.Iterator<java.lang.String> getOutput_directoriesIterator() {
    return (this.output_directories == null) ? null : this.output_directories.iterator();
  }

  public void addToOutput_directories(java.lang.String elem) {
    if (this.output_directories == null) {
      this.output_directories = new java.util.ArrayList<java.lang.String>();
    }
    this.output_directories.add(elem);
  }

  public java.util.List<java.lang.String> getOutput_directories() {
    return this.output_directories;
  }

  public Action setOutput_directories(java.util.List<java.lang.String> output_directories) {
    this.output_directories = output_directories;
    return this;
  }

  public void unsetOutput_directories() {
    this.output_directories = null;
  }

  /** Returns true if field output_directories is set (has been assigned a value) and false otherwise */
  public boolean isSetOutput_directories() {
    return this.output_directories != null;
  }

  public void setOutput_directoriesIsSet(boolean value) {
    if (!value) {
      this.output_directories = null;
    }
  }

  public Requirements getRequirements() {
    return this.requirements;
  }

  public Action setRequirements(Requirements requirements) {
    this.requirements = requirements;
    return this;
  }

  public void unsetRequirements() {
    this.requirements = null;
  }

  /** Returns true if field requirements is set (has been assigned a value) and false otherwise */
  public boolean isSetRequirements() {
    return this.requirements != null;
  }

  public void setRequirementsIsSet(boolean value) {
    if (!value) {
      this.requirements = null;
    }
  }

  public long getTimeout_secs() {
    return this.timeout_secs;
  }

  public Action setTimeout_secs(long timeout_secs) {
    this.timeout_secs = timeout_secs;
    setTimeout_secsIsSet(true);
    return this;
  }

  public void unsetTimeout_secs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMEOUT_SECS_ISSET_ID);
  }

  /** Returns true if field timeout_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout_secs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMEOUT_SECS_ISSET_ID);
  }

  public void setTimeout_secsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMEOUT_SECS_ISSET_ID, value);
  }

  public boolean isDo_not_cache() {
    return this.do_not_cache;
  }

  public Action setDo_not_cache(boolean do_not_cache) {
    this.do_not_cache = do_not_cache;
    setDo_not_cacheIsSet(true);
    return this;
  }

  public void unsetDo_not_cache() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DO_NOT_CACHE_ISSET_ID);
  }

  /** Returns true if field do_not_cache is set (has been assigned a value) and false otherwise */
  public boolean isSetDo_not_cache() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DO_NOT_CACHE_ISSET_ID);
  }

  public void setDo_not_cacheIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DO_NOT_CACHE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case COMMAND_DIGEST:
      if (value == null) {
        unsetCommand_digest();
      } else {
        setCommand_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    case INPUT_ROOT_DIGEST:
      if (value == null) {
        unsetInput_root_digest();
      } else {
        setInput_root_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    case OUTPUT_FILES:
      if (value == null) {
        unsetOutput_files();
      } else {
        setOutput_files((java.util.List<java.lang.String>)value);
      }
      break;

    case OUTPUT_DIRECTORIES:
      if (value == null) {
        unsetOutput_directories();
      } else {
        setOutput_directories((java.util.List<java.lang.String>)value);
      }
      break;

    case REQUIREMENTS:
      if (value == null) {
        unsetRequirements();
      } else {
        setRequirements((Requirements)value);
      }
      break;

    case TIMEOUT_SECS:
      if (value == null) {
        unsetTimeout_secs();
      } else {
        setTimeout_secs((java.lang.Long)value);
      }
      break;

    case DO_NOT_CACHE:
      if (value == null) {
        unsetDo_not_cache();
      } else {
        setDo_not_cache((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMAND_DIGEST:
      return getCommand_digest();

    case INPUT_ROOT_DIGEST:
      return getInput_root_digest();

    case OUTPUT_FILES:
      return getOutput_files();

    case OUTPUT_DIRECTORIES:
      return getOutput_directories();

    case REQUIREMENTS:
      return getRequirements();

    case TIMEOUT_SECS:
      return getTimeout_secs();

    case DO_NOT_CACHE:
      return isDo_not_cache();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COMMAND_DIGEST:
      return isSetCommand_digest();
    case INPUT_ROOT_DIGEST:
      return isSetInput_root_digest();
    case OUTPUT_FILES:
      return isSetOutput_files();
    case OUTPUT_DIRECTORIES:
      return isSetOutput_directories();
    case REQUIREMENTS:
      return isSetRequirements();
    case TIMEOUT_SECS:
      return isSetTimeout_secs();
    case DO_NOT_CACHE:
      return isSetDo_not_cache();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Action)
      return this.equals((Action)that);
    return false;
  }

  public boolean equals(Action that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_command_digest = true && this.isSetCommand_digest();
    boolean that_present_command_digest = true && that.isSetCommand_digest();
    if (this_present_command_digest || that_present_command_digest) {
      if (!(this_present_command_digest && that_present_command_digest))
        return false;
      if (!this.command_digest.equals(that.command_digest))
        return false;
    }

    boolean this_present_input_root_digest = true && this.isSetInput_root_digest();
    boolean that_present_input_root_digest = true && that.isSetInput_root_digest();
    if (this_present_input_root_digest || that_present_input_root_digest) {
      if (!(this_present_input_root_digest && that_present_input_root_digest))
        return false;
      if (!this.input_root_digest.equals(that.input_root_digest))
        return false;
    }

    boolean this_present_output_files = true && this.isSetOutput_files();
    boolean that_present_output_files = true && that.isSetOutput_files();
    if (this_present_output_files || that_present_output_files) {
      if (!(this_present_output_files && that_present_output_files))
        return false;
      if (!this.output_files.equals(that.output_files))
        return false;
    }

    boolean this_present_output_directories = true && this.isSetOutput_directories();
    boolean that_present_output_directories = true && that.isSetOutput_directories();
    if (this_present_output_directories || that_present_output_directories) {
      if (!(this_present_output_directories && that_present_output_directories))
        return false;
      if (!this.output_directories.equals(that.output_directories))
        return false;
    }

    boolean this_present_requirements = true && this.isSetRequirements();
    boolean that_present_requirements = true && that.isSetRequirements();
    if (this_present_requirements || that_present_requirements) {
      if (!(this_present_requirements && that_present_requirements))
        return false;
      if (!this.requirements.equals(that.requirements))
        return false;
    }

    boolean this_present_timeout_secs = true;
    boolean that_present_timeout_secs = true;
    if (this_present_timeout_secs || that_present_timeout_secs) {
      if (!(this_present_timeout_secs && that_present_timeout_secs))
        return false;
      if (this.timeout_secs != that.timeout_secs)
        return false;
    }

    boolean this_present_do_not_cache = true;
    boolean that_present_do_not_cache = true;
    if (this_present_do_not_cache || that_present_do_not_cache) {
      if (!(this_present_do_not_cache && that_present_do_not_cache))
        return false;
      if (this.do_not_cache != that.do_not_cache)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCommand_digest()) ? 131071 : 524287);
    if (isSetCommand_digest())
      hashCode = hashCode * 8191 + command_digest.hashCode();

    hashCode = hashCode * 8191 + ((isSetInput_root_digest()) ? 131071 : 524287);
    if (isSetInput_root_digest())
      hashCode = hashCode * 8191 + input_root_digest.hashCode();

    hashCode = hashCode * 8191 + ((isSetOutput_files()) ? 131071 : 524287);
    if (isSetOutput_files())
      hashCode = hashCode * 8191 + output_files.hashCode();

    hashCode = hashCode * 8191 + ((isSetOutput_directories()) ? 131071 : 524287);
    if (isSetOutput_directories())
      hashCode = hashCode * 8191 + output_directories.hashCode();

    hashCode = hashCode * 8191 + ((isSetRequirements()) ? 131071 : 524287);
    if (isSetRequirements())
      hashCode = hashCode * 8191 + requirements.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timeout_secs);

    hashCode = hashCode * 8191 + ((do_not_cache) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Action other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCommand_digest()).compareTo(other.isSetCommand_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommand_digest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.command_digest, other.command_digest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInput_root_digest()).compareTo(other.isSetInput_root_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput_root_digest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input_root_digest, other.input_root_digest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOutput_files()).compareTo(other.isSetOutput_files());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutput_files()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_files, other.output_files);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOutput_directories()).compareTo(other.isSetOutput_directories());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutput_directories()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output_directories, other.output_directories);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequirements()).compareTo(other.isSetRequirements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequirements()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requirements, other.requirements);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeout_secs()).compareTo(other.isSetTimeout_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout_secs, other.timeout_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDo_not_cache()).compareTo(other.isSetDo_not_cache());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDo_not_cache()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.do_not_cache, other.do_not_cache);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(");
    boolean first = true;

    sb.append("command_digest:");
    if (this.command_digest == null) {
      sb.append("null");
    } else {
      sb.append(this.command_digest);
    }
    first = false;
    if (isSetInput_root_digest()) {
      if (!first) sb.append(", ");
      sb.append("input_root_digest:");
      if (this.input_root_digest == null) {
        sb.append("null");
      } else {
        sb.append(this.input_root_digest);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("output_files:");
    if (this.output_files == null) {
      sb.append("null");
    } else {
      sb.append(this.output_files);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("output_directories:");
    if (this.output_directories == null) {
      sb.append("null");
    } else {
      sb.append(this.output_directories);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requirements:");
    if (this.requirements == null) {
      sb.append("null");
    } else {
      sb.append(this.requirements);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeout_secs:");
    sb.append(this.timeout_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("do_not_cache:");
    sb.append(this.do_not_cache);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (command_digest != null) {
      command_digest.validate();
    }
    if (input_root_digest != null) {
      input_root_digest.validate();
    }
    if (requirements != null) {
      requirements.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ActionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ActionStandardScheme getScheme() {
      return new ActionStandardScheme();
    }
  }

  private static class ActionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Action> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Action struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMAND_DIGEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.command_digest = new com.facebook.remoteexecution.cas.Digest();
              struct.command_digest.read(iprot);
              struct.setCommand_digestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INPUT_ROOT_DIGEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.input_root_digest = new com.facebook.remoteexecution.cas.Digest();
              struct.input_root_digest.read(iprot);
              struct.setInput_root_digestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTPUT_FILES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.output_files = new java.util.ArrayList<java.lang.String>(_list80.size);
                java.lang.String _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = iprot.readString();
                  struct.output_files.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setOutput_filesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OUTPUT_DIRECTORIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list83 = iprot.readListBegin();
                struct.output_directories = new java.util.ArrayList<java.lang.String>(_list83.size);
                java.lang.String _elem84;
                for (int _i85 = 0; _i85 < _list83.size; ++_i85)
                {
                  _elem84 = iprot.readString();
                  struct.output_directories.add(_elem84);
                }
                iprot.readListEnd();
              }
              struct.setOutput_directoriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUIREMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.requirements = new Requirements();
              struct.requirements.read(iprot);
              struct.setRequirementsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIMEOUT_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeout_secs = iprot.readI64();
              struct.setTimeout_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DO_NOT_CACHE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.do_not_cache = iprot.readBool();
              struct.setDo_not_cacheIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Action struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.command_digest != null) {
        oprot.writeFieldBegin(COMMAND_DIGEST_FIELD_DESC);
        struct.command_digest.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.input_root_digest != null) {
        if (struct.isSetInput_root_digest()) {
          oprot.writeFieldBegin(INPUT_ROOT_DIGEST_FIELD_DESC);
          struct.input_root_digest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.output_files != null) {
        oprot.writeFieldBegin(OUTPUT_FILES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.output_files.size()));
          for (java.lang.String _iter86 : struct.output_files)
          {
            oprot.writeString(_iter86);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.output_directories != null) {
        oprot.writeFieldBegin(OUTPUT_DIRECTORIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.output_directories.size()));
          for (java.lang.String _iter87 : struct.output_directories)
          {
            oprot.writeString(_iter87);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.requirements != null) {
        oprot.writeFieldBegin(REQUIREMENTS_FIELD_DESC);
        struct.requirements.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMEOUT_SECS_FIELD_DESC);
      oprot.writeI64(struct.timeout_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DO_NOT_CACHE_FIELD_DESC);
      oprot.writeBool(struct.do_not_cache);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ActionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ActionTupleScheme getScheme() {
      return new ActionTupleScheme();
    }
  }

  private static class ActionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Action> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Action struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCommand_digest()) {
        optionals.set(0);
      }
      if (struct.isSetInput_root_digest()) {
        optionals.set(1);
      }
      if (struct.isSetOutput_files()) {
        optionals.set(2);
      }
      if (struct.isSetOutput_directories()) {
        optionals.set(3);
      }
      if (struct.isSetRequirements()) {
        optionals.set(4);
      }
      if (struct.isSetTimeout_secs()) {
        optionals.set(5);
      }
      if (struct.isSetDo_not_cache()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetCommand_digest()) {
        struct.command_digest.write(oprot);
      }
      if (struct.isSetInput_root_digest()) {
        struct.input_root_digest.write(oprot);
      }
      if (struct.isSetOutput_files()) {
        {
          oprot.writeI32(struct.output_files.size());
          for (java.lang.String _iter88 : struct.output_files)
          {
            oprot.writeString(_iter88);
          }
        }
      }
      if (struct.isSetOutput_directories()) {
        {
          oprot.writeI32(struct.output_directories.size());
          for (java.lang.String _iter89 : struct.output_directories)
          {
            oprot.writeString(_iter89);
          }
        }
      }
      if (struct.isSetRequirements()) {
        struct.requirements.write(oprot);
      }
      if (struct.isSetTimeout_secs()) {
        oprot.writeI64(struct.timeout_secs);
      }
      if (struct.isSetDo_not_cache()) {
        oprot.writeBool(struct.do_not_cache);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Action struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.command_digest = new com.facebook.remoteexecution.cas.Digest();
        struct.command_digest.read(iprot);
        struct.setCommand_digestIsSet(true);
      }
      if (incoming.get(1)) {
        struct.input_root_digest = new com.facebook.remoteexecution.cas.Digest();
        struct.input_root_digest.read(iprot);
        struct.setInput_root_digestIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list90 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.output_files = new java.util.ArrayList<java.lang.String>(_list90.size);
          java.lang.String _elem91;
          for (int _i92 = 0; _i92 < _list90.size; ++_i92)
          {
            _elem91 = iprot.readString();
            struct.output_files.add(_elem91);
          }
        }
        struct.setOutput_filesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.output_directories = new java.util.ArrayList<java.lang.String>(_list93.size);
          java.lang.String _elem94;
          for (int _i95 = 0; _i95 < _list93.size; ++_i95)
          {
            _elem94 = iprot.readString();
            struct.output_directories.add(_elem94);
          }
        }
        struct.setOutput_directoriesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.requirements = new Requirements();
        struct.requirements.read(iprot);
        struct.setRequirementsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.timeout_secs = iprot.readI64();
        struct.setTimeout_secsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.do_not_cache = iprot.readBool();
        struct.setDo_not_cacheIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
