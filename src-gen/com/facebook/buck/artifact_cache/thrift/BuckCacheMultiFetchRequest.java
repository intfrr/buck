/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class BuckCacheMultiFetchRequest implements org.apache.thrift.TBase<BuckCacheMultiFetchRequest, BuckCacheMultiFetchRequest._Fields>, java.io.Serializable, Cloneable, Comparable<BuckCacheMultiFetchRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuckCacheMultiFetchRequest");

  private static final org.apache.thrift.protocol.TField RULE_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleKeys", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField REPOSITORY_FIELD_DESC = new org.apache.thrift.protocol.TField("repository", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SCHEDULE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduleType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DISTRIBUTED_BUILD_MODE_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("distributedBuildModeEnabled", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField BUILD_TARGETS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildTargets", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuckCacheMultiFetchRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuckCacheMultiFetchRequestTupleSchemeFactory();

  public java.util.List<RuleKey> ruleKeys; // optional
  public java.lang.String repository; // optional
  public java.lang.String scheduleType; // optional
  public boolean distributedBuildModeEnabled; // optional
  public java.util.List<java.lang.String> buildTargets; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RULE_KEYS((short)1, "ruleKeys"),
    REPOSITORY((short)2, "repository"),
    SCHEDULE_TYPE((short)3, "scheduleType"),
    DISTRIBUTED_BUILD_MODE_ENABLED((short)4, "distributedBuildModeEnabled"),
    BUILD_TARGETS((short)5, "buildTargets");

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
        case 1: // RULE_KEYS
          return RULE_KEYS;
        case 2: // REPOSITORY
          return REPOSITORY;
        case 3: // SCHEDULE_TYPE
          return SCHEDULE_TYPE;
        case 4: // DISTRIBUTED_BUILD_MODE_ENABLED
          return DISTRIBUTED_BUILD_MODE_ENABLED;
        case 5: // BUILD_TARGETS
          return BUILD_TARGETS;
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
  private static final int __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RULE_KEYS,_Fields.REPOSITORY,_Fields.SCHEDULE_TYPE,_Fields.DISTRIBUTED_BUILD_MODE_ENABLED,_Fields.BUILD_TARGETS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RULE_KEYS, new org.apache.thrift.meta_data.FieldMetaData("ruleKeys", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RuleKey.class))));
    tmpMap.put(_Fields.REPOSITORY, new org.apache.thrift.meta_data.FieldMetaData("repository", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEDULE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("scheduleType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISTRIBUTED_BUILD_MODE_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("distributedBuildModeEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BUILD_TARGETS, new org.apache.thrift.meta_data.FieldMetaData("buildTargets", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuckCacheMultiFetchRequest.class, metaDataMap);
  }

  public BuckCacheMultiFetchRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuckCacheMultiFetchRequest(BuckCacheMultiFetchRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRuleKeys()) {
      java.util.List<RuleKey> __this__ruleKeys = new java.util.ArrayList<RuleKey>(other.ruleKeys.size());
      for (RuleKey other_element : other.ruleKeys) {
        __this__ruleKeys.add(new RuleKey(other_element));
      }
      this.ruleKeys = __this__ruleKeys;
    }
    if (other.isSetRepository()) {
      this.repository = other.repository;
    }
    if (other.isSetScheduleType()) {
      this.scheduleType = other.scheduleType;
    }
    this.distributedBuildModeEnabled = other.distributedBuildModeEnabled;
    if (other.isSetBuildTargets()) {
      java.util.List<java.lang.String> __this__buildTargets = new java.util.ArrayList<java.lang.String>(other.buildTargets);
      this.buildTargets = __this__buildTargets;
    }
  }

  public BuckCacheMultiFetchRequest deepCopy() {
    return new BuckCacheMultiFetchRequest(this);
  }

  @Override
  public void clear() {
    this.ruleKeys = null;
    this.repository = null;
    this.scheduleType = null;
    setDistributedBuildModeEnabledIsSet(false);
    this.distributedBuildModeEnabled = false;
    this.buildTargets = null;
  }

  public int getRuleKeysSize() {
    return (this.ruleKeys == null) ? 0 : this.ruleKeys.size();
  }

  public java.util.Iterator<RuleKey> getRuleKeysIterator() {
    return (this.ruleKeys == null) ? null : this.ruleKeys.iterator();
  }

  public void addToRuleKeys(RuleKey elem) {
    if (this.ruleKeys == null) {
      this.ruleKeys = new java.util.ArrayList<RuleKey>();
    }
    this.ruleKeys.add(elem);
  }

  public java.util.List<RuleKey> getRuleKeys() {
    return this.ruleKeys;
  }

  public BuckCacheMultiFetchRequest setRuleKeys(java.util.List<RuleKey> ruleKeys) {
    this.ruleKeys = ruleKeys;
    return this;
  }

  public void unsetRuleKeys() {
    this.ruleKeys = null;
  }

  /** Returns true if field ruleKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleKeys() {
    return this.ruleKeys != null;
  }

  public void setRuleKeysIsSet(boolean value) {
    if (!value) {
      this.ruleKeys = null;
    }
  }

  public java.lang.String getRepository() {
    return this.repository;
  }

  public BuckCacheMultiFetchRequest setRepository(java.lang.String repository) {
    this.repository = repository;
    return this;
  }

  public void unsetRepository() {
    this.repository = null;
  }

  /** Returns true if field repository is set (has been assigned a value) and false otherwise */
  public boolean isSetRepository() {
    return this.repository != null;
  }

  public void setRepositoryIsSet(boolean value) {
    if (!value) {
      this.repository = null;
    }
  }

  public java.lang.String getScheduleType() {
    return this.scheduleType;
  }

  public BuckCacheMultiFetchRequest setScheduleType(java.lang.String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public void unsetScheduleType() {
    this.scheduleType = null;
  }

  /** Returns true if field scheduleType is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduleType() {
    return this.scheduleType != null;
  }

  public void setScheduleTypeIsSet(boolean value) {
    if (!value) {
      this.scheduleType = null;
    }
  }

  public boolean isDistributedBuildModeEnabled() {
    return this.distributedBuildModeEnabled;
  }

  public BuckCacheMultiFetchRequest setDistributedBuildModeEnabled(boolean distributedBuildModeEnabled) {
    this.distributedBuildModeEnabled = distributedBuildModeEnabled;
    setDistributedBuildModeEnabledIsSet(true);
    return this;
  }

  public void unsetDistributedBuildModeEnabled() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID);
  }

  /** Returns true if field distributedBuildModeEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetDistributedBuildModeEnabled() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID);
  }

  public void setDistributedBuildModeEnabledIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISTRIBUTEDBUILDMODEENABLED_ISSET_ID, value);
  }

  public int getBuildTargetsSize() {
    return (this.buildTargets == null) ? 0 : this.buildTargets.size();
  }

  public java.util.Iterator<java.lang.String> getBuildTargetsIterator() {
    return (this.buildTargets == null) ? null : this.buildTargets.iterator();
  }

  public void addToBuildTargets(java.lang.String elem) {
    if (this.buildTargets == null) {
      this.buildTargets = new java.util.ArrayList<java.lang.String>();
    }
    this.buildTargets.add(elem);
  }

  public java.util.List<java.lang.String> getBuildTargets() {
    return this.buildTargets;
  }

  public BuckCacheMultiFetchRequest setBuildTargets(java.util.List<java.lang.String> buildTargets) {
    this.buildTargets = buildTargets;
    return this;
  }

  public void unsetBuildTargets() {
    this.buildTargets = null;
  }

  /** Returns true if field buildTargets is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildTargets() {
    return this.buildTargets != null;
  }

  public void setBuildTargetsIsSet(boolean value) {
    if (!value) {
      this.buildTargets = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case RULE_KEYS:
      if (value == null) {
        unsetRuleKeys();
      } else {
        setRuleKeys((java.util.List<RuleKey>)value);
      }
      break;

    case REPOSITORY:
      if (value == null) {
        unsetRepository();
      } else {
        setRepository((java.lang.String)value);
      }
      break;

    case SCHEDULE_TYPE:
      if (value == null) {
        unsetScheduleType();
      } else {
        setScheduleType((java.lang.String)value);
      }
      break;

    case DISTRIBUTED_BUILD_MODE_ENABLED:
      if (value == null) {
        unsetDistributedBuildModeEnabled();
      } else {
        setDistributedBuildModeEnabled((java.lang.Boolean)value);
      }
      break;

    case BUILD_TARGETS:
      if (value == null) {
        unsetBuildTargets();
      } else {
        setBuildTargets((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RULE_KEYS:
      return getRuleKeys();

    case REPOSITORY:
      return getRepository();

    case SCHEDULE_TYPE:
      return getScheduleType();

    case DISTRIBUTED_BUILD_MODE_ENABLED:
      return isDistributedBuildModeEnabled();

    case BUILD_TARGETS:
      return getBuildTargets();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RULE_KEYS:
      return isSetRuleKeys();
    case REPOSITORY:
      return isSetRepository();
    case SCHEDULE_TYPE:
      return isSetScheduleType();
    case DISTRIBUTED_BUILD_MODE_ENABLED:
      return isSetDistributedBuildModeEnabled();
    case BUILD_TARGETS:
      return isSetBuildTargets();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuckCacheMultiFetchRequest)
      return this.equals((BuckCacheMultiFetchRequest)that);
    return false;
  }

  public boolean equals(BuckCacheMultiFetchRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ruleKeys = true && this.isSetRuleKeys();
    boolean that_present_ruleKeys = true && that.isSetRuleKeys();
    if (this_present_ruleKeys || that_present_ruleKeys) {
      if (!(this_present_ruleKeys && that_present_ruleKeys))
        return false;
      if (!this.ruleKeys.equals(that.ruleKeys))
        return false;
    }

    boolean this_present_repository = true && this.isSetRepository();
    boolean that_present_repository = true && that.isSetRepository();
    if (this_present_repository || that_present_repository) {
      if (!(this_present_repository && that_present_repository))
        return false;
      if (!this.repository.equals(that.repository))
        return false;
    }

    boolean this_present_scheduleType = true && this.isSetScheduleType();
    boolean that_present_scheduleType = true && that.isSetScheduleType();
    if (this_present_scheduleType || that_present_scheduleType) {
      if (!(this_present_scheduleType && that_present_scheduleType))
        return false;
      if (!this.scheduleType.equals(that.scheduleType))
        return false;
    }

    boolean this_present_distributedBuildModeEnabled = true && this.isSetDistributedBuildModeEnabled();
    boolean that_present_distributedBuildModeEnabled = true && that.isSetDistributedBuildModeEnabled();
    if (this_present_distributedBuildModeEnabled || that_present_distributedBuildModeEnabled) {
      if (!(this_present_distributedBuildModeEnabled && that_present_distributedBuildModeEnabled))
        return false;
      if (this.distributedBuildModeEnabled != that.distributedBuildModeEnabled)
        return false;
    }

    boolean this_present_buildTargets = true && this.isSetBuildTargets();
    boolean that_present_buildTargets = true && that.isSetBuildTargets();
    if (this_present_buildTargets || that_present_buildTargets) {
      if (!(this_present_buildTargets && that_present_buildTargets))
        return false;
      if (!this.buildTargets.equals(that.buildTargets))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRuleKeys()) ? 131071 : 524287);
    if (isSetRuleKeys())
      hashCode = hashCode * 8191 + ruleKeys.hashCode();

    hashCode = hashCode * 8191 + ((isSetRepository()) ? 131071 : 524287);
    if (isSetRepository())
      hashCode = hashCode * 8191 + repository.hashCode();

    hashCode = hashCode * 8191 + ((isSetScheduleType()) ? 131071 : 524287);
    if (isSetScheduleType())
      hashCode = hashCode * 8191 + scheduleType.hashCode();

    hashCode = hashCode * 8191 + ((isSetDistributedBuildModeEnabled()) ? 131071 : 524287);
    if (isSetDistributedBuildModeEnabled())
      hashCode = hashCode * 8191 + ((distributedBuildModeEnabled) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetBuildTargets()) ? 131071 : 524287);
    if (isSetBuildTargets())
      hashCode = hashCode * 8191 + buildTargets.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuckCacheMultiFetchRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRuleKeys()).compareTo(other.isSetRuleKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleKeys, other.ruleKeys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRepository()).compareTo(other.isSetRepository());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepository()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repository, other.repository);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScheduleType()).compareTo(other.isSetScheduleType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduleType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduleType, other.scheduleType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDistributedBuildModeEnabled()).compareTo(other.isSetDistributedBuildModeEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistributedBuildModeEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.distributedBuildModeEnabled, other.distributedBuildModeEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuildTargets()).compareTo(other.isSetBuildTargets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildTargets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildTargets, other.buildTargets);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuckCacheMultiFetchRequest(");
    boolean first = true;

    if (isSetRuleKeys()) {
      sb.append("ruleKeys:");
      if (this.ruleKeys == null) {
        sb.append("null");
      } else {
        sb.append(this.ruleKeys);
      }
      first = false;
    }
    if (isSetRepository()) {
      if (!first) sb.append(", ");
      sb.append("repository:");
      if (this.repository == null) {
        sb.append("null");
      } else {
        sb.append(this.repository);
      }
      first = false;
    }
    if (isSetScheduleType()) {
      if (!first) sb.append(", ");
      sb.append("scheduleType:");
      if (this.scheduleType == null) {
        sb.append("null");
      } else {
        sb.append(this.scheduleType);
      }
      first = false;
    }
    if (isSetDistributedBuildModeEnabled()) {
      if (!first) sb.append(", ");
      sb.append("distributedBuildModeEnabled:");
      sb.append(this.distributedBuildModeEnabled);
      first = false;
    }
    if (isSetBuildTargets()) {
      if (!first) sb.append(", ");
      sb.append("buildTargets:");
      if (this.buildTargets == null) {
        sb.append("null");
      } else {
        sb.append(this.buildTargets);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class BuckCacheMultiFetchRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuckCacheMultiFetchRequestStandardScheme getScheme() {
      return new BuckCacheMultiFetchRequestStandardScheme();
    }
  }

  private static class BuckCacheMultiFetchRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuckCacheMultiFetchRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuckCacheMultiFetchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RULE_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.ruleKeys = new java.util.ArrayList<RuleKey>(_list58.size);
                RuleKey _elem59;
                for (int _i60 = 0; _i60 < _list58.size; ++_i60)
                {
                  _elem59 = new RuleKey();
                  _elem59.read(iprot);
                  struct.ruleKeys.add(_elem59);
                }
                iprot.readListEnd();
              }
              struct.setRuleKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPOSITORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.repository = iprot.readString();
              struct.setRepositoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCHEDULE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheduleType = iprot.readString();
              struct.setScheduleTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISTRIBUTED_BUILD_MODE_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.distributedBuildModeEnabled = iprot.readBool();
              struct.setDistributedBuildModeEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BUILD_TARGETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list61 = iprot.readListBegin();
                struct.buildTargets = new java.util.ArrayList<java.lang.String>(_list61.size);
                java.lang.String _elem62;
                for (int _i63 = 0; _i63 < _list61.size; ++_i63)
                {
                  _elem62 = iprot.readString();
                  struct.buildTargets.add(_elem62);
                }
                iprot.readListEnd();
              }
              struct.setBuildTargetsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuckCacheMultiFetchRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ruleKeys != null) {
        if (struct.isSetRuleKeys()) {
          oprot.writeFieldBegin(RULE_KEYS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ruleKeys.size()));
            for (RuleKey _iter64 : struct.ruleKeys)
            {
              _iter64.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.repository != null) {
        if (struct.isSetRepository()) {
          oprot.writeFieldBegin(REPOSITORY_FIELD_DESC);
          oprot.writeString(struct.repository);
          oprot.writeFieldEnd();
        }
      }
      if (struct.scheduleType != null) {
        if (struct.isSetScheduleType()) {
          oprot.writeFieldBegin(SCHEDULE_TYPE_FIELD_DESC);
          oprot.writeString(struct.scheduleType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        oprot.writeFieldBegin(DISTRIBUTED_BUILD_MODE_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.distributedBuildModeEnabled);
        oprot.writeFieldEnd();
      }
      if (struct.buildTargets != null) {
        if (struct.isSetBuildTargets()) {
          oprot.writeFieldBegin(BUILD_TARGETS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.buildTargets.size()));
            for (java.lang.String _iter65 : struct.buildTargets)
            {
              oprot.writeString(_iter65);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuckCacheMultiFetchRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuckCacheMultiFetchRequestTupleScheme getScheme() {
      return new BuckCacheMultiFetchRequestTupleScheme();
    }
  }

  private static class BuckCacheMultiFetchRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuckCacheMultiFetchRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuckCacheMultiFetchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRuleKeys()) {
        optionals.set(0);
      }
      if (struct.isSetRepository()) {
        optionals.set(1);
      }
      if (struct.isSetScheduleType()) {
        optionals.set(2);
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        optionals.set(3);
      }
      if (struct.isSetBuildTargets()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetRuleKeys()) {
        {
          oprot.writeI32(struct.ruleKeys.size());
          for (RuleKey _iter66 : struct.ruleKeys)
          {
            _iter66.write(oprot);
          }
        }
      }
      if (struct.isSetRepository()) {
        oprot.writeString(struct.repository);
      }
      if (struct.isSetScheduleType()) {
        oprot.writeString(struct.scheduleType);
      }
      if (struct.isSetDistributedBuildModeEnabled()) {
        oprot.writeBool(struct.distributedBuildModeEnabled);
      }
      if (struct.isSetBuildTargets()) {
        {
          oprot.writeI32(struct.buildTargets.size());
          for (java.lang.String _iter67 : struct.buildTargets)
          {
            oprot.writeString(_iter67);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuckCacheMultiFetchRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list68 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ruleKeys = new java.util.ArrayList<RuleKey>(_list68.size);
          RuleKey _elem69;
          for (int _i70 = 0; _i70 < _list68.size; ++_i70)
          {
            _elem69 = new RuleKey();
            _elem69.read(iprot);
            struct.ruleKeys.add(_elem69);
          }
        }
        struct.setRuleKeysIsSet(true);
      }
      if (incoming.get(1)) {
        struct.repository = iprot.readString();
        struct.setRepositoryIsSet(true);
      }
      if (incoming.get(2)) {
        struct.scheduleType = iprot.readString();
        struct.setScheduleTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.distributedBuildModeEnabled = iprot.readBool();
        struct.setDistributedBuildModeEnabledIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list71 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.buildTargets = new java.util.ArrayList<java.lang.String>(_list71.size);
          java.lang.String _elem72;
          for (int _i73 = 0; _i73 < _list71.size; ++_i73)
          {
            _elem72 = iprot.readString();
            struct.buildTargets.add(_elem72);
          }
        }
        struct.setBuildTargetsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

