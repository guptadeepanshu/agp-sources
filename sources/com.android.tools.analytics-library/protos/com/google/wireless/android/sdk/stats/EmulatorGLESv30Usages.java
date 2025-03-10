// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Track whether a GLES3.0 command is used or not
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorGLESv30Usages}
 */
public final class EmulatorGLESv30Usages extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorGLESv30Usages)
    EmulatorGLESv30UsagesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorGLESv30Usages.newBuilder() to construct.
  private EmulatorGLESv30Usages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorGLESv30Usages() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorGLESv30Usages();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLESv30Usages_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLESv30Usages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.class, com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.Builder.class);
  }

  private int bitField0_;
  public static final int IS_USED_FIELD_NUMBER = 1;
  private boolean isUsed_ = false;
  /**
   * <pre>
   * Has the client create any GLES3 contexts
   * </pre>
   *
   * <code>optional bool is_used = 1;</code>
   * @return Whether the isUsed field is set.
   */
  @java.lang.Override
  public boolean hasIsUsed() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Has the client create any GLES3 contexts
   * </pre>
   *
   * <code>optional bool is_used = 1;</code>
   * @return The isUsed.
   */
  @java.lang.Override
  public boolean getIsUsed() {
    return isUsed_;
  }

  public static final int FENCE_SYNC_FIELD_NUMBER = 2;
  private boolean fenceSync_ = false;
  /**
   * <pre>
   * Track glFenceSync command calls
   * </pre>
   *
   * <code>optional bool fence_sync = 2;</code>
   * @return Whether the fenceSync field is set.
   */
  @java.lang.Override
  public boolean hasFenceSync() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Track glFenceSync command calls
   * </pre>
   *
   * <code>optional bool fence_sync = 2;</code>
   * @return The fenceSync.
   */
  @java.lang.Override
  public boolean getFenceSync() {
    return fenceSync_;
  }

  public static final int FRAMEBUFFER_TEXTURE_LAYER_FIELD_NUMBER = 3;
  private boolean framebufferTextureLayer_ = false;
  /**
   * <pre>
   * Track glFramebufferTextureLayer command calls
   * </pre>
   *
   * <code>optional bool framebuffer_texture_layer = 3;</code>
   * @return Whether the framebufferTextureLayer field is set.
   */
  @java.lang.Override
  public boolean hasFramebufferTextureLayer() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Track glFramebufferTextureLayer command calls
   * </pre>
   *
   * <code>optional bool framebuffer_texture_layer = 3;</code>
   * @return The framebufferTextureLayer.
   */
  @java.lang.Override
  public boolean getFramebufferTextureLayer() {
    return framebufferTextureLayer_;
  }

  public static final int RENDERBUFFER_STORAGE_MULTISAMPLE_FIELD_NUMBER = 4;
  private boolean renderbufferStorageMultisample_ = false;
  /**
   * <pre>
   * Track glRenderbufferStorageMultisample command calls
   * </pre>
   *
   * <code>optional bool renderbuffer_storage_multisample = 4;</code>
   * @return Whether the renderbufferStorageMultisample field is set.
   */
  @java.lang.Override
  public boolean hasRenderbufferStorageMultisample() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Track glRenderbufferStorageMultisample command calls
   * </pre>
   *
   * <code>optional bool renderbuffer_storage_multisample = 4;</code>
   * @return The renderbufferStorageMultisample.
   */
  @java.lang.Override
  public boolean getRenderbufferStorageMultisample() {
    return renderbufferStorageMultisample_;
  }

  public static final int GEN_TRANSFORM_FEEDBACKS_FIELD_NUMBER = 5;
  private boolean genTransformFeedbacks_ = false;
  /**
   * <pre>
   * Track glGenTransformFeedbacks command calls
   * </pre>
   *
   * <code>optional bool gen_transform_feedbacks = 5;</code>
   * @return Whether the genTransformFeedbacks field is set.
   */
  @java.lang.Override
  public boolean hasGenTransformFeedbacks() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Track glGenTransformFeedbacks command calls
   * </pre>
   *
   * <code>optional bool gen_transform_feedbacks = 5;</code>
   * @return The genTransformFeedbacks.
   */
  @java.lang.Override
  public boolean getGenTransformFeedbacks() {
    return genTransformFeedbacks_;
  }

  public static final int BEGIN_QUERY_FIELD_NUMBER = 6;
  private boolean beginQuery_ = false;
  /**
   * <pre>
   * Track glBeginQuery command calls
   * </pre>
   *
   * <code>optional bool begin_query = 6;</code>
   * @return Whether the beginQuery field is set.
   */
  @java.lang.Override
  public boolean hasBeginQuery() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * Track glBeginQuery command calls
   * </pre>
   *
   * <code>optional bool begin_query = 6;</code>
   * @return The beginQuery.
   */
  @java.lang.Override
  public boolean getBeginQuery() {
    return beginQuery_;
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
      output.writeBool(1, isUsed_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, fenceSync_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, framebufferTextureLayer_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(4, renderbufferStorageMultisample_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBool(5, genTransformFeedbacks_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeBool(6, beginQuery_);
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
        .computeBoolSize(1, isUsed_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, fenceSync_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, framebufferTextureLayer_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, renderbufferStorageMultisample_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, genTransformFeedbacks_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, beginQuery_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages other = (com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages) obj;

    if (hasIsUsed() != other.hasIsUsed()) return false;
    if (hasIsUsed()) {
      if (getIsUsed()
          != other.getIsUsed()) return false;
    }
    if (hasFenceSync() != other.hasFenceSync()) return false;
    if (hasFenceSync()) {
      if (getFenceSync()
          != other.getFenceSync()) return false;
    }
    if (hasFramebufferTextureLayer() != other.hasFramebufferTextureLayer()) return false;
    if (hasFramebufferTextureLayer()) {
      if (getFramebufferTextureLayer()
          != other.getFramebufferTextureLayer()) return false;
    }
    if (hasRenderbufferStorageMultisample() != other.hasRenderbufferStorageMultisample()) return false;
    if (hasRenderbufferStorageMultisample()) {
      if (getRenderbufferStorageMultisample()
          != other.getRenderbufferStorageMultisample()) return false;
    }
    if (hasGenTransformFeedbacks() != other.hasGenTransformFeedbacks()) return false;
    if (hasGenTransformFeedbacks()) {
      if (getGenTransformFeedbacks()
          != other.getGenTransformFeedbacks()) return false;
    }
    if (hasBeginQuery() != other.hasBeginQuery()) return false;
    if (hasBeginQuery()) {
      if (getBeginQuery()
          != other.getBeginQuery()) return false;
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
    if (hasIsUsed()) {
      hash = (37 * hash) + IS_USED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUsed());
    }
    if (hasFenceSync()) {
      hash = (37 * hash) + FENCE_SYNC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFenceSync());
    }
    if (hasFramebufferTextureLayer()) {
      hash = (37 * hash) + FRAMEBUFFER_TEXTURE_LAYER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFramebufferTextureLayer());
    }
    if (hasRenderbufferStorageMultisample()) {
      hash = (37 * hash) + RENDERBUFFER_STORAGE_MULTISAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRenderbufferStorageMultisample());
    }
    if (hasGenTransformFeedbacks()) {
      hash = (37 * hash) + GEN_TRANSFORM_FEEDBACKS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGenTransformFeedbacks());
    }
    if (hasBeginQuery()) {
      hash = (37 * hash) + BEGIN_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBeginQuery());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages prototype) {
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
   * Track whether a GLES3.0 command is used or not
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorGLESv30Usages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorGLESv30Usages)
      com.google.wireless.android.sdk.stats.EmulatorGLESv30UsagesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLESv30Usages_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLESv30Usages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.class, com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.newBuilder()
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
      isUsed_ = false;
      fenceSync_ = false;
      framebufferTextureLayer_ = false;
      renderbufferStorageMultisample_ = false;
      genTransformFeedbacks_ = false;
      beginQuery_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLESv30Usages_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages build() {
      com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages result = new com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isUsed_ = isUsed_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fenceSync_ = fenceSync_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.framebufferTextureLayer_ = framebufferTextureLayer_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.renderbufferStorageMultisample_ = renderbufferStorageMultisample_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.genTransformFeedbacks_ = genTransformFeedbacks_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.beginQuery_ = beginQuery_;
        to_bitField0_ |= 0x00000020;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages.getDefaultInstance()) return this;
      if (other.hasIsUsed()) {
        setIsUsed(other.getIsUsed());
      }
      if (other.hasFenceSync()) {
        setFenceSync(other.getFenceSync());
      }
      if (other.hasFramebufferTextureLayer()) {
        setFramebufferTextureLayer(other.getFramebufferTextureLayer());
      }
      if (other.hasRenderbufferStorageMultisample()) {
        setRenderbufferStorageMultisample(other.getRenderbufferStorageMultisample());
      }
      if (other.hasGenTransformFeedbacks()) {
        setGenTransformFeedbacks(other.getGenTransformFeedbacks());
      }
      if (other.hasBeginQuery()) {
        setBeginQuery(other.getBeginQuery());
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
              isUsed_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              fenceSync_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              framebufferTextureLayer_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              renderbufferStorageMultisample_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              genTransformFeedbacks_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              beginQuery_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private boolean isUsed_ ;
    /**
     * <pre>
     * Has the client create any GLES3 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return Whether the isUsed field is set.
     */
    @java.lang.Override
    public boolean hasIsUsed() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Has the client create any GLES3 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return The isUsed.
     */
    @java.lang.Override
    public boolean getIsUsed() {
      return isUsed_;
    }
    /**
     * <pre>
     * Has the client create any GLES3 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @param value The isUsed to set.
     * @return This builder for chaining.
     */
    public Builder setIsUsed(boolean value) {

      isUsed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Has the client create any GLES3 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsUsed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isUsed_ = false;
      onChanged();
      return this;
    }

    private boolean fenceSync_ ;
    /**
     * <pre>
     * Track glFenceSync command calls
     * </pre>
     *
     * <code>optional bool fence_sync = 2;</code>
     * @return Whether the fenceSync field is set.
     */
    @java.lang.Override
    public boolean hasFenceSync() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Track glFenceSync command calls
     * </pre>
     *
     * <code>optional bool fence_sync = 2;</code>
     * @return The fenceSync.
     */
    @java.lang.Override
    public boolean getFenceSync() {
      return fenceSync_;
    }
    /**
     * <pre>
     * Track glFenceSync command calls
     * </pre>
     *
     * <code>optional bool fence_sync = 2;</code>
     * @param value The fenceSync to set.
     * @return This builder for chaining.
     */
    public Builder setFenceSync(boolean value) {

      fenceSync_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glFenceSync command calls
     * </pre>
     *
     * <code>optional bool fence_sync = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFenceSync() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fenceSync_ = false;
      onChanged();
      return this;
    }

    private boolean framebufferTextureLayer_ ;
    /**
     * <pre>
     * Track glFramebufferTextureLayer command calls
     * </pre>
     *
     * <code>optional bool framebuffer_texture_layer = 3;</code>
     * @return Whether the framebufferTextureLayer field is set.
     */
    @java.lang.Override
    public boolean hasFramebufferTextureLayer() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Track glFramebufferTextureLayer command calls
     * </pre>
     *
     * <code>optional bool framebuffer_texture_layer = 3;</code>
     * @return The framebufferTextureLayer.
     */
    @java.lang.Override
    public boolean getFramebufferTextureLayer() {
      return framebufferTextureLayer_;
    }
    /**
     * <pre>
     * Track glFramebufferTextureLayer command calls
     * </pre>
     *
     * <code>optional bool framebuffer_texture_layer = 3;</code>
     * @param value The framebufferTextureLayer to set.
     * @return This builder for chaining.
     */
    public Builder setFramebufferTextureLayer(boolean value) {

      framebufferTextureLayer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glFramebufferTextureLayer command calls
     * </pre>
     *
     * <code>optional bool framebuffer_texture_layer = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFramebufferTextureLayer() {
      bitField0_ = (bitField0_ & ~0x00000004);
      framebufferTextureLayer_ = false;
      onChanged();
      return this;
    }

    private boolean renderbufferStorageMultisample_ ;
    /**
     * <pre>
     * Track glRenderbufferStorageMultisample command calls
     * </pre>
     *
     * <code>optional bool renderbuffer_storage_multisample = 4;</code>
     * @return Whether the renderbufferStorageMultisample field is set.
     */
    @java.lang.Override
    public boolean hasRenderbufferStorageMultisample() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Track glRenderbufferStorageMultisample command calls
     * </pre>
     *
     * <code>optional bool renderbuffer_storage_multisample = 4;</code>
     * @return The renderbufferStorageMultisample.
     */
    @java.lang.Override
    public boolean getRenderbufferStorageMultisample() {
      return renderbufferStorageMultisample_;
    }
    /**
     * <pre>
     * Track glRenderbufferStorageMultisample command calls
     * </pre>
     *
     * <code>optional bool renderbuffer_storage_multisample = 4;</code>
     * @param value The renderbufferStorageMultisample to set.
     * @return This builder for chaining.
     */
    public Builder setRenderbufferStorageMultisample(boolean value) {

      renderbufferStorageMultisample_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glRenderbufferStorageMultisample command calls
     * </pre>
     *
     * <code>optional bool renderbuffer_storage_multisample = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRenderbufferStorageMultisample() {
      bitField0_ = (bitField0_ & ~0x00000008);
      renderbufferStorageMultisample_ = false;
      onChanged();
      return this;
    }

    private boolean genTransformFeedbacks_ ;
    /**
     * <pre>
     * Track glGenTransformFeedbacks command calls
     * </pre>
     *
     * <code>optional bool gen_transform_feedbacks = 5;</code>
     * @return Whether the genTransformFeedbacks field is set.
     */
    @java.lang.Override
    public boolean hasGenTransformFeedbacks() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Track glGenTransformFeedbacks command calls
     * </pre>
     *
     * <code>optional bool gen_transform_feedbacks = 5;</code>
     * @return The genTransformFeedbacks.
     */
    @java.lang.Override
    public boolean getGenTransformFeedbacks() {
      return genTransformFeedbacks_;
    }
    /**
     * <pre>
     * Track glGenTransformFeedbacks command calls
     * </pre>
     *
     * <code>optional bool gen_transform_feedbacks = 5;</code>
     * @param value The genTransformFeedbacks to set.
     * @return This builder for chaining.
     */
    public Builder setGenTransformFeedbacks(boolean value) {

      genTransformFeedbacks_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glGenTransformFeedbacks command calls
     * </pre>
     *
     * <code>optional bool gen_transform_feedbacks = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenTransformFeedbacks() {
      bitField0_ = (bitField0_ & ~0x00000010);
      genTransformFeedbacks_ = false;
      onChanged();
      return this;
    }

    private boolean beginQuery_ ;
    /**
     * <pre>
     * Track glBeginQuery command calls
     * </pre>
     *
     * <code>optional bool begin_query = 6;</code>
     * @return Whether the beginQuery field is set.
     */
    @java.lang.Override
    public boolean hasBeginQuery() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Track glBeginQuery command calls
     * </pre>
     *
     * <code>optional bool begin_query = 6;</code>
     * @return The beginQuery.
     */
    @java.lang.Override
    public boolean getBeginQuery() {
      return beginQuery_;
    }
    /**
     * <pre>
     * Track glBeginQuery command calls
     * </pre>
     *
     * <code>optional bool begin_query = 6;</code>
     * @param value The beginQuery to set.
     * @return This builder for chaining.
     */
    public Builder setBeginQuery(boolean value) {

      beginQuery_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glBeginQuery command calls
     * </pre>
     *
     * <code>optional bool begin_query = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginQuery() {
      bitField0_ = (bitField0_ & ~0x00000020);
      beginQuery_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorGLESv30Usages)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorGLESv30Usages)
  private static final com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorGLESv30Usages>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorGLESv30Usages>() {
    @java.lang.Override
    public EmulatorGLESv30Usages parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmulatorGLESv30Usages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorGLESv30Usages> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorGLESv30Usages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

