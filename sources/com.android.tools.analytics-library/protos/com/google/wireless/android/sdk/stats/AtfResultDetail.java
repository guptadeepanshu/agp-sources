// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details related to an ATF check result
 * </pre>
 *
 * Protobuf type {@code android_studio.AtfResultDetail}
 */
public final class AtfResultDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AtfResultDetail)
    AtfResultDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AtfResultDetail.newBuilder() to construct.
  private AtfResultDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AtfResultDetail() {
    checkName_ = "";
    resultType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AtfResultDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AtfResultDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AtfResultDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AtfResultDetail.class, com.google.wireless.android.sdk.stats.AtfResultDetail.Builder.class);
  }

  private int bitField0_;
  public static final int CHECK_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object checkName_ = "";
  /**
   * <pre>
   * Simple name of the ATF check which produced the check result
   * </pre>
   *
   * <code>optional string check_name = 1;</code>
   * @return Whether the checkName field is set.
   */
  @java.lang.Override
  public boolean hasCheckName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Simple name of the ATF check which produced the check result
   * </pre>
   *
   * <code>optional string check_name = 1;</code>
   * @return The checkName.
   */
  @java.lang.Override
  public java.lang.String getCheckName() {
    java.lang.Object ref = checkName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        checkName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Simple name of the ATF check which produced the check result
   * </pre>
   *
   * <code>optional string check_name = 1;</code>
   * @return The bytes for checkName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCheckNameBytes() {
    java.lang.Object ref = checkName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_TYPE_FIELD_NUMBER = 2;
  private int resultType_ = 0;
  /**
   * <pre>
   * The result type of the ATF check result
   * </pre>
   *
   * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
   * @return Whether the resultType field is set.
   */
  @java.lang.Override public boolean hasResultType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The result type of the ATF check result
   * </pre>
   *
   * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
   * @return The resultType.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType getResultType() {
    com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType result = com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType.forNumber(resultType_);
    return result == null ? com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType.UNKNOWN : result;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, checkName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, resultType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, checkName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resultType_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AtfResultDetail)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AtfResultDetail other = (com.google.wireless.android.sdk.stats.AtfResultDetail) obj;

    if (hasCheckName() != other.hasCheckName()) return false;
    if (hasCheckName()) {
      if (!getCheckName()
          .equals(other.getCheckName())) return false;
    }
    if (hasResultType() != other.hasResultType()) return false;
    if (hasResultType()) {
      if (resultType_ != other.resultType_) return false;
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
    if (hasCheckName()) {
      hash = (37 * hash) + CHECK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getCheckName().hashCode();
    }
    if (hasResultType()) {
      hash = (37 * hash) + RESULT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + resultType_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AtfResultDetail parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AtfResultDetail prototype) {
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
   * Details related to an ATF check result
   * </pre>
   *
   * Protobuf type {@code android_studio.AtfResultDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AtfResultDetail)
      com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AtfResultDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AtfResultDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AtfResultDetail.class, com.google.wireless.android.sdk.stats.AtfResultDetail.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AtfResultDetail.newBuilder()
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
      checkName_ = "";
      resultType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AtfResultDetail_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AtfResultDetail getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AtfResultDetail build() {
      com.google.wireless.android.sdk.stats.AtfResultDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AtfResultDetail buildPartial() {
      com.google.wireless.android.sdk.stats.AtfResultDetail result = new com.google.wireless.android.sdk.stats.AtfResultDetail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.AtfResultDetail result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.checkName_ = checkName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resultType_ = resultType_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.AtfResultDetail) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AtfResultDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AtfResultDetail other) {
      if (other == com.google.wireless.android.sdk.stats.AtfResultDetail.getDefaultInstance()) return this;
      if (other.hasCheckName()) {
        checkName_ = other.checkName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResultType()) {
        setResultType(other.getResultType());
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
              checkName_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType tmpValue =
                  com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                resultType_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
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

    private java.lang.Object checkName_ = "";
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @return Whether the checkName field is set.
     */
    public boolean hasCheckName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @return The checkName.
     */
    public java.lang.String getCheckName() {
      java.lang.Object ref = checkName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          checkName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @return The bytes for checkName.
     */
    public com.google.protobuf.ByteString
        getCheckNameBytes() {
      java.lang.Object ref = checkName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @param value The checkName to set.
     * @return This builder for chaining.
     */
    public Builder setCheckName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      checkName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCheckName() {
      checkName_ = getDefaultInstance().getCheckName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Simple name of the ATF check which produced the check result
     * </pre>
     *
     * <code>optional string check_name = 1;</code>
     * @param value The bytes for checkName to set.
     * @return This builder for chaining.
     */
    public Builder setCheckNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int resultType_ = 0;
    /**
     * <pre>
     * The result type of the ATF check result
     * </pre>
     *
     * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
     * @return Whether the resultType field is set.
     */
    @java.lang.Override public boolean hasResultType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The result type of the ATF check result
     * </pre>
     *
     * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
     * @return The resultType.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType getResultType() {
      com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType result = com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType.forNumber(resultType_);
      return result == null ? com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType.UNKNOWN : result;
    }
    /**
     * <pre>
     * The result type of the ATF check result
     * </pre>
     *
     * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
     * @param value The resultType to set.
     * @return This builder for chaining.
     */
    public Builder setResultType(com.google.wireless.android.sdk.stats.AtfAuditResult.AtfResultCount.CheckResultType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resultType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result type of the ATF check result
     * </pre>
     *
     * <code>optional .android_studio.AtfAuditResult.AtfResultCount.CheckResultType result_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resultType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AtfResultDetail)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AtfResultDetail)
  private static final com.google.wireless.android.sdk.stats.AtfResultDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AtfResultDetail();
  }

  public static com.google.wireless.android.sdk.stats.AtfResultDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AtfResultDetail>
      PARSER = new com.google.protobuf.AbstractParser<AtfResultDetail>() {
    @java.lang.Override
    public AtfResultDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<AtfResultDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AtfResultDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AtfResultDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

