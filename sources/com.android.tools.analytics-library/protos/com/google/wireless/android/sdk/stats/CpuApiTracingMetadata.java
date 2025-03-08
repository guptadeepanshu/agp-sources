// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Data associated with API-initiated tracing
 * </pre>
 *
 * Protobuf type {@code android_studio.CpuApiTracingMetadata}
 */
public final class CpuApiTracingMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.CpuApiTracingMetadata)
    CpuApiTracingMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CpuApiTracingMetadata.newBuilder() to construct.
  private CpuApiTracingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CpuApiTracingMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CpuApiTracingMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuApiTracingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuApiTracingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.class, com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int USE_SAMPLING_FIELD_NUMBER = 1;
  private boolean useSampling_ = false;
  /**
   * <pre>
   * True if using sampling; false if using instrumentation.
   * </pre>
   *
   * <code>optional bool use_sampling = 1;</code>
   * @return Whether the useSampling field is set.
   */
  @java.lang.Override
  public boolean hasUseSampling() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * True if using sampling; false if using instrumentation.
   * </pre>
   *
   * <code>optional bool use_sampling = 1;</code>
   * @return The useSampling.
   */
  @java.lang.Override
  public boolean getUseSampling() {
    return useSampling_;
  }

  public static final int ARG_TRACE_PATH_FIELD_NUMBER = 2;
  private boolean argTracePath_ = false;
  /**
   * <pre>
   * A trace path is given and not null (we don't log the path as it might
   * contain PII).
   * </pre>
   *
   * <code>optional bool arg_trace_path = 2;</code>
   * @return Whether the argTracePath field is set.
   */
  @java.lang.Override
  public boolean hasArgTracePath() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A trace path is given and not null (we don't log the path as it might
   * contain PII).
   * </pre>
   *
   * <code>optional bool arg_trace_path = 2;</code>
   * @return The argTracePath.
   */
  @java.lang.Override
  public boolean getArgTracePath() {
    return argTracePath_;
  }

  public static final int ARG_BUFFER_SIZE_FIELD_NUMBER = 3;
  private int argBufferSize_ = 0;
  /**
   * <pre>
   * Buffer size as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_buffer_size = 3;</code>
   * @return Whether the argBufferSize field is set.
   */
  @java.lang.Override
  public boolean hasArgBufferSize() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Buffer size as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_buffer_size = 3;</code>
   * @return The argBufferSize.
   */
  @java.lang.Override
  public int getArgBufferSize() {
    return argBufferSize_;
  }

  public static final int ARG_FLAGS_FIELD_NUMBER = 4;
  private int argFlags_ = 0;
  /**
   * <pre>
   * Flags as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_flags = 4;</code>
   * @return Whether the argFlags field is set.
   */
  @java.lang.Override
  public boolean hasArgFlags() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Flags as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_flags = 4;</code>
   * @return The argFlags.
   */
  @java.lang.Override
  public int getArgFlags() {
    return argFlags_;
  }

  public static final int ARG_INTERVAL_US_FIELD_NUMBER = 5;
  private int argIntervalUs_ = 0;
  /**
   * <pre>
   * Sampling interval as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_interval_us = 5;</code>
   * @return Whether the argIntervalUs field is set.
   */
  @java.lang.Override
  public boolean hasArgIntervalUs() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Sampling interval as a given API argument (-1 if unavailable).
   * </pre>
   *
   * <code>optional int32 arg_interval_us = 5;</code>
   * @return The argIntervalUs.
   */
  @java.lang.Override
  public int getArgIntervalUs() {
    return argIntervalUs_;
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
      output.writeBool(1, useSampling_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, argTracePath_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, argBufferSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, argFlags_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt32(5, argIntervalUs_);
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
        .computeBoolSize(1, useSampling_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, argTracePath_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, argBufferSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, argFlags_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, argIntervalUs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.CpuApiTracingMetadata)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.CpuApiTracingMetadata other = (com.google.wireless.android.sdk.stats.CpuApiTracingMetadata) obj;

    if (hasUseSampling() != other.hasUseSampling()) return false;
    if (hasUseSampling()) {
      if (getUseSampling()
          != other.getUseSampling()) return false;
    }
    if (hasArgTracePath() != other.hasArgTracePath()) return false;
    if (hasArgTracePath()) {
      if (getArgTracePath()
          != other.getArgTracePath()) return false;
    }
    if (hasArgBufferSize() != other.hasArgBufferSize()) return false;
    if (hasArgBufferSize()) {
      if (getArgBufferSize()
          != other.getArgBufferSize()) return false;
    }
    if (hasArgFlags() != other.hasArgFlags()) return false;
    if (hasArgFlags()) {
      if (getArgFlags()
          != other.getArgFlags()) return false;
    }
    if (hasArgIntervalUs() != other.hasArgIntervalUs()) return false;
    if (hasArgIntervalUs()) {
      if (getArgIntervalUs()
          != other.getArgIntervalUs()) return false;
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
    if (hasUseSampling()) {
      hash = (37 * hash) + USE_SAMPLING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseSampling());
    }
    if (hasArgTracePath()) {
      hash = (37 * hash) + ARG_TRACE_PATH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getArgTracePath());
    }
    if (hasArgBufferSize()) {
      hash = (37 * hash) + ARG_BUFFER_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getArgBufferSize();
    }
    if (hasArgFlags()) {
      hash = (37 * hash) + ARG_FLAGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgFlags();
    }
    if (hasArgIntervalUs()) {
      hash = (37 * hash) + ARG_INTERVAL_US_FIELD_NUMBER;
      hash = (53 * hash) + getArgIntervalUs();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.CpuApiTracingMetadata prototype) {
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
   * Data associated with API-initiated tracing
   * </pre>
   *
   * Protobuf type {@code android_studio.CpuApiTracingMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.CpuApiTracingMetadata)
      com.google.wireless.android.sdk.stats.CpuApiTracingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuApiTracingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuApiTracingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.class, com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.newBuilder()
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
      useSampling_ = false;
      argTracePath_ = false;
      argBufferSize_ = 0;
      argFlags_ = 0;
      argIntervalUs_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuApiTracingMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuApiTracingMetadata getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuApiTracingMetadata build() {
      com.google.wireless.android.sdk.stats.CpuApiTracingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuApiTracingMetadata buildPartial() {
      com.google.wireless.android.sdk.stats.CpuApiTracingMetadata result = new com.google.wireless.android.sdk.stats.CpuApiTracingMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.CpuApiTracingMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.useSampling_ = useSampling_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.argTracePath_ = argTracePath_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.argBufferSize_ = argBufferSize_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.argFlags_ = argFlags_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.argIntervalUs_ = argIntervalUs_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.CpuApiTracingMetadata) {
        return mergeFrom((com.google.wireless.android.sdk.stats.CpuApiTracingMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.CpuApiTracingMetadata other) {
      if (other == com.google.wireless.android.sdk.stats.CpuApiTracingMetadata.getDefaultInstance()) return this;
      if (other.hasUseSampling()) {
        setUseSampling(other.getUseSampling());
      }
      if (other.hasArgTracePath()) {
        setArgTracePath(other.getArgTracePath());
      }
      if (other.hasArgBufferSize()) {
        setArgBufferSize(other.getArgBufferSize());
      }
      if (other.hasArgFlags()) {
        setArgFlags(other.getArgFlags());
      }
      if (other.hasArgIntervalUs()) {
        setArgIntervalUs(other.getArgIntervalUs());
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
              useSampling_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              argTracePath_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              argBufferSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              argFlags_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              argIntervalUs_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private boolean useSampling_ ;
    /**
     * <pre>
     * True if using sampling; false if using instrumentation.
     * </pre>
     *
     * <code>optional bool use_sampling = 1;</code>
     * @return Whether the useSampling field is set.
     */
    @java.lang.Override
    public boolean hasUseSampling() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * True if using sampling; false if using instrumentation.
     * </pre>
     *
     * <code>optional bool use_sampling = 1;</code>
     * @return The useSampling.
     */
    @java.lang.Override
    public boolean getUseSampling() {
      return useSampling_;
    }
    /**
     * <pre>
     * True if using sampling; false if using instrumentation.
     * </pre>
     *
     * <code>optional bool use_sampling = 1;</code>
     * @param value The useSampling to set.
     * @return This builder for chaining.
     */
    public Builder setUseSampling(boolean value) {

      useSampling_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if using sampling; false if using instrumentation.
     * </pre>
     *
     * <code>optional bool use_sampling = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseSampling() {
      bitField0_ = (bitField0_ & ~0x00000001);
      useSampling_ = false;
      onChanged();
      return this;
    }

    private boolean argTracePath_ ;
    /**
     * <pre>
     * A trace path is given and not null (we don't log the path as it might
     * contain PII).
     * </pre>
     *
     * <code>optional bool arg_trace_path = 2;</code>
     * @return Whether the argTracePath field is set.
     */
    @java.lang.Override
    public boolean hasArgTracePath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A trace path is given and not null (we don't log the path as it might
     * contain PII).
     * </pre>
     *
     * <code>optional bool arg_trace_path = 2;</code>
     * @return The argTracePath.
     */
    @java.lang.Override
    public boolean getArgTracePath() {
      return argTracePath_;
    }
    /**
     * <pre>
     * A trace path is given and not null (we don't log the path as it might
     * contain PII).
     * </pre>
     *
     * <code>optional bool arg_trace_path = 2;</code>
     * @param value The argTracePath to set.
     * @return This builder for chaining.
     */
    public Builder setArgTracePath(boolean value) {

      argTracePath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A trace path is given and not null (we don't log the path as it might
     * contain PII).
     * </pre>
     *
     * <code>optional bool arg_trace_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgTracePath() {
      bitField0_ = (bitField0_ & ~0x00000002);
      argTracePath_ = false;
      onChanged();
      return this;
    }

    private int argBufferSize_ ;
    /**
     * <pre>
     * Buffer size as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_buffer_size = 3;</code>
     * @return Whether the argBufferSize field is set.
     */
    @java.lang.Override
    public boolean hasArgBufferSize() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Buffer size as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_buffer_size = 3;</code>
     * @return The argBufferSize.
     */
    @java.lang.Override
    public int getArgBufferSize() {
      return argBufferSize_;
    }
    /**
     * <pre>
     * Buffer size as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_buffer_size = 3;</code>
     * @param value The argBufferSize to set.
     * @return This builder for chaining.
     */
    public Builder setArgBufferSize(int value) {

      argBufferSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Buffer size as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_buffer_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgBufferSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      argBufferSize_ = 0;
      onChanged();
      return this;
    }

    private int argFlags_ ;
    /**
     * <pre>
     * Flags as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_flags = 4;</code>
     * @return Whether the argFlags field is set.
     */
    @java.lang.Override
    public boolean hasArgFlags() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Flags as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_flags = 4;</code>
     * @return The argFlags.
     */
    @java.lang.Override
    public int getArgFlags() {
      return argFlags_;
    }
    /**
     * <pre>
     * Flags as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_flags = 4;</code>
     * @param value The argFlags to set.
     * @return This builder for chaining.
     */
    public Builder setArgFlags(int value) {

      argFlags_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flags as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_flags = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgFlags() {
      bitField0_ = (bitField0_ & ~0x00000008);
      argFlags_ = 0;
      onChanged();
      return this;
    }

    private int argIntervalUs_ ;
    /**
     * <pre>
     * Sampling interval as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_interval_us = 5;</code>
     * @return Whether the argIntervalUs field is set.
     */
    @java.lang.Override
    public boolean hasArgIntervalUs() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Sampling interval as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_interval_us = 5;</code>
     * @return The argIntervalUs.
     */
    @java.lang.Override
    public int getArgIntervalUs() {
      return argIntervalUs_;
    }
    /**
     * <pre>
     * Sampling interval as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_interval_us = 5;</code>
     * @param value The argIntervalUs to set.
     * @return This builder for chaining.
     */
    public Builder setArgIntervalUs(int value) {

      argIntervalUs_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sampling interval as a given API argument (-1 if unavailable).
     * </pre>
     *
     * <code>optional int32 arg_interval_us = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgIntervalUs() {
      bitField0_ = (bitField0_ & ~0x00000010);
      argIntervalUs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.CpuApiTracingMetadata)
  }

  // @@protoc_insertion_point(class_scope:android_studio.CpuApiTracingMetadata)
  private static final com.google.wireless.android.sdk.stats.CpuApiTracingMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.CpuApiTracingMetadata();
  }

  public static com.google.wireless.android.sdk.stats.CpuApiTracingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CpuApiTracingMetadata>
      PARSER = new com.google.protobuf.AbstractParser<CpuApiTracingMetadata>() {
    @java.lang.Override
    public CpuApiTracingMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CpuApiTracingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpuApiTracingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CpuApiTracingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

