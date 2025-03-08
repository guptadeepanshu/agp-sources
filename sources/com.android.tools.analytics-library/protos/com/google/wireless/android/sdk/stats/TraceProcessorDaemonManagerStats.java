// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.TraceProcessorDaemonManagerStats}
 */
public final class TraceProcessorDaemonManagerStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.TraceProcessorDaemonManagerStats)
    TraceProcessorDaemonManagerStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TraceProcessorDaemonManagerStats.newBuilder() to construct.
  private TraceProcessorDaemonManagerStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TraceProcessorDaemonManagerStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TraceProcessorDaemonManagerStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonManagerStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonManagerStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.class, com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_TO_SPAWN_MS_FIELD_NUMBER = 1;
  private long timeToSpawnMs_ = 0L;
  /**
   * <pre>
   * Time to spawn the daemon in milliseconds
   * </pre>
   *
   * <code>optional uint64 time_to_spawn_ms = 1;</code>
   * @return Whether the timeToSpawnMs field is set.
   */
  @java.lang.Override
  public boolean hasTimeToSpawnMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Time to spawn the daemon in milliseconds
   * </pre>
   *
   * <code>optional uint64 time_to_spawn_ms = 1;</code>
   * @return The timeToSpawnMs.
   */
  @java.lang.Override
  public long getTimeToSpawnMs() {
    return timeToSpawnMs_;
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
      output.writeUInt64(1, timeToSpawnMs_);
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
        .computeUInt64Size(1, timeToSpawnMs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats other = (com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats) obj;

    if (hasTimeToSpawnMs() != other.hasTimeToSpawnMs()) return false;
    if (hasTimeToSpawnMs()) {
      if (getTimeToSpawnMs()
          != other.getTimeToSpawnMs()) return false;
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
    if (hasTimeToSpawnMs()) {
      hash = (37 * hash) + TIME_TO_SPAWN_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeToSpawnMs());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats prototype) {
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
   * Protobuf type {@code android_studio.TraceProcessorDaemonManagerStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.TraceProcessorDaemonManagerStats)
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonManagerStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonManagerStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.class, com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.newBuilder()
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
      timeToSpawnMs_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonManagerStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats build() {
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats buildPartial() {
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats result = new com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeToSpawnMs_ = timeToSpawnMs_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats other) {
      if (other == com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats.getDefaultInstance()) return this;
      if (other.hasTimeToSpawnMs()) {
        setTimeToSpawnMs(other.getTimeToSpawnMs());
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
              timeToSpawnMs_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long timeToSpawnMs_ ;
    /**
     * <pre>
     * Time to spawn the daemon in milliseconds
     * </pre>
     *
     * <code>optional uint64 time_to_spawn_ms = 1;</code>
     * @return Whether the timeToSpawnMs field is set.
     */
    @java.lang.Override
    public boolean hasTimeToSpawnMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Time to spawn the daemon in milliseconds
     * </pre>
     *
     * <code>optional uint64 time_to_spawn_ms = 1;</code>
     * @return The timeToSpawnMs.
     */
    @java.lang.Override
    public long getTimeToSpawnMs() {
      return timeToSpawnMs_;
    }
    /**
     * <pre>
     * Time to spawn the daemon in milliseconds
     * </pre>
     *
     * <code>optional uint64 time_to_spawn_ms = 1;</code>
     * @param value The timeToSpawnMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeToSpawnMs(long value) {

      timeToSpawnMs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time to spawn the daemon in milliseconds
     * </pre>
     *
     * <code>optional uint64 time_to_spawn_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeToSpawnMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeToSpawnMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.TraceProcessorDaemonManagerStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.TraceProcessorDaemonManagerStats)
  private static final com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats();
  }

  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TraceProcessorDaemonManagerStats>
      PARSER = new com.google.protobuf.AbstractParser<TraceProcessorDaemonManagerStats>() {
    @java.lang.Override
    public TraceProcessorDaemonManagerStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<TraceProcessorDaemonManagerStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TraceProcessorDaemonManagerStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

