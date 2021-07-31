// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Detailed info about emulator boot up.
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorBootInfo}
 */
public  final class EmulatorBootInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorBootInfo)
    EmulatorBootInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorBootInfo.newBuilder() to construct.
  private EmulatorBootInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorBootInfo() {
    bootStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorBootInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmulatorBootInfo(
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
            com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus value = com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              bootStatus_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            durationMs_ = input.readUInt64();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorBootInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorBootInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorBootInfo.class, com.google.wireless.android.sdk.stats.EmulatorBootInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.EmulatorBootInfo.BootStatus}
   */
  public enum BootStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_STATUS = 0;</code>
     */
    UNKNOWN_STATUS(0),
    /**
     * <code>BOOT_COMPLETED = 1;</code>
     */
    BOOT_COMPLETED(1),
    /**
     * <code>BOOT_FAILED = 2;</code>
     */
    BOOT_FAILED(2),
    ;

    /**
     * <code>UNKNOWN_STATUS = 0;</code>
     */
    public static final int UNKNOWN_STATUS_VALUE = 0;
    /**
     * <code>BOOT_COMPLETED = 1;</code>
     */
    public static final int BOOT_COMPLETED_VALUE = 1;
    /**
     * <code>BOOT_FAILED = 2;</code>
     */
    public static final int BOOT_FAILED_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BootStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BootStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_STATUS;
        case 1: return BOOT_COMPLETED;
        case 2: return BOOT_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BootStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BootStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BootStatus>() {
            public BootStatus findValueByNumber(int number) {
              return BootStatus.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.EmulatorBootInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final BootStatus[] VALUES = values();

    public static BootStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BootStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.EmulatorBootInfo.BootStatus)
  }

  private int bitField0_;
  public static final int BOOT_STATUS_FIELD_NUMBER = 1;
  private int bootStatus_;
  /**
   * <pre>
   * Outcome of the emulator boot.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
   * @return Whether the bootStatus field is set.
   */
  public boolean hasBootStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Outcome of the emulator boot.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
   * @return The bootStatus.
   */
  public com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus getBootStatus() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus result = com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus.valueOf(bootStatus_);
    return result == null ? com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus.UNKNOWN_STATUS : result;
  }

  public static final int DURATION_MS_FIELD_NUMBER = 2;
  private long durationMs_;
  /**
   * <pre>
   * How long it took to boot, either successfully or not.
   * </pre>
   *
   * <code>optional uint64 duration_ms = 2;</code>
   * @return Whether the durationMs field is set.
   */
  public boolean hasDurationMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * How long it took to boot, either successfully or not.
   * </pre>
   *
   * <code>optional uint64 duration_ms = 2;</code>
   * @return The durationMs.
   */
  public long getDurationMs() {
    return durationMs_;
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
      output.writeEnum(1, bootStatus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, durationMs_);
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
        .computeEnumSize(1, bootStatus_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, durationMs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorBootInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorBootInfo other = (com.google.wireless.android.sdk.stats.EmulatorBootInfo) obj;

    if (hasBootStatus() != other.hasBootStatus()) return false;
    if (hasBootStatus()) {
      if (bootStatus_ != other.bootStatus_) return false;
    }
    if (hasDurationMs() != other.hasDurationMs()) return false;
    if (hasDurationMs()) {
      if (getDurationMs()
          != other.getDurationMs()) return false;
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
    if (hasBootStatus()) {
      hash = (37 * hash) + BOOT_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + bootStatus_;
    }
    if (hasDurationMs()) {
      hash = (37 * hash) + DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDurationMs());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorBootInfo prototype) {
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
   * <pre>
   * Detailed info about emulator boot up.
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorBootInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorBootInfo)
      com.google.wireless.android.sdk.stats.EmulatorBootInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorBootInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorBootInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorBootInfo.class, com.google.wireless.android.sdk.stats.EmulatorBootInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorBootInfo.newBuilder()
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
      bootStatus_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      durationMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorBootInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorBootInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorBootInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorBootInfo build() {
      com.google.wireless.android.sdk.stats.EmulatorBootInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorBootInfo buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorBootInfo result = new com.google.wireless.android.sdk.stats.EmulatorBootInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.bootStatus_ = bootStatus_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.durationMs_ = durationMs_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorBootInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorBootInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorBootInfo other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorBootInfo.getDefaultInstance()) return this;
      if (other.hasBootStatus()) {
        setBootStatus(other.getBootStatus());
      }
      if (other.hasDurationMs()) {
        setDurationMs(other.getDurationMs());
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
      com.google.wireless.android.sdk.stats.EmulatorBootInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.EmulatorBootInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int bootStatus_ = 0;
    /**
     * <pre>
     * Outcome of the emulator boot.
     * </pre>
     *
     * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
     * @return Whether the bootStatus field is set.
     */
    public boolean hasBootStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Outcome of the emulator boot.
     * </pre>
     *
     * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
     * @return The bootStatus.
     */
    public com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus getBootStatus() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus result = com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus.valueOf(bootStatus_);
      return result == null ? com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus.UNKNOWN_STATUS : result;
    }
    /**
     * <pre>
     * Outcome of the emulator boot.
     * </pre>
     *
     * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
     * @param value The bootStatus to set.
     * @return This builder for chaining.
     */
    public Builder setBootStatus(com.google.wireless.android.sdk.stats.EmulatorBootInfo.BootStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      bootStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Outcome of the emulator boot.
     * </pre>
     *
     * <code>optional .android_studio.EmulatorBootInfo.BootStatus boot_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBootStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bootStatus_ = 0;
      onChanged();
      return this;
    }

    private long durationMs_ ;
    /**
     * <pre>
     * How long it took to boot, either successfully or not.
     * </pre>
     *
     * <code>optional uint64 duration_ms = 2;</code>
     * @return Whether the durationMs field is set.
     */
    public boolean hasDurationMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * How long it took to boot, either successfully or not.
     * </pre>
     *
     * <code>optional uint64 duration_ms = 2;</code>
     * @return The durationMs.
     */
    public long getDurationMs() {
      return durationMs_;
    }
    /**
     * <pre>
     * How long it took to boot, either successfully or not.
     * </pre>
     *
     * <code>optional uint64 duration_ms = 2;</code>
     * @param value The durationMs to set.
     * @return This builder for chaining.
     */
    public Builder setDurationMs(long value) {
      bitField0_ |= 0x00000002;
      durationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How long it took to boot, either successfully or not.
     * </pre>
     *
     * <code>optional uint64 duration_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      durationMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorBootInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorBootInfo)
  private static final com.google.wireless.android.sdk.stats.EmulatorBootInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorBootInfo();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorBootInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorBootInfo>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorBootInfo>() {
    @java.lang.Override
    public EmulatorBootInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmulatorBootInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmulatorBootInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorBootInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorBootInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

