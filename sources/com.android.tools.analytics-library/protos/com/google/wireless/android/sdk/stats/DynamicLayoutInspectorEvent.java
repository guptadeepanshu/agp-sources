// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for dynamic layout inspector (inspector v2) events
 * </pre>
 *
 * Protobuf type {@code android_studio.DynamicLayoutInspectorEvent}
 */
public  final class DynamicLayoutInspectorEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DynamicLayoutInspectorEvent)
    DynamicLayoutInspectorEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicLayoutInspectorEvent.newBuilder() to construct.
  private DynamicLayoutInspectorEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicLayoutInspectorEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicLayoutInspectorEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynamicLayoutInspectorEvent(
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
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType value = com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 18: {
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType}
   */
  public enum DynamicLayoutInspectorEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <pre>
     * Layout inspector was opened
     * </pre>
     *
     * <code>OPEN = 1;</code>
     */
    OPEN(1),
    /**
     * <pre>
     * User tried to attach to a device
     * </pre>
     *
     * <code>ATTACH_REQUEST = 2;</code>
     */
    ATTACH_REQUEST(2),
    /**
     * <pre>
     * Device attached successfully
     * </pre>
     *
     * <code>ATTACH_SUCCESS = 3;</code>
     */
    ATTACH_SUCCESS(3),
    /**
     * <pre>
     * First render after connection
     * </pre>
     *
     * <code>INITIAL_RENDER = 4;</code>
     */
    INITIAL_RENDER(4),
    /**
     * <pre>
     * First render after connection without images
     * </pre>
     *
     * <code>INITIAL_RENDER_NO_PICTURE = 5;</code>
     */
    INITIAL_RENDER_NO_PICTURE(5),
    /**
     * <pre>
     * First render after connection with bitmap images
     * </pre>
     *
     * <code>INITIAL_RENDER_BITMAPS = 6;</code>
     */
    INITIAL_RENDER_BITMAPS(6),
    /**
     * <pre>
     * User tried to attach to a device using compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_REQUEST = 7;</code>
     */
    COMPATIBILITY_REQUEST(7),
    /**
     * <pre>
     * Device attached successfully in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_SUCCESS = 8;</code>
     */
    COMPATIBILITY_SUCCESS(8),
    /**
     * <pre>
     * First render after connection in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_RENDER = 9;</code>
     */
    COMPATIBILITY_RENDER(9),
    /**
     * <pre>
     * First render after connection without images in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_RENDER_NO_PICTURE = 10;</code>
     */
    COMPATIBILITY_RENDER_NO_PICTURE(10),
    /**
     * <pre>
     * Session Data after a session ended
     * </pre>
     *
     * <code>SESSION_DATA = 11;</code>
     */
    SESSION_DATA(11),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <pre>
     * Layout inspector was opened
     * </pre>
     *
     * <code>OPEN = 1;</code>
     */
    public static final int OPEN_VALUE = 1;
    /**
     * <pre>
     * User tried to attach to a device
     * </pre>
     *
     * <code>ATTACH_REQUEST = 2;</code>
     */
    public static final int ATTACH_REQUEST_VALUE = 2;
    /**
     * <pre>
     * Device attached successfully
     * </pre>
     *
     * <code>ATTACH_SUCCESS = 3;</code>
     */
    public static final int ATTACH_SUCCESS_VALUE = 3;
    /**
     * <pre>
     * First render after connection
     * </pre>
     *
     * <code>INITIAL_RENDER = 4;</code>
     */
    public static final int INITIAL_RENDER_VALUE = 4;
    /**
     * <pre>
     * First render after connection without images
     * </pre>
     *
     * <code>INITIAL_RENDER_NO_PICTURE = 5;</code>
     */
    public static final int INITIAL_RENDER_NO_PICTURE_VALUE = 5;
    /**
     * <pre>
     * First render after connection with bitmap images
     * </pre>
     *
     * <code>INITIAL_RENDER_BITMAPS = 6;</code>
     */
    public static final int INITIAL_RENDER_BITMAPS_VALUE = 6;
    /**
     * <pre>
     * User tried to attach to a device using compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_REQUEST = 7;</code>
     */
    public static final int COMPATIBILITY_REQUEST_VALUE = 7;
    /**
     * <pre>
     * Device attached successfully in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_SUCCESS = 8;</code>
     */
    public static final int COMPATIBILITY_SUCCESS_VALUE = 8;
    /**
     * <pre>
     * First render after connection in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_RENDER = 9;</code>
     */
    public static final int COMPATIBILITY_RENDER_VALUE = 9;
    /**
     * <pre>
     * First render after connection without images in compatibility mode
     * </pre>
     *
     * <code>COMPATIBILITY_RENDER_NO_PICTURE = 10;</code>
     */
    public static final int COMPATIBILITY_RENDER_NO_PICTURE_VALUE = 10;
    /**
     * <pre>
     * Session Data after a session ended
     * </pre>
     *
     * <code>SESSION_DATA = 11;</code>
     */
    public static final int SESSION_DATA_VALUE = 11;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DynamicLayoutInspectorEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DynamicLayoutInspectorEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return OPEN;
        case 2: return ATTACH_REQUEST;
        case 3: return ATTACH_SUCCESS;
        case 4: return INITIAL_RENDER;
        case 5: return INITIAL_RENDER_NO_PICTURE;
        case 6: return INITIAL_RENDER_BITMAPS;
        case 7: return COMPATIBILITY_REQUEST;
        case 8: return COMPATIBILITY_SUCCESS;
        case 9: return COMPATIBILITY_RENDER;
        case 10: return COMPATIBILITY_RENDER_NO_PICTURE;
        case 11: return SESSION_DATA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DynamicLayoutInspectorEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DynamicLayoutInspectorEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DynamicLayoutInspectorEventType>() {
            public DynamicLayoutInspectorEventType findValueByNumber(int number) {
              return DynamicLayoutInspectorEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final DynamicLayoutInspectorEventType[] VALUES = values();

    public static DynamicLayoutInspectorEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DynamicLayoutInspectorEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
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
   * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
   * @return The type.
   */
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType result = com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int SESSION_FIELD_NUMBER = 2;
  private com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession session_;
  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
   * @return Whether the session field is set.
   */
  public boolean hasSession() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
   * @return The session.
   */
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession getSession() {
    return session_ == null ? com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.getDefaultInstance() : session_;
  }
  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
   */
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder getSessionOrBuilder() {
    return session_ == null ? com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.getDefaultInstance() : session_;
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
      output.writeMessage(2, getSession());
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
        .computeMessageSize(2, getSession());
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent other = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession()
          .equals(other.getSession())) return false;
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
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent prototype) {
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
   * Details for dynamic layout inspector (inspector v2) events
   * </pre>
   *
   * Protobuf type {@code android_studio.DynamicLayoutInspectorEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DynamicLayoutInspectorEvent)
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.newBuilder()
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
        getSessionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        sessionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent build() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent buildPartial() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent result = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (sessionBuilder_ == null) {
          result.session_ = session_;
        } else {
          result.session_ = sessionBuilder_.build();
        }
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
      if (other instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent other) {
      if (other == com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasSession()) {
        mergeSession(other.getSession());
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
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent) e.getUnfinishedMessage();
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
     * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
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
     * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
     * @return The type.
     */
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType result = com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * Type of event
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType value) {
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
     * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession session_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder> sessionBuilder_;
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     * @return The session.
     */
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public Builder setSession(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public Builder setSession(
        com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public Builder mergeSession(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession value) {
      if (sessionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            session_ != null &&
            session_ != com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.getDefaultInstance()) {
          session_ =
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        sessionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder getSessionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.getDefaultInstance() : session_;
      }
    }
    /**
     * <pre>
     * Data for the layout inspector session
     * </pre>
     *
     * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession.Builder, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DynamicLayoutInspectorEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DynamicLayoutInspectorEvent)
  private static final com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent();
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DynamicLayoutInspectorEvent>
      PARSER = new com.google.protobuf.AbstractParser<DynamicLayoutInspectorEvent>() {
    @java.lang.Override
    public DynamicLayoutInspectorEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynamicLayoutInspectorEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynamicLayoutInspectorEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicLayoutInspectorEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

