// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_caching.proto

package com.android.build.gradle.internal.cxx.caching;

/**
 * <pre>
 **
 * String-table-encoded version of [Compilation]
 * </pre>
 *
 * Protobuf type {@code EncodedCompilation}
 */
public final class EncodedCompilation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedCompilation)
    EncodedCompilationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedCompilation.newBuilder() to construct.
  private EncodedCompilation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedCompilation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedCompilation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncodedCompilation(
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

            workingDirectoryId_ = input.readInt32();
            break;
          }
          case 18: {
            com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder subBuilder = null;
            if (objectFileKey_ != null) {
              subBuilder = objectFileKey_.toBuilder();
            }
            objectFileKey_ = input.readMessage(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(objectFileKey_);
              objectFileKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            objectFileId_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedCompilation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedCompilation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.caching.EncodedCompilation.class, com.android.build.gradle.internal.cxx.caching.EncodedCompilation.Builder.class);
  }

  public static final int WORKING_DIRECTORY_ID_FIELD_NUMBER = 1;
  private int workingDirectoryId_;
  /**
   * <code>int32 working_directory_id = 1;</code>
   * @return The workingDirectoryId.
   */
  @java.lang.Override
  public int getWorkingDirectoryId() {
    return workingDirectoryId_;
  }

  public static final int OBJECT_FILE_KEY_FIELD_NUMBER = 2;
  private com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey objectFileKey_;
  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   * @return Whether the objectFileKey field is set.
   */
  @java.lang.Override
  public boolean hasObjectFileKey() {
    return objectFileKey_ != null;
  }
  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   * @return The objectFileKey.
   */
  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getObjectFileKey() {
    return objectFileKey_ == null ? com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.getDefaultInstance() : objectFileKey_;
  }
  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   */
  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder getObjectFileKeyOrBuilder() {
    return getObjectFileKey();
  }

  public static final int OBJECT_FILE_ID_FIELD_NUMBER = 3;
  private int objectFileId_;
  /**
   * <code>int32 object_file_id = 3;</code>
   * @return The objectFileId.
   */
  @java.lang.Override
  public int getObjectFileId() {
    return objectFileId_;
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
    if (workingDirectoryId_ != 0) {
      output.writeInt32(1, workingDirectoryId_);
    }
    if (objectFileKey_ != null) {
      output.writeMessage(2, getObjectFileKey());
    }
    if (objectFileId_ != 0) {
      output.writeInt32(3, objectFileId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workingDirectoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, workingDirectoryId_);
    }
    if (objectFileKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getObjectFileKey());
    }
    if (objectFileId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, objectFileId_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.caching.EncodedCompilation)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.caching.EncodedCompilation other = (com.android.build.gradle.internal.cxx.caching.EncodedCompilation) obj;

    if (getWorkingDirectoryId()
        != other.getWorkingDirectoryId()) return false;
    if (hasObjectFileKey() != other.hasObjectFileKey()) return false;
    if (hasObjectFileKey()) {
      if (!getObjectFileKey()
          .equals(other.getObjectFileKey())) return false;
    }
    if (getObjectFileId()
        != other.getObjectFileId()) return false;
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
    hash = (37 * hash) + WORKING_DIRECTORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkingDirectoryId();
    if (hasObjectFileKey()) {
      hash = (37 * hash) + OBJECT_FILE_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getObjectFileKey().hashCode();
    }
    hash = (37 * hash) + OBJECT_FILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectFileId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.caching.EncodedCompilation prototype) {
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
   * String-table-encoded version of [Compilation]
   * </pre>
   *
   * Protobuf type {@code EncodedCompilation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedCompilation)
      com.android.build.gradle.internal.cxx.caching.EncodedCompilationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedCompilation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedCompilation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.caching.EncodedCompilation.class, com.android.build.gradle.internal.cxx.caching.EncodedCompilation.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.caching.EncodedCompilation.newBuilder()
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
      workingDirectoryId_ = 0;

      if (objectFileKeyBuilder_ == null) {
        objectFileKey_ = null;
      } else {
        objectFileKey_ = null;
        objectFileKeyBuilder_ = null;
      }
      objectFileId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedCompilation_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedCompilation getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.caching.EncodedCompilation.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedCompilation build() {
      com.android.build.gradle.internal.cxx.caching.EncodedCompilation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedCompilation buildPartial() {
      com.android.build.gradle.internal.cxx.caching.EncodedCompilation result = new com.android.build.gradle.internal.cxx.caching.EncodedCompilation(this);
      result.workingDirectoryId_ = workingDirectoryId_;
      if (objectFileKeyBuilder_ == null) {
        result.objectFileKey_ = objectFileKey_;
      } else {
        result.objectFileKey_ = objectFileKeyBuilder_.build();
      }
      result.objectFileId_ = objectFileId_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.caching.EncodedCompilation) {
        return mergeFrom((com.android.build.gradle.internal.cxx.caching.EncodedCompilation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.caching.EncodedCompilation other) {
      if (other == com.android.build.gradle.internal.cxx.caching.EncodedCompilation.getDefaultInstance()) return this;
      if (other.getWorkingDirectoryId() != 0) {
        setWorkingDirectoryId(other.getWorkingDirectoryId());
      }
      if (other.hasObjectFileKey()) {
        mergeObjectFileKey(other.getObjectFileKey());
      }
      if (other.getObjectFileId() != 0) {
        setObjectFileId(other.getObjectFileId());
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
      com.android.build.gradle.internal.cxx.caching.EncodedCompilation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.caching.EncodedCompilation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int workingDirectoryId_ ;
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @return The workingDirectoryId.
     */
    @java.lang.Override
    public int getWorkingDirectoryId() {
      return workingDirectoryId_;
    }
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @param value The workingDirectoryId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkingDirectoryId(int value) {
      
      workingDirectoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkingDirectoryId() {
      
      workingDirectoryId_ = 0;
      onChanged();
      return this;
    }

    private com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey objectFileKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder> objectFileKeyBuilder_;
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     * @return Whether the objectFileKey field is set.
     */
    public boolean hasObjectFileKey() {
      return objectFileKeyBuilder_ != null || objectFileKey_ != null;
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     * @return The objectFileKey.
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getObjectFileKey() {
      if (objectFileKeyBuilder_ == null) {
        return objectFileKey_ == null ? com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.getDefaultInstance() : objectFileKey_;
      } else {
        return objectFileKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public Builder setObjectFileKey(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey value) {
      if (objectFileKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectFileKey_ = value;
        onChanged();
      } else {
        objectFileKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public Builder setObjectFileKey(
        com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder builderForValue) {
      if (objectFileKeyBuilder_ == null) {
        objectFileKey_ = builderForValue.build();
        onChanged();
      } else {
        objectFileKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public Builder mergeObjectFileKey(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey value) {
      if (objectFileKeyBuilder_ == null) {
        if (objectFileKey_ != null) {
          objectFileKey_ =
            com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.newBuilder(objectFileKey_).mergeFrom(value).buildPartial();
        } else {
          objectFileKey_ = value;
        }
        onChanged();
      } else {
        objectFileKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public Builder clearObjectFileKey() {
      if (objectFileKeyBuilder_ == null) {
        objectFileKey_ = null;
        onChanged();
      } else {
        objectFileKey_ = null;
        objectFileKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder getObjectFileKeyBuilder() {
      
      onChanged();
      return getObjectFileKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder getObjectFileKeyOrBuilder() {
      if (objectFileKeyBuilder_ != null) {
        return objectFileKeyBuilder_.getMessageOrBuilder();
      } else {
        return objectFileKey_ == null ?
            com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.getDefaultInstance() : objectFileKey_;
      }
    }
    /**
     * <code>.EncodedObjectFileKey object_file_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder> 
        getObjectFileKeyFieldBuilder() {
      if (objectFileKeyBuilder_ == null) {
        objectFileKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder>(
                getObjectFileKey(),
                getParentForChildren(),
                isClean());
        objectFileKey_ = null;
      }
      return objectFileKeyBuilder_;
    }

    private int objectFileId_ ;
    /**
     * <code>int32 object_file_id = 3;</code>
     * @return The objectFileId.
     */
    @java.lang.Override
    public int getObjectFileId() {
      return objectFileId_;
    }
    /**
     * <code>int32 object_file_id = 3;</code>
     * @param value The objectFileId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectFileId(int value) {
      
      objectFileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 object_file_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectFileId() {
      
      objectFileId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EncodedCompilation)
  }

  // @@protoc_insertion_point(class_scope:EncodedCompilation)
  private static final com.android.build.gradle.internal.cxx.caching.EncodedCompilation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.caching.EncodedCompilation();
  }

  public static com.android.build.gradle.internal.cxx.caching.EncodedCompilation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedCompilation>
      PARSER = new com.google.protobuf.AbstractParser<EncodedCompilation>() {
    @java.lang.Override
    public EncodedCompilation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncodedCompilation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncodedCompilation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedCompilation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedCompilation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

