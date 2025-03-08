// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Metrics for LocationV2
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorLocationV2}
 */
public final class EmulatorLocationV2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorLocationV2)
    EmulatorLocationV2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorLocationV2.newBuilder() to construct.
  private EmulatorLocationV2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorLocationV2() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorLocationV2();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorLocationV2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorLocationV2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorLocationV2.class, com.google.wireless.android.sdk.stats.EmulatorLocationV2.Builder.class);
  }

  private int bitField0_;
  public static final int SET_LOC_COUNT_FIELD_NUMBER = 1;
  private int setLocCount_ = 0;
  /**
   * <pre>
   * Count for "Set Location" button
   * </pre>
   *
   * <code>optional uint32 set_loc_count = 1;</code>
   * @return Whether the setLocCount field is set.
   */
  @java.lang.Override
  public boolean hasSetLocCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Count for "Set Location" button
   * </pre>
   *
   * <code>optional uint32 set_loc_count = 1;</code>
   * @return The setLocCount.
   */
  @java.lang.Override
  public int getSetLocCount() {
    return setLocCount_;
  }

  public static final int PLAY_ROUTE_COUNT_FIELD_NUMBER = 2;
  private int playRouteCount_ = 0;
  /**
   * <pre>
   * Count for "Play route" button
   * </pre>
   *
   * <code>optional uint32 play_route_count = 2;</code>
   * @return Whether the playRouteCount field is set.
   */
  @java.lang.Override
  public boolean hasPlayRouteCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Count for "Play route" button
   * </pre>
   *
   * <code>optional uint32 play_route_count = 2;</code>
   * @return The playRouteCount.
   */
  @java.lang.Override
  public int getPlayRouteCount() {
    return playRouteCount_;
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
      output.writeUInt32(1, setLocCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, playRouteCount_);
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
        .computeUInt32Size(1, setLocCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, playRouteCount_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorLocationV2)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorLocationV2 other = (com.google.wireless.android.sdk.stats.EmulatorLocationV2) obj;

    if (hasSetLocCount() != other.hasSetLocCount()) return false;
    if (hasSetLocCount()) {
      if (getSetLocCount()
          != other.getSetLocCount()) return false;
    }
    if (hasPlayRouteCount() != other.hasPlayRouteCount()) return false;
    if (hasPlayRouteCount()) {
      if (getPlayRouteCount()
          != other.getPlayRouteCount()) return false;
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
    if (hasSetLocCount()) {
      hash = (37 * hash) + SET_LOC_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getSetLocCount();
    }
    if (hasPlayRouteCount()) {
      hash = (37 * hash) + PLAY_ROUTE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getPlayRouteCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorLocationV2 prototype) {
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
   * Metrics for LocationV2
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorLocationV2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorLocationV2)
      com.google.wireless.android.sdk.stats.EmulatorLocationV2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorLocationV2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorLocationV2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorLocationV2.class, com.google.wireless.android.sdk.stats.EmulatorLocationV2.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorLocationV2.newBuilder()
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
      setLocCount_ = 0;
      playRouteCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorLocationV2_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorLocationV2 getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorLocationV2.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorLocationV2 build() {
      com.google.wireless.android.sdk.stats.EmulatorLocationV2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorLocationV2 buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorLocationV2 result = new com.google.wireless.android.sdk.stats.EmulatorLocationV2(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.EmulatorLocationV2 result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.setLocCount_ = setLocCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.playRouteCount_ = playRouteCount_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorLocationV2) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorLocationV2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorLocationV2 other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorLocationV2.getDefaultInstance()) return this;
      if (other.hasSetLocCount()) {
        setSetLocCount(other.getSetLocCount());
      }
      if (other.hasPlayRouteCount()) {
        setPlayRouteCount(other.getPlayRouteCount());
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
              setLocCount_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              playRouteCount_ = input.readUInt32();
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

    private int setLocCount_ ;
    /**
     * <pre>
     * Count for "Set Location" button
     * </pre>
     *
     * <code>optional uint32 set_loc_count = 1;</code>
     * @return Whether the setLocCount field is set.
     */
    @java.lang.Override
    public boolean hasSetLocCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Count for "Set Location" button
     * </pre>
     *
     * <code>optional uint32 set_loc_count = 1;</code>
     * @return The setLocCount.
     */
    @java.lang.Override
    public int getSetLocCount() {
      return setLocCount_;
    }
    /**
     * <pre>
     * Count for "Set Location" button
     * </pre>
     *
     * <code>optional uint32 set_loc_count = 1;</code>
     * @param value The setLocCount to set.
     * @return This builder for chaining.
     */
    public Builder setSetLocCount(int value) {

      setLocCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count for "Set Location" button
     * </pre>
     *
     * <code>optional uint32 set_loc_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSetLocCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      setLocCount_ = 0;
      onChanged();
      return this;
    }

    private int playRouteCount_ ;
    /**
     * <pre>
     * Count for "Play route" button
     * </pre>
     *
     * <code>optional uint32 play_route_count = 2;</code>
     * @return Whether the playRouteCount field is set.
     */
    @java.lang.Override
    public boolean hasPlayRouteCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Count for "Play route" button
     * </pre>
     *
     * <code>optional uint32 play_route_count = 2;</code>
     * @return The playRouteCount.
     */
    @java.lang.Override
    public int getPlayRouteCount() {
      return playRouteCount_;
    }
    /**
     * <pre>
     * Count for "Play route" button
     * </pre>
     *
     * <code>optional uint32 play_route_count = 2;</code>
     * @param value The playRouteCount to set.
     * @return This builder for chaining.
     */
    public Builder setPlayRouteCount(int value) {

      playRouteCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count for "Play route" button
     * </pre>
     *
     * <code>optional uint32 play_route_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayRouteCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      playRouteCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorLocationV2)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorLocationV2)
  private static final com.google.wireless.android.sdk.stats.EmulatorLocationV2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorLocationV2();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorLocationV2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorLocationV2>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorLocationV2>() {
    @java.lang.Override
    public EmulatorLocationV2 parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmulatorLocationV2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorLocationV2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorLocationV2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

