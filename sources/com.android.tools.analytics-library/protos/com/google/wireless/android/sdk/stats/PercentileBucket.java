// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * One bucket of a PercentileEstimator.
 * </pre>
 *
 * Protobuf type {@code android_studio.PercentileBucket}
 */
public final class PercentileBucket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.PercentileBucket)
    PercentileBucketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PercentileBucket.newBuilder() to construct.
  private PercentileBucket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PercentileBucket() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PercentileBucket();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PercentileBucket(
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
          case 9: {
            bitField0_ |= 0x00000001;
            targetPercentile_ = input.readDouble();
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            value_ = input.readDouble();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            count_ = input.readUInt64();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_PercentileBucket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_PercentileBucket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.PercentileBucket.class, com.google.wireless.android.sdk.stats.PercentileBucket.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_PERCENTILE_FIELD_NUMBER = 1;
  private double targetPercentile_;
  /**
   * <pre>
   * The target percentile for this bucket.
   * </pre>
   *
   * <code>optional double target_percentile = 1;</code>
   * @return Whether the targetPercentile field is set.
   */
  @java.lang.Override
  public boolean hasTargetPercentile() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The target percentile for this bucket.
   * </pre>
   *
   * <code>optional double target_percentile = 1;</code>
   * @return The targetPercentile.
   */
  @java.lang.Override
  public double getTargetPercentile() {
    return targetPercentile_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private double value_;
  /**
   * <pre>
   * Estimated value at this bucket.
   * </pre>
   *
   * <code>optional double value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Estimated value at this bucket.
   * </pre>
   *
   * <code>optional double value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private long count_;
  /**
   * <pre>
   * Number of samples less than value.
   * </pre>
   *
   * <code>optional uint64 count = 3;</code>
   * @return Whether the count field is set.
   */
  @java.lang.Override
  public boolean hasCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Number of samples less than value.
   * </pre>
   *
   * <code>optional uint64 count = 3;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
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
      output.writeDouble(1, targetPercentile_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, value_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt64(3, count_);
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
        .computeDoubleSize(1, targetPercentile_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, value_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, count_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.PercentileBucket)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.PercentileBucket other = (com.google.wireless.android.sdk.stats.PercentileBucket) obj;

    if (hasTargetPercentile() != other.hasTargetPercentile()) return false;
    if (hasTargetPercentile()) {
      if (java.lang.Double.doubleToLongBits(getTargetPercentile())
          != java.lang.Double.doubleToLongBits(
              other.getTargetPercentile())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (java.lang.Double.doubleToLongBits(getValue())
          != java.lang.Double.doubleToLongBits(
              other.getValue())) return false;
    }
    if (hasCount() != other.hasCount()) return false;
    if (hasCount()) {
      if (getCount()
          != other.getCount()) return false;
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
    if (hasTargetPercentile()) {
      hash = (37 * hash) + TARGET_PERCENTILE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getTargetPercentile()));
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
    }
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCount());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.PercentileBucket parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.PercentileBucket prototype) {
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
   * One bucket of a PercentileEstimator.
   * </pre>
   *
   * Protobuf type {@code android_studio.PercentileBucket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.PercentileBucket)
      com.google.wireless.android.sdk.stats.PercentileBucketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_PercentileBucket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_PercentileBucket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.PercentileBucket.class, com.google.wireless.android.sdk.stats.PercentileBucket.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.PercentileBucket.newBuilder()
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
      targetPercentile_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_PercentileBucket_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.PercentileBucket getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.PercentileBucket.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.PercentileBucket build() {
      com.google.wireless.android.sdk.stats.PercentileBucket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.PercentileBucket buildPartial() {
      com.google.wireless.android.sdk.stats.PercentileBucket result = new com.google.wireless.android.sdk.stats.PercentileBucket(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetPercentile_ = targetPercentile_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.count_ = count_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.wireless.android.sdk.stats.PercentileBucket) {
        return mergeFrom((com.google.wireless.android.sdk.stats.PercentileBucket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.PercentileBucket other) {
      if (other == com.google.wireless.android.sdk.stats.PercentileBucket.getDefaultInstance()) return this;
      if (other.hasTargetPercentile()) {
        setTargetPercentile(other.getTargetPercentile());
      }
      if (other.hasValue()) {
        setValue(other.getValue());
      }
      if (other.hasCount()) {
        setCount(other.getCount());
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
      com.google.wireless.android.sdk.stats.PercentileBucket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.PercentileBucket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double targetPercentile_ ;
    /**
     * <pre>
     * The target percentile for this bucket.
     * </pre>
     *
     * <code>optional double target_percentile = 1;</code>
     * @return Whether the targetPercentile field is set.
     */
    @java.lang.Override
    public boolean hasTargetPercentile() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The target percentile for this bucket.
     * </pre>
     *
     * <code>optional double target_percentile = 1;</code>
     * @return The targetPercentile.
     */
    @java.lang.Override
    public double getTargetPercentile() {
      return targetPercentile_;
    }
    /**
     * <pre>
     * The target percentile for this bucket.
     * </pre>
     *
     * <code>optional double target_percentile = 1;</code>
     * @param value The targetPercentile to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPercentile(double value) {
      bitField0_ |= 0x00000001;
      targetPercentile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target percentile for this bucket.
     * </pre>
     *
     * <code>optional double target_percentile = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPercentile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetPercentile_ = 0D;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <pre>
     * Estimated value at this bucket.
     * </pre>
     *
     * <code>optional double value = 2;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Estimated value at this bucket.
     * </pre>
     *
     * <code>optional double value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <pre>
     * Estimated value at this bucket.
     * </pre>
     *
     * <code>optional double value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      bitField0_ |= 0x00000002;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Estimated value at this bucket.
     * </pre>
     *
     * <code>optional double value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = 0D;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * Number of samples less than value.
     * </pre>
     *
     * <code>optional uint64 count = 3;</code>
     * @return Whether the count field is set.
     */
    @java.lang.Override
    public boolean hasCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Number of samples less than value.
     * </pre>
     *
     * <code>optional uint64 count = 3;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * Number of samples less than value.
     * </pre>
     *
     * <code>optional uint64 count = 3;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {
      bitField0_ |= 0x00000004;
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of samples less than value.
     * </pre>
     *
     * <code>optional uint64 count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.PercentileBucket)
  }

  // @@protoc_insertion_point(class_scope:android_studio.PercentileBucket)
  private static final com.google.wireless.android.sdk.stats.PercentileBucket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.PercentileBucket();
  }

  public static com.google.wireless.android.sdk.stats.PercentileBucket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PercentileBucket>
      PARSER = new com.google.protobuf.AbstractParser<PercentileBucket>() {
    @java.lang.Override
    public PercentileBucket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PercentileBucket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PercentileBucket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PercentileBucket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.PercentileBucket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

