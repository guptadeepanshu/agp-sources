// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.SmlCompletionRequestErrorEvent}
 */
public final class SmlCompletionRequestErrorEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.SmlCompletionRequestErrorEvent)
    SmlCompletionRequestErrorEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmlCompletionRequestErrorEvent.newBuilder() to construct.
  private SmlCompletionRequestErrorEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmlCompletionRequestErrorEvent() {
    modelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmlCompletionRequestErrorEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SmlCompletionRequestErrorEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SmlCompletionRequestErrorEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.class, com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.Builder.class);
  }

  private int bitField0_;
  public static final int MODEL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object modelId_ = "";
  /**
   * <code>optional string model_id = 1;</code>
   * @return Whether the modelId field is set.
   */
  @java.lang.Override
  public boolean hasModelId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string model_id = 1;</code>
   * @return The modelId.
   */
  @java.lang.Override
  public java.lang.String getModelId() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        modelId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string model_id = 1;</code>
   * @return The bytes for modelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelIdBytes() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRPC_ERROR_RESPONSE_CODE_FIELD_NUMBER = 3;
  private int grpcErrorResponseCode_ = 0;
  /**
   * <code>optional int32 grpc_error_response_code = 3;</code>
   * @return Whether the grpcErrorResponseCode field is set.
   */
  @java.lang.Override
  public boolean hasGrpcErrorResponseCode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 grpc_error_response_code = 3;</code>
   * @return The grpcErrorResponseCode.
   */
  @java.lang.Override
  public int getGrpcErrorResponseCode() {
    return grpcErrorResponseCode_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(3, grpcErrorResponseCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, grpcErrorResponseCode_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent other = (com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent) obj;

    if (hasModelId() != other.hasModelId()) return false;
    if (hasModelId()) {
      if (!getModelId()
          .equals(other.getModelId())) return false;
    }
    if (hasGrpcErrorResponseCode() != other.hasGrpcErrorResponseCode()) return false;
    if (hasGrpcErrorResponseCode()) {
      if (getGrpcErrorResponseCode()
          != other.getGrpcErrorResponseCode()) return false;
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
    if (hasModelId()) {
      hash = (37 * hash) + MODEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModelId().hashCode();
    }
    if (hasGrpcErrorResponseCode()) {
      hash = (37 * hash) + GRPC_ERROR_RESPONSE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getGrpcErrorResponseCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent prototype) {
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
   * Protobuf type {@code android_studio.SmlCompletionRequestErrorEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.SmlCompletionRequestErrorEvent)
      com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SmlCompletionRequestErrorEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SmlCompletionRequestErrorEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.class, com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.newBuilder()
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
      modelId_ = "";
      grpcErrorResponseCode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_SmlCompletionRequestErrorEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent build() {
      com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent buildPartial() {
      com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent result = new com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelId_ = modelId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grpcErrorResponseCode_ = grpcErrorResponseCode_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent other) {
      if (other == com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent.getDefaultInstance()) return this;
      if (other.hasModelId()) {
        modelId_ = other.modelId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGrpcErrorResponseCode()) {
        setGrpcErrorResponseCode(other.getGrpcErrorResponseCode());
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
              modelId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              grpcErrorResponseCode_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private java.lang.Object modelId_ = "";
    /**
     * <code>optional string model_id = 1;</code>
     * @return Whether the modelId field is set.
     */
    public boolean hasModelId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string model_id = 1;</code>
     * @return The modelId.
     */
    public java.lang.String getModelId() {
      java.lang.Object ref = modelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          modelId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string model_id = 1;</code>
     * @return The bytes for modelId.
     */
    public com.google.protobuf.ByteString
        getModelIdBytes() {
      java.lang.Object ref = modelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string model_id = 1;</code>
     * @param value The modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      modelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string model_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelId() {
      modelId_ = getDefaultInstance().getModelId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string model_id = 1;</code>
     * @param value The bytes for modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      modelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int grpcErrorResponseCode_ ;
    /**
     * <code>optional int32 grpc_error_response_code = 3;</code>
     * @return Whether the grpcErrorResponseCode field is set.
     */
    @java.lang.Override
    public boolean hasGrpcErrorResponseCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 grpc_error_response_code = 3;</code>
     * @return The grpcErrorResponseCode.
     */
    @java.lang.Override
    public int getGrpcErrorResponseCode() {
      return grpcErrorResponseCode_;
    }
    /**
     * <code>optional int32 grpc_error_response_code = 3;</code>
     * @param value The grpcErrorResponseCode to set.
     * @return This builder for chaining.
     */
    public Builder setGrpcErrorResponseCode(int value) {

      grpcErrorResponseCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 grpc_error_response_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrpcErrorResponseCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      grpcErrorResponseCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.SmlCompletionRequestErrorEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.SmlCompletionRequestErrorEvent)
  private static final com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent();
  }

  public static com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SmlCompletionRequestErrorEvent>
      PARSER = new com.google.protobuf.AbstractParser<SmlCompletionRequestErrorEvent>() {
    @java.lang.Override
    public SmlCompletionRequestErrorEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmlCompletionRequestErrorEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmlCompletionRequestErrorEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.SmlCompletionRequestErrorEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

