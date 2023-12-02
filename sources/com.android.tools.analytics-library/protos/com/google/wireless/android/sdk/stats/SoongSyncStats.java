// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.SoongSyncStats}
 */
public final class SoongSyncStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.SoongSyncStats)
    SoongSyncStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SoongSyncStats.newBuilder() to construct.
  private SoongSyncStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SoongSyncStats() {
    trigger_ = 0;
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SoongSyncStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SoongSyncStats(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger value = com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              trigger_ = rawValue;
            }
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.SoongSyncStats.Status value = com.google.wireless.android.sdk.stats.SoongSyncStats.Status.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              status_ = rawValue;
            }
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            totalTimeMs_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SoongSyncStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SoongSyncStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.SoongSyncStats.class, com.google.wireless.android.sdk.stats.SoongSyncStats.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.SoongSyncStats.Trigger}
   */
  public enum Trigger
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TRIGGER_UNKNOWN = 0;</code>
     */
    TRIGGER_UNKNOWN(0),
    /**
     * <code>PROJECT_OPEN = 1;</code>
     */
    PROJECT_OPEN(1),
    /**
     * <code>USER_SYNC_ACTION = 2;</code>
     */
    USER_SYNC_ACTION(2),
    ;

    /**
     * <code>TRIGGER_UNKNOWN = 0;</code>
     */
    public static final int TRIGGER_UNKNOWN_VALUE = 0;
    /**
     * <code>PROJECT_OPEN = 1;</code>
     */
    public static final int PROJECT_OPEN_VALUE = 1;
    /**
     * <code>USER_SYNC_ACTION = 2;</code>
     */
    public static final int USER_SYNC_ACTION_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Trigger valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Trigger forNumber(int value) {
      switch (value) {
        case 0: return TRIGGER_UNKNOWN;
        case 1: return PROJECT_OPEN;
        case 2: return USER_SYNC_ACTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Trigger>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Trigger> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Trigger>() {
            public Trigger findValueByNumber(int number) {
              return Trigger.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.SoongSyncStats.getDescriptor().getEnumTypes().get(0);
    }

    private static final Trigger[] VALUES = values();

    public static Trigger valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Trigger(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.SoongSyncStats.Trigger)
  }

  /**
   * Protobuf enum {@code android_studio.SoongSyncStats.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNKNOWN = 0;</code>
     */
    STATUS_UNKNOWN(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>FAIL = 2;</code>
     */
    FAIL(2),
    /**
     * <code>CANCELLED = 3;</code>
     */
    CANCELLED(3),
    ;

    /**
     * <code>STATUS_UNKNOWN = 0;</code>
     */
    public static final int STATUS_UNKNOWN_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>FAIL = 2;</code>
     */
    public static final int FAIL_VALUE = 2;
    /**
     * <code>CANCELLED = 3;</code>
     */
    public static final int CANCELLED_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNKNOWN;
        case 1: return SUCCESS;
        case 2: return FAIL;
        case 3: return CANCELLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.SoongSyncStats.getDescriptor().getEnumTypes().get(1);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.SoongSyncStats.Status)
  }

  private int bitField0_;
  public static final int TRIGGER_FIELD_NUMBER = 1;
  private int trigger_;
  /**
   * <pre>
   * Cause of sync
   * </pre>
   *
   * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
   * @return Whether the trigger field is set.
   */
  @java.lang.Override public boolean hasTrigger() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Cause of sync
   * </pre>
   *
   * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
   * @return The trigger.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger getTrigger() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger result = com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger.valueOf(trigger_);
    return result == null ? com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger.TRIGGER_UNKNOWN : result;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <pre>
   * Status of sync
   * </pre>
   *
   * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Status of sync
   * </pre>
   *
   * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.SoongSyncStats.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.SoongSyncStats.Status result = com.google.wireless.android.sdk.stats.SoongSyncStats.Status.valueOf(status_);
    return result == null ? com.google.wireless.android.sdk.stats.SoongSyncStats.Status.STATUS_UNKNOWN : result;
  }

  public static final int TOTAL_TIME_MS_FIELD_NUMBER = 3;
  private long totalTimeMs_;
  /**
   * <pre>
   * Total time of the entire sync process
   * </pre>
   *
   * <code>optional int64 total_time_ms = 3;</code>
   * @return Whether the totalTimeMs field is set.
   */
  @java.lang.Override
  public boolean hasTotalTimeMs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Total time of the entire sync process
   * </pre>
   *
   * <code>optional int64 total_time_ms = 3;</code>
   * @return The totalTimeMs.
   */
  @java.lang.Override
  public long getTotalTimeMs() {
    return totalTimeMs_;
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
      output.writeEnum(1, trigger_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, status_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, totalTimeMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, trigger_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalTimeMs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.SoongSyncStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.SoongSyncStats other = (com.google.wireless.android.sdk.stats.SoongSyncStats) obj;

    if (hasTrigger() != other.hasTrigger()) return false;
    if (hasTrigger()) {
      if (trigger_ != other.trigger_) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (status_ != other.status_) return false;
    }
    if (hasTotalTimeMs() != other.hasTotalTimeMs()) return false;
    if (hasTotalTimeMs()) {
      if (getTotalTimeMs()
          != other.getTotalTimeMs()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTrigger()) {
      hash = (37 * hash) + TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + trigger_;
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    if (hasTotalTimeMs()) {
      hash = (37 * hash) + TOTAL_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalTimeMs());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SoongSyncStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.SoongSyncStats prototype) {
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
   * Protobuf type {@code android_studio.SoongSyncStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.SoongSyncStats)
      com.google.wireless.android.sdk.stats.SoongSyncStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SoongSyncStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SoongSyncStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.SoongSyncStats.class, com.google.wireless.android.sdk.stats.SoongSyncStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.SoongSyncStats.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trigger_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      totalTimeMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SoongSyncStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SoongSyncStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.SoongSyncStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SoongSyncStats build() {
      com.google.wireless.android.sdk.stats.SoongSyncStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SoongSyncStats buildPartial() {
      com.google.wireless.android.sdk.stats.SoongSyncStats result = new com.google.wireless.android.sdk.stats.SoongSyncStats(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.trigger_ = trigger_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.status_ = status_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalTimeMs_ = totalTimeMs_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.SoongSyncStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.SoongSyncStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.SoongSyncStats other) {
      if (other == com.google.wireless.android.sdk.stats.SoongSyncStats.getDefaultInstance()) return this;
      if (other.hasTrigger()) {
        setTrigger(other.getTrigger());
      }
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      if (other.hasTotalTimeMs()) {
        setTotalTimeMs(other.getTotalTimeMs());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.wireless.android.sdk.stats.SoongSyncStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.SoongSyncStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int trigger_ = 0;
    /**
     * <pre>
     * Cause of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
     * @return Whether the trigger field is set.
     */
    @java.lang.Override public boolean hasTrigger() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Cause of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
     * @return The trigger.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger getTrigger() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger result = com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger.valueOf(trigger_);
      return result == null ? com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger.TRIGGER_UNKNOWN : result;
    }
    /**
     * <pre>
     * Cause of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
     * @param value The trigger to set.
     * @return This builder for chaining.
     */
    public Builder setTrigger(com.google.wireless.android.sdk.stats.SoongSyncStats.Trigger value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      trigger_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cause of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Trigger trigger = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrigger() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trigger_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Status of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Status of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SoongSyncStats.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.SoongSyncStats.Status result = com.google.wireless.android.sdk.stats.SoongSyncStats.Status.valueOf(status_);
      return result == null ? com.google.wireless.android.sdk.stats.SoongSyncStats.Status.STATUS_UNKNOWN : result;
    }
    /**
     * <pre>
     * Status of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.wireless.android.sdk.stats.SoongSyncStats.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of sync
     * </pre>
     *
     * <code>optional .android_studio.SoongSyncStats.Status status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      onChanged();
      return this;
    }

    private long totalTimeMs_ ;
    /**
     * <pre>
     * Total time of the entire sync process
     * </pre>
     *
     * <code>optional int64 total_time_ms = 3;</code>
     * @return Whether the totalTimeMs field is set.
     */
    @java.lang.Override
    public boolean hasTotalTimeMs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Total time of the entire sync process
     * </pre>
     *
     * <code>optional int64 total_time_ms = 3;</code>
     * @return The totalTimeMs.
     */
    @java.lang.Override
    public long getTotalTimeMs() {
      return totalTimeMs_;
    }
    /**
     * <pre>
     * Total time of the entire sync process
     * </pre>
     *
     * <code>optional int64 total_time_ms = 3;</code>
     * @param value The totalTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTimeMs(long value) {
      bitField0_ |= 0x00000004;
      totalTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total time of the entire sync process
     * </pre>
     *
     * <code>optional int64 total_time_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTimeMs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalTimeMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.SoongSyncStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.SoongSyncStats)
  private static final com.google.wireless.android.sdk.stats.SoongSyncStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.SoongSyncStats();
  }

  public static com.google.wireless.android.sdk.stats.SoongSyncStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SoongSyncStats>
      PARSER = new com.google.protobuf.AbstractParser<SoongSyncStats>() {
    @java.lang.Override
    public SoongSyncStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SoongSyncStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SoongSyncStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SoongSyncStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.SoongSyncStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

