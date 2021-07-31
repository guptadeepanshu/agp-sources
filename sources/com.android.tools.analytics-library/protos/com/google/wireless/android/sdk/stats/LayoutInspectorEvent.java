// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for layout inspector events
 * </pre>
 *
 * Protobuf type {@code android_studio.LayoutInspectorEvent}
 */
public  final class LayoutInspectorEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.LayoutInspectorEvent)
    LayoutInspectorEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LayoutInspectorEvent.newBuilder() to construct.
  private LayoutInspectorEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LayoutInspectorEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LayoutInspectorEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LayoutInspectorEvent(
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
            com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType value = com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            durationInMs_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            dataSize_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            version_ = input.readUInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LayoutInspectorEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LayoutInspectorEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.LayoutInspectorEvent.class, com.google.wireless.android.sdk.stats.LayoutInspectorEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.LayoutInspectorEvent.LayoutInspectorEventType}
   */
  public enum LayoutInspectorEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <pre>
     * Capture view data from a window
     * </pre>
     *
     * <code>CAPTURE = 1;</code>
     */
    CAPTURE(1),
    /**
     * <pre>
     * Layout inspector was opened
     * </pre>
     *
     * <code>OPEN = 2;</code>
     */
    OPEN(2),
    /**
     * <pre>
     * Dump Display List of selected node
     * </pre>
     *
     * <code>DUMP_DISPLAYLIST = 3;</code>
     */
    DUMP_DISPLAYLIST(3),
    /**
     * <pre>
     * Pixel perfect feature used to overlay a design mock
     * </pre>
     *
     * <code>OVERLAY_IMAGE = 4;</code>
     */
    OVERLAY_IMAGE(4),
    /**
     * <pre>
     * Render a sub section of the captured view
     * </pre>
     *
     * <code>RENDER_SUB_VIEW = 5;</code>
     */
    RENDER_SUB_VIEW(5),
    /**
     * <pre>
     * Navigate to declaration of a view resource by id
     * </pre>
     *
     * <code>GO_TO_DECLARATION = 6;</code>
     */
    GO_TO_DECLARATION(6),
    /**
     * <pre>
     * Capture view data timeout
     * </pre>
     *
     * <code>CAPTURE_TIME_OUT = 7;</code>
     */
    CAPTURE_TIME_OUT(7),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <pre>
     * Capture view data from a window
     * </pre>
     *
     * <code>CAPTURE = 1;</code>
     */
    public static final int CAPTURE_VALUE = 1;
    /**
     * <pre>
     * Layout inspector was opened
     * </pre>
     *
     * <code>OPEN = 2;</code>
     */
    public static final int OPEN_VALUE = 2;
    /**
     * <pre>
     * Dump Display List of selected node
     * </pre>
     *
     * <code>DUMP_DISPLAYLIST = 3;</code>
     */
    public static final int DUMP_DISPLAYLIST_VALUE = 3;
    /**
     * <pre>
     * Pixel perfect feature used to overlay a design mock
     * </pre>
     *
     * <code>OVERLAY_IMAGE = 4;</code>
     */
    public static final int OVERLAY_IMAGE_VALUE = 4;
    /**
     * <pre>
     * Render a sub section of the captured view
     * </pre>
     *
     * <code>RENDER_SUB_VIEW = 5;</code>
     */
    public static final int RENDER_SUB_VIEW_VALUE = 5;
    /**
     * <pre>
     * Navigate to declaration of a view resource by id
     * </pre>
     *
     * <code>GO_TO_DECLARATION = 6;</code>
     */
    public static final int GO_TO_DECLARATION_VALUE = 6;
    /**
     * <pre>
     * Capture view data timeout
     * </pre>
     *
     * <code>CAPTURE_TIME_OUT = 7;</code>
     */
    public static final int CAPTURE_TIME_OUT_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LayoutInspectorEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LayoutInspectorEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return CAPTURE;
        case 2: return OPEN;
        case 3: return DUMP_DISPLAYLIST;
        case 4: return OVERLAY_IMAGE;
        case 5: return RENDER_SUB_VIEW;
        case 6: return GO_TO_DECLARATION;
        case 7: return CAPTURE_TIME_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LayoutInspectorEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LayoutInspectorEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LayoutInspectorEventType>() {
            public LayoutInspectorEventType findValueByNumber(int number) {
              return LayoutInspectorEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.LayoutInspectorEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final LayoutInspectorEventType[] VALUES = values();

    public static LayoutInspectorEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LayoutInspectorEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.LayoutInspectorEvent.LayoutInspectorEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
   * @return The type.
   */
  public com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType result = com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int DURATION_IN_MS_FIELD_NUMBER = 2;
  private long durationInMs_;
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
   * </pre>
   *
   * <code>optional int64 duration_in_ms = 2;</code>
   * @return Whether the durationInMs field is set.
   */
  public boolean hasDurationInMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
   * </pre>
   *
   * <code>optional int64 duration_in_ms = 2;</code>
   * @return The durationInMs.
   */
  public long getDurationInMs() {
    return durationInMs_;
  }

  public static final int DATA_SIZE_FIELD_NUMBER = 3;
  private long dataSize_;
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE
   * size of the captured view data in bytes
   * </pre>
   *
   * <code>optional int64 data_size = 3;</code>
   * @return Whether the dataSize field is set.
   */
  public boolean hasDataSize() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE
   * size of the captured view data in bytes
   * </pre>
   *
   * <code>optional int64 data_size = 3;</code>
   * @return The dataSize.
   */
  public long getDataSize() {
    return dataSize_;
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private int version_;
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE or OPEN
   * which version of the protocol is used to capture layout info
   * </pre>
   *
   * <code>optional uint32 version = 4;</code>
   * @return Whether the version field is set.
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE or OPEN
   * which version of the protocol is used to capture layout info
   * </pre>
   *
   * <code>optional uint32 version = 4;</code>
   * @return The version.
   */
  public int getVersion() {
    return version_;
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
      output.writeInt64(2, durationInMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, dataSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, version_);
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, durationInMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dataSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, version_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.LayoutInspectorEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.LayoutInspectorEvent other = (com.google.wireless.android.sdk.stats.LayoutInspectorEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasDurationInMs() != other.hasDurationInMs()) return false;
    if (hasDurationInMs()) {
      if (getDurationInMs()
          != other.getDurationInMs()) return false;
    }
    if (hasDataSize() != other.hasDataSize()) return false;
    if (hasDataSize()) {
      if (getDataSize()
          != other.getDataSize()) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (getVersion()
          != other.getVersion()) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasDurationInMs()) {
      hash = (37 * hash) + DURATION_IN_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDurationInMs());
    }
    if (hasDataSize()) {
      hash = (37 * hash) + DATA_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDataSize());
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.LayoutInspectorEvent prototype) {
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
   * Details for layout inspector events
   * </pre>
   *
   * Protobuf type {@code android_studio.LayoutInspectorEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.LayoutInspectorEvent)
      com.google.wireless.android.sdk.stats.LayoutInspectorEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LayoutInspectorEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LayoutInspectorEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.LayoutInspectorEvent.class, com.google.wireless.android.sdk.stats.LayoutInspectorEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.LayoutInspectorEvent.newBuilder()
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
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      durationInMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      dataSize_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LayoutInspectorEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LayoutInspectorEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.LayoutInspectorEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LayoutInspectorEvent build() {
      com.google.wireless.android.sdk.stats.LayoutInspectorEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LayoutInspectorEvent buildPartial() {
      com.google.wireless.android.sdk.stats.LayoutInspectorEvent result = new com.google.wireless.android.sdk.stats.LayoutInspectorEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.durationInMs_ = durationInMs_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataSize_ = dataSize_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.version_ = version_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.wireless.android.sdk.stats.LayoutInspectorEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.LayoutInspectorEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.LayoutInspectorEvent other) {
      if (other == com.google.wireless.android.sdk.stats.LayoutInspectorEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasDurationInMs()) {
        setDurationInMs(other.getDurationInMs());
      }
      if (other.hasDataSize()) {
        setDataSize(other.getDataSize());
      }
      if (other.hasVersion()) {
        setVersion(other.getVersion());
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
      com.google.wireless.android.sdk.stats.LayoutInspectorEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.LayoutInspectorEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
     * @return The type.
     */
    public com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType result = com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType value) {
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
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long durationInMs_ ;
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
     * </pre>
     *
     * <code>optional int64 duration_in_ms = 2;</code>
     * @return Whether the durationInMs field is set.
     */
    public boolean hasDurationInMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
     * </pre>
     *
     * <code>optional int64 duration_in_ms = 2;</code>
     * @return The durationInMs.
     */
    public long getDurationInMs() {
      return durationInMs_;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
     * </pre>
     *
     * <code>optional int64 duration_in_ms = 2;</code>
     * @param value The durationInMs to set.
     * @return This builder for chaining.
     */
    public Builder setDurationInMs(long value) {
      bitField0_ |= 0x00000002;
      durationInMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
     * </pre>
     *
     * <code>optional int64 duration_in_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationInMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      durationInMs_ = 0L;
      onChanged();
      return this;
    }

    private long dataSize_ ;
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE
     * size of the captured view data in bytes
     * </pre>
     *
     * <code>optional int64 data_size = 3;</code>
     * @return Whether the dataSize field is set.
     */
    public boolean hasDataSize() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE
     * size of the captured view data in bytes
     * </pre>
     *
     * <code>optional int64 data_size = 3;</code>
     * @return The dataSize.
     */
    public long getDataSize() {
      return dataSize_;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE
     * size of the captured view data in bytes
     * </pre>
     *
     * <code>optional int64 data_size = 3;</code>
     * @param value The dataSize to set.
     * @return This builder for chaining.
     */
    public Builder setDataSize(long value) {
      bitField0_ |= 0x00000004;
      dataSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE
     * size of the captured view data in bytes
     * </pre>
     *
     * <code>optional int64 data_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dataSize_ = 0L;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE or OPEN
     * which version of the protocol is used to capture layout info
     * </pre>
     *
     * <code>optional uint32 version = 4;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE or OPEN
     * which version of the protocol is used to capture layout info
     * </pre>
     *
     * <code>optional uint32 version = 4;</code>
     * @return The version.
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE or OPEN
     * which version of the protocol is used to capture layout info
     * </pre>
     *
     * <code>optional uint32 version = 4;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      bitField0_ |= 0x00000008;
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * defined if LayoutInspectorEventType = CAPTURE or OPEN
     * which version of the protocol is used to capture layout info
     * </pre>
     *
     * <code>optional uint32 version = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000008);
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.LayoutInspectorEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.LayoutInspectorEvent)
  private static final com.google.wireless.android.sdk.stats.LayoutInspectorEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.LayoutInspectorEvent();
  }

  public static com.google.wireless.android.sdk.stats.LayoutInspectorEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LayoutInspectorEvent>
      PARSER = new com.google.protobuf.AbstractParser<LayoutInspectorEvent>() {
    @java.lang.Override
    public LayoutInspectorEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LayoutInspectorEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LayoutInspectorEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LayoutInspectorEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.LayoutInspectorEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

