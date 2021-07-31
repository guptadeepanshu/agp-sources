// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Session data for dynamic layout inspector (inspector v2) around 3D rotation
 * </pre>
 *
 * Protobuf type {@code android_studio.DynamicLayoutInspectorRotation}
 */
public  final class DynamicLayoutInspectorRotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DynamicLayoutInspectorRotation)
    DynamicLayoutInspectorRotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicLayoutInspectorRotation.newBuilder() to construct.
  private DynamicLayoutInspectorRotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicLayoutInspectorRotation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicLayoutInspectorRotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynamicLayoutInspectorRotation(
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
            imageClicksIn3D_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            imageClicksIn2D_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            componentTreeClicksIn3D_ = input.readUInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            componentTreeClicksIn2D_ = input.readUInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorRotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorRotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.Builder.class);
  }

  private int bitField0_;
  public static final int IMAGE_CLICKS_IN_3D_FIELD_NUMBER = 1;
  private int imageClicksIn3D_;
  /**
   * <pre>
   * Component selection count in image while showing in 3D
   * </pre>
   *
   * <code>optional uint32 image_clicks_in_3d = 1;</code>
   * @return Whether the imageClicksIn3d field is set.
   */
  public boolean hasImageClicksIn3D() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Component selection count in image while showing in 3D
   * </pre>
   *
   * <code>optional uint32 image_clicks_in_3d = 1;</code>
   * @return The imageClicksIn3d.
   */
  public int getImageClicksIn3D() {
    return imageClicksIn3D_;
  }

  public static final int IMAGE_CLICKS_IN_2D_FIELD_NUMBER = 2;
  private int imageClicksIn2D_;
  /**
   * <pre>
   * Component selection count in image while showing in 2D
   * </pre>
   *
   * <code>optional uint32 image_clicks_in_2d = 2;</code>
   * @return Whether the imageClicksIn2d field is set.
   */
  public boolean hasImageClicksIn2D() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Component selection count in image while showing in 2D
   * </pre>
   *
   * <code>optional uint32 image_clicks_in_2d = 2;</code>
   * @return The imageClicksIn2d.
   */
  public int getImageClicksIn2D() {
    return imageClicksIn2D_;
  }

  public static final int COMPONENT_TREE_CLICKS_IN_3D_FIELD_NUMBER = 3;
  private int componentTreeClicksIn3D_;
  /**
   * <pre>
   * Component selection count in the component tree while showing in 3D
   * </pre>
   *
   * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
   * @return Whether the componentTreeClicksIn3d field is set.
   */
  public boolean hasComponentTreeClicksIn3D() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Component selection count in the component tree while showing in 3D
   * </pre>
   *
   * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
   * @return The componentTreeClicksIn3d.
   */
  public int getComponentTreeClicksIn3D() {
    return componentTreeClicksIn3D_;
  }

  public static final int COMPONENT_TREE_CLICKS_IN_2D_FIELD_NUMBER = 4;
  private int componentTreeClicksIn2D_;
  /**
   * <pre>
   * Component selection count in the component tree while showing in 2D
   * </pre>
   *
   * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
   * @return Whether the componentTreeClicksIn2d field is set.
   */
  public boolean hasComponentTreeClicksIn2D() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Component selection count in the component tree while showing in 2D
   * </pre>
   *
   * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
   * @return The componentTreeClicksIn2d.
   */
  public int getComponentTreeClicksIn2D() {
    return componentTreeClicksIn2D_;
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
      output.writeUInt32(1, imageClicksIn3D_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, imageClicksIn2D_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, componentTreeClicksIn3D_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, componentTreeClicksIn2D_);
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
        .computeUInt32Size(1, imageClicksIn3D_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, imageClicksIn2D_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, componentTreeClicksIn3D_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, componentTreeClicksIn2D_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation other = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation) obj;

    if (hasImageClicksIn3D() != other.hasImageClicksIn3D()) return false;
    if (hasImageClicksIn3D()) {
      if (getImageClicksIn3D()
          != other.getImageClicksIn3D()) return false;
    }
    if (hasImageClicksIn2D() != other.hasImageClicksIn2D()) return false;
    if (hasImageClicksIn2D()) {
      if (getImageClicksIn2D()
          != other.getImageClicksIn2D()) return false;
    }
    if (hasComponentTreeClicksIn3D() != other.hasComponentTreeClicksIn3D()) return false;
    if (hasComponentTreeClicksIn3D()) {
      if (getComponentTreeClicksIn3D()
          != other.getComponentTreeClicksIn3D()) return false;
    }
    if (hasComponentTreeClicksIn2D() != other.hasComponentTreeClicksIn2D()) return false;
    if (hasComponentTreeClicksIn2D()) {
      if (getComponentTreeClicksIn2D()
          != other.getComponentTreeClicksIn2D()) return false;
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
    if (hasImageClicksIn3D()) {
      hash = (37 * hash) + IMAGE_CLICKS_IN_3D_FIELD_NUMBER;
      hash = (53 * hash) + getImageClicksIn3D();
    }
    if (hasImageClicksIn2D()) {
      hash = (37 * hash) + IMAGE_CLICKS_IN_2D_FIELD_NUMBER;
      hash = (53 * hash) + getImageClicksIn2D();
    }
    if (hasComponentTreeClicksIn3D()) {
      hash = (37 * hash) + COMPONENT_TREE_CLICKS_IN_3D_FIELD_NUMBER;
      hash = (53 * hash) + getComponentTreeClicksIn3D();
    }
    if (hasComponentTreeClicksIn2D()) {
      hash = (37 * hash) + COMPONENT_TREE_CLICKS_IN_2D_FIELD_NUMBER;
      hash = (53 * hash) + getComponentTreeClicksIn2D();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation prototype) {
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
   * Session data for dynamic layout inspector (inspector v2) around 3D rotation
   * </pre>
   *
   * Protobuf type {@code android_studio.DynamicLayoutInspectorRotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DynamicLayoutInspectorRotation)
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorRotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorRotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.newBuilder()
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
      imageClicksIn3D_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      imageClicksIn2D_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      componentTreeClicksIn3D_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      componentTreeClicksIn2D_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorRotation_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation build() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation buildPartial() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation result = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.imageClicksIn3D_ = imageClicksIn3D_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.imageClicksIn2D_ = imageClicksIn2D_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.componentTreeClicksIn3D_ = componentTreeClicksIn3D_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.componentTreeClicksIn2D_ = componentTreeClicksIn2D_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation other) {
      if (other == com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation.getDefaultInstance()) return this;
      if (other.hasImageClicksIn3D()) {
        setImageClicksIn3D(other.getImageClicksIn3D());
      }
      if (other.hasImageClicksIn2D()) {
        setImageClicksIn2D(other.getImageClicksIn2D());
      }
      if (other.hasComponentTreeClicksIn3D()) {
        setComponentTreeClicksIn3D(other.getComponentTreeClicksIn3D());
      }
      if (other.hasComponentTreeClicksIn2D()) {
        setComponentTreeClicksIn2D(other.getComponentTreeClicksIn2D());
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
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int imageClicksIn3D_ ;
    /**
     * <pre>
     * Component selection count in image while showing in 3D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_3d = 1;</code>
     * @return Whether the imageClicksIn3d field is set.
     */
    public boolean hasImageClicksIn3D() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Component selection count in image while showing in 3D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_3d = 1;</code>
     * @return The imageClicksIn3d.
     */
    public int getImageClicksIn3D() {
      return imageClicksIn3D_;
    }
    /**
     * <pre>
     * Component selection count in image while showing in 3D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_3d = 1;</code>
     * @param value The imageClicksIn3d to set.
     * @return This builder for chaining.
     */
    public Builder setImageClicksIn3D(int value) {
      bitField0_ |= 0x00000001;
      imageClicksIn3D_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Component selection count in image while showing in 3D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_3d = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageClicksIn3D() {
      bitField0_ = (bitField0_ & ~0x00000001);
      imageClicksIn3D_ = 0;
      onChanged();
      return this;
    }

    private int imageClicksIn2D_ ;
    /**
     * <pre>
     * Component selection count in image while showing in 2D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_2d = 2;</code>
     * @return Whether the imageClicksIn2d field is set.
     */
    public boolean hasImageClicksIn2D() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Component selection count in image while showing in 2D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_2d = 2;</code>
     * @return The imageClicksIn2d.
     */
    public int getImageClicksIn2D() {
      return imageClicksIn2D_;
    }
    /**
     * <pre>
     * Component selection count in image while showing in 2D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_2d = 2;</code>
     * @param value The imageClicksIn2d to set.
     * @return This builder for chaining.
     */
    public Builder setImageClicksIn2D(int value) {
      bitField0_ |= 0x00000002;
      imageClicksIn2D_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Component selection count in image while showing in 2D
     * </pre>
     *
     * <code>optional uint32 image_clicks_in_2d = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageClicksIn2D() {
      bitField0_ = (bitField0_ & ~0x00000002);
      imageClicksIn2D_ = 0;
      onChanged();
      return this;
    }

    private int componentTreeClicksIn3D_ ;
    /**
     * <pre>
     * Component selection count in the component tree while showing in 3D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
     * @return Whether the componentTreeClicksIn3d field is set.
     */
    public boolean hasComponentTreeClicksIn3D() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 3D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
     * @return The componentTreeClicksIn3d.
     */
    public int getComponentTreeClicksIn3D() {
      return componentTreeClicksIn3D_;
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 3D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
     * @param value The componentTreeClicksIn3d to set.
     * @return This builder for chaining.
     */
    public Builder setComponentTreeClicksIn3D(int value) {
      bitField0_ |= 0x00000004;
      componentTreeClicksIn3D_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 3D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_3d = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearComponentTreeClicksIn3D() {
      bitField0_ = (bitField0_ & ~0x00000004);
      componentTreeClicksIn3D_ = 0;
      onChanged();
      return this;
    }

    private int componentTreeClicksIn2D_ ;
    /**
     * <pre>
     * Component selection count in the component tree while showing in 2D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
     * @return Whether the componentTreeClicksIn2d field is set.
     */
    public boolean hasComponentTreeClicksIn2D() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 2D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
     * @return The componentTreeClicksIn2d.
     */
    public int getComponentTreeClicksIn2D() {
      return componentTreeClicksIn2D_;
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 2D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
     * @param value The componentTreeClicksIn2d to set.
     * @return This builder for chaining.
     */
    public Builder setComponentTreeClicksIn2D(int value) {
      bitField0_ |= 0x00000008;
      componentTreeClicksIn2D_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Component selection count in the component tree while showing in 2D
     * </pre>
     *
     * <code>optional uint32 component_tree_clicks_in_2d = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearComponentTreeClicksIn2D() {
      bitField0_ = (bitField0_ & ~0x00000008);
      componentTreeClicksIn2D_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DynamicLayoutInspectorRotation)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DynamicLayoutInspectorRotation)
  private static final com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation();
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DynamicLayoutInspectorRotation>
      PARSER = new com.google.protobuf.AbstractParser<DynamicLayoutInspectorRotation>() {
    @java.lang.Override
    public DynamicLayoutInspectorRotation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynamicLayoutInspectorRotation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynamicLayoutInspectorRotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicLayoutInspectorRotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorRotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

