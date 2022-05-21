// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sync_variant.proto

package com.android.ide.model.sync;

/**
 * <pre>
 * Application VariantType specific model.
 * </pre>
 *
 * Protobuf type {@code ApplicationVariantModel}
 */
public  final class ApplicationVariantModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApplicationVariantModel)
    ApplicationVariantModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplicationVariantModel.newBuilder() to construct.
  private ApplicationVariantModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplicationVariantModel() {
    applicationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplicationVariantModel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplicationVariantModel(
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
            com.android.ide.model.sync.ModuleVariantModel.Builder subBuilder = null;
            if (moduleCommonModel_ != null) {
              subBuilder = moduleCommonModel_.toBuilder();
            }
            moduleCommonModel_ = input.readMessage(com.android.ide.model.sync.ModuleVariantModel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(moduleCommonModel_);
              moduleCommonModel_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationId_ = s;
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
    return com.android.ide.model.sync.SyncVariant.internal_static_ApplicationVariantModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.ide.model.sync.SyncVariant.internal_static_ApplicationVariantModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.ide.model.sync.ApplicationVariantModel.class, com.android.ide.model.sync.ApplicationVariantModel.Builder.class);
  }

  public static final int MODULECOMMONMODEL_FIELD_NUMBER = 1;
  private com.android.ide.model.sync.ModuleVariantModel moduleCommonModel_;
  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   * @return Whether the moduleCommonModel field is set.
   */
  public boolean hasModuleCommonModel() {
    return moduleCommonModel_ != null;
  }
  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   * @return The moduleCommonModel.
   */
  public com.android.ide.model.sync.ModuleVariantModel getModuleCommonModel() {
    return moduleCommonModel_ == null ? com.android.ide.model.sync.ModuleVariantModel.getDefaultInstance() : moduleCommonModel_;
  }
  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   */
  public com.android.ide.model.sync.ModuleVariantModelOrBuilder getModuleCommonModelOrBuilder() {
    return getModuleCommonModel();
  }

  public static final int APPLICATIONID_FIELD_NUMBER = 2;
  private volatile java.lang.Object applicationId_;
  /**
   * <code>string applicationId = 2;</code>
   * @return The applicationId.
   */
  public java.lang.String getApplicationId() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationId_ = s;
      return s;
    }
  }
  /**
   * <code>string applicationId = 2;</code>
   * @return The bytes for applicationId.
   */
  public com.google.protobuf.ByteString
      getApplicationIdBytes() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationId_ = b;
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
    if (moduleCommonModel_ != null) {
      output.writeMessage(1, getModuleCommonModel());
    }
    if (!getApplicationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, applicationId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (moduleCommonModel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModuleCommonModel());
    }
    if (!getApplicationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, applicationId_);
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
    if (!(obj instanceof com.android.ide.model.sync.ApplicationVariantModel)) {
      return super.equals(obj);
    }
    com.android.ide.model.sync.ApplicationVariantModel other = (com.android.ide.model.sync.ApplicationVariantModel) obj;

    if (hasModuleCommonModel() != other.hasModuleCommonModel()) return false;
    if (hasModuleCommonModel()) {
      if (!getModuleCommonModel()
          .equals(other.getModuleCommonModel())) return false;
    }
    if (!getApplicationId()
        .equals(other.getApplicationId())) return false;
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
    if (hasModuleCommonModel()) {
      hash = (37 * hash) + MODULECOMMONMODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModuleCommonModel().hashCode();
    }
    hash = (37 * hash) + APPLICATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.ide.model.sync.ApplicationVariantModel parseFrom(
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
  public static Builder newBuilder(com.android.ide.model.sync.ApplicationVariantModel prototype) {
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
   * Application VariantType specific model.
   * </pre>
   *
   * Protobuf type {@code ApplicationVariantModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApplicationVariantModel)
      com.android.ide.model.sync.ApplicationVariantModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.ide.model.sync.SyncVariant.internal_static_ApplicationVariantModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.ide.model.sync.SyncVariant.internal_static_ApplicationVariantModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.ide.model.sync.ApplicationVariantModel.class, com.android.ide.model.sync.ApplicationVariantModel.Builder.class);
    }

    // Construct using com.android.ide.model.sync.ApplicationVariantModel.newBuilder()
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
      if (moduleCommonModelBuilder_ == null) {
        moduleCommonModel_ = null;
      } else {
        moduleCommonModel_ = null;
        moduleCommonModelBuilder_ = null;
      }
      applicationId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.ide.model.sync.SyncVariant.internal_static_ApplicationVariantModel_descriptor;
    }

    @java.lang.Override
    public com.android.ide.model.sync.ApplicationVariantModel getDefaultInstanceForType() {
      return com.android.ide.model.sync.ApplicationVariantModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.ide.model.sync.ApplicationVariantModel build() {
      com.android.ide.model.sync.ApplicationVariantModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.ide.model.sync.ApplicationVariantModel buildPartial() {
      com.android.ide.model.sync.ApplicationVariantModel result = new com.android.ide.model.sync.ApplicationVariantModel(this);
      if (moduleCommonModelBuilder_ == null) {
        result.moduleCommonModel_ = moduleCommonModel_;
      } else {
        result.moduleCommonModel_ = moduleCommonModelBuilder_.build();
      }
      result.applicationId_ = applicationId_;
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
      if (other instanceof com.android.ide.model.sync.ApplicationVariantModel) {
        return mergeFrom((com.android.ide.model.sync.ApplicationVariantModel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.ide.model.sync.ApplicationVariantModel other) {
      if (other == com.android.ide.model.sync.ApplicationVariantModel.getDefaultInstance()) return this;
      if (other.hasModuleCommonModel()) {
        mergeModuleCommonModel(other.getModuleCommonModel());
      }
      if (!other.getApplicationId().isEmpty()) {
        applicationId_ = other.applicationId_;
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
      com.android.ide.model.sync.ApplicationVariantModel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.ide.model.sync.ApplicationVariantModel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.android.ide.model.sync.ModuleVariantModel moduleCommonModel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.ide.model.sync.ModuleVariantModel, com.android.ide.model.sync.ModuleVariantModel.Builder, com.android.ide.model.sync.ModuleVariantModelOrBuilder> moduleCommonModelBuilder_;
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     * @return Whether the moduleCommonModel field is set.
     */
    public boolean hasModuleCommonModel() {
      return moduleCommonModelBuilder_ != null || moduleCommonModel_ != null;
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     * @return The moduleCommonModel.
     */
    public com.android.ide.model.sync.ModuleVariantModel getModuleCommonModel() {
      if (moduleCommonModelBuilder_ == null) {
        return moduleCommonModel_ == null ? com.android.ide.model.sync.ModuleVariantModel.getDefaultInstance() : moduleCommonModel_;
      } else {
        return moduleCommonModelBuilder_.getMessage();
      }
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public Builder setModuleCommonModel(com.android.ide.model.sync.ModuleVariantModel value) {
      if (moduleCommonModelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        moduleCommonModel_ = value;
        onChanged();
      } else {
        moduleCommonModelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public Builder setModuleCommonModel(
        com.android.ide.model.sync.ModuleVariantModel.Builder builderForValue) {
      if (moduleCommonModelBuilder_ == null) {
        moduleCommonModel_ = builderForValue.build();
        onChanged();
      } else {
        moduleCommonModelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public Builder mergeModuleCommonModel(com.android.ide.model.sync.ModuleVariantModel value) {
      if (moduleCommonModelBuilder_ == null) {
        if (moduleCommonModel_ != null) {
          moduleCommonModel_ =
            com.android.ide.model.sync.ModuleVariantModel.newBuilder(moduleCommonModel_).mergeFrom(value).buildPartial();
        } else {
          moduleCommonModel_ = value;
        }
        onChanged();
      } else {
        moduleCommonModelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public Builder clearModuleCommonModel() {
      if (moduleCommonModelBuilder_ == null) {
        moduleCommonModel_ = null;
        onChanged();
      } else {
        moduleCommonModel_ = null;
        moduleCommonModelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public com.android.ide.model.sync.ModuleVariantModel.Builder getModuleCommonModelBuilder() {
      
      onChanged();
      return getModuleCommonModelFieldBuilder().getBuilder();
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    public com.android.ide.model.sync.ModuleVariantModelOrBuilder getModuleCommonModelOrBuilder() {
      if (moduleCommonModelBuilder_ != null) {
        return moduleCommonModelBuilder_.getMessageOrBuilder();
      } else {
        return moduleCommonModel_ == null ?
            com.android.ide.model.sync.ModuleVariantModel.getDefaultInstance() : moduleCommonModel_;
      }
    }
    /**
     * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.ide.model.sync.ModuleVariantModel, com.android.ide.model.sync.ModuleVariantModel.Builder, com.android.ide.model.sync.ModuleVariantModelOrBuilder> 
        getModuleCommonModelFieldBuilder() {
      if (moduleCommonModelBuilder_ == null) {
        moduleCommonModelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.ide.model.sync.ModuleVariantModel, com.android.ide.model.sync.ModuleVariantModel.Builder, com.android.ide.model.sync.ModuleVariantModelOrBuilder>(
                getModuleCommonModel(),
                getParentForChildren(),
                isClean());
        moduleCommonModel_ = null;
      }
      return moduleCommonModelBuilder_;
    }

    private java.lang.Object applicationId_ = "";
    /**
     * <code>string applicationId = 2;</code>
     * @return The applicationId.
     */
    public java.lang.String getApplicationId() {
      java.lang.Object ref = applicationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string applicationId = 2;</code>
     * @return The bytes for applicationId.
     */
    public com.google.protobuf.ByteString
        getApplicationIdBytes() {
      java.lang.Object ref = applicationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string applicationId = 2;</code>
     * @param value The applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string applicationId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationId() {
      
      applicationId_ = getDefaultInstance().getApplicationId();
      onChanged();
      return this;
    }
    /**
     * <code>string applicationId = 2;</code>
     * @param value The bytes for applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationId_ = value;
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


    // @@protoc_insertion_point(builder_scope:ApplicationVariantModel)
  }

  // @@protoc_insertion_point(class_scope:ApplicationVariantModel)
  private static final com.android.ide.model.sync.ApplicationVariantModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.ide.model.sync.ApplicationVariantModel();
  }

  public static com.android.ide.model.sync.ApplicationVariantModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationVariantModel>
      PARSER = new com.google.protobuf.AbstractParser<ApplicationVariantModel>() {
    @java.lang.Override
    public ApplicationVariantModel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplicationVariantModel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplicationVariantModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationVariantModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.ide.model.sync.ApplicationVariantModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

