// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Metrics related to C++ header file view in Android Project
 * </pre>
 *
 * Protobuf type {@code android_studio.CppHeadersViewEvent}
 */
public  final class CppHeadersViewEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.CppHeadersViewEvent)
    CppHeadersViewEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CppHeadersViewEvent.newBuilder() to construct.
  private CppHeadersViewEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CppHeadersViewEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CppHeadersViewEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CppHeadersViewEvent(
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
            com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType value = com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType.valueOf(rawValue);
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
            eventDurationMs_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            nodeImmediateChildren_ = input.readInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CppHeadersViewEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CppHeadersViewEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.CppHeadersViewEvent.class, com.google.wireless.android.sdk.stats.CppHeadersViewEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.CppHeadersViewEvent.CppHeadersViewEventType}
   */
  public enum CppHeadersViewEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_CPP_HEADERS_VIEW_EVENT = 0;</code>
     */
    UNKNOWN_CPP_HEADERS_VIEW_EVENT(0),
    /**
     * <pre>
     * Set when the user opens the top include node
     * </pre>
     *
     * <code>OPEN_TOP_INCLUDES_NODE = 1;</code>
     */
    OPEN_TOP_INCLUDES_NODE(1),
    ;

    /**
     * <code>UNKNOWN_CPP_HEADERS_VIEW_EVENT = 0;</code>
     */
    public static final int UNKNOWN_CPP_HEADERS_VIEW_EVENT_VALUE = 0;
    /**
     * <pre>
     * Set when the user opens the top include node
     * </pre>
     *
     * <code>OPEN_TOP_INCLUDES_NODE = 1;</code>
     */
    public static final int OPEN_TOP_INCLUDES_NODE_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CppHeadersViewEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CppHeadersViewEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_CPP_HEADERS_VIEW_EVENT;
        case 1: return OPEN_TOP_INCLUDES_NODE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CppHeadersViewEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CppHeadersViewEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CppHeadersViewEventType>() {
            public CppHeadersViewEventType findValueByNumber(int number) {
              return CppHeadersViewEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.CppHeadersViewEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final CppHeadersViewEventType[] VALUES = values();

    public static CppHeadersViewEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CppHeadersViewEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.CppHeadersViewEvent.CppHeadersViewEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Metrics related to enhanced C++ header files view enabled by
   * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
   * </pre>
   *
   * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Metrics related to enhanced C++ header files view enabled by
   * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
   * </pre>
   *
   * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
   * @return The type.
   */
  public com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType result = com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType.UNKNOWN_CPP_HEADERS_VIEW_EVENT : result;
  }

  public static final int EVENT_DURATION_MS_FIELD_NUMBER = 2;
  private long eventDurationMs_;
  /**
   * <pre>
   * The amount of time taken for the event to complete in milliseconds.
   * </pre>
   *
   * <code>optional int64 event_duration_ms = 2;</code>
   * @return Whether the eventDurationMs field is set.
   */
  public boolean hasEventDurationMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The amount of time taken for the event to complete in milliseconds.
   * </pre>
   *
   * <code>optional int64 event_duration_ms = 2;</code>
   * @return The eventDurationMs.
   */
  public long getEventDurationMs() {
    return eventDurationMs_;
  }

  public static final int NODE_IMMEDIATE_CHILDREN_FIELD_NUMBER = 3;
  private int nodeImmediateChildren_;
  /**
   * <pre>
   * The count of the immediate children of the node that was opened by
   * the user.
   * </pre>
   *
   * <code>optional int32 node_immediate_children = 3;</code>
   * @return Whether the nodeImmediateChildren field is set.
   */
  public boolean hasNodeImmediateChildren() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The count of the immediate children of the node that was opened by
   * the user.
   * </pre>
   *
   * <code>optional int32 node_immediate_children = 3;</code>
   * @return The nodeImmediateChildren.
   */
  public int getNodeImmediateChildren() {
    return nodeImmediateChildren_;
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
      output.writeInt64(2, eventDurationMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, nodeImmediateChildren_);
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
        .computeInt64Size(2, eventDurationMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nodeImmediateChildren_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.CppHeadersViewEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.CppHeadersViewEvent other = (com.google.wireless.android.sdk.stats.CppHeadersViewEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasEventDurationMs() != other.hasEventDurationMs()) return false;
    if (hasEventDurationMs()) {
      if (getEventDurationMs()
          != other.getEventDurationMs()) return false;
    }
    if (hasNodeImmediateChildren() != other.hasNodeImmediateChildren()) return false;
    if (hasNodeImmediateChildren()) {
      if (getNodeImmediateChildren()
          != other.getNodeImmediateChildren()) return false;
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
    if (hasEventDurationMs()) {
      hash = (37 * hash) + EVENT_DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEventDurationMs());
    }
    if (hasNodeImmediateChildren()) {
      hash = (37 * hash) + NODE_IMMEDIATE_CHILDREN_FIELD_NUMBER;
      hash = (53 * hash) + getNodeImmediateChildren();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.CppHeadersViewEvent prototype) {
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
   * Metrics related to C++ header file view in Android Project
   * </pre>
   *
   * Protobuf type {@code android_studio.CppHeadersViewEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.CppHeadersViewEvent)
      com.google.wireless.android.sdk.stats.CppHeadersViewEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CppHeadersViewEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CppHeadersViewEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.CppHeadersViewEvent.class, com.google.wireless.android.sdk.stats.CppHeadersViewEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.CppHeadersViewEvent.newBuilder()
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
      eventDurationMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      nodeImmediateChildren_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CppHeadersViewEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CppHeadersViewEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.CppHeadersViewEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CppHeadersViewEvent build() {
      com.google.wireless.android.sdk.stats.CppHeadersViewEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CppHeadersViewEvent buildPartial() {
      com.google.wireless.android.sdk.stats.CppHeadersViewEvent result = new com.google.wireless.android.sdk.stats.CppHeadersViewEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventDurationMs_ = eventDurationMs_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nodeImmediateChildren_ = nodeImmediateChildren_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.CppHeadersViewEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.CppHeadersViewEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.CppHeadersViewEvent other) {
      if (other == com.google.wireless.android.sdk.stats.CppHeadersViewEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasEventDurationMs()) {
        setEventDurationMs(other.getEventDurationMs());
      }
      if (other.hasNodeImmediateChildren()) {
        setNodeImmediateChildren(other.getNodeImmediateChildren());
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
      com.google.wireless.android.sdk.stats.CppHeadersViewEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.CppHeadersViewEvent) e.getUnfinishedMessage();
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
     * Metrics related to enhanced C++ header files view enabled by
     * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
     * </pre>
     *
     * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Metrics related to enhanced C++ header files view enabled by
     * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
     * </pre>
     *
     * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
     * @return The type.
     */
    public com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType result = com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType.UNKNOWN_CPP_HEADERS_VIEW_EVENT : result;
    }
    /**
     * <pre>
     * Metrics related to enhanced C++ header files view enabled by
     * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
     * </pre>
     *
     * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.CppHeadersViewEvent.CppHeadersViewEventType value) {
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
     * Metrics related to enhanced C++ header files view enabled by
     * under ENABLE_ENHANCED_NATIVE_HEADER_SUPPORT flag
     * </pre>
     *
     * <code>optional .android_studio.CppHeadersViewEvent.CppHeadersViewEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long eventDurationMs_ ;
    /**
     * <pre>
     * The amount of time taken for the event to complete in milliseconds.
     * </pre>
     *
     * <code>optional int64 event_duration_ms = 2;</code>
     * @return Whether the eventDurationMs field is set.
     */
    public boolean hasEventDurationMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The amount of time taken for the event to complete in milliseconds.
     * </pre>
     *
     * <code>optional int64 event_duration_ms = 2;</code>
     * @return The eventDurationMs.
     */
    public long getEventDurationMs() {
      return eventDurationMs_;
    }
    /**
     * <pre>
     * The amount of time taken for the event to complete in milliseconds.
     * </pre>
     *
     * <code>optional int64 event_duration_ms = 2;</code>
     * @param value The eventDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setEventDurationMs(long value) {
      bitField0_ |= 0x00000002;
      eventDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of time taken for the event to complete in milliseconds.
     * </pre>
     *
     * <code>optional int64 event_duration_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventDurationMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventDurationMs_ = 0L;
      onChanged();
      return this;
    }

    private int nodeImmediateChildren_ ;
    /**
     * <pre>
     * The count of the immediate children of the node that was opened by
     * the user.
     * </pre>
     *
     * <code>optional int32 node_immediate_children = 3;</code>
     * @return Whether the nodeImmediateChildren field is set.
     */
    public boolean hasNodeImmediateChildren() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The count of the immediate children of the node that was opened by
     * the user.
     * </pre>
     *
     * <code>optional int32 node_immediate_children = 3;</code>
     * @return The nodeImmediateChildren.
     */
    public int getNodeImmediateChildren() {
      return nodeImmediateChildren_;
    }
    /**
     * <pre>
     * The count of the immediate children of the node that was opened by
     * the user.
     * </pre>
     *
     * <code>optional int32 node_immediate_children = 3;</code>
     * @param value The nodeImmediateChildren to set.
     * @return This builder for chaining.
     */
    public Builder setNodeImmediateChildren(int value) {
      bitField0_ |= 0x00000004;
      nodeImmediateChildren_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The count of the immediate children of the node that was opened by
     * the user.
     * </pre>
     *
     * <code>optional int32 node_immediate_children = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeImmediateChildren() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nodeImmediateChildren_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.CppHeadersViewEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.CppHeadersViewEvent)
  private static final com.google.wireless.android.sdk.stats.CppHeadersViewEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.CppHeadersViewEvent();
  }

  public static com.google.wireless.android.sdk.stats.CppHeadersViewEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CppHeadersViewEvent>
      PARSER = new com.google.protobuf.AbstractParser<CppHeadersViewEvent>() {
    @java.lang.Override
    public CppHeadersViewEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CppHeadersViewEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CppHeadersViewEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CppHeadersViewEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CppHeadersViewEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

