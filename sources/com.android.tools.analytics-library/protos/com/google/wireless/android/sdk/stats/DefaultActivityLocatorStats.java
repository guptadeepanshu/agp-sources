// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Information about how long DefaultActivityLocator blocked on getting
 * a list of activities from the merged manifest.
 * </pre>
 *
 * Protobuf type {@code android_studio.DefaultActivityLocatorStats}
 */
public final class DefaultActivityLocatorStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DefaultActivityLocatorStats)
    DefaultActivityLocatorStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DefaultActivityLocatorStats.newBuilder() to construct.
  private DefaultActivityLocatorStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DefaultActivityLocatorStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DefaultActivityLocatorStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DefaultActivityLocatorStats(
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
            blocksUiThread_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            indexBased_ = input.readBool();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            usedPotentiallyStaleManifest_ = input.readBool();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            latencyMs_ = input.readUInt64();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DefaultActivityLocatorStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DefaultActivityLocatorStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.class, com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.Builder.class);
  }

  private int bitField0_;
  public static final int BLOCKS_UI_THREAD_FIELD_NUMBER = 1;
  private boolean blocksUiThread_;
  /**
   * <pre>
   * Whether getting information from the merged manifest blocked the UI thread.
   * </pre>
   *
   * <code>optional bool blocks_ui_thread = 1;</code>
   * @return Whether the blocksUiThread field is set.
   */
  @java.lang.Override
  public boolean hasBlocksUiThread() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether getting information from the merged manifest blocked the UI thread.
   * </pre>
   *
   * <code>optional bool blocks_ui_thread = 1;</code>
   * @return The blocksUiThread.
   */
  @java.lang.Override
  public boolean getBlocksUiThread() {
    return blocksUiThread_;
  }

  public static final int INDEX_BASED_FIELD_NUMBER = 2;
  private boolean indexBased_;
  /**
   * <pre>
   * Whether we're leveraging an index to determine the module's activities.
   * </pre>
   *
   * <code>optional bool index_based = 2;</code>
   * @return Whether the indexBased field is set.
   */
  @java.lang.Override
  public boolean hasIndexBased() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Whether we're leveraging an index to determine the module's activities.
   * </pre>
   *
   * <code>optional bool index_based = 2;</code>
   * @return The indexBased.
   */
  @java.lang.Override
  public boolean getIndexBased() {
    return indexBased_;
  }

  public static final int USED_POTENTIALLY_STALE_MANIFEST_FIELD_NUMBER = 3;
  private boolean usedPotentiallyStaleManifest_;
  /**
   * <pre>
   * Whether DefaultActivityLocator used a potentially stale manifest (as
   * opposed to blocking on a fresh view of the merged manifest).
   * </pre>
   *
   * <code>optional bool used_potentially_stale_manifest = 3;</code>
   * @return Whether the usedPotentiallyStaleManifest field is set.
   */
  @java.lang.Override
  public boolean hasUsedPotentiallyStaleManifest() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether DefaultActivityLocator used a potentially stale manifest (as
   * opposed to blocking on a fresh view of the merged manifest).
   * </pre>
   *
   * <code>optional bool used_potentially_stale_manifest = 3;</code>
   * @return The usedPotentiallyStaleManifest.
   */
  @java.lang.Override
  public boolean getUsedPotentiallyStaleManifest() {
    return usedPotentiallyStaleManifest_;
  }

  public static final int LATENCY_MS_FIELD_NUMBER = 4;
  private long latencyMs_;
  /**
   * <pre>
   * How long it took us to obtain the list of activiteis
   * from the merged manifest.
   * </pre>
   *
   * <code>optional uint64 latency_ms = 4;</code>
   * @return Whether the latencyMs field is set.
   */
  @java.lang.Override
  public boolean hasLatencyMs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * How long it took us to obtain the list of activiteis
   * from the merged manifest.
   * </pre>
   *
   * <code>optional uint64 latency_ms = 4;</code>
   * @return The latencyMs.
   */
  @java.lang.Override
  public long getLatencyMs() {
    return latencyMs_;
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
      output.writeBool(1, blocksUiThread_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, indexBased_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, usedPotentiallyStaleManifest_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(4, latencyMs_);
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
        .computeBoolSize(1, blocksUiThread_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, indexBased_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, usedPotentiallyStaleManifest_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, latencyMs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats other = (com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats) obj;

    if (hasBlocksUiThread() != other.hasBlocksUiThread()) return false;
    if (hasBlocksUiThread()) {
      if (getBlocksUiThread()
          != other.getBlocksUiThread()) return false;
    }
    if (hasIndexBased() != other.hasIndexBased()) return false;
    if (hasIndexBased()) {
      if (getIndexBased()
          != other.getIndexBased()) return false;
    }
    if (hasUsedPotentiallyStaleManifest() != other.hasUsedPotentiallyStaleManifest()) return false;
    if (hasUsedPotentiallyStaleManifest()) {
      if (getUsedPotentiallyStaleManifest()
          != other.getUsedPotentiallyStaleManifest()) return false;
    }
    if (hasLatencyMs() != other.hasLatencyMs()) return false;
    if (hasLatencyMs()) {
      if (getLatencyMs()
          != other.getLatencyMs()) return false;
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
    if (hasBlocksUiThread()) {
      hash = (37 * hash) + BLOCKS_UI_THREAD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBlocksUiThread());
    }
    if (hasIndexBased()) {
      hash = (37 * hash) + INDEX_BASED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIndexBased());
    }
    if (hasUsedPotentiallyStaleManifest()) {
      hash = (37 * hash) + USED_POTENTIALLY_STALE_MANIFEST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUsedPotentiallyStaleManifest());
    }
    if (hasLatencyMs()) {
      hash = (37 * hash) + LATENCY_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLatencyMs());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats prototype) {
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
   * Information about how long DefaultActivityLocator blocked on getting
   * a list of activities from the merged manifest.
   * </pre>
   *
   * Protobuf type {@code android_studio.DefaultActivityLocatorStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DefaultActivityLocatorStats)
      com.google.wireless.android.sdk.stats.DefaultActivityLocatorStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DefaultActivityLocatorStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DefaultActivityLocatorStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.class, com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.newBuilder()
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
      blocksUiThread_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      indexBased_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      usedPotentiallyStaleManifest_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      latencyMs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DefaultActivityLocatorStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats build() {
      com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats buildPartial() {
      com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats result = new com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blocksUiThread_ = blocksUiThread_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.indexBased_ = indexBased_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.usedPotentiallyStaleManifest_ = usedPotentiallyStaleManifest_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.latencyMs_ = latencyMs_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats other) {
      if (other == com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats.getDefaultInstance()) return this;
      if (other.hasBlocksUiThread()) {
        setBlocksUiThread(other.getBlocksUiThread());
      }
      if (other.hasIndexBased()) {
        setIndexBased(other.getIndexBased());
      }
      if (other.hasUsedPotentiallyStaleManifest()) {
        setUsedPotentiallyStaleManifest(other.getUsedPotentiallyStaleManifest());
      }
      if (other.hasLatencyMs()) {
        setLatencyMs(other.getLatencyMs());
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
      com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean blocksUiThread_ ;
    /**
     * <pre>
     * Whether getting information from the merged manifest blocked the UI thread.
     * </pre>
     *
     * <code>optional bool blocks_ui_thread = 1;</code>
     * @return Whether the blocksUiThread field is set.
     */
    @java.lang.Override
    public boolean hasBlocksUiThread() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Whether getting information from the merged manifest blocked the UI thread.
     * </pre>
     *
     * <code>optional bool blocks_ui_thread = 1;</code>
     * @return The blocksUiThread.
     */
    @java.lang.Override
    public boolean getBlocksUiThread() {
      return blocksUiThread_;
    }
    /**
     * <pre>
     * Whether getting information from the merged manifest blocked the UI thread.
     * </pre>
     *
     * <code>optional bool blocks_ui_thread = 1;</code>
     * @param value The blocksUiThread to set.
     * @return This builder for chaining.
     */
    public Builder setBlocksUiThread(boolean value) {
      bitField0_ |= 0x00000001;
      blocksUiThread_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether getting information from the merged manifest blocked the UI thread.
     * </pre>
     *
     * <code>optional bool blocks_ui_thread = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocksUiThread() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blocksUiThread_ = false;
      onChanged();
      return this;
    }

    private boolean indexBased_ ;
    /**
     * <pre>
     * Whether we're leveraging an index to determine the module's activities.
     * </pre>
     *
     * <code>optional bool index_based = 2;</code>
     * @return Whether the indexBased field is set.
     */
    @java.lang.Override
    public boolean hasIndexBased() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Whether we're leveraging an index to determine the module's activities.
     * </pre>
     *
     * <code>optional bool index_based = 2;</code>
     * @return The indexBased.
     */
    @java.lang.Override
    public boolean getIndexBased() {
      return indexBased_;
    }
    /**
     * <pre>
     * Whether we're leveraging an index to determine the module's activities.
     * </pre>
     *
     * <code>optional bool index_based = 2;</code>
     * @param value The indexBased to set.
     * @return This builder for chaining.
     */
    public Builder setIndexBased(boolean value) {
      bitField0_ |= 0x00000002;
      indexBased_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether we're leveraging an index to determine the module's activities.
     * </pre>
     *
     * <code>optional bool index_based = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndexBased() {
      bitField0_ = (bitField0_ & ~0x00000002);
      indexBased_ = false;
      onChanged();
      return this;
    }

    private boolean usedPotentiallyStaleManifest_ ;
    /**
     * <pre>
     * Whether DefaultActivityLocator used a potentially stale manifest (as
     * opposed to blocking on a fresh view of the merged manifest).
     * </pre>
     *
     * <code>optional bool used_potentially_stale_manifest = 3;</code>
     * @return Whether the usedPotentiallyStaleManifest field is set.
     */
    @java.lang.Override
    public boolean hasUsedPotentiallyStaleManifest() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Whether DefaultActivityLocator used a potentially stale manifest (as
     * opposed to blocking on a fresh view of the merged manifest).
     * </pre>
     *
     * <code>optional bool used_potentially_stale_manifest = 3;</code>
     * @return The usedPotentiallyStaleManifest.
     */
    @java.lang.Override
    public boolean getUsedPotentiallyStaleManifest() {
      return usedPotentiallyStaleManifest_;
    }
    /**
     * <pre>
     * Whether DefaultActivityLocator used a potentially stale manifest (as
     * opposed to blocking on a fresh view of the merged manifest).
     * </pre>
     *
     * <code>optional bool used_potentially_stale_manifest = 3;</code>
     * @param value The usedPotentiallyStaleManifest to set.
     * @return This builder for chaining.
     */
    public Builder setUsedPotentiallyStaleManifest(boolean value) {
      bitField0_ |= 0x00000004;
      usedPotentiallyStaleManifest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether DefaultActivityLocator used a potentially stale manifest (as
     * opposed to blocking on a fresh view of the merged manifest).
     * </pre>
     *
     * <code>optional bool used_potentially_stale_manifest = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsedPotentiallyStaleManifest() {
      bitField0_ = (bitField0_ & ~0x00000004);
      usedPotentiallyStaleManifest_ = false;
      onChanged();
      return this;
    }

    private long latencyMs_ ;
    /**
     * <pre>
     * How long it took us to obtain the list of activiteis
     * from the merged manifest.
     * </pre>
     *
     * <code>optional uint64 latency_ms = 4;</code>
     * @return Whether the latencyMs field is set.
     */
    @java.lang.Override
    public boolean hasLatencyMs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * How long it took us to obtain the list of activiteis
     * from the merged manifest.
     * </pre>
     *
     * <code>optional uint64 latency_ms = 4;</code>
     * @return The latencyMs.
     */
    @java.lang.Override
    public long getLatencyMs() {
      return latencyMs_;
    }
    /**
     * <pre>
     * How long it took us to obtain the list of activiteis
     * from the merged manifest.
     * </pre>
     *
     * <code>optional uint64 latency_ms = 4;</code>
     * @param value The latencyMs to set.
     * @return This builder for chaining.
     */
    public Builder setLatencyMs(long value) {
      bitField0_ |= 0x00000008;
      latencyMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How long it took us to obtain the list of activiteis
     * from the merged manifest.
     * </pre>
     *
     * <code>optional uint64 latency_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatencyMs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      latencyMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DefaultActivityLocatorStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DefaultActivityLocatorStats)
  private static final com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats();
  }

  public static com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DefaultActivityLocatorStats>
      PARSER = new com.google.protobuf.AbstractParser<DefaultActivityLocatorStats>() {
    @java.lang.Override
    public DefaultActivityLocatorStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DefaultActivityLocatorStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DefaultActivityLocatorStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefaultActivityLocatorStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DefaultActivityLocatorStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

