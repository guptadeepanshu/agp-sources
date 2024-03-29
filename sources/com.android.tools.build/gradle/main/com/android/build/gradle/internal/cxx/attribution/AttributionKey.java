// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_attribution.proto

package com.android.build.gradle.internal.cxx.attribution;

/**
 * <pre>
 **
 * Unique identifier containing module, variant, and ABI.
 * </pre>
 *
 * Protobuf type {@code AttributionKey}
 */
public final class AttributionKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AttributionKey)
    AttributionKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttributionKey.newBuilder() to construct.
  private AttributionKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttributionKey() {
    module_ = "";
    variant_ = "";
    abi_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttributionKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttributionKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            module_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            variant_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            abi_ = s;
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
    return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_AttributionKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_AttributionKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.attribution.AttributionKey.class, com.android.build.gradle.internal.cxx.attribution.AttributionKey.Builder.class);
  }

  public static final int MODULE_FIELD_NUMBER = 1;
  private volatile java.lang.Object module_;
  /**
   * <code>string module = 1;</code>
   * @return The module.
   */
  @java.lang.Override
  public java.lang.String getModule() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      module_ = s;
      return s;
    }
  }
  /**
   * <code>string module = 1;</code>
   * @return The bytes for module.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleBytes() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      module_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIANT_FIELD_NUMBER = 2;
  private volatile java.lang.Object variant_;
  /**
   * <code>string variant = 2;</code>
   * @return The variant.
   */
  @java.lang.Override
  public java.lang.String getVariant() {
    java.lang.Object ref = variant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      variant_ = s;
      return s;
    }
  }
  /**
   * <code>string variant = 2;</code>
   * @return The bytes for variant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVariantBytes() {
    java.lang.Object ref = variant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      variant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ABI_FIELD_NUMBER = 3;
  private volatile java.lang.Object abi_;
  /**
   * <code>string abi = 3;</code>
   * @return The abi.
   */
  @java.lang.Override
  public java.lang.String getAbi() {
    java.lang.Object ref = abi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      abi_ = s;
      return s;
    }
  }
  /**
   * <code>string abi = 3;</code>
   * @return The bytes for abi.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAbiBytes() {
    java.lang.Object ref = abi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      abi_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(variant_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, variant_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(abi_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, abi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(variant_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, variant_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(abi_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, abi_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.attribution.AttributionKey)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.attribution.AttributionKey other = (com.android.build.gradle.internal.cxx.attribution.AttributionKey) obj;

    if (!getModule()
        .equals(other.getModule())) return false;
    if (!getVariant()
        .equals(other.getVariant())) return false;
    if (!getAbi()
        .equals(other.getAbi())) return false;
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
    hash = (37 * hash) + MODULE_FIELD_NUMBER;
    hash = (53 * hash) + getModule().hashCode();
    hash = (37 * hash) + VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + getVariant().hashCode();
    hash = (37 * hash) + ABI_FIELD_NUMBER;
    hash = (53 * hash) + getAbi().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.attribution.AttributionKey prototype) {
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
   **
   * Unique identifier containing module, variant, and ABI.
   * </pre>
   *
   * Protobuf type {@code AttributionKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AttributionKey)
      com.android.build.gradle.internal.cxx.attribution.AttributionKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_AttributionKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_AttributionKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.attribution.AttributionKey.class, com.android.build.gradle.internal.cxx.attribution.AttributionKey.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.attribution.AttributionKey.newBuilder()
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
      module_ = "";

      variant_ = "";

      abi_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_AttributionKey_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.AttributionKey getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.attribution.AttributionKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.AttributionKey build() {
      com.android.build.gradle.internal.cxx.attribution.AttributionKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.AttributionKey buildPartial() {
      com.android.build.gradle.internal.cxx.attribution.AttributionKey result = new com.android.build.gradle.internal.cxx.attribution.AttributionKey(this);
      result.module_ = module_;
      result.variant_ = variant_;
      result.abi_ = abi_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.attribution.AttributionKey) {
        return mergeFrom((com.android.build.gradle.internal.cxx.attribution.AttributionKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.attribution.AttributionKey other) {
      if (other == com.android.build.gradle.internal.cxx.attribution.AttributionKey.getDefaultInstance()) return this;
      if (!other.getModule().isEmpty()) {
        module_ = other.module_;
        onChanged();
      }
      if (!other.getVariant().isEmpty()) {
        variant_ = other.variant_;
        onChanged();
      }
      if (!other.getAbi().isEmpty()) {
        abi_ = other.abi_;
        onChanged();
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
      com.android.build.gradle.internal.cxx.attribution.AttributionKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.attribution.AttributionKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object module_ = "";
    /**
     * <code>string module = 1;</code>
     * @return The module.
     */
    public java.lang.String getModule() {
      java.lang.Object ref = module_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        module_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string module = 1;</code>
     * @return The bytes for module.
     */
    public com.google.protobuf.ByteString
        getModuleBytes() {
      java.lang.Object ref = module_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        module_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string module = 1;</code>
     * @param value The module to set.
     * @return This builder for chaining.
     */
    public Builder setModule(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      module_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModule() {
      
      module_ = getDefaultInstance().getModule();
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1;</code>
     * @param value The bytes for module to set.
     * @return This builder for chaining.
     */
    public Builder setModuleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      module_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object variant_ = "";
    /**
     * <code>string variant = 2;</code>
     * @return The variant.
     */
    public java.lang.String getVariant() {
      java.lang.Object ref = variant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        variant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string variant = 2;</code>
     * @return The bytes for variant.
     */
    public com.google.protobuf.ByteString
        getVariantBytes() {
      java.lang.Object ref = variant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        variant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string variant = 2;</code>
     * @param value The variant to set.
     * @return This builder for chaining.
     */
    public Builder setVariant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      variant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string variant = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVariant() {
      
      variant_ = getDefaultInstance().getVariant();
      onChanged();
      return this;
    }
    /**
     * <code>string variant = 2;</code>
     * @param value The bytes for variant to set.
     * @return This builder for chaining.
     */
    public Builder setVariantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      variant_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object abi_ = "";
    /**
     * <code>string abi = 3;</code>
     * @return The abi.
     */
    public java.lang.String getAbi() {
      java.lang.Object ref = abi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        abi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string abi = 3;</code>
     * @return The bytes for abi.
     */
    public com.google.protobuf.ByteString
        getAbiBytes() {
      java.lang.Object ref = abi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        abi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string abi = 3;</code>
     * @param value The abi to set.
     * @return This builder for chaining.
     */
    public Builder setAbi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      abi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string abi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbi() {
      
      abi_ = getDefaultInstance().getAbi();
      onChanged();
      return this;
    }
    /**
     * <code>string abi = 3;</code>
     * @param value The bytes for abi to set.
     * @return This builder for chaining.
     */
    public Builder setAbiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      abi_ = value;
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


    // @@protoc_insertion_point(builder_scope:AttributionKey)
  }

  // @@protoc_insertion_point(class_scope:AttributionKey)
  private static final com.android.build.gradle.internal.cxx.attribution.AttributionKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.attribution.AttributionKey();
  }

  public static com.android.build.gradle.internal.cxx.attribution.AttributionKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributionKey>
      PARSER = new com.google.protobuf.AbstractParser<AttributionKey>() {
    @java.lang.Override
    public AttributionKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttributionKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttributionKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributionKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.attribution.AttributionKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

