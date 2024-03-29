// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_caching.proto

package com.android.build.gradle.internal.cxx.caching;

/**
 * <pre>
 **
 * String-table-encoded version of [ObjectFileKey]
 * </pre>
 *
 * Protobuf type {@code EncodedObjectFileKey}
 */
public final class EncodedObjectFileKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedObjectFileKey)
    EncodedObjectFileKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedObjectFileKey.newBuilder() to construct.
  private EncodedObjectFileKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedObjectFileKey() {
    dependencyIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedObjectFileKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedObjectFileKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedObjectFileKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.class, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder.class);
  }

  public static final int DEPENDENCY_KEY_FIELD_NUMBER = 1;
  private com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey dependencyKey_;
  /**
   * <code>.EncodedDependenciesKey dependency_key = 1;</code>
   * @return Whether the dependencyKey field is set.
   */
  @java.lang.Override
  public boolean hasDependencyKey() {
    return dependencyKey_ != null;
  }
  /**
   * <code>.EncodedDependenciesKey dependency_key = 1;</code>
   * @return The dependencyKey.
   */
  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey getDependencyKey() {
    return dependencyKey_ == null ? com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.getDefaultInstance() : dependencyKey_;
  }
  /**
   * <code>.EncodedDependenciesKey dependency_key = 1;</code>
   */
  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKeyOrBuilder getDependencyKeyOrBuilder() {
    return dependencyKey_ == null ? com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.getDefaultInstance() : dependencyKey_;
  }

  public static final int DEPENDENCY_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList dependencyIds_;
  /**
   * <code>repeated int32 dependency_ids = 2;</code>
   * @return A list containing the dependencyIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getDependencyIdsList() {
    return dependencyIds_;
  }
  /**
   * <code>repeated int32 dependency_ids = 2;</code>
   * @return The count of dependencyIds.
   */
  public int getDependencyIdsCount() {
    return dependencyIds_.size();
  }
  /**
   * <code>repeated int32 dependency_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The dependencyIds at the given index.
   */
  public int getDependencyIds(int index) {
    return dependencyIds_.getInt(index);
  }
  private int dependencyIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (dependencyKey_ != null) {
      output.writeMessage(1, getDependencyKey());
    }
    if (getDependencyIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(dependencyIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < dependencyIds_.size(); i++) {
      output.writeInt32NoTag(dependencyIds_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dependencyKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDependencyKey());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dependencyIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(dependencyIds_.getInt(i));
      }
      size += dataSize;
      if (!getDependencyIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dependencyIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey other = (com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey) obj;

    if (hasDependencyKey() != other.hasDependencyKey()) return false;
    if (hasDependencyKey()) {
      if (!getDependencyKey()
          .equals(other.getDependencyKey())) return false;
    }
    if (!getDependencyIdsList()
        .equals(other.getDependencyIdsList())) return false;
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
    if (hasDependencyKey()) {
      hash = (37 * hash) + DEPENDENCY_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getDependencyKey().hashCode();
    }
    if (getDependencyIdsCount() > 0) {
      hash = (37 * hash) + DEPENDENCY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDependencyIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey prototype) {
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
   * String-table-encoded version of [ObjectFileKey]
   * </pre>
   *
   * Protobuf type {@code EncodedObjectFileKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedObjectFileKey)
      com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedObjectFileKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedObjectFileKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.class, com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.newBuilder()
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
      dependencyKey_ = null;
      if (dependencyKeyBuilder_ != null) {
        dependencyKeyBuilder_.dispose();
        dependencyKeyBuilder_ = null;
      }
      dependencyIds_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.caching.CxxCaching.internal_static_EncodedObjectFileKey_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey build() {
      com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey buildPartial() {
      com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey result = new com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        dependencyIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.dependencyIds_ = dependencyIds_;
    }

    private void buildPartial0(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dependencyKey_ = dependencyKeyBuilder_ == null
            ? dependencyKey_
            : dependencyKeyBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey) {
        return mergeFrom((com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey other) {
      if (other == com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey.getDefaultInstance()) return this;
      if (other.hasDependencyKey()) {
        mergeDependencyKey(other.getDependencyKey());
      }
      if (!other.dependencyIds_.isEmpty()) {
        if (dependencyIds_.isEmpty()) {
          dependencyIds_ = other.dependencyIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDependencyIdsIsMutable();
          dependencyIds_.addAll(other.dependencyIds_);
        }
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
              input.readMessage(
                  getDependencyKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int v = input.readInt32();
              ensureDependencyIdsIsMutable();
              dependencyIds_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureDependencyIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                dependencyIds_.addInt(input.readInt32());
              }
              input.popLimit(limit);
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

    private com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey dependencyKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKeyOrBuilder> dependencyKeyBuilder_;
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     * @return Whether the dependencyKey field is set.
     */
    public boolean hasDependencyKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     * @return The dependencyKey.
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey getDependencyKey() {
      if (dependencyKeyBuilder_ == null) {
        return dependencyKey_ == null ? com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.getDefaultInstance() : dependencyKey_;
      } else {
        return dependencyKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public Builder setDependencyKey(com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey value) {
      if (dependencyKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dependencyKey_ = value;
      } else {
        dependencyKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public Builder setDependencyKey(
        com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.Builder builderForValue) {
      if (dependencyKeyBuilder_ == null) {
        dependencyKey_ = builderForValue.build();
      } else {
        dependencyKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public Builder mergeDependencyKey(com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey value) {
      if (dependencyKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dependencyKey_ != null &&
          dependencyKey_ != com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.getDefaultInstance()) {
          getDependencyKeyBuilder().mergeFrom(value);
        } else {
          dependencyKey_ = value;
        }
      } else {
        dependencyKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public Builder clearDependencyKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dependencyKey_ = null;
      if (dependencyKeyBuilder_ != null) {
        dependencyKeyBuilder_.dispose();
        dependencyKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.Builder getDependencyKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDependencyKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    public com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKeyOrBuilder getDependencyKeyOrBuilder() {
      if (dependencyKeyBuilder_ != null) {
        return dependencyKeyBuilder_.getMessageOrBuilder();
      } else {
        return dependencyKey_ == null ?
            com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.getDefaultInstance() : dependencyKey_;
      }
    }
    /**
     * <code>.EncodedDependenciesKey dependency_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKeyOrBuilder> 
        getDependencyKeyFieldBuilder() {
      if (dependencyKeyBuilder_ == null) {
        dependencyKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKey.Builder, com.android.build.gradle.internal.cxx.caching.EncodedDependenciesKeyOrBuilder>(
                getDependencyKey(),
                getParentForChildren(),
                isClean());
        dependencyKey_ = null;
      }
      return dependencyKeyBuilder_;
    }

    private com.google.protobuf.Internal.IntList dependencyIds_ = emptyIntList();
    private void ensureDependencyIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dependencyIds_ = mutableCopy(dependencyIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @return A list containing the dependencyIds.
     */
    public java.util.List<java.lang.Integer>
        getDependencyIdsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(dependencyIds_) : dependencyIds_;
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @return The count of dependencyIds.
     */
    public int getDependencyIdsCount() {
      return dependencyIds_.size();
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The dependencyIds at the given index.
     */
    public int getDependencyIds(int index) {
      return dependencyIds_.getInt(index);
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The dependencyIds to set.
     * @return This builder for chaining.
     */
    public Builder setDependencyIds(
        int index, int value) {

      ensureDependencyIdsIsMutable();
      dependencyIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @param value The dependencyIds to add.
     * @return This builder for chaining.
     */
    public Builder addDependencyIds(int value) {

      ensureDependencyIdsIsMutable();
      dependencyIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @param values The dependencyIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDependencyIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureDependencyIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dependencyIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 dependency_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDependencyIds() {
      dependencyIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:EncodedObjectFileKey)
  }

  // @@protoc_insertion_point(class_scope:EncodedObjectFileKey)
  private static final com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey();
  }

  public static com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedObjectFileKey>
      PARSER = new com.google.protobuf.AbstractParser<EncodedObjectFileKey>() {
    @java.lang.Override
    public EncodedObjectFileKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<EncodedObjectFileKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedObjectFileKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

