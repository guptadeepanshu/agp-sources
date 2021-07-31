// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.GraphicsResourceUsage}
 */
public  final class GraphicsResourceUsage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.GraphicsResourceUsage)
    GraphicsResourceUsageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphicsResourceUsage.newBuilder() to construct.
  private GraphicsResourceUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphicsResourceUsage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GraphicsResourceUsage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GraphicsResourceUsage(
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
            colorbufferCount_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            shaderCount_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            renderthreadCount_ = input.readUInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            colorbufferTotalAllocationBytes_ = input.readUInt64();
            break;
          }
          case 42: {
            com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder subBuilder = null;
            if (((bitField0_ & 0x00000010) != 0)) {
              subBuilder = vulkanResourceUsage_.toBuilder();
            }
            vulkanResourceUsage_ = input.readMessage(com.google.wireless.android.sdk.stats.VulkanResourceUsage.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vulkanResourceUsage_);
              vulkanResourceUsage_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000010;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GraphicsResourceUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GraphicsResourceUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.GraphicsResourceUsage.class, com.google.wireless.android.sdk.stats.GraphicsResourceUsage.Builder.class);
  }

  private int bitField0_;
  public static final int COLORBUFFER_COUNT_FIELD_NUMBER = 1;
  private int colorbufferCount_;
  /**
   * <pre>
   * common betweek OpenGL and Vulkan
   * </pre>
   *
   * <code>optional uint32 colorbuffer_count = 1;</code>
   * @return Whether the colorbufferCount field is set.
   */
  public boolean hasColorbufferCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * common betweek OpenGL and Vulkan
   * </pre>
   *
   * <code>optional uint32 colorbuffer_count = 1;</code>
   * @return The colorbufferCount.
   */
  public int getColorbufferCount() {
    return colorbufferCount_;
  }

  public static final int SHADER_COUNT_FIELD_NUMBER = 2;
  private int shaderCount_;
  /**
   * <code>optional uint32 shader_count = 2;</code>
   * @return Whether the shaderCount field is set.
   */
  public boolean hasShaderCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 shader_count = 2;</code>
   * @return The shaderCount.
   */
  public int getShaderCount() {
    return shaderCount_;
  }

  public static final int RENDERTHREAD_COUNT_FIELD_NUMBER = 3;
  private int renderthreadCount_;
  /**
   * <code>optional uint32 renderthread_count = 3;</code>
   * @return Whether the renderthreadCount field is set.
   */
  public boolean hasRenderthreadCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 renderthread_count = 3;</code>
   * @return The renderthreadCount.
   */
  public int getRenderthreadCount() {
    return renderthreadCount_;
  }

  public static final int COLORBUFFER_TOTAL_ALLOCATION_BYTES_FIELD_NUMBER = 4;
  private long colorbufferTotalAllocationBytes_;
  /**
   * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
   * @return Whether the colorbufferTotalAllocationBytes field is set.
   */
  public boolean hasColorbufferTotalAllocationBytes() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
   * @return The colorbufferTotalAllocationBytes.
   */
  public long getColorbufferTotalAllocationBytes() {
    return colorbufferTotalAllocationBytes_;
  }

  public static final int VULKAN_RESOURCE_USAGE_FIELD_NUMBER = 5;
  private com.google.wireless.android.sdk.stats.VulkanResourceUsage vulkanResourceUsage_;
  /**
   * <pre>
   * Vulkan
   * </pre>
   *
   * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
   * @return Whether the vulkanResourceUsage field is set.
   */
  public boolean hasVulkanResourceUsage() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Vulkan
   * </pre>
   *
   * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
   * @return The vulkanResourceUsage.
   */
  public com.google.wireless.android.sdk.stats.VulkanResourceUsage getVulkanResourceUsage() {
    return vulkanResourceUsage_ == null ? com.google.wireless.android.sdk.stats.VulkanResourceUsage.getDefaultInstance() : vulkanResourceUsage_;
  }
  /**
   * <pre>
   * Vulkan
   * </pre>
   *
   * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
   */
  public com.google.wireless.android.sdk.stats.VulkanResourceUsageOrBuilder getVulkanResourceUsageOrBuilder() {
    return vulkanResourceUsage_ == null ? com.google.wireless.android.sdk.stats.VulkanResourceUsage.getDefaultInstance() : vulkanResourceUsage_;
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
      output.writeUInt32(1, colorbufferCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, shaderCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, renderthreadCount_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(4, colorbufferTotalAllocationBytes_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeMessage(5, getVulkanResourceUsage());
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
        .computeUInt32Size(1, colorbufferCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, shaderCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, renderthreadCount_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, colorbufferTotalAllocationBytes_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getVulkanResourceUsage());
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.GraphicsResourceUsage)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.GraphicsResourceUsage other = (com.google.wireless.android.sdk.stats.GraphicsResourceUsage) obj;

    if (hasColorbufferCount() != other.hasColorbufferCount()) return false;
    if (hasColorbufferCount()) {
      if (getColorbufferCount()
          != other.getColorbufferCount()) return false;
    }
    if (hasShaderCount() != other.hasShaderCount()) return false;
    if (hasShaderCount()) {
      if (getShaderCount()
          != other.getShaderCount()) return false;
    }
    if (hasRenderthreadCount() != other.hasRenderthreadCount()) return false;
    if (hasRenderthreadCount()) {
      if (getRenderthreadCount()
          != other.getRenderthreadCount()) return false;
    }
    if (hasColorbufferTotalAllocationBytes() != other.hasColorbufferTotalAllocationBytes()) return false;
    if (hasColorbufferTotalAllocationBytes()) {
      if (getColorbufferTotalAllocationBytes()
          != other.getColorbufferTotalAllocationBytes()) return false;
    }
    if (hasVulkanResourceUsage() != other.hasVulkanResourceUsage()) return false;
    if (hasVulkanResourceUsage()) {
      if (!getVulkanResourceUsage()
          .equals(other.getVulkanResourceUsage())) return false;
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
    if (hasColorbufferCount()) {
      hash = (37 * hash) + COLORBUFFER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getColorbufferCount();
    }
    if (hasShaderCount()) {
      hash = (37 * hash) + SHADER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getShaderCount();
    }
    if (hasRenderthreadCount()) {
      hash = (37 * hash) + RENDERTHREAD_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getRenderthreadCount();
    }
    if (hasColorbufferTotalAllocationBytes()) {
      hash = (37 * hash) + COLORBUFFER_TOTAL_ALLOCATION_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getColorbufferTotalAllocationBytes());
    }
    if (hasVulkanResourceUsage()) {
      hash = (37 * hash) + VULKAN_RESOURCE_USAGE_FIELD_NUMBER;
      hash = (53 * hash) + getVulkanResourceUsage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.GraphicsResourceUsage prototype) {
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
   * Protobuf type {@code android_studio.GraphicsResourceUsage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.GraphicsResourceUsage)
      com.google.wireless.android.sdk.stats.GraphicsResourceUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GraphicsResourceUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GraphicsResourceUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.GraphicsResourceUsage.class, com.google.wireless.android.sdk.stats.GraphicsResourceUsage.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.GraphicsResourceUsage.newBuilder()
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
        getVulkanResourceUsageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      colorbufferCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      shaderCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      renderthreadCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      colorbufferTotalAllocationBytes_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      if (vulkanResourceUsageBuilder_ == null) {
        vulkanResourceUsage_ = null;
      } else {
        vulkanResourceUsageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GraphicsResourceUsage_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GraphicsResourceUsage getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.GraphicsResourceUsage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GraphicsResourceUsage build() {
      com.google.wireless.android.sdk.stats.GraphicsResourceUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GraphicsResourceUsage buildPartial() {
      com.google.wireless.android.sdk.stats.GraphicsResourceUsage result = new com.google.wireless.android.sdk.stats.GraphicsResourceUsage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.colorbufferCount_ = colorbufferCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shaderCount_ = shaderCount_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.renderthreadCount_ = renderthreadCount_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.colorbufferTotalAllocationBytes_ = colorbufferTotalAllocationBytes_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        if (vulkanResourceUsageBuilder_ == null) {
          result.vulkanResourceUsage_ = vulkanResourceUsage_;
        } else {
          result.vulkanResourceUsage_ = vulkanResourceUsageBuilder_.build();
        }
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof com.google.wireless.android.sdk.stats.GraphicsResourceUsage) {
        return mergeFrom((com.google.wireless.android.sdk.stats.GraphicsResourceUsage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.GraphicsResourceUsage other) {
      if (other == com.google.wireless.android.sdk.stats.GraphicsResourceUsage.getDefaultInstance()) return this;
      if (other.hasColorbufferCount()) {
        setColorbufferCount(other.getColorbufferCount());
      }
      if (other.hasShaderCount()) {
        setShaderCount(other.getShaderCount());
      }
      if (other.hasRenderthreadCount()) {
        setRenderthreadCount(other.getRenderthreadCount());
      }
      if (other.hasColorbufferTotalAllocationBytes()) {
        setColorbufferTotalAllocationBytes(other.getColorbufferTotalAllocationBytes());
      }
      if (other.hasVulkanResourceUsage()) {
        mergeVulkanResourceUsage(other.getVulkanResourceUsage());
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
      com.google.wireless.android.sdk.stats.GraphicsResourceUsage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.GraphicsResourceUsage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int colorbufferCount_ ;
    /**
     * <pre>
     * common betweek OpenGL and Vulkan
     * </pre>
     *
     * <code>optional uint32 colorbuffer_count = 1;</code>
     * @return Whether the colorbufferCount field is set.
     */
    public boolean hasColorbufferCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * common betweek OpenGL and Vulkan
     * </pre>
     *
     * <code>optional uint32 colorbuffer_count = 1;</code>
     * @return The colorbufferCount.
     */
    public int getColorbufferCount() {
      return colorbufferCount_;
    }
    /**
     * <pre>
     * common betweek OpenGL and Vulkan
     * </pre>
     *
     * <code>optional uint32 colorbuffer_count = 1;</code>
     * @param value The colorbufferCount to set.
     * @return This builder for chaining.
     */
    public Builder setColorbufferCount(int value) {
      bitField0_ |= 0x00000001;
      colorbufferCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * common betweek OpenGL and Vulkan
     * </pre>
     *
     * <code>optional uint32 colorbuffer_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearColorbufferCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      colorbufferCount_ = 0;
      onChanged();
      return this;
    }

    private int shaderCount_ ;
    /**
     * <code>optional uint32 shader_count = 2;</code>
     * @return Whether the shaderCount field is set.
     */
    public boolean hasShaderCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 shader_count = 2;</code>
     * @return The shaderCount.
     */
    public int getShaderCount() {
      return shaderCount_;
    }
    /**
     * <code>optional uint32 shader_count = 2;</code>
     * @param value The shaderCount to set.
     * @return This builder for chaining.
     */
    public Builder setShaderCount(int value) {
      bitField0_ |= 0x00000002;
      shaderCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 shader_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShaderCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shaderCount_ = 0;
      onChanged();
      return this;
    }

    private int renderthreadCount_ ;
    /**
     * <code>optional uint32 renderthread_count = 3;</code>
     * @return Whether the renderthreadCount field is set.
     */
    public boolean hasRenderthreadCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 renderthread_count = 3;</code>
     * @return The renderthreadCount.
     */
    public int getRenderthreadCount() {
      return renderthreadCount_;
    }
    /**
     * <code>optional uint32 renderthread_count = 3;</code>
     * @param value The renderthreadCount to set.
     * @return This builder for chaining.
     */
    public Builder setRenderthreadCount(int value) {
      bitField0_ |= 0x00000004;
      renderthreadCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 renderthread_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRenderthreadCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      renderthreadCount_ = 0;
      onChanged();
      return this;
    }

    private long colorbufferTotalAllocationBytes_ ;
    /**
     * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
     * @return Whether the colorbufferTotalAllocationBytes field is set.
     */
    public boolean hasColorbufferTotalAllocationBytes() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
     * @return The colorbufferTotalAllocationBytes.
     */
    public long getColorbufferTotalAllocationBytes() {
      return colorbufferTotalAllocationBytes_;
    }
    /**
     * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
     * @param value The colorbufferTotalAllocationBytes to set.
     * @return This builder for chaining.
     */
    public Builder setColorbufferTotalAllocationBytes(long value) {
      bitField0_ |= 0x00000008;
      colorbufferTotalAllocationBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 colorbuffer_total_allocation_bytes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearColorbufferTotalAllocationBytes() {
      bitField0_ = (bitField0_ & ~0x00000008);
      colorbufferTotalAllocationBytes_ = 0L;
      onChanged();
      return this;
    }

    private com.google.wireless.android.sdk.stats.VulkanResourceUsage vulkanResourceUsage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.VulkanResourceUsage, com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder, com.google.wireless.android.sdk.stats.VulkanResourceUsageOrBuilder> vulkanResourceUsageBuilder_;
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     * @return Whether the vulkanResourceUsage field is set.
     */
    public boolean hasVulkanResourceUsage() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     * @return The vulkanResourceUsage.
     */
    public com.google.wireless.android.sdk.stats.VulkanResourceUsage getVulkanResourceUsage() {
      if (vulkanResourceUsageBuilder_ == null) {
        return vulkanResourceUsage_ == null ? com.google.wireless.android.sdk.stats.VulkanResourceUsage.getDefaultInstance() : vulkanResourceUsage_;
      } else {
        return vulkanResourceUsageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public Builder setVulkanResourceUsage(com.google.wireless.android.sdk.stats.VulkanResourceUsage value) {
      if (vulkanResourceUsageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vulkanResourceUsage_ = value;
        onChanged();
      } else {
        vulkanResourceUsageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public Builder setVulkanResourceUsage(
        com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder builderForValue) {
      if (vulkanResourceUsageBuilder_ == null) {
        vulkanResourceUsage_ = builderForValue.build();
        onChanged();
      } else {
        vulkanResourceUsageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public Builder mergeVulkanResourceUsage(com.google.wireless.android.sdk.stats.VulkanResourceUsage value) {
      if (vulkanResourceUsageBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
            vulkanResourceUsage_ != null &&
            vulkanResourceUsage_ != com.google.wireless.android.sdk.stats.VulkanResourceUsage.getDefaultInstance()) {
          vulkanResourceUsage_ =
            com.google.wireless.android.sdk.stats.VulkanResourceUsage.newBuilder(vulkanResourceUsage_).mergeFrom(value).buildPartial();
        } else {
          vulkanResourceUsage_ = value;
        }
        onChanged();
      } else {
        vulkanResourceUsageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public Builder clearVulkanResourceUsage() {
      if (vulkanResourceUsageBuilder_ == null) {
        vulkanResourceUsage_ = null;
        onChanged();
      } else {
        vulkanResourceUsageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder getVulkanResourceUsageBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getVulkanResourceUsageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    public com.google.wireless.android.sdk.stats.VulkanResourceUsageOrBuilder getVulkanResourceUsageOrBuilder() {
      if (vulkanResourceUsageBuilder_ != null) {
        return vulkanResourceUsageBuilder_.getMessageOrBuilder();
      } else {
        return vulkanResourceUsage_ == null ?
            com.google.wireless.android.sdk.stats.VulkanResourceUsage.getDefaultInstance() : vulkanResourceUsage_;
      }
    }
    /**
     * <pre>
     * Vulkan
     * </pre>
     *
     * <code>optional .android_studio.VulkanResourceUsage vulkan_resource_usage = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.VulkanResourceUsage, com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder, com.google.wireless.android.sdk.stats.VulkanResourceUsageOrBuilder> 
        getVulkanResourceUsageFieldBuilder() {
      if (vulkanResourceUsageBuilder_ == null) {
        vulkanResourceUsageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.wireless.android.sdk.stats.VulkanResourceUsage, com.google.wireless.android.sdk.stats.VulkanResourceUsage.Builder, com.google.wireless.android.sdk.stats.VulkanResourceUsageOrBuilder>(
                getVulkanResourceUsage(),
                getParentForChildren(),
                isClean());
        vulkanResourceUsage_ = null;
      }
      return vulkanResourceUsageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.GraphicsResourceUsage)
  }

  // @@protoc_insertion_point(class_scope:android_studio.GraphicsResourceUsage)
  private static final com.google.wireless.android.sdk.stats.GraphicsResourceUsage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.GraphicsResourceUsage();
  }

  public static com.google.wireless.android.sdk.stats.GraphicsResourceUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GraphicsResourceUsage>
      PARSER = new com.google.protobuf.AbstractParser<GraphicsResourceUsage>() {
    @java.lang.Override
    public GraphicsResourceUsage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GraphicsResourceUsage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphicsResourceUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphicsResourceUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.GraphicsResourceUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

