// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_configure.proto

package com.android.build.gradle.internal.cxx.configure;

/**
 * <pre>
 * Records creation of C/C++ model
 * </pre>
 *
 * Protobuf type {@code CreateCxxModel}
 */
public final class CreateCxxModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateCxxModel)
    CreateCxxModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCxxModel.newBuilder() to construct.
  private CreateCxxModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCxxModel() {
    gradlePath_ = "";
    variantName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCxxModel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_CreateCxxModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_CreateCxxModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.configure.CreateCxxModel.class, com.android.build.gradle.internal.cxx.configure.CreateCxxModel.Builder.class);
  }

  public static final int GRADLE_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gradlePath_ = "";
  /**
   * <code>string gradle_path = 1;</code>
   * @return The gradlePath.
   */
  @java.lang.Override
  public java.lang.String getGradlePath() {
    java.lang.Object ref = gradlePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gradlePath_ = s;
      return s;
    }
  }
  /**
   * <code>string gradle_path = 1;</code>
   * @return The bytes for gradlePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGradlePathBytes() {
    java.lang.Object ref = gradlePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gradlePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIANT_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object variantName_ = "";
  /**
   * <code>string variant_name = 2;</code>
   * @return The variantName.
   */
  @java.lang.Override
  public java.lang.String getVariantName() {
    java.lang.Object ref = variantName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      variantName_ = s;
      return s;
    }
  }
  /**
   * <code>string variant_name = 2;</code>
   * @return The bytes for variantName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVariantNameBytes() {
    java.lang.Object ref = variantName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      variantName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gradlePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gradlePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(variantName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, variantName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gradlePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gradlePath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(variantName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, variantName_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.configure.CreateCxxModel)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.configure.CreateCxxModel other = (com.android.build.gradle.internal.cxx.configure.CreateCxxModel) obj;

    if (!getGradlePath()
        .equals(other.getGradlePath())) return false;
    if (!getVariantName()
        .equals(other.getVariantName())) return false;
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
    hash = (37 * hash) + GRADLE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGradlePath().hashCode();
    hash = (37 * hash) + VARIANT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVariantName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.configure.CreateCxxModel prototype) {
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
   * Records creation of C/C++ model
   * </pre>
   *
   * Protobuf type {@code CreateCxxModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateCxxModel)
      com.android.build.gradle.internal.cxx.configure.CreateCxxModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_CreateCxxModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_CreateCxxModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.configure.CreateCxxModel.class, com.android.build.gradle.internal.cxx.configure.CreateCxxModel.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.configure.CreateCxxModel.newBuilder()
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
      gradlePath_ = "";
      variantName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_CreateCxxModel_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.CreateCxxModel getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.configure.CreateCxxModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.CreateCxxModel build() {
      com.android.build.gradle.internal.cxx.configure.CreateCxxModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.CreateCxxModel buildPartial() {
      com.android.build.gradle.internal.cxx.configure.CreateCxxModel result = new com.android.build.gradle.internal.cxx.configure.CreateCxxModel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.android.build.gradle.internal.cxx.configure.CreateCxxModel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gradlePath_ = gradlePath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.variantName_ = variantName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.build.gradle.internal.cxx.configure.CreateCxxModel) {
        return mergeFrom((com.android.build.gradle.internal.cxx.configure.CreateCxxModel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.configure.CreateCxxModel other) {
      if (other == com.android.build.gradle.internal.cxx.configure.CreateCxxModel.getDefaultInstance()) return this;
      if (!other.getGradlePath().isEmpty()) {
        gradlePath_ = other.gradlePath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVariantName().isEmpty()) {
        variantName_ = other.variantName_;
        bitField0_ |= 0x00000002;
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
              gradlePath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              variantName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object gradlePath_ = "";
    /**
     * <code>string gradle_path = 1;</code>
     * @return The gradlePath.
     */
    public java.lang.String getGradlePath() {
      java.lang.Object ref = gradlePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gradlePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gradle_path = 1;</code>
     * @return The bytes for gradlePath.
     */
    public com.google.protobuf.ByteString
        getGradlePathBytes() {
      java.lang.Object ref = gradlePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gradlePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gradle_path = 1;</code>
     * @param value The gradlePath to set.
     * @return This builder for chaining.
     */
    public Builder setGradlePath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gradlePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string gradle_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGradlePath() {
      gradlePath_ = getDefaultInstance().getGradlePath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string gradle_path = 1;</code>
     * @param value The bytes for gradlePath to set.
     * @return This builder for chaining.
     */
    public Builder setGradlePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gradlePath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object variantName_ = "";
    /**
     * <code>string variant_name = 2;</code>
     * @return The variantName.
     */
    public java.lang.String getVariantName() {
      java.lang.Object ref = variantName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        variantName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string variant_name = 2;</code>
     * @return The bytes for variantName.
     */
    public com.google.protobuf.ByteString
        getVariantNameBytes() {
      java.lang.Object ref = variantName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        variantName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string variant_name = 2;</code>
     * @param value The variantName to set.
     * @return This builder for chaining.
     */
    public Builder setVariantName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      variantName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string variant_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVariantName() {
      variantName_ = getDefaultInstance().getVariantName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string variant_name = 2;</code>
     * @param value The bytes for variantName to set.
     * @return This builder for chaining.
     */
    public Builder setVariantNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      variantName_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:CreateCxxModel)
  }

  // @@protoc_insertion_point(class_scope:CreateCxxModel)
  private static final com.android.build.gradle.internal.cxx.configure.CreateCxxModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.configure.CreateCxxModel();
  }

  public static com.android.build.gradle.internal.cxx.configure.CreateCxxModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCxxModel>
      PARSER = new com.google.protobuf.AbstractParser<CreateCxxModel>() {
    @java.lang.Override
    public CreateCxxModel parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCxxModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCxxModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.configure.CreateCxxModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

