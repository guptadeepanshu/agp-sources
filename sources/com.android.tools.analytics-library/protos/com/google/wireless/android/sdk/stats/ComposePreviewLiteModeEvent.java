// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for Compose Preview Lite Mode event
 * </pre>
 *
 * Protobuf type {@code android_studio.ComposePreviewLiteModeEvent}
 */
public final class ComposePreviewLiteModeEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ComposePreviewLiteModeEvent)
    ComposePreviewLiteModeEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComposePreviewLiteModeEvent.newBuilder() to construct.
  private ComposePreviewLiteModeEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComposePreviewLiteModeEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComposePreviewLiteModeEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewLiteModeEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewLiteModeEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.class, com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType}
   */
  public enum ComposePreviewLiteModeEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <pre>
     * A file containing previews is opened and the preview(s) render.
     * </pre>
     *
     * <code>OPEN_AND_RENDER = 1;</code>
     */
    OPEN_AND_RENDER(1),
    /**
     * <pre>
     * Compose Preview Lite Mode was enabled/disabled.
     * </pre>
     *
     * <code>PREVIEW_LITE_MODE_SWITCH = 2;</code>
     */
    PREVIEW_LITE_MODE_SWITCH(2),
    /**
     * <pre>
     * Android Studio Essentials Mode was enabled/disabled.
     * </pre>
     *
     * <code>STUDIO_ESSENTIALS_MODE_SWITCH = 3;</code>
     */
    STUDIO_ESSENTIALS_MODE_SWITCH(3),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <pre>
     * A file containing previews is opened and the preview(s) render.
     * </pre>
     *
     * <code>OPEN_AND_RENDER = 1;</code>
     */
    public static final int OPEN_AND_RENDER_VALUE = 1;
    /**
     * <pre>
     * Compose Preview Lite Mode was enabled/disabled.
     * </pre>
     *
     * <code>PREVIEW_LITE_MODE_SWITCH = 2;</code>
     */
    public static final int PREVIEW_LITE_MODE_SWITCH_VALUE = 2;
    /**
     * <pre>
     * Android Studio Essentials Mode was enabled/disabled.
     * </pre>
     *
     * <code>STUDIO_ESSENTIALS_MODE_SWITCH = 3;</code>
     */
    public static final int STUDIO_ESSENTIALS_MODE_SWITCH_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ComposePreviewLiteModeEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ComposePreviewLiteModeEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return OPEN_AND_RENDER;
        case 2: return PREVIEW_LITE_MODE_SWITCH;
        case 3: return STUDIO_ESSENTIALS_MODE_SWITCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ComposePreviewLiteModeEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ComposePreviewLiteModeEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ComposePreviewLiteModeEventType>() {
            public ComposePreviewLiteModeEventType findValueByNumber(int number) {
              return ComposePreviewLiteModeEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final ComposePreviewLiteModeEventType[] VALUES = values();

    public static ComposePreviewLiteModeEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ComposePreviewLiteModeEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType getType() {
    com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType result = com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType.forNumber(type_);
    return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int IS_COMPOSE_PREVIEW_LITE_MODE_FIELD_NUMBER = 2;
  private boolean isComposePreviewLiteMode_ = false;
  /**
   * <pre>
   * True if Compose Preview Lite Mode is enabled when logging the event.
   * For switch events, the value is logged after the switch happens.
   * </pre>
   *
   * <code>optional bool is_compose_preview_lite_mode = 2;</code>
   * @return Whether the isComposePreviewLiteMode field is set.
   */
  @java.lang.Override
  public boolean hasIsComposePreviewLiteMode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * True if Compose Preview Lite Mode is enabled when logging the event.
   * For switch events, the value is logged after the switch happens.
   * </pre>
   *
   * <code>optional bool is_compose_preview_lite_mode = 2;</code>
   * @return The isComposePreviewLiteMode.
   */
  @java.lang.Override
  public boolean getIsComposePreviewLiteMode() {
    return isComposePreviewLiteMode_;
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
      output.writeBool(2, isComposePreviewLiteMode_);
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
        .computeBoolSize(2, isComposePreviewLiteMode_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent other = (com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasIsComposePreviewLiteMode() != other.hasIsComposePreviewLiteMode()) return false;
    if (hasIsComposePreviewLiteMode()) {
      if (getIsComposePreviewLiteMode()
          != other.getIsComposePreviewLiteMode()) return false;
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
    if (hasIsComposePreviewLiteMode()) {
      hash = (37 * hash) + IS_COMPOSE_PREVIEW_LITE_MODE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsComposePreviewLiteMode());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent prototype) {
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
   * Details for Compose Preview Lite Mode event
   * </pre>
   *
   * Protobuf type {@code android_studio.ComposePreviewLiteModeEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ComposePreviewLiteModeEvent)
      com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewLiteModeEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewLiteModeEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.class, com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.newBuilder()
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
      isComposePreviewLiteMode_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewLiteModeEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent build() {
      com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent result = new com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isComposePreviewLiteMode_ = isComposePreviewLiteMode_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasIsComposePreviewLiteMode()) {
        setIsComposePreviewLiteMode(other.getIsComposePreviewLiteMode());
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
              com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType tmpValue =
                  com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              isComposePreviewLiteMode_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType getType() {
      com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType result = com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType.forNumber(type_);
      return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType value) {
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
     * <code>optional .android_studio.ComposePreviewLiteModeEvent.ComposePreviewLiteModeEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean isComposePreviewLiteMode_ ;
    /**
     * <pre>
     * True if Compose Preview Lite Mode is enabled when logging the event.
     * For switch events, the value is logged after the switch happens.
     * </pre>
     *
     * <code>optional bool is_compose_preview_lite_mode = 2;</code>
     * @return Whether the isComposePreviewLiteMode field is set.
     */
    @java.lang.Override
    public boolean hasIsComposePreviewLiteMode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * True if Compose Preview Lite Mode is enabled when logging the event.
     * For switch events, the value is logged after the switch happens.
     * </pre>
     *
     * <code>optional bool is_compose_preview_lite_mode = 2;</code>
     * @return The isComposePreviewLiteMode.
     */
    @java.lang.Override
    public boolean getIsComposePreviewLiteMode() {
      return isComposePreviewLiteMode_;
    }
    /**
     * <pre>
     * True if Compose Preview Lite Mode is enabled when logging the event.
     * For switch events, the value is logged after the switch happens.
     * </pre>
     *
     * <code>optional bool is_compose_preview_lite_mode = 2;</code>
     * @param value The isComposePreviewLiteMode to set.
     * @return This builder for chaining.
     */
    public Builder setIsComposePreviewLiteMode(boolean value) {

      isComposePreviewLiteMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if Compose Preview Lite Mode is enabled when logging the event.
     * For switch events, the value is logged after the switch happens.
     * </pre>
     *
     * <code>optional bool is_compose_preview_lite_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsComposePreviewLiteMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isComposePreviewLiteMode_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ComposePreviewLiteModeEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ComposePreviewLiteModeEvent)
  private static final com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent();
  }

  public static com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ComposePreviewLiteModeEvent>
      PARSER = new com.google.protobuf.AbstractParser<ComposePreviewLiteModeEvent>() {
    @java.lang.Override
    public ComposePreviewLiteModeEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComposePreviewLiteModeEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComposePreviewLiteModeEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ComposePreviewLiteModeEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

