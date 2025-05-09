// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Emulator guest image's GL info.
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorGuestGlInfo}
 */
public final class EmulatorGuestGlInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorGuestGlInfo)
    EmulatorGuestGlInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorGuestGlInfo.newBuilder() to construct.
  private EmulatorGuestGlInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorGuestGlInfo() {
    vendor_ = "";
    renderer_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorGuestGlInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGuestGlInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGuestGlInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.class, com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.Builder.class);
  }

  private int bitField0_;
  public static final int VENDOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vendor_ = "";
  /**
   * <pre>
   * GL Driver vendor.
   * </pre>
   *
   * <code>optional string vendor = 1;</code>
   * @return Whether the vendor field is set.
   */
  @java.lang.Override
  public boolean hasVendor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * GL Driver vendor.
   * </pre>
   *
   * <code>optional string vendor = 1;</code>
   * @return The vendor.
   */
  @java.lang.Override
  public java.lang.String getVendor() {
    java.lang.Object ref = vendor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        vendor_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * GL Driver vendor.
   * </pre>
   *
   * <code>optional string vendor = 1;</code>
   * @return The bytes for vendor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVendorBytes() {
    java.lang.Object ref = vendor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vendor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RENDERER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object renderer_ = "";
  /**
   * <pre>
   * GL Driver name.
   * </pre>
   *
   * <code>optional string renderer = 2;</code>
   * @return Whether the renderer field is set.
   */
  @java.lang.Override
  public boolean hasRenderer() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * GL Driver name.
   * </pre>
   *
   * <code>optional string renderer = 2;</code>
   * @return The renderer.
   */
  @java.lang.Override
  public java.lang.String getRenderer() {
    java.lang.Object ref = renderer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        renderer_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * GL Driver name.
   * </pre>
   *
   * <code>optional string renderer = 2;</code>
   * @return The bytes for renderer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRendererBytes() {
    java.lang.Object ref = renderer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      renderer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   * <pre>
   * GL Driver version number.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * GL Driver version number.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        version_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * GL Driver version number.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vendor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, renderer_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, version_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vendor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, renderer_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, version_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo other = (com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo) obj;

    if (hasVendor() != other.hasVendor()) return false;
    if (hasVendor()) {
      if (!getVendor()
          .equals(other.getVendor())) return false;
    }
    if (hasRenderer() != other.hasRenderer()) return false;
    if (hasRenderer()) {
      if (!getRenderer()
          .equals(other.getRenderer())) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
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
    if (hasVendor()) {
      hash = (37 * hash) + VENDOR_FIELD_NUMBER;
      hash = (53 * hash) + getVendor().hashCode();
    }
    if (hasRenderer()) {
      hash = (37 * hash) + RENDERER_FIELD_NUMBER;
      hash = (53 * hash) + getRenderer().hashCode();
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo prototype) {
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
   * Emulator guest image's GL info.
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorGuestGlInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorGuestGlInfo)
      com.google.wireless.android.sdk.stats.EmulatorGuestGlInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGuestGlInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGuestGlInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.class, com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.newBuilder()
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
      vendor_ = "";
      renderer_ = "";
      version_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGuestGlInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo build() {
      com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo result = new com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vendor_ = vendor_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.renderer_ = renderer_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = version_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo.getDefaultInstance()) return this;
      if (other.hasVendor()) {
        vendor_ = other.vendor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRenderer()) {
        renderer_ = other.renderer_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasVersion()) {
        version_ = other.version_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 10: {
              vendor_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              renderer_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              version_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object vendor_ = "";
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @return Whether the vendor field is set.
     */
    public boolean hasVendor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @return The vendor.
     */
    public java.lang.String getVendor() {
      java.lang.Object ref = vendor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          vendor_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @return The bytes for vendor.
     */
    public com.google.protobuf.ByteString
        getVendorBytes() {
      java.lang.Object ref = vendor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vendor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @param value The vendor to set.
     * @return This builder for chaining.
     */
    public Builder setVendor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVendor() {
      vendor_ = getDefaultInstance().getVendor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver vendor.
     * </pre>
     *
     * <code>optional string vendor = 1;</code>
     * @param value The bytes for vendor to set.
     * @return This builder for chaining.
     */
    public Builder setVendorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      vendor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object renderer_ = "";
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @return Whether the renderer field is set.
     */
    public boolean hasRenderer() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @return The renderer.
     */
    public java.lang.String getRenderer() {
      java.lang.Object ref = renderer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          renderer_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @return The bytes for renderer.
     */
    public com.google.protobuf.ByteString
        getRendererBytes() {
      java.lang.Object ref = renderer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        renderer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @param value The renderer to set.
     * @return This builder for chaining.
     */
    public Builder setRenderer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      renderer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRenderer() {
      renderer_ = getDefaultInstance().getRenderer();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver name.
     * </pre>
     *
     * <code>optional string renderer = 2;</code>
     * @param value The bytes for renderer to set.
     * @return This builder for chaining.
     */
    public Builder setRendererBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      renderer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GL Driver version number.
     * </pre>
     *
     * <code>optional string version = 3;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorGuestGlInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorGuestGlInfo)
  private static final com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorGuestGlInfo>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorGuestGlInfo>() {
    @java.lang.Override
    public EmulatorGuestGlInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmulatorGuestGlInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorGuestGlInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorGuestGlInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

