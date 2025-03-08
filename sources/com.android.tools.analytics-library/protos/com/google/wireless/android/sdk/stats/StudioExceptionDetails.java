// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.StudioExceptionDetails}
 */
public final class StudioExceptionDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.StudioExceptionDetails)
    StudioExceptionDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudioExceptionDetails.newBuilder() to construct.
  private StudioExceptionDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudioExceptionDetails() {
    hash_ = "";
    summary_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudioExceptionDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioExceptionDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioExceptionDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.StudioExceptionDetails.class, com.google.wireless.android.sdk.stats.StudioExceptionDetails.Builder.class);
  }

  private int bitField0_;
  public static final int HASH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hash_ = "";
  /**
   * <pre>
   * hash of the exception stack trace
   * </pre>
   *
   * <code>optional string hash = 1;</code>
   * @return Whether the hash field is set.
   */
  @java.lang.Override
  public boolean hasHash() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * hash of the exception stack trace
   * </pre>
   *
   * <code>optional string hash = 1;</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        hash_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * hash of the exception stack trace
   * </pre>
   *
   * <code>optional string hash = 1;</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUMMARY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object summary_ = "";
  /**
   * <pre>
   * summary of the exception stack trace
   * </pre>
   *
   * <code>optional string summary = 2;</code>
   * @return Whether the summary field is set.
   */
  @java.lang.Override
  public boolean hasSummary() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * summary of the exception stack trace
   * </pre>
   *
   * <code>optional string summary = 2;</code>
   * @return The summary.
   */
  @java.lang.Override
  public java.lang.String getSummary() {
    java.lang.Object ref = summary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        summary_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * summary of the exception stack trace
   * </pre>
   *
   * <code>optional string summary = 2;</code>
   * @return The bytes for summary.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSummaryBytes() {
    java.lang.Object ref = summary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      summary_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private int count_ = 0;
  /**
   * <pre>
   * number of crashes seen with this stack trace
   * </pre>
   *
   * <code>optional uint32 count = 3;</code>
   * @return Whether the count field is set.
   */
  @java.lang.Override
  public boolean hasCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * number of crashes seen with this stack trace
   * </pre>
   *
   * <code>optional uint32 count = 3;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hash_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, summary_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hash_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, summary_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, count_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.StudioExceptionDetails)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.StudioExceptionDetails other = (com.google.wireless.android.sdk.stats.StudioExceptionDetails) obj;

    if (hasHash() != other.hasHash()) return false;
    if (hasHash()) {
      if (!getHash()
          .equals(other.getHash())) return false;
    }
    if (hasSummary() != other.hasSummary()) return false;
    if (hasSummary()) {
      if (!getSummary()
          .equals(other.getSummary())) return false;
    }
    if (hasCount() != other.hasCount()) return false;
    if (hasCount()) {
      if (getCount()
          != other.getCount()) return false;
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
    if (hasHash()) {
      hash = (37 * hash) + HASH_FIELD_NUMBER;
      hash = (53 * hash) + getHash().hashCode();
    }
    if (hasSummary()) {
      hash = (37 * hash) + SUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getSummary().hashCode();
    }
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.StudioExceptionDetails prototype) {
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
   * Protobuf type {@code android_studio.StudioExceptionDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.StudioExceptionDetails)
      com.google.wireless.android.sdk.stats.StudioExceptionDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioExceptionDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioExceptionDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.StudioExceptionDetails.class, com.google.wireless.android.sdk.stats.StudioExceptionDetails.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.StudioExceptionDetails.newBuilder()
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
      hash_ = "";
      summary_ = "";
      count_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioExceptionDetails_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioExceptionDetails getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.StudioExceptionDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioExceptionDetails build() {
      com.google.wireless.android.sdk.stats.StudioExceptionDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioExceptionDetails buildPartial() {
      com.google.wireless.android.sdk.stats.StudioExceptionDetails result = new com.google.wireless.android.sdk.stats.StudioExceptionDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.StudioExceptionDetails result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hash_ = hash_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.summary_ = summary_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.count_ = count_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.StudioExceptionDetails) {
        return mergeFrom((com.google.wireless.android.sdk.stats.StudioExceptionDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.StudioExceptionDetails other) {
      if (other == com.google.wireless.android.sdk.stats.StudioExceptionDetails.getDefaultInstance()) return this;
      if (other.hasHash()) {
        hash_ = other.hash_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSummary()) {
        summary_ = other.summary_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCount()) {
        setCount(other.getCount());
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
              hash_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              summary_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              count_ = input.readUInt32();
              bitField0_ |= 0x00000004;
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

    private java.lang.Object hash_ = "";
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @return Whether the hash field is set.
     */
    public boolean hasHash() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          hash_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      hash_ = getDefaultInstance().getHash();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash of the exception stack trace
     * </pre>
     *
     * <code>optional string hash = 1;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object summary_ = "";
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @return Whether the summary field is set.
     */
    public boolean hasSummary() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @return The summary.
     */
    public java.lang.String getSummary() {
      java.lang.Object ref = summary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          summary_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @return The bytes for summary.
     */
    public com.google.protobuf.ByteString
        getSummaryBytes() {
      java.lang.Object ref = summary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        summary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @param value The summary to set.
     * @return This builder for chaining.
     */
    public Builder setSummary(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      summary_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSummary() {
      summary_ = getDefaultInstance().getSummary();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * summary of the exception stack trace
     * </pre>
     *
     * <code>optional string summary = 2;</code>
     * @param value The bytes for summary to set.
     * @return This builder for chaining.
     */
    public Builder setSummaryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      summary_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * number of crashes seen with this stack trace
     * </pre>
     *
     * <code>optional uint32 count = 3;</code>
     * @return Whether the count field is set.
     */
    @java.lang.Override
    public boolean hasCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * number of crashes seen with this stack trace
     * </pre>
     *
     * <code>optional uint32 count = 3;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * number of crashes seen with this stack trace
     * </pre>
     *
     * <code>optional uint32 count = 3;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of crashes seen with this stack trace
     * </pre>
     *
     * <code>optional uint32 count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.StudioExceptionDetails)
  }

  // @@protoc_insertion_point(class_scope:android_studio.StudioExceptionDetails)
  private static final com.google.wireless.android.sdk.stats.StudioExceptionDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.StudioExceptionDetails();
  }

  public static com.google.wireless.android.sdk.stats.StudioExceptionDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StudioExceptionDetails>
      PARSER = new com.google.protobuf.AbstractParser<StudioExceptionDetails>() {
    @java.lang.Override
    public StudioExceptionDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<StudioExceptionDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudioExceptionDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.StudioExceptionDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

