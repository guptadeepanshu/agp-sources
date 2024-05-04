// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.ComposePreviewCanvasEvent}
 */
public final class ComposePreviewCanvasEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ComposePreviewCanvasEvent)
    ComposePreviewCanvasEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ComposePreviewCanvasEvent.newBuilder() to construct.
  private ComposePreviewCanvasEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ComposePreviewCanvasEvent() {
    eventType_ = 0;
    layoutName_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ComposePreviewCanvasEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewCanvasEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewCanvasEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.class, com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ComposePreviewCanvasEvent.EventType}
   */
  public enum EventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <code>SELECT_LAYOUT = 1;</code>
     */
    SELECT_LAYOUT(1),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <code>SELECT_LAYOUT = 1;</code>
     */
    public static final int SELECT_LAYOUT_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return SELECT_LAYOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
            public EventType findValueByNumber(int number) {
              return EventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ComposePreviewCanvasEvent.EventType)
  }

  /**
   * Protobuf enum {@code android_studio.ComposePreviewCanvasEvent.LayoutName}
   */
  public enum LayoutName
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_LAYOUT_NAME = 0;</code>
     */
    UNKNOWN_LAYOUT_NAME(0),
    /**
     * <code>LIST = 1;</code>
     */
    LIST(1),
    /**
     * <code>GRID = 2;</code>
     */
    GRID(2),
    /**
     * <code>GROUPED_LIST = 3;</code>
     */
    GROUPED_LIST(3),
    /**
     * <code>GROUPED_GRID = 4;</code>
     */
    GROUPED_GRID(4),
    /**
     * <code>GALLERY = 5;</code>
     */
    GALLERY(5),
    ;

    /**
     * <code>UNKNOWN_LAYOUT_NAME = 0;</code>
     */
    public static final int UNKNOWN_LAYOUT_NAME_VALUE = 0;
    /**
     * <code>LIST = 1;</code>
     */
    public static final int LIST_VALUE = 1;
    /**
     * <code>GRID = 2;</code>
     */
    public static final int GRID_VALUE = 2;
    /**
     * <code>GROUPED_LIST = 3;</code>
     */
    public static final int GROUPED_LIST_VALUE = 3;
    /**
     * <code>GROUPED_GRID = 4;</code>
     */
    public static final int GROUPED_GRID_VALUE = 4;
    /**
     * <code>GALLERY = 5;</code>
     */
    public static final int GALLERY_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LayoutName valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LayoutName forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_LAYOUT_NAME;
        case 1: return LIST;
        case 2: return GRID;
        case 3: return GROUPED_LIST;
        case 4: return GROUPED_GRID;
        case 5: return GALLERY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LayoutName>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LayoutName> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LayoutName>() {
            public LayoutName findValueByNumber(int number) {
              return LayoutName.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final LayoutName[] VALUES = values();

    public static LayoutName valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LayoutName(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ComposePreviewCanvasEvent.LayoutName)
  }

  private int bitField0_;
  public static final int EVENT_TYPE_FIELD_NUMBER = 1;
  private int eventType_;
  /**
   * <pre>
   * What kind of interaction or event happens in the compose preview canvas
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
   * @return Whether the eventType field is set.
   */
  @java.lang.Override public boolean hasEventType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * What kind of interaction or event happens in the compose preview canvas
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
   * @return The eventType.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType getEventType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType result = com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType.valueOf(eventType_);
    return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int LAYOUT_NAME_FIELD_NUMBER = 2;
  private int layoutName_;
  /**
   * <pre>
   * The chosen layout id in the compose preview canvas, i.e. ListLayout
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
   * @return Whether the layoutName field is set.
   */
  @java.lang.Override public boolean hasLayoutName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The chosen layout id in the compose preview canvas, i.e. ListLayout
   * </pre>
   *
   * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
   * @return The layoutName.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName getLayoutName() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName result = com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName.valueOf(layoutName_);
    return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName.UNKNOWN_LAYOUT_NAME : result;
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
      output.writeEnum(1, eventType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, layoutName_);
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
        .computeEnumSize(1, eventType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, layoutName_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent other = (com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent) obj;

    if (hasEventType() != other.hasEventType()) return false;
    if (hasEventType()) {
      if (eventType_ != other.eventType_) return false;
    }
    if (hasLayoutName() != other.hasLayoutName()) return false;
    if (hasLayoutName()) {
      if (layoutName_ != other.layoutName_) return false;
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
    if (hasEventType()) {
      hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + eventType_;
    }
    if (hasLayoutName()) {
      hash = (37 * hash) + LAYOUT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + layoutName_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent prototype) {
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
   * Protobuf type {@code android_studio.ComposePreviewCanvasEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ComposePreviewCanvasEvent)
      com.google.wireless.android.sdk.stats.ComposePreviewCanvasEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewCanvasEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewCanvasEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.class, com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      eventType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      layoutName_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ComposePreviewCanvasEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent build() {
      com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent result = new com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.eventType_ = eventType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.layoutName_ = layoutName_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.getDefaultInstance()) return this;
      if (other.hasEventType()) {
        setEventType(other.getEventType());
      }
      if (other.hasLayoutName()) {
        setLayoutName(other.getLayoutName());
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
              com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType tmpValue =
                  com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                eventType_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName tmpValue =
                  com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                layoutName_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
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

    private int eventType_ = 0;
    /**
     * <pre>
     * What kind of interaction or event happens in the compose preview canvas
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
     * @return Whether the eventType field is set.
     */
    @java.lang.Override public boolean hasEventType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * What kind of interaction or event happens in the compose preview canvas
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType getEventType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType result = com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType.valueOf(eventType_);
      return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * What kind of interaction or event happens in the compose preview canvas
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What kind of interaction or event happens in the compose preview canvas
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.EventType event_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eventType_ = 0;
      onChanged();
      return this;
    }

    private int layoutName_ = 0;
    /**
     * <pre>
     * The chosen layout id in the compose preview canvas, i.e. ListLayout
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
     * @return Whether the layoutName field is set.
     */
    @java.lang.Override public boolean hasLayoutName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The chosen layout id in the compose preview canvas, i.e. ListLayout
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
     * @return The layoutName.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName getLayoutName() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName result = com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName.valueOf(layoutName_);
      return result == null ? com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName.UNKNOWN_LAYOUT_NAME : result;
    }
    /**
     * <pre>
     * The chosen layout id in the compose preview canvas, i.e. ListLayout
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
     * @param value The layoutName to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutName(com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent.LayoutName value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      layoutName_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The chosen layout id in the compose preview canvas, i.e. ListLayout
     * </pre>
     *
     * <code>optional .android_studio.ComposePreviewCanvasEvent.LayoutName layout_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLayoutName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      layoutName_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ComposePreviewCanvasEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ComposePreviewCanvasEvent)
  private static final com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent();
  }

  public static com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ComposePreviewCanvasEvent>
      PARSER = new com.google.protobuf.AbstractParser<ComposePreviewCanvasEvent>() {
    @java.lang.Override
    public ComposePreviewCanvasEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComposePreviewCanvasEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComposePreviewCanvasEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ComposePreviewCanvasEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

