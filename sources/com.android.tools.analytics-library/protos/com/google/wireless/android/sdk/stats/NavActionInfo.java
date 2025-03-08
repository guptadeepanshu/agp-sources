// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.NavActionInfo}
 */
public final class NavActionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.NavActionInfo)
    NavActionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NavActionInfo.newBuilder() to construct.
  private NavActionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NavActionInfo() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NavActionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavActionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavActionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.NavActionInfo.class, com.google.wireless.android.sdk.stats.NavActionInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.NavActionInfo.ActionType}
   */
  public enum ActionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>REGULAR = 1;</code>
     */
    REGULAR(1),
    /**
     * <code>EXIT = 2;</code>
     */
    EXIT(2),
    /**
     * <code>GLOBAL = 3;</code>
     */
    GLOBAL(3),
    /**
     * <code>SELF = 4;</code>
     */
    SELF(4),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>REGULAR = 1;</code>
     */
    public static final int REGULAR_VALUE = 1;
    /**
     * <code>EXIT = 2;</code>
     */
    public static final int EXIT_VALUE = 2;
    /**
     * <code>GLOBAL = 3;</code>
     */
    public static final int GLOBAL_VALUE = 3;
    /**
     * <code>SELF = 4;</code>
     */
    public static final int SELF_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ActionType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return REGULAR;
        case 2: return EXIT;
        case 3: return GLOBAL;
        case 4: return SELF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ActionType>() {
            public ActionType findValueByNumber(int number) {
              return ActionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.NavActionInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final ActionType[] VALUES = values();

    public static ActionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.NavActionInfo.ActionType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * Type of the action affected
   * </pre>
   *
   * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of the action affected
   * </pre>
   *
   * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.NavActionInfo.ActionType getType() {
    com.google.wireless.android.sdk.stats.NavActionInfo.ActionType result = com.google.wireless.android.sdk.stats.NavActionInfo.ActionType.forNumber(type_);
    return result == null ? com.google.wireless.android.sdk.stats.NavActionInfo.ActionType.UNKNOWN : result;
  }

  public static final int HAS_POP_FIELD_NUMBER = 2;
  private boolean hasPop_ = false;
  /**
   * <pre>
   * Whether the action has popTo set
   * </pre>
   *
   * <code>optional bool has_pop = 2;</code>
   * @return Whether the hasPop field is set.
   */
  @java.lang.Override
  public boolean hasHasPop() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether the action has popTo set
   * </pre>
   *
   * <code>optional bool has_pop = 2;</code>
   * @return The hasPop.
   */
  @java.lang.Override
  public boolean getHasPop() {
    return hasPop_;
  }

  public static final int INCLUSIVE_FIELD_NUMBER = 3;
  private boolean inclusive_ = false;
  /**
   * <pre>
   * Whether the action has popToInclusive set
   * </pre>
   *
   * <code>optional bool inclusive = 3;</code>
   * @return Whether the inclusive field is set.
   */
  @java.lang.Override
  public boolean hasInclusive() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether the action has popToInclusive set
   * </pre>
   *
   * <code>optional bool inclusive = 3;</code>
   * @return The inclusive.
   */
  @java.lang.Override
  public boolean getInclusive() {
    return inclusive_;
  }

  public static final int COUNT_FROM_SOURCE_FIELD_NUMBER = 4;
  private int countFromSource_ = 0;
  /**
   * <pre>
   * The number of actions originating from the same destination as this one
   * </pre>
   *
   * <code>optional uint32 count_from_source = 4;</code>
   * @return Whether the countFromSource field is set.
   */
  @java.lang.Override
  public boolean hasCountFromSource() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * The number of actions originating from the same destination as this one
   * </pre>
   *
   * <code>optional uint32 count_from_source = 4;</code>
   * @return The countFromSource.
   */
  @java.lang.Override
  public int getCountFromSource() {
    return countFromSource_;
  }

  public static final int COUNT_TO_DESTINATION_FIELD_NUMBER = 5;
  private int countToDestination_ = 0;
  /**
   * <pre>
   * The number of actions targeting the same destination as this one
   * </pre>
   *
   * <code>optional uint32 count_to_destination = 5;</code>
   * @return Whether the countToDestination field is set.
   */
  @java.lang.Override
  public boolean hasCountToDestination() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * The number of actions targeting the same destination as this one
   * </pre>
   *
   * <code>optional uint32 count_to_destination = 5;</code>
   * @return The countToDestination.
   */
  @java.lang.Override
  public int getCountToDestination() {
    return countToDestination_;
  }

  public static final int COUNT_SAME_FIELD_NUMBER = 6;
  private int countSame_ = 0;
  /**
   * <pre>
   * The number of actions with the same source and destination as this one
   * </pre>
   *
   * <code>optional uint32 count_same = 6;</code>
   * @return Whether the countSame field is set.
   */
  @java.lang.Override
  public boolean hasCountSame() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * The number of actions with the same source and destination as this one
   * </pre>
   *
   * <code>optional uint32 count_same = 6;</code>
   * @return The countSame.
   */
  @java.lang.Override
  public int getCountSame() {
    return countSame_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, hasPop_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, inclusive_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, countFromSource_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeUInt32(5, countToDestination_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeUInt32(6, countSame_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasPop_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, inclusive_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, countFromSource_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, countToDestination_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, countSame_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.NavActionInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.NavActionInfo other = (com.google.wireless.android.sdk.stats.NavActionInfo) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasHasPop() != other.hasHasPop()) return false;
    if (hasHasPop()) {
      if (getHasPop()
          != other.getHasPop()) return false;
    }
    if (hasInclusive() != other.hasInclusive()) return false;
    if (hasInclusive()) {
      if (getInclusive()
          != other.getInclusive()) return false;
    }
    if (hasCountFromSource() != other.hasCountFromSource()) return false;
    if (hasCountFromSource()) {
      if (getCountFromSource()
          != other.getCountFromSource()) return false;
    }
    if (hasCountToDestination() != other.hasCountToDestination()) return false;
    if (hasCountToDestination()) {
      if (getCountToDestination()
          != other.getCountToDestination()) return false;
    }
    if (hasCountSame() != other.hasCountSame()) return false;
    if (hasCountSame()) {
      if (getCountSame()
          != other.getCountSame()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasHasPop()) {
      hash = (37 * hash) + HAS_POP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasPop());
    }
    if (hasInclusive()) {
      hash = (37 * hash) + INCLUSIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getInclusive());
    }
    if (hasCountFromSource()) {
      hash = (37 * hash) + COUNT_FROM_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getCountFromSource();
    }
    if (hasCountToDestination()) {
      hash = (37 * hash) + COUNT_TO_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getCountToDestination();
    }
    if (hasCountSame()) {
      hash = (37 * hash) + COUNT_SAME_FIELD_NUMBER;
      hash = (53 * hash) + getCountSame();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavActionInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.NavActionInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code android_studio.NavActionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.NavActionInfo)
      com.google.wireless.android.sdk.stats.NavActionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavActionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavActionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.NavActionInfo.class, com.google.wireless.android.sdk.stats.NavActionInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.NavActionInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      hasPop_ = false;
      inclusive_ = false;
      countFromSource_ = 0;
      countToDestination_ = 0;
      countSame_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavActionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavActionInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.NavActionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavActionInfo build() {
      com.google.wireless.android.sdk.stats.NavActionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavActionInfo buildPartial() {
      com.google.wireless.android.sdk.stats.NavActionInfo result = new com.google.wireless.android.sdk.stats.NavActionInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.NavActionInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hasPop_ = hasPop_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inclusive_ = inclusive_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.countFromSource_ = countFromSource_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.countToDestination_ = countToDestination_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.countSame_ = countSame_;
        to_bitField0_ |= 0x00000020;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.NavActionInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.NavActionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.NavActionInfo other) {
      if (other == com.google.wireless.android.sdk.stats.NavActionInfo.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasHasPop()) {
        setHasPop(other.getHasPop());
      }
      if (other.hasInclusive()) {
        setInclusive(other.getInclusive());
      }
      if (other.hasCountFromSource()) {
        setCountFromSource(other.getCountFromSource());
      }
      if (other.hasCountToDestination()) {
        setCountToDestination(other.getCountToDestination());
      }
      if (other.hasCountSame()) {
        setCountSame(other.getCountSame());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.NavActionInfo.ActionType tmpValue =
                  com.google.wireless.android.sdk.stats.NavActionInfo.ActionType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              hasPop_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              inclusive_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              countFromSource_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              countToDestination_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              countSame_ = input.readUInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * Type of the action affected
     * </pre>
     *
     * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type of the action affected
     * </pre>
     *
     * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavActionInfo.ActionType getType() {
      com.google.wireless.android.sdk.stats.NavActionInfo.ActionType result = com.google.wireless.android.sdk.stats.NavActionInfo.ActionType.forNumber(type_);
      return result == null ? com.google.wireless.android.sdk.stats.NavActionInfo.ActionType.UNKNOWN : result;
    }
    /**
     * <pre>
     * Type of the action affected
     * </pre>
     *
     * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.NavActionInfo.ActionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the action affected
     * </pre>
     *
     * <code>optional .android_studio.NavActionInfo.ActionType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean hasPop_ ;
    /**
     * <pre>
     * Whether the action has popTo set
     * </pre>
     *
     * <code>optional bool has_pop = 2;</code>
     * @return Whether the hasPop field is set.
     */
    @java.lang.Override
    public boolean hasHasPop() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Whether the action has popTo set
     * </pre>
     *
     * <code>optional bool has_pop = 2;</code>
     * @return The hasPop.
     */
    @java.lang.Override
    public boolean getHasPop() {
      return hasPop_;
    }
    /**
     * <pre>
     * Whether the action has popTo set
     * </pre>
     *
     * <code>optional bool has_pop = 2;</code>
     * @param value The hasPop to set.
     * @return This builder for chaining.
     */
    public Builder setHasPop(boolean value) {

      hasPop_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the action has popTo set
     * </pre>
     *
     * <code>optional bool has_pop = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasPop() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hasPop_ = false;
      onChanged();
      return this;
    }

    private boolean inclusive_ ;
    /**
     * <pre>
     * Whether the action has popToInclusive set
     * </pre>
     *
     * <code>optional bool inclusive = 3;</code>
     * @return Whether the inclusive field is set.
     */
    @java.lang.Override
    public boolean hasInclusive() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Whether the action has popToInclusive set
     * </pre>
     *
     * <code>optional bool inclusive = 3;</code>
     * @return The inclusive.
     */
    @java.lang.Override
    public boolean getInclusive() {
      return inclusive_;
    }
    /**
     * <pre>
     * Whether the action has popToInclusive set
     * </pre>
     *
     * <code>optional bool inclusive = 3;</code>
     * @param value The inclusive to set.
     * @return This builder for chaining.
     */
    public Builder setInclusive(boolean value) {

      inclusive_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the action has popToInclusive set
     * </pre>
     *
     * <code>optional bool inclusive = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInclusive() {
      bitField0_ = (bitField0_ & ~0x00000004);
      inclusive_ = false;
      onChanged();
      return this;
    }

    private int countFromSource_ ;
    /**
     * <pre>
     * The number of actions originating from the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_from_source = 4;</code>
     * @return Whether the countFromSource field is set.
     */
    @java.lang.Override
    public boolean hasCountFromSource() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The number of actions originating from the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_from_source = 4;</code>
     * @return The countFromSource.
     */
    @java.lang.Override
    public int getCountFromSource() {
      return countFromSource_;
    }
    /**
     * <pre>
     * The number of actions originating from the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_from_source = 4;</code>
     * @param value The countFromSource to set.
     * @return This builder for chaining.
     */
    public Builder setCountFromSource(int value) {

      countFromSource_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of actions originating from the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_from_source = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountFromSource() {
      bitField0_ = (bitField0_ & ~0x00000008);
      countFromSource_ = 0;
      onChanged();
      return this;
    }

    private int countToDestination_ ;
    /**
     * <pre>
     * The number of actions targeting the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_to_destination = 5;</code>
     * @return Whether the countToDestination field is set.
     */
    @java.lang.Override
    public boolean hasCountToDestination() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The number of actions targeting the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_to_destination = 5;</code>
     * @return The countToDestination.
     */
    @java.lang.Override
    public int getCountToDestination() {
      return countToDestination_;
    }
    /**
     * <pre>
     * The number of actions targeting the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_to_destination = 5;</code>
     * @param value The countToDestination to set.
     * @return This builder for chaining.
     */
    public Builder setCountToDestination(int value) {

      countToDestination_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of actions targeting the same destination as this one
     * </pre>
     *
     * <code>optional uint32 count_to_destination = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountToDestination() {
      bitField0_ = (bitField0_ & ~0x00000010);
      countToDestination_ = 0;
      onChanged();
      return this;
    }

    private int countSame_ ;
    /**
     * <pre>
     * The number of actions with the same source and destination as this one
     * </pre>
     *
     * <code>optional uint32 count_same = 6;</code>
     * @return Whether the countSame field is set.
     */
    @java.lang.Override
    public boolean hasCountSame() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * The number of actions with the same source and destination as this one
     * </pre>
     *
     * <code>optional uint32 count_same = 6;</code>
     * @return The countSame.
     */
    @java.lang.Override
    public int getCountSame() {
      return countSame_;
    }
    /**
     * <pre>
     * The number of actions with the same source and destination as this one
     * </pre>
     *
     * <code>optional uint32 count_same = 6;</code>
     * @param value The countSame to set.
     * @return This builder for chaining.
     */
    public Builder setCountSame(int value) {

      countSame_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of actions with the same source and destination as this one
     * </pre>
     *
     * <code>optional uint32 count_same = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountSame() {
      bitField0_ = (bitField0_ & ~0x00000020);
      countSame_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:android_studio.NavActionInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.NavActionInfo)
  private static final com.google.wireless.android.sdk.stats.NavActionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.NavActionInfo();
  }

  public static com.google.wireless.android.sdk.stats.NavActionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<NavActionInfo>
      PARSER = new com.google.protobuf.AbstractParser<NavActionInfo>() {
    @java.lang.Override
    public NavActionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NavActionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NavActionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.NavActionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

