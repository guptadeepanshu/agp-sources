// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Data associated with startup CPU profiling
 * </pre>
 *
 * Protobuf type {@code android_studio.CpuStartupProfilingMetadata}
 */
public final class CpuStartupProfilingMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.CpuStartupProfilingMetadata)
    CpuStartupProfilingMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CpuStartupProfilingMetadata.newBuilder() to construct.
  private CpuStartupProfilingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CpuStartupProfilingMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CpuStartupProfilingMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuStartupProfilingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuStartupProfilingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.class, com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int PROFILING_CONFIG_FIELD_NUMBER = 1;
  private com.google.wireless.android.sdk.stats.CpuProfilingConfig profilingConfig_;
  /**
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
   * @return Whether the profilingConfig field is set.
   */
  @java.lang.Override
  public boolean hasProfilingConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
   * @return The profilingConfig.
   */
  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CpuProfilingConfig getProfilingConfig() {
    return profilingConfig_ == null ? com.google.wireless.android.sdk.stats.CpuProfilingConfig.getDefaultInstance() : profilingConfig_;
  }
  /**
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
   */
  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder getProfilingConfigOrBuilder() {
    return profilingConfig_ == null ? com.google.wireless.android.sdk.stats.CpuProfilingConfig.getDefaultInstance() : profilingConfig_;
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
      output.writeMessage(1, getProfilingConfig());
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
        .computeMessageSize(1, getProfilingConfig());
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata other = (com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata) obj;

    if (hasProfilingConfig() != other.hasProfilingConfig()) return false;
    if (hasProfilingConfig()) {
      if (!getProfilingConfig()
          .equals(other.getProfilingConfig())) return false;
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
    if (hasProfilingConfig()) {
      hash = (37 * hash) + PROFILING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getProfilingConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata prototype) {
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
   * Data associated with startup CPU profiling
   * </pre>
   *
   * Protobuf type {@code android_studio.CpuStartupProfilingMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.CpuStartupProfilingMetadata)
      com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuStartupProfilingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuStartupProfilingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.class, com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.newBuilder()
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
        getProfilingConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (profilingConfigBuilder_ == null) {
        profilingConfig_ = null;
      } else {
        profilingConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_CpuStartupProfilingMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata build() {
      com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata buildPartial() {
      com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata result = new com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (profilingConfigBuilder_ == null) {
          result.profilingConfig_ = profilingConfig_;
        } else {
          result.profilingConfig_ = profilingConfigBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata) {
        return mergeFrom((com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata other) {
      if (other == com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata.getDefaultInstance()) return this;
      if (other.hasProfilingConfig()) {
        mergeProfilingConfig(other.getProfilingConfig());
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
                  getProfilingConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.wireless.android.sdk.stats.CpuProfilingConfig profilingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.CpuProfilingConfig, com.google.wireless.android.sdk.stats.CpuProfilingConfig.Builder, com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder> profilingConfigBuilder_;
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     * @return Whether the profilingConfig field is set.
     */
    public boolean hasProfilingConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     * @return The profilingConfig.
     */
    public com.google.wireless.android.sdk.stats.CpuProfilingConfig getProfilingConfig() {
      if (profilingConfigBuilder_ == null) {
        return profilingConfig_ == null ? com.google.wireless.android.sdk.stats.CpuProfilingConfig.getDefaultInstance() : profilingConfig_;
      } else {
        return profilingConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public Builder setProfilingConfig(com.google.wireless.android.sdk.stats.CpuProfilingConfig value) {
      if (profilingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profilingConfig_ = value;
        onChanged();
      } else {
        profilingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public Builder setProfilingConfig(
        com.google.wireless.android.sdk.stats.CpuProfilingConfig.Builder builderForValue) {
      if (profilingConfigBuilder_ == null) {
        profilingConfig_ = builderForValue.build();
        onChanged();
      } else {
        profilingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public Builder mergeProfilingConfig(com.google.wireless.android.sdk.stats.CpuProfilingConfig value) {
      if (profilingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            profilingConfig_ != null &&
            profilingConfig_ != com.google.wireless.android.sdk.stats.CpuProfilingConfig.getDefaultInstance()) {
          profilingConfig_ =
            com.google.wireless.android.sdk.stats.CpuProfilingConfig.newBuilder(profilingConfig_).mergeFrom(value).buildPartial();
        } else {
          profilingConfig_ = value;
        }
        onChanged();
      } else {
        profilingConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public Builder clearProfilingConfig() {
      if (profilingConfigBuilder_ == null) {
        profilingConfig_ = null;
        onChanged();
      } else {
        profilingConfigBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.CpuProfilingConfig.Builder getProfilingConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProfilingConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder getProfilingConfigOrBuilder() {
      if (profilingConfigBuilder_ != null) {
        return profilingConfigBuilder_.getMessageOrBuilder();
      } else {
        return profilingConfig_ == null ?
            com.google.wireless.android.sdk.stats.CpuProfilingConfig.getDefaultInstance() : profilingConfig_;
      }
    }
    /**
     * <code>optional .android_studio.CpuProfilingConfig profiling_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.CpuProfilingConfig, com.google.wireless.android.sdk.stats.CpuProfilingConfig.Builder, com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder> 
        getProfilingConfigFieldBuilder() {
      if (profilingConfigBuilder_ == null) {
        profilingConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.wireless.android.sdk.stats.CpuProfilingConfig, com.google.wireless.android.sdk.stats.CpuProfilingConfig.Builder, com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder>(
                getProfilingConfig(),
                getParentForChildren(),
                isClean());
        profilingConfig_ = null;
      }
      return profilingConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.CpuStartupProfilingMetadata)
  }

  // @@protoc_insertion_point(class_scope:android_studio.CpuStartupProfilingMetadata)
  private static final com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata();
  }

  public static com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CpuStartupProfilingMetadata>
      PARSER = new com.google.protobuf.AbstractParser<CpuStartupProfilingMetadata>() {
    @java.lang.Override
    public CpuStartupProfilingMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CpuStartupProfilingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpuStartupProfilingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.CpuStartupProfilingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

