// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Data collected by IntelliJ when a run is finished
 * </pre>
 *
 * Protobuf type {@code android_studio.RunFinishData}
 */
public final class RunFinishData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.RunFinishData)
    RunFinishDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunFinishData.newBuilder() to construct.
  private RunFinishData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunFinishData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunFinishData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_RunFinishData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_RunFinishData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.RunFinishData.class, com.google.wireless.android.sdk.stats.RunFinishData.Builder.class);
  }

  private int bitField0_;
  public static final int DURATION_MS_FIELD_NUMBER = 1;
  private long durationMs_ = 0L;
  /**
   * <pre>
   * duration of the run in ms
   * </pre>
   *
   * <code>optional int64 duration_ms = 1;</code>
   * @return Whether the durationMs field is set.
   */
  @java.lang.Override
  public boolean hasDurationMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * duration of the run in ms
   * </pre>
   *
   * <code>optional int64 duration_ms = 1;</code>
   * @return The durationMs.
   */
  @java.lang.Override
  public long getDurationMs() {
    return durationMs_;
  }

  public static final int IDE_ACTIVITY_FIELD_NUMBER = 2;
  private int ideActivity_ = 0;
  /**
   * <pre>
   * Unique id for activity
   * </pre>
   *
   * <code>optional int32 ide_activity = 2;</code>
   * @return Whether the ideActivity field is set.
   */
  @java.lang.Override
  public boolean hasIdeActivity() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Unique id for activity
   * </pre>
   *
   * <code>optional int32 ide_activity = 2;</code>
   * @return The ideActivity.
   */
  @java.lang.Override
  public int getIdeActivity() {
    return ideActivity_;
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
      output.writeInt64(1, durationMs_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, ideActivity_);
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
        .computeInt64Size(1, durationMs_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ideActivity_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.RunFinishData)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.RunFinishData other = (com.google.wireless.android.sdk.stats.RunFinishData) obj;

    if (hasDurationMs() != other.hasDurationMs()) return false;
    if (hasDurationMs()) {
      if (getDurationMs()
          != other.getDurationMs()) return false;
    }
    if (hasIdeActivity() != other.hasIdeActivity()) return false;
    if (hasIdeActivity()) {
      if (getIdeActivity()
          != other.getIdeActivity()) return false;
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
    if (hasDurationMs()) {
      hash = (37 * hash) + DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDurationMs());
    }
    if (hasIdeActivity()) {
      hash = (37 * hash) + IDE_ACTIVITY_FIELD_NUMBER;
      hash = (53 * hash) + getIdeActivity();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.RunFinishData parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.RunFinishData prototype) {
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
   * Data collected by IntelliJ when a run is finished
   * </pre>
   *
   * Protobuf type {@code android_studio.RunFinishData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.RunFinishData)
      com.google.wireless.android.sdk.stats.RunFinishDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_RunFinishData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_RunFinishData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.RunFinishData.class, com.google.wireless.android.sdk.stats.RunFinishData.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.RunFinishData.newBuilder()
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
      durationMs_ = 0L;
      ideActivity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_RunFinishData_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.RunFinishData getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.RunFinishData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.RunFinishData build() {
      com.google.wireless.android.sdk.stats.RunFinishData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.RunFinishData buildPartial() {
      com.google.wireless.android.sdk.stats.RunFinishData result = new com.google.wireless.android.sdk.stats.RunFinishData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.RunFinishData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.durationMs_ = durationMs_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ideActivity_ = ideActivity_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.RunFinishData) {
        return mergeFrom((com.google.wireless.android.sdk.stats.RunFinishData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.RunFinishData other) {
      if (other == com.google.wireless.android.sdk.stats.RunFinishData.getDefaultInstance()) return this;
      if (other.hasDurationMs()) {
        setDurationMs(other.getDurationMs());
      }
      if (other.hasIdeActivity()) {
        setIdeActivity(other.getIdeActivity());
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
              durationMs_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              ideActivity_ = input.readInt32();
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

    private long durationMs_ ;
    /**
     * <pre>
     * duration of the run in ms
     * </pre>
     *
     * <code>optional int64 duration_ms = 1;</code>
     * @return Whether the durationMs field is set.
     */
    @java.lang.Override
    public boolean hasDurationMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * duration of the run in ms
     * </pre>
     *
     * <code>optional int64 duration_ms = 1;</code>
     * @return The durationMs.
     */
    @java.lang.Override
    public long getDurationMs() {
      return durationMs_;
    }
    /**
     * <pre>
     * duration of the run in ms
     * </pre>
     *
     * <code>optional int64 duration_ms = 1;</code>
     * @param value The durationMs to set.
     * @return This builder for chaining.
     */
    public Builder setDurationMs(long value) {

      durationMs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * duration of the run in ms
     * </pre>
     *
     * <code>optional int64 duration_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      durationMs_ = 0L;
      onChanged();
      return this;
    }

    private int ideActivity_ ;
    /**
     * <pre>
     * Unique id for activity
     * </pre>
     *
     * <code>optional int32 ide_activity = 2;</code>
     * @return Whether the ideActivity field is set.
     */
    @java.lang.Override
    public boolean hasIdeActivity() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Unique id for activity
     * </pre>
     *
     * <code>optional int32 ide_activity = 2;</code>
     * @return The ideActivity.
     */
    @java.lang.Override
    public int getIdeActivity() {
      return ideActivity_;
    }
    /**
     * <pre>
     * Unique id for activity
     * </pre>
     *
     * <code>optional int32 ide_activity = 2;</code>
     * @param value The ideActivity to set.
     * @return This builder for chaining.
     */
    public Builder setIdeActivity(int value) {

      ideActivity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique id for activity
     * </pre>
     *
     * <code>optional int32 ide_activity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdeActivity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ideActivity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.RunFinishData)
  }

  // @@protoc_insertion_point(class_scope:android_studio.RunFinishData)
  private static final com.google.wireless.android.sdk.stats.RunFinishData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.RunFinishData();
  }

  public static com.google.wireless.android.sdk.stats.RunFinishData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RunFinishData>
      PARSER = new com.google.protobuf.AbstractParser<RunFinishData>() {
    @java.lang.Override
    public RunFinishData parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunFinishData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunFinishData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.RunFinishData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

