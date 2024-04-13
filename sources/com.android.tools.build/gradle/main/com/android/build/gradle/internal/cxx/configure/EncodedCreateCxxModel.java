// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_configure.proto

package com.android.build.gradle.internal.cxx.configure;

/**
 * Protobuf type {@code EncodedCreateCxxModel}
 */
public final class EncodedCreateCxxModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedCreateCxxModel)
    EncodedCreateCxxModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedCreateCxxModel.newBuilder() to construct.
  private EncodedCreateCxxModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedCreateCxxModel() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedCreateCxxModel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncodedCreateCxxModel(
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
          case 8: {

            gradlePath_ = input.readInt32();
            break;
          }
          case 16: {

            variantName_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedCreateCxxModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedCreateCxxModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.class, com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.Builder.class);
  }

  public static final int GRADLE_PATH_FIELD_NUMBER = 1;
  private int gradlePath_;
  /**
   * <code>int32 gradle_path = 1;</code>
   * @return The gradlePath.
   */
  @java.lang.Override
  public int getGradlePath() {
    return gradlePath_;
  }

  public static final int VARIANT_NAME_FIELD_NUMBER = 2;
  private int variantName_;
  /**
   * <code>int32 variant_name = 2;</code>
   * @return The variantName.
   */
  @java.lang.Override
  public int getVariantName() {
    return variantName_;
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
    if (gradlePath_ != 0) {
      output.writeInt32(1, gradlePath_);
    }
    if (variantName_ != 0) {
      output.writeInt32(2, variantName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gradlePath_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, gradlePath_);
    }
    if (variantName_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, variantName_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel other = (com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel) obj;

    if (getGradlePath()
        != other.getGradlePath()) return false;
    if (getVariantName()
        != other.getVariantName()) return false;
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
    hash = (37 * hash) + GRADLE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGradlePath();
    hash = (37 * hash) + VARIANT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVariantName();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel prototype) {
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
   * Protobuf type {@code EncodedCreateCxxModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedCreateCxxModel)
      com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedCreateCxxModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedCreateCxxModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.class, com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.newBuilder()
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
      gradlePath_ = 0;

      variantName_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedCreateCxxModel_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel build() {
      com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel buildPartial() {
      com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel result = new com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel(this);
      result.gradlePath_ = gradlePath_;
      result.variantName_ = variantName_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel) {
        return mergeFrom((com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel other) {
      if (other == com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel.getDefaultInstance()) return this;
      if (other.getGradlePath() != 0) {
        setGradlePath(other.getGradlePath());
      }
      if (other.getVariantName() != 0) {
        setVariantName(other.getVariantName());
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
      com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gradlePath_ ;
    /**
     * <code>int32 gradle_path = 1;</code>
     * @return The gradlePath.
     */
    @java.lang.Override
    public int getGradlePath() {
      return gradlePath_;
    }
    /**
     * <code>int32 gradle_path = 1;</code>
     * @param value The gradlePath to set.
     * @return This builder for chaining.
     */
    public Builder setGradlePath(int value) {
      
      gradlePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gradle_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGradlePath() {
      
      gradlePath_ = 0;
      onChanged();
      return this;
    }

    private int variantName_ ;
    /**
     * <code>int32 variant_name = 2;</code>
     * @return The variantName.
     */
    @java.lang.Override
    public int getVariantName() {
      return variantName_;
    }
    /**
     * <code>int32 variant_name = 2;</code>
     * @param value The variantName to set.
     * @return This builder for chaining.
     */
    public Builder setVariantName(int value) {
      
      variantName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 variant_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVariantName() {
      
      variantName_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EncodedCreateCxxModel)
  }

  // @@protoc_insertion_point(class_scope:EncodedCreateCxxModel)
  private static final com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel();
  }

  public static com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedCreateCxxModel>
      PARSER = new com.google.protobuf.AbstractParser<EncodedCreateCxxModel>() {
    @java.lang.Override
    public EncodedCreateCxxModel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncodedCreateCxxModel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncodedCreateCxxModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedCreateCxxModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.configure.EncodedCreateCxxModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
