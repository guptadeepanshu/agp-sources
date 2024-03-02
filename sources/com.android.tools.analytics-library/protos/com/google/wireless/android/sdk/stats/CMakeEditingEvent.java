// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Metrics related to editing CMake files.
 * </pre>
 *
 * Protobuf type {@code android_studio.CMakeEditingEvent}
 */
public final class CMakeEditingEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.CMakeEditingEvent)
    CMakeEditingEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CMakeEditingEvent.newBuilder() to construct.
  private CMakeEditingEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CMakeEditingEvent() {
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CMakeEditingEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CMakeEditingEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CMakeEditingEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.CMakeEditingEvent.class, com.google.wireless.android.sdk.stats.CMakeEditingEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.CMakeEditingEvent.CMakeEditingEventKind}
   */
  public enum CMakeEditingEventKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_CMAKE_EDITING_EVENT = 0;</code>
     */
    UNKNOWN_CMAKE_EDITING_EVENT(0),
    /**
     * <pre>
     * Set when syntax highlighting for CMake is first used.
     * </pre>
     *
     * <code>SYNTAX_HIGHLIGHTING = 1;</code>
     */
    SYNTAX_HIGHLIGHTING(1),
    /**
     * <pre>
     * Set when code completion is first used.
     * </pre>
     *
     * <code>CODE_COMPLETION = 2;</code>
     */
    CODE_COMPLETION(2),
    ;

    /**
     * <code>UNKNOWN_CMAKE_EDITING_EVENT = 0;</code>
     */
    public static final int UNKNOWN_CMAKE_EDITING_EVENT_VALUE = 0;
    /**
     * <pre>
     * Set when syntax highlighting for CMake is first used.
     * </pre>
     *
     * <code>SYNTAX_HIGHLIGHTING = 1;</code>
     */
    public static final int SYNTAX_HIGHLIGHTING_VALUE = 1;
    /**
     * <pre>
     * Set when code completion is first used.
     * </pre>
     *
     * <code>CODE_COMPLETION = 2;</code>
     */
    public static final int CODE_COMPLETION_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CMakeEditingEventKind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CMakeEditingEventKind forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_CMAKE_EDITING_EVENT;
        case 1: return SYNTAX_HIGHLIGHTING;
        case 2: return CODE_COMPLETION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CMakeEditingEventKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CMakeEditingEventKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CMakeEditingEventKind>() {
            public CMakeEditingEventKind findValueByNumber(int number) {
              return CMakeEditingEventKind.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.CMakeEditingEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final CMakeEditingEventKind[] VALUES = values();

    public static CMakeEditingEventKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CMakeEditingEventKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.CMakeEditingEvent.CMakeEditingEventKind)
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_;
  /**
   * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  @java.lang.Override public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind getKind() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind result = com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind.valueOf(kind_);
    return result == null ? com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind.UNKNOWN_CMAKE_EDITING_EVENT : result;
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
  @java.lang.Override
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
  @java.lang.Override
  public long getEventDurationMs() {
    return eventDurationMs_;
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
      output.writeInt64(2, eventDurationMs_);
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
        .computeInt64Size(2, eventDurationMs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.CMakeEditingEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.CMakeEditingEvent other = (com.google.wireless.android.sdk.stats.CMakeEditingEvent) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (kind_ != other.kind_) return false;
    }
    if (hasEventDurationMs() != other.hasEventDurationMs()) return false;
    if (hasEventDurationMs()) {
      if (getEventDurationMs()
          != other.getEventDurationMs()) return false;
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
    if (hasEventDurationMs()) {
      hash = (37 * hash) + EVENT_DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEventDurationMs());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.CMakeEditingEvent prototype) {
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
   * Metrics related to editing CMake files.
   * </pre>
   *
   * Protobuf type {@code android_studio.CMakeEditingEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.CMakeEditingEvent)
      com.google.wireless.android.sdk.stats.CMakeEditingEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CMakeEditingEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CMakeEditingEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.CMakeEditingEvent.class, com.google.wireless.android.sdk.stats.CMakeEditingEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.CMakeEditingEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      kind_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      eventDurationMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CMakeEditingEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CMakeEditingEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.CMakeEditingEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CMakeEditingEvent build() {
      com.google.wireless.android.sdk.stats.CMakeEditingEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CMakeEditingEvent buildPartial() {
      com.google.wireless.android.sdk.stats.CMakeEditingEvent result = new com.google.wireless.android.sdk.stats.CMakeEditingEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.kind_ = kind_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventDurationMs_ = eventDurationMs_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.CMakeEditingEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.CMakeEditingEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.CMakeEditingEvent other) {
      if (other == com.google.wireless.android.sdk.stats.CMakeEditingEvent.getDefaultInstance()) return this;
      if (other.hasKind()) {
        setKind(other.getKind());
      }
      if (other.hasEventDurationMs()) {
        setEventDurationMs(other.getEventDurationMs());
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
              com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind tmpValue =
                  com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                kind_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              eventDurationMs_ = input.readInt64();
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

    private int kind_ = 0;
    /**
     * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
     * @return Whether the kind field is set.
     */
    @java.lang.Override public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind getKind() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind result = com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind.valueOf(kind_);
      return result == null ? com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind.UNKNOWN_CMAKE_EDITING_EVENT : result;
    }
    /**
     * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.google.wireless.android.sdk.stats.CMakeEditingEvent.CMakeEditingEventKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.CMakeEditingEvent.CMakeEditingEventKind kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
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
    @java.lang.Override
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
    @java.lang.Override
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


    // @@protoc_insertion_point(builder_scope:android_studio.CMakeEditingEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.CMakeEditingEvent)
  private static final com.google.wireless.android.sdk.stats.CMakeEditingEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.CMakeEditingEvent();
  }

  public static com.google.wireless.android.sdk.stats.CMakeEditingEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CMakeEditingEvent>
      PARSER = new com.google.protobuf.AbstractParser<CMakeEditingEvent>() {
    @java.lang.Override
    public CMakeEditingEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<CMakeEditingEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CMakeEditingEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CMakeEditingEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

