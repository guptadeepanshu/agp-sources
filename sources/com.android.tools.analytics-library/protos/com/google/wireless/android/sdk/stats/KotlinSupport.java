// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Kotlin support information
 * </pre>
 *
 * Protobuf type {@code android_studio.KotlinSupport}
 */
public final class KotlinSupport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.KotlinSupport)
    KotlinSupportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KotlinSupport.newBuilder() to construct.
  private KotlinSupport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KotlinSupport() {
    kotlinSupportVersion_ = "";
    androidKtxVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KotlinSupport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.KotlinSupport.class, com.google.wireless.android.sdk.stats.KotlinSupport.Builder.class);
  }

  private int bitField0_;
  public static final int INCLUDE_KOTLIN_SUPPORT_FIELD_NUMBER = 1;
  private boolean includeKotlinSupport_;
  /**
   * <pre>
   * True if "Include Kotlin Support" option checked
   * when Android project created, False otherwise.
   * Set when kind = TEMPLATE_RENDER
   * </pre>
   *
   * <code>optional bool include_kotlin_support = 1;</code>
   * @return Whether the includeKotlinSupport field is set.
   */
  @java.lang.Override
  public boolean hasIncludeKotlinSupport() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * True if "Include Kotlin Support" option checked
   * when Android project created, False otherwise.
   * Set when kind = TEMPLATE_RENDER
   * </pre>
   *
   * <code>optional bool include_kotlin_support = 1;</code>
   * @return The includeKotlinSupport.
   */
  @java.lang.Override
  public boolean getIncludeKotlinSupport() {
    return includeKotlinSupport_;
  }

  public static final int KOTLIN_SUPPORT_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object kotlinSupportVersion_;
  /**
   * <pre>
   * Kotlin version used, e.g. "1.1.3-2".
   * </pre>
   *
   * <code>optional string kotlin_support_version = 2;</code>
   * @return Whether the kotlinSupportVersion field is set.
   */
  @java.lang.Override
  public boolean hasKotlinSupportVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Kotlin version used, e.g. "1.1.3-2".
   * </pre>
   *
   * <code>optional string kotlin_support_version = 2;</code>
   * @return The kotlinSupportVersion.
   */
  @java.lang.Override
  public java.lang.String getKotlinSupportVersion() {
    java.lang.Object ref = kotlinSupportVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        kotlinSupportVersion_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Kotlin version used, e.g. "1.1.3-2".
   * </pre>
   *
   * <code>optional string kotlin_support_version = 2;</code>
   * @return The bytes for kotlinSupportVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKotlinSupportVersionBytes() {
    java.lang.Object ref = kotlinSupportVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kotlinSupportVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANDROID_KTX_VERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object androidKtxVersion_;
  /**
   * <pre>
   * Android Ktx version used, e.g. "1.0.0".
   * </pre>
   *
   * <code>optional string android_ktx_version = 3;</code>
   * @return Whether the androidKtxVersion field is set.
   */
  @java.lang.Override
  public boolean hasAndroidKtxVersion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Android Ktx version used, e.g. "1.0.0".
   * </pre>
   *
   * <code>optional string android_ktx_version = 3;</code>
   * @return The androidKtxVersion.
   */
  @java.lang.Override
  public java.lang.String getAndroidKtxVersion() {
    java.lang.Object ref = androidKtxVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        androidKtxVersion_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Android Ktx version used, e.g. "1.0.0".
   * </pre>
   *
   * <code>optional string android_ktx_version = 3;</code>
   * @return The bytes for androidKtxVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAndroidKtxVersionBytes() {
    java.lang.Object ref = androidKtxVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      androidKtxVersion_ = b;
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
      output.writeBool(1, includeKotlinSupport_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kotlinSupportVersion_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, androidKtxVersion_);
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
        .computeBoolSize(1, includeKotlinSupport_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kotlinSupportVersion_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, androidKtxVersion_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.KotlinSupport)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.KotlinSupport other = (com.google.wireless.android.sdk.stats.KotlinSupport) obj;

    if (hasIncludeKotlinSupport() != other.hasIncludeKotlinSupport()) return false;
    if (hasIncludeKotlinSupport()) {
      if (getIncludeKotlinSupport()
          != other.getIncludeKotlinSupport()) return false;
    }
    if (hasKotlinSupportVersion() != other.hasKotlinSupportVersion()) return false;
    if (hasKotlinSupportVersion()) {
      if (!getKotlinSupportVersion()
          .equals(other.getKotlinSupportVersion())) return false;
    }
    if (hasAndroidKtxVersion() != other.hasAndroidKtxVersion()) return false;
    if (hasAndroidKtxVersion()) {
      if (!getAndroidKtxVersion()
          .equals(other.getAndroidKtxVersion())) return false;
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
    if (hasIncludeKotlinSupport()) {
      hash = (37 * hash) + INCLUDE_KOTLIN_SUPPORT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIncludeKotlinSupport());
    }
    if (hasKotlinSupportVersion()) {
      hash = (37 * hash) + KOTLIN_SUPPORT_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getKotlinSupportVersion().hashCode();
    }
    if (hasAndroidKtxVersion()) {
      hash = (37 * hash) + ANDROID_KTX_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getAndroidKtxVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupport parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.KotlinSupport prototype) {
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
   * Kotlin support information
   * </pre>
   *
   * Protobuf type {@code android_studio.KotlinSupport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.KotlinSupport)
      com.google.wireless.android.sdk.stats.KotlinSupportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.KotlinSupport.class, com.google.wireless.android.sdk.stats.KotlinSupport.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.KotlinSupport.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      includeKotlinSupport_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      kotlinSupportVersion_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      androidKtxVersion_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupport_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupport getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.KotlinSupport.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupport build() {
      com.google.wireless.android.sdk.stats.KotlinSupport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupport buildPartial() {
      com.google.wireless.android.sdk.stats.KotlinSupport result = new com.google.wireless.android.sdk.stats.KotlinSupport(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.includeKotlinSupport_ = includeKotlinSupport_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.kotlinSupportVersion_ = kotlinSupportVersion_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.androidKtxVersion_ = androidKtxVersion_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.KotlinSupport) {
        return mergeFrom((com.google.wireless.android.sdk.stats.KotlinSupport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.KotlinSupport other) {
      if (other == com.google.wireless.android.sdk.stats.KotlinSupport.getDefaultInstance()) return this;
      if (other.hasIncludeKotlinSupport()) {
        setIncludeKotlinSupport(other.getIncludeKotlinSupport());
      }
      if (other.hasKotlinSupportVersion()) {
        bitField0_ |= 0x00000002;
        kotlinSupportVersion_ = other.kotlinSupportVersion_;
        onChanged();
      }
      if (other.hasAndroidKtxVersion()) {
        bitField0_ |= 0x00000004;
        androidKtxVersion_ = other.androidKtxVersion_;
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
            case 8: {
              includeKotlinSupport_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              kotlinSupportVersion_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              androidKtxVersion_ = input.readBytes();
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

    private boolean includeKotlinSupport_ ;
    /**
     * <pre>
     * True if "Include Kotlin Support" option checked
     * when Android project created, False otherwise.
     * Set when kind = TEMPLATE_RENDER
     * </pre>
     *
     * <code>optional bool include_kotlin_support = 1;</code>
     * @return Whether the includeKotlinSupport field is set.
     */
    @java.lang.Override
    public boolean hasIncludeKotlinSupport() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * True if "Include Kotlin Support" option checked
     * when Android project created, False otherwise.
     * Set when kind = TEMPLATE_RENDER
     * </pre>
     *
     * <code>optional bool include_kotlin_support = 1;</code>
     * @return The includeKotlinSupport.
     */
    @java.lang.Override
    public boolean getIncludeKotlinSupport() {
      return includeKotlinSupport_;
    }
    /**
     * <pre>
     * True if "Include Kotlin Support" option checked
     * when Android project created, False otherwise.
     * Set when kind = TEMPLATE_RENDER
     * </pre>
     *
     * <code>optional bool include_kotlin_support = 1;</code>
     * @param value The includeKotlinSupport to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeKotlinSupport(boolean value) {
      bitField0_ |= 0x00000001;
      includeKotlinSupport_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if "Include Kotlin Support" option checked
     * when Android project created, False otherwise.
     * Set when kind = TEMPLATE_RENDER
     * </pre>
     *
     * <code>optional bool include_kotlin_support = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeKotlinSupport() {
      bitField0_ = (bitField0_ & ~0x00000001);
      includeKotlinSupport_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object kotlinSupportVersion_ = "";
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @return Whether the kotlinSupportVersion field is set.
     */
    public boolean hasKotlinSupportVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @return The kotlinSupportVersion.
     */
    public java.lang.String getKotlinSupportVersion() {
      java.lang.Object ref = kotlinSupportVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kotlinSupportVersion_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @return The bytes for kotlinSupportVersion.
     */
    public com.google.protobuf.ByteString
        getKotlinSupportVersionBytes() {
      java.lang.Object ref = kotlinSupportVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kotlinSupportVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @param value The kotlinSupportVersion to set.
     * @return This builder for chaining.
     */
    public Builder setKotlinSupportVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      kotlinSupportVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKotlinSupportVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      kotlinSupportVersion_ = getDefaultInstance().getKotlinSupportVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Kotlin version used, e.g. "1.1.3-2".
     * </pre>
     *
     * <code>optional string kotlin_support_version = 2;</code>
     * @param value The bytes for kotlinSupportVersion to set.
     * @return This builder for chaining.
     */
    public Builder setKotlinSupportVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      kotlinSupportVersion_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object androidKtxVersion_ = "";
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @return Whether the androidKtxVersion field is set.
     */
    public boolean hasAndroidKtxVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @return The androidKtxVersion.
     */
    public java.lang.String getAndroidKtxVersion() {
      java.lang.Object ref = androidKtxVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          androidKtxVersion_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @return The bytes for androidKtxVersion.
     */
    public com.google.protobuf.ByteString
        getAndroidKtxVersionBytes() {
      java.lang.Object ref = androidKtxVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        androidKtxVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @param value The androidKtxVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAndroidKtxVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      androidKtxVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAndroidKtxVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      androidKtxVersion_ = getDefaultInstance().getAndroidKtxVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Android Ktx version used, e.g. "1.0.0".
     * </pre>
     *
     * <code>optional string android_ktx_version = 3;</code>
     * @param value The bytes for androidKtxVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAndroidKtxVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      androidKtxVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.KotlinSupport)
  }

  // @@protoc_insertion_point(class_scope:android_studio.KotlinSupport)
  private static final com.google.wireless.android.sdk.stats.KotlinSupport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.KotlinSupport();
  }

  public static com.google.wireless.android.sdk.stats.KotlinSupport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<KotlinSupport>
      PARSER = new com.google.protobuf.AbstractParser<KotlinSupport>() {
    @java.lang.Override
    public KotlinSupport parsePartialFrom(
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

  public static com.google.protobuf.Parser<KotlinSupport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KotlinSupport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.KotlinSupport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

