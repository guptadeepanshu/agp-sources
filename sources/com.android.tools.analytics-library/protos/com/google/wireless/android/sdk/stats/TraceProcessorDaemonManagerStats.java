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

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TraceProcessorDaemonManagerStats(
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
            bitField0_ |= 0x00000001;
            timeToSpawnMs_ = input.readUInt64();
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
  private long timeToSpawnMs_;
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
    unknownFields.writeTo(output);
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
    size += unknownFields.getSerializedSize();
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
    if (hasTimeToSpawnMs()) {
      hash = (37 * hash) + TIME_TO_SPAWN_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeToSpawnMs());
    }
    hash = (29 * hash) + unknownFields.hashCode();
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
      timeToSpawnMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
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
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeToSpawnMs_ = timeToSpawnMs_;
        to_bitField0_ |= 0x00000001;
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
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.TraceProcessorDaemonManagerStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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
      bitField0_ |= 0x00000001;
      timeToSpawnMs_ = value;
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
      return new TraceProcessorDaemonManagerStats(input, extensionRegistry);
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

