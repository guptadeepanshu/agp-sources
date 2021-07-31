// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details related to an ATF fix which been applied by the user
 * </pre>
 *
 * Protobuf type {@code android_studio.ApplyAtfFixEvent}
 */
public  final class ApplyAtfFixEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ApplyAtfFixEvent)
    ApplyAtfFixEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplyAtfFixEvent.newBuilder() to construct.
  private ApplyAtfFixEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplyAtfFixEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplyAtfFixEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplyAtfFixEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            com.google.wireless.android.sdk.stats.AtfResultDetail.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = atfResult_.toBuilder();
            }
            atfResult_ = input.readMessage(com.google.wireless.android.sdk.stats.AtfResultDetail.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(atfResult_);
              atfResult_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.google.wireless.android.sdk.stats.AtfFixDetail.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = atfFix_.toBuilder();
            }
            atfFix_ = input.readMessage(com.google.wireless.android.sdk.stats.AtfFixDetail.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(atfFix_);
              atfFix_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ApplyAtfFixEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ApplyAtfFixEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.class, com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.Builder.class);
  }

  private int bitField0_;
  public static final int ATF_RESULT_FIELD_NUMBER = 1;
  private com.google.wireless.android.sdk.stats.AtfResultDetail atfResult_;
  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
   * @return Whether the atfResult field is set.
   */
  public boolean hasAtfResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
   * @return The atfResult.
   */
  public com.google.wireless.android.sdk.stats.AtfResultDetail getAtfResult() {
    return atfResult_ == null ? com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance() : atfResult_;
  }
  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
   */
  public com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder getAtfResultOrBuilder() {
    return atfResult_ == null ? com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance() : atfResult_;
  }

  public static final int ATF_FIX_FIELD_NUMBER = 2;
  private com.google.wireless.android.sdk.stats.AtfFixDetail atfFix_;
  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
   * @return Whether the atfFix field is set.
   */
  public boolean hasAtfFix() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
   * @return The atfFix.
   */
  public com.google.wireless.android.sdk.stats.AtfFixDetail getAtfFix() {
    return atfFix_ == null ? com.google.wireless.android.sdk.stats.AtfFixDetail.getDefaultInstance() : atfFix_;
  }
  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
   */
  public com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder getAtfFixOrBuilder() {
    return atfFix_ == null ? com.google.wireless.android.sdk.stats.AtfFixDetail.getDefaultInstance() : atfFix_;
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
      output.writeMessage(1, getAtfResult());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAtfFix());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAtfResult());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAtfFix());
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ApplyAtfFixEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ApplyAtfFixEvent other = (com.google.wireless.android.sdk.stats.ApplyAtfFixEvent) obj;

    if (hasAtfResult() != other.hasAtfResult()) return false;
    if (hasAtfResult()) {
      if (!getAtfResult()
          .equals(other.getAtfResult())) return false;
    }
    if (hasAtfFix() != other.hasAtfFix()) return false;
    if (hasAtfFix()) {
      if (!getAtfFix()
          .equals(other.getAtfFix())) return false;
    }
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
    if (hasAtfResult()) {
      hash = (37 * hash) + ATF_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getAtfResult().hashCode();
    }
    if (hasAtfFix()) {
      hash = (37 * hash) + ATF_FIX_FIELD_NUMBER;
      hash = (53 * hash) + getAtfFix().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ApplyAtfFixEvent prototype) {
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
   * Details related to an ATF fix which been applied by the user
   * </pre>
   *
   * Protobuf type {@code android_studio.ApplyAtfFixEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ApplyAtfFixEvent)
      com.google.wireless.android.sdk.stats.ApplyAtfFixEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ApplyAtfFixEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ApplyAtfFixEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.class, com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.newBuilder()
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
        getAtfResultFieldBuilder();
        getAtfFixFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (atfResultBuilder_ == null) {
        atfResult_ = null;
      } else {
        atfResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (atfFixBuilder_ == null) {
        atfFix_ = null;
      } else {
        atfFixBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ApplyAtfFixEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ApplyAtfFixEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ApplyAtfFixEvent build() {
      com.google.wireless.android.sdk.stats.ApplyAtfFixEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ApplyAtfFixEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ApplyAtfFixEvent result = new com.google.wireless.android.sdk.stats.ApplyAtfFixEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (atfResultBuilder_ == null) {
          result.atfResult_ = atfResult_;
        } else {
          result.atfResult_ = atfResultBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (atfFixBuilder_ == null) {
          result.atfFix_ = atfFix_;
        } else {
          result.atfFix_ = atfFixBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ApplyAtfFixEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ApplyAtfFixEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ApplyAtfFixEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ApplyAtfFixEvent.getDefaultInstance()) return this;
      if (other.hasAtfResult()) {
        mergeAtfResult(other.getAtfResult());
      }
      if (other.hasAtfFix()) {
        mergeAtfFix(other.getAtfFix());
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
      com.google.wireless.android.sdk.stats.ApplyAtfFixEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.ApplyAtfFixEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.wireless.android.sdk.stats.AtfResultDetail atfResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.AtfResultDetail, com.google.wireless.android.sdk.stats.AtfResultDetail.Builder, com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder> atfResultBuilder_;
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     * @return Whether the atfResult field is set.
     */
    public boolean hasAtfResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     * @return The atfResult.
     */
    public com.google.wireless.android.sdk.stats.AtfResultDetail getAtfResult() {
      if (atfResultBuilder_ == null) {
        return atfResult_ == null ? com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance() : atfResult_;
      } else {
        return atfResultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public Builder setAtfResult(com.google.wireless.android.sdk.stats.AtfResultDetail value) {
      if (atfResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        atfResult_ = value;
        onChanged();
      } else {
        atfResultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public Builder setAtfResult(
        com.google.wireless.android.sdk.stats.AtfResultDetail.Builder builderForValue) {
      if (atfResultBuilder_ == null) {
        atfResult_ = builderForValue.build();
        onChanged();
      } else {
        atfResultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public Builder mergeAtfResult(com.google.wireless.android.sdk.stats.AtfResultDetail value) {
      if (atfResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            atfResult_ != null &&
            atfResult_ != com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance()) {
          atfResult_ =
            com.google.wireless.android.sdk.stats.AtfResultDetail.newBuilder(atfResult_).mergeFrom(value).buildPartial();
        } else {
          atfResult_ = value;
        }
        onChanged();
      } else {
        atfResultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public Builder clearAtfResult() {
      if (atfResultBuilder_ == null) {
        atfResult_ = null;
        onChanged();
      } else {
        atfResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.AtfResultDetail.Builder getAtfResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAtfResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder getAtfResultOrBuilder() {
      if (atfResultBuilder_ != null) {
        return atfResultBuilder_.getMessageOrBuilder();
      } else {
        return atfResult_ == null ?
            com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance() : atfResult_;
      }
    }
    /**
     * <pre>
     * Details related to the ATF result which has been fixed
     * </pre>
     *
     * <code>optional .android_studio.AtfResultDetail atf_result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.AtfResultDetail, com.google.wireless.android.sdk.stats.AtfResultDetail.Builder, com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder> 
        getAtfResultFieldBuilder() {
      if (atfResultBuilder_ == null) {
        atfResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.wireless.android.sdk.stats.AtfResultDetail, com.google.wireless.android.sdk.stats.AtfResultDetail.Builder, com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder>(
                getAtfResult(),
                getParentForChildren(),
                isClean());
        atfResult_ = null;
      }
      return atfResultBuilder_;
    }

    private com.google.wireless.android.sdk.stats.AtfFixDetail atfFix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.AtfFixDetail, com.google.wireless.android.sdk.stats.AtfFixDetail.Builder, com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder> atfFixBuilder_;
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     * @return Whether the atfFix field is set.
     */
    public boolean hasAtfFix() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     * @return The atfFix.
     */
    public com.google.wireless.android.sdk.stats.AtfFixDetail getAtfFix() {
      if (atfFixBuilder_ == null) {
        return atfFix_ == null ? com.google.wireless.android.sdk.stats.AtfFixDetail.getDefaultInstance() : atfFix_;
      } else {
        return atfFixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public Builder setAtfFix(com.google.wireless.android.sdk.stats.AtfFixDetail value) {
      if (atfFixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        atfFix_ = value;
        onChanged();
      } else {
        atfFixBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public Builder setAtfFix(
        com.google.wireless.android.sdk.stats.AtfFixDetail.Builder builderForValue) {
      if (atfFixBuilder_ == null) {
        atfFix_ = builderForValue.build();
        onChanged();
      } else {
        atfFixBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public Builder mergeAtfFix(com.google.wireless.android.sdk.stats.AtfFixDetail value) {
      if (atfFixBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            atfFix_ != null &&
            atfFix_ != com.google.wireless.android.sdk.stats.AtfFixDetail.getDefaultInstance()) {
          atfFix_ =
            com.google.wireless.android.sdk.stats.AtfFixDetail.newBuilder(atfFix_).mergeFrom(value).buildPartial();
        } else {
          atfFix_ = value;
        }
        onChanged();
      } else {
        atfFixBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public Builder clearAtfFix() {
      if (atfFixBuilder_ == null) {
        atfFix_ = null;
        onChanged();
      } else {
        atfFixBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public com.google.wireless.android.sdk.stats.AtfFixDetail.Builder getAtfFixBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAtfFixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    public com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder getAtfFixOrBuilder() {
      if (atfFixBuilder_ != null) {
        return atfFixBuilder_.getMessageOrBuilder();
      } else {
        return atfFix_ == null ?
            com.google.wireless.android.sdk.stats.AtfFixDetail.getDefaultInstance() : atfFix_;
      }
    }
    /**
     * <pre>
     * Details related to the ATF fix which has been applied
     * </pre>
     *
     * <code>optional .android_studio.AtfFixDetail atf_fix = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.wireless.android.sdk.stats.AtfFixDetail, com.google.wireless.android.sdk.stats.AtfFixDetail.Builder, com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder> 
        getAtfFixFieldBuilder() {
      if (atfFixBuilder_ == null) {
        atfFixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.wireless.android.sdk.stats.AtfFixDetail, com.google.wireless.android.sdk.stats.AtfFixDetail.Builder, com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder>(
                getAtfFix(),
                getParentForChildren(),
                isClean());
        atfFix_ = null;
      }
      return atfFixBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ApplyAtfFixEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ApplyAtfFixEvent)
  private static final com.google.wireless.android.sdk.stats.ApplyAtfFixEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ApplyAtfFixEvent();
  }

  public static com.google.wireless.android.sdk.stats.ApplyAtfFixEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ApplyAtfFixEvent>
      PARSER = new com.google.protobuf.AbstractParser<ApplyAtfFixEvent>() {
    @java.lang.Override
    public ApplyAtfFixEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplyAtfFixEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplyAtfFixEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplyAtfFixEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ApplyAtfFixEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

