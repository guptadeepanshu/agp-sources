// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Estimations of percentiles of time spent on LLDB operations.
 * </pre>
 *
 * Protobuf type {@code android_studio.LldbPerformanceStats}
 */
public  final class LldbPerformanceStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.LldbPerformanceStats)
    LldbPerformanceStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LldbPerformanceStats.newBuilder() to construct.
  private LldbPerformanceStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LldbPerformanceStats() {
    estimator_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LldbPerformanceStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LldbPerformanceStats(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              estimator_ = new java.util.ArrayList<com.google.wireless.android.sdk.stats.LldbPercentileEstimator>();
              mutable_bitField0_ |= 0x00000001;
            }
            estimator_.add(
                input.readMessage(com.google.wireless.android.sdk.stats.LldbPercentileEstimator.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        estimator_ = java.util.Collections.unmodifiableList(estimator_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbPerformanceStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbPerformanceStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.LldbPerformanceStats.class, com.google.wireless.android.sdk.stats.LldbPerformanceStats.Builder.class);
  }

  public static final int ESTIMATOR_FIELD_NUMBER = 1;
  private java.util.List<com.google.wireless.android.sdk.stats.LldbPercentileEstimator> estimator_;
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
   */
  public java.util.List<com.google.wireless.android.sdk.stats.LldbPercentileEstimator> getEstimatorList() {
    return estimator_;
  }
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
   */
  public java.util.List<? extends com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder> 
      getEstimatorOrBuilderList() {
    return estimator_;
  }
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
   */
  public int getEstimatorCount() {
    return estimator_.size();
  }
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
   */
  public com.google.wireless.android.sdk.stats.LldbPercentileEstimator getEstimator(int index) {
    return estimator_.get(index);
  }
  /**
   * <pre>
   * Collection of estimations of performance metrics.
   * </pre>
   *
   * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
   */
  public com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder getEstimatorOrBuilder(
      int index) {
    return estimator_.get(index);
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
    for (int i = 0; i < estimator_.size(); i++) {
      output.writeMessage(1, estimator_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < estimator_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, estimator_.get(i));
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.LldbPerformanceStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.LldbPerformanceStats other = (com.google.wireless.android.sdk.stats.LldbPerformanceStats) obj;

    if (!getEstimatorList()
        .equals(other.getEstimatorList())) return false;
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
    if (getEstimatorCount() > 0) {
      hash = (37 * hash) + ESTIMATOR_FIELD_NUMBER;
      hash = (53 * hash) + getEstimatorList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.LldbPerformanceStats prototype) {
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
   * Estimations of percentiles of time spent on LLDB operations.
   * </pre>
   *
   * Protobuf type {@code android_studio.LldbPerformanceStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.LldbPerformanceStats)
      com.google.wireless.android.sdk.stats.LldbPerformanceStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbPerformanceStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbPerformanceStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.LldbPerformanceStats.class, com.google.wireless.android.sdk.stats.LldbPerformanceStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.LldbPerformanceStats.newBuilder()
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
        getEstimatorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (estimatorBuilder_ == null) {
        estimator_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        estimatorBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbPerformanceStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbPerformanceStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.LldbPerformanceStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbPerformanceStats build() {
      com.google.wireless.android.sdk.stats.LldbPerformanceStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbPerformanceStats buildPartial() {
      com.google.wireless.android.sdk.stats.LldbPerformanceStats result = new com.google.wireless.android.sdk.stats.LldbPerformanceStats(this);
      int from_bitField0_ = bitField0_;
      if (estimatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          estimator_ = java.util.Collections.unmodifiableList(estimator_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.estimator_ = estimator_;
      } else {
        result.estimator_ = estimatorBuilder_.build();
      }
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
      if (other instanceof com.google.wireless.android.sdk.stats.LldbPerformanceStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.LldbPerformanceStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.LldbPerformanceStats other) {
      if (other == com.google.wireless.android.sdk.stats.LldbPerformanceStats.getDefaultInstance()) return this;
      if (estimatorBuilder_ == null) {
        if (!other.estimator_.isEmpty()) {
          if (estimator_.isEmpty()) {
            estimator_ = other.estimator_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEstimatorIsMutable();
            estimator_.addAll(other.estimator_);
          }
          onChanged();
        }
      } else {
        if (!other.estimator_.isEmpty()) {
          if (estimatorBuilder_.isEmpty()) {
            estimatorBuilder_.dispose();
            estimatorBuilder_ = null;
            estimator_ = other.estimator_;
            bitField0_ = (bitField0_ & ~0x00000001);
            estimatorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEstimatorFieldBuilder() : null;
          } else {
            estimatorBuilder_.addAllMessages(other.estimator_);
          }
        }
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
      com.google.wireless.android.sdk.stats.LldbPerformanceStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.LldbPerformanceStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.wireless.android.sdk.stats.LldbPercentileEstimator> estimator_ =
      java.util.Collections.emptyList();
    private void ensureEstimatorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        estimator_ = new java.util.ArrayList<com.google.wireless.android.sdk.stats.LldbPercentileEstimator>(estimator_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.wireless.android.sdk.stats.LldbPercentileEstimator, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder, com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder> estimatorBuilder_;

    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public java.util.List<com.google.wireless.android.sdk.stats.LldbPercentileEstimator> getEstimatorList() {
      if (estimatorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(estimator_);
      } else {
        return estimatorBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public int getEstimatorCount() {
      if (estimatorBuilder_ == null) {
        return estimator_.size();
      } else {
        return estimatorBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.LldbPercentileEstimator getEstimator(int index) {
      if (estimatorBuilder_ == null) {
        return estimator_.get(index);
      } else {
        return estimatorBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder setEstimator(
        int index, com.google.wireless.android.sdk.stats.LldbPercentileEstimator value) {
      if (estimatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEstimatorIsMutable();
        estimator_.set(index, value);
        onChanged();
      } else {
        estimatorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder setEstimator(
        int index, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder builderForValue) {
      if (estimatorBuilder_ == null) {
        ensureEstimatorIsMutable();
        estimator_.set(index, builderForValue.build());
        onChanged();
      } else {
        estimatorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder addEstimator(com.google.wireless.android.sdk.stats.LldbPercentileEstimator value) {
      if (estimatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEstimatorIsMutable();
        estimator_.add(value);
        onChanged();
      } else {
        estimatorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder addEstimator(
        int index, com.google.wireless.android.sdk.stats.LldbPercentileEstimator value) {
      if (estimatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEstimatorIsMutable();
        estimator_.add(index, value);
        onChanged();
      } else {
        estimatorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder addEstimator(
        com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder builderForValue) {
      if (estimatorBuilder_ == null) {
        ensureEstimatorIsMutable();
        estimator_.add(builderForValue.build());
        onChanged();
      } else {
        estimatorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder addEstimator(
        int index, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder builderForValue) {
      if (estimatorBuilder_ == null) {
        ensureEstimatorIsMutable();
        estimator_.add(index, builderForValue.build());
        onChanged();
      } else {
        estimatorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder addAllEstimator(
        java.lang.Iterable<? extends com.google.wireless.android.sdk.stats.LldbPercentileEstimator> values) {
      if (estimatorBuilder_ == null) {
        ensureEstimatorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, estimator_);
        onChanged();
      } else {
        estimatorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder clearEstimator() {
      if (estimatorBuilder_ == null) {
        estimator_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        estimatorBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public Builder removeEstimator(int index) {
      if (estimatorBuilder_ == null) {
        ensureEstimatorIsMutable();
        estimator_.remove(index);
        onChanged();
      } else {
        estimatorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder getEstimatorBuilder(
        int index) {
      return getEstimatorFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder getEstimatorOrBuilder(
        int index) {
      if (estimatorBuilder_ == null) {
        return estimator_.get(index);  } else {
        return estimatorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public java.util.List<? extends com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder> 
         getEstimatorOrBuilderList() {
      if (estimatorBuilder_ != null) {
        return estimatorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(estimator_);
      }
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder addEstimatorBuilder() {
      return getEstimatorFieldBuilder().addBuilder(
          com.google.wireless.android.sdk.stats.LldbPercentileEstimator.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder addEstimatorBuilder(
        int index) {
      return getEstimatorFieldBuilder().addBuilder(
          index, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.getDefaultInstance());
    }
    /**
     * <pre>
     * Collection of estimations of performance metrics.
     * </pre>
     *
     * <code>repeated .android_studio.LldbPercentileEstimator estimator = 1;</code>
     */
    public java.util.List<com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder> 
         getEstimatorBuilderList() {
      return getEstimatorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.wireless.android.sdk.stats.LldbPercentileEstimator, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder, com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder> 
        getEstimatorFieldBuilder() {
      if (estimatorBuilder_ == null) {
        estimatorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.wireless.android.sdk.stats.LldbPercentileEstimator, com.google.wireless.android.sdk.stats.LldbPercentileEstimator.Builder, com.google.wireless.android.sdk.stats.LldbPercentileEstimatorOrBuilder>(
                estimator_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        estimator_ = null;
      }
      return estimatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.LldbPerformanceStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.LldbPerformanceStats)
  private static final com.google.wireless.android.sdk.stats.LldbPerformanceStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.LldbPerformanceStats();
  }

  public static com.google.wireless.android.sdk.stats.LldbPerformanceStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LldbPerformanceStats>
      PARSER = new com.google.protobuf.AbstractParser<LldbPerformanceStats>() {
    @java.lang.Override
    public LldbPerformanceStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LldbPerformanceStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LldbPerformanceStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LldbPerformanceStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.LldbPerformanceStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

