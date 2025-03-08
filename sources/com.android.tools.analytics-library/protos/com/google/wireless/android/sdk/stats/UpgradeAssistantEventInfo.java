// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.UpgradeAssistantEventInfo}
 */
public final class UpgradeAssistantEventInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.UpgradeAssistantEventInfo)
    UpgradeAssistantEventInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpgradeAssistantEventInfo.newBuilder() to construct.
  private UpgradeAssistantEventInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpgradeAssistantEventInfo() {
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpgradeAssistantEventInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_UpgradeAssistantEventInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_UpgradeAssistantEventInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.class, com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind}
   */
  public enum UpgradeAssistantEventKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND = 0;</code>
     */
    UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND(0),
    /**
     * <code>FIND_USAGES = 1;</code>
     */
    FIND_USAGES(1),
    /**
     * <code>PREVIEW_REFACTORING = 2;</code>
     */
    PREVIEW_REFACTORING(2),
    /**
     * <code>EXECUTE = 3;</code>
     */
    EXECUTE(3),
    /**
     * <code>FAILURE_PREDICTED = 4;</code>
     */
    FAILURE_PREDICTED(4),
    /**
     * <code>SYNC_SKIPPED = 5;</code>
     */
    SYNC_SKIPPED(5),
    /**
     * <code>SYNC_FAILED = 6;</code>
     */
    SYNC_FAILED(6),
    /**
     * <code>SYNC_SUCCEEDED = 7;</code>
     */
    SYNC_SUCCEEDED(7),
    /**
     * <code>INTERNAL_ERROR = 8;</code>
     */
    INTERNAL_ERROR(8),
    /**
     * <code>BLOCKED = 9;</code>
     */
    BLOCKED(9),
    ;

    /**
     * <code>UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND = 0;</code>
     */
    public static final int UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND_VALUE = 0;
    /**
     * <code>FIND_USAGES = 1;</code>
     */
    public static final int FIND_USAGES_VALUE = 1;
    /**
     * <code>PREVIEW_REFACTORING = 2;</code>
     */
    public static final int PREVIEW_REFACTORING_VALUE = 2;
    /**
     * <code>EXECUTE = 3;</code>
     */
    public static final int EXECUTE_VALUE = 3;
    /**
     * <code>FAILURE_PREDICTED = 4;</code>
     */
    public static final int FAILURE_PREDICTED_VALUE = 4;
    /**
     * <code>SYNC_SKIPPED = 5;</code>
     */
    public static final int SYNC_SKIPPED_VALUE = 5;
    /**
     * <code>SYNC_FAILED = 6;</code>
     */
    public static final int SYNC_FAILED_VALUE = 6;
    /**
     * <code>SYNC_SUCCEEDED = 7;</code>
     */
    public static final int SYNC_SUCCEEDED_VALUE = 7;
    /**
     * <code>INTERNAL_ERROR = 8;</code>
     */
    public static final int INTERNAL_ERROR_VALUE = 8;
    /**
     * <code>BLOCKED = 9;</code>
     */
    public static final int BLOCKED_VALUE = 9;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UpgradeAssistantEventKind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UpgradeAssistantEventKind forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND;
        case 1: return FIND_USAGES;
        case 2: return PREVIEW_REFACTORING;
        case 3: return EXECUTE;
        case 4: return FAILURE_PREDICTED;
        case 5: return SYNC_SKIPPED;
        case 6: return SYNC_FAILED;
        case 7: return SYNC_SUCCEEDED;
        case 8: return INTERNAL_ERROR;
        case 9: return BLOCKED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UpgradeAssistantEventKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UpgradeAssistantEventKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UpgradeAssistantEventKind>() {
            public UpgradeAssistantEventKind findValueByNumber(int number) {
              return UpgradeAssistantEventKind.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final UpgradeAssistantEventKind[] VALUES = values();

    public static UpgradeAssistantEventKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private UpgradeAssistantEventKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind)
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <pre>
   * The kind of event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  @java.lang.Override public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The kind of event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind getKind() {
    com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind result = com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind.forNumber(kind_);
    return result == null ? com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind.UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND : result;
  }

  public static final int USAGES_FIELD_NUMBER = 2;
  private int usages_ = 0;
  /**
   * <pre>
   * The number of usages.  Will be set if kind is FIND_USAGES,
   * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
   * SYNC_SUCCEEDED.
   * </pre>
   *
   * <code>optional int32 usages = 2;</code>
   * @return Whether the usages field is set.
   */
  @java.lang.Override
  public boolean hasUsages() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The number of usages.  Will be set if kind is FIND_USAGES,
   * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
   * SYNC_SUCCEEDED.
   * </pre>
   *
   * <code>optional int32 usages = 2;</code>
   * @return The usages.
   */
  @java.lang.Override
  public int getUsages() {
    return usages_;
  }

  public static final int FILES_FIELD_NUMBER = 3;
  private int files_ = 0;
  /**
   * <pre>
   * The number of files involved in the build.  Will be set if
   * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
   * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
   * </pre>
   *
   * <code>optional int32 files = 3;</code>
   * @return Whether the files field is set.
   */
  @java.lang.Override
  public boolean hasFiles() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The number of files involved in the build.  Will be set if
   * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
   * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
   * </pre>
   *
   * <code>optional int32 files = 3;</code>
   * @return The files.
   */
  @java.lang.Override
  public int getFiles() {
    return files_;
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
      output.writeEnum(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, usages_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, files_);
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
        .computeEnumSize(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, usages_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, files_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo other = (com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (kind_ != other.kind_) return false;
    }
    if (hasUsages() != other.hasUsages()) return false;
    if (hasUsages()) {
      if (getUsages()
          != other.getUsages()) return false;
    }
    if (hasFiles() != other.hasFiles()) return false;
    if (hasFiles()) {
      if (getFiles()
          != other.getFiles()) return false;
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
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + kind_;
    }
    if (hasUsages()) {
      hash = (37 * hash) + USAGES_FIELD_NUMBER;
      hash = (53 * hash) + getUsages();
    }
    if (hasFiles()) {
      hash = (37 * hash) + FILES_FIELD_NUMBER;
      hash = (53 * hash) + getFiles();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo prototype) {
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
   * Protobuf type {@code android_studio.UpgradeAssistantEventInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.UpgradeAssistantEventInfo)
      com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_UpgradeAssistantEventInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_UpgradeAssistantEventInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.class, com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.newBuilder()
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
      kind_ = 0;
      usages_ = 0;
      files_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_UpgradeAssistantEventInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo build() {
      com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo buildPartial() {
      com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo result = new com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.usages_ = usages_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.files_ = files_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo other) {
      if (other == com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.getDefaultInstance()) return this;
      if (other.hasKind()) {
        setKind(other.getKind());
      }
      if (other.hasUsages()) {
        setUsages(other.getUsages());
      }
      if (other.hasFiles()) {
        setFiles(other.getFiles());
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
              com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind tmpValue =
                  com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                kind_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              usages_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              files_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int kind_ = 0;
    /**
     * <pre>
     * The kind of event.
     * </pre>
     *
     * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
     * @return Whether the kind field is set.
     */
    @java.lang.Override public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The kind of event.
     * </pre>
     *
     * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind getKind() {
      com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind result = com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind.forNumber(kind_);
      return result == null ? com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind.UNKNOWN_UPGRADE_ASSISTANT_EVENT_KIND : result;
    }
    /**
     * <pre>
     * The kind of event.
     * </pre>
     *
     * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of event.
     * </pre>
     *
     * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private int usages_ ;
    /**
     * <pre>
     * The number of usages.  Will be set if kind is FIND_USAGES,
     * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
     * SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 usages = 2;</code>
     * @return Whether the usages field is set.
     */
    @java.lang.Override
    public boolean hasUsages() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The number of usages.  Will be set if kind is FIND_USAGES,
     * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
     * SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 usages = 2;</code>
     * @return The usages.
     */
    @java.lang.Override
    public int getUsages() {
      return usages_;
    }
    /**
     * <pre>
     * The number of usages.  Will be set if kind is FIND_USAGES,
     * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
     * SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 usages = 2;</code>
     * @param value The usages to set.
     * @return This builder for chaining.
     */
    public Builder setUsages(int value) {

      usages_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of usages.  Will be set if kind is FIND_USAGES,
     * PREVIEW_REFACTORING, EXECUTE, SYNC_SKIPPED, SYNC_FAILED, or
     * SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 usages = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsages() {
      bitField0_ = (bitField0_ & ~0x00000002);
      usages_ = 0;
      onChanged();
      return this;
    }

    private int files_ ;
    /**
     * <pre>
     * The number of files involved in the build.  Will be set if
     * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
     * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 files = 3;</code>
     * @return Whether the files field is set.
     */
    @java.lang.Override
    public boolean hasFiles() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The number of files involved in the build.  Will be set if
     * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
     * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 files = 3;</code>
     * @return The files.
     */
    @java.lang.Override
    public int getFiles() {
      return files_;
    }
    /**
     * <pre>
     * The number of files involved in the build.  Will be set if
     * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
     * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 files = 3;</code>
     * @param value The files to set.
     * @return This builder for chaining.
     */
    public Builder setFiles(int value) {

      files_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of files involved in the build.  Will be set if
     * kind is FIND_USAGES, PREVIEW_REFACTORING, EXECUTE,
     * SYNC_SKIPPED, SYNC_FAILED, or SYNC_SUCCEEDED.
     * </pre>
     *
     * <code>optional int32 files = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiles() {
      bitField0_ = (bitField0_ & ~0x00000004);
      files_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.UpgradeAssistantEventInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.UpgradeAssistantEventInfo)
  private static final com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo();
  }

  public static com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UpgradeAssistantEventInfo>
      PARSER = new com.google.protobuf.AbstractParser<UpgradeAssistantEventInfo>() {
    @java.lang.Override
    public UpgradeAssistantEventInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpgradeAssistantEventInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpgradeAssistantEventInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

