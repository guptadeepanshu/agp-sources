// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.TraceProcessorDaemonQueryStats}
 */
public final class TraceProcessorDaemonQueryStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.TraceProcessorDaemonQueryStats)
    TraceProcessorDaemonQueryStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TraceProcessorDaemonQueryStats.newBuilder() to construct.
  private TraceProcessorDaemonQueryStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TraceProcessorDaemonQueryStats() {
    queryStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TraceProcessorDaemonQueryStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonQueryStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonQueryStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.class, com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus}
   */
  public enum QueryReturnStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <pre>
     * The query returned successfully.
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    OK(1),
    /**
     * <pre>
     * The query returned, but TPD identified a problem in the query so it might
     * have some missing data.
     * </pre>
     *
     * <code>QUERY_ERROR = 2;</code>
     */
    QUERY_ERROR(2),
    /**
     * <pre>
     * The backend was unable to perform the query (e.g. the daemon couldn’t be
     * reached)
     * </pre>
     *
     * <code>QUERY_FAILED = 3;</code>
     */
    QUERY_FAILED(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * The query returned successfully.
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;
    /**
     * <pre>
     * The query returned, but TPD identified a problem in the query so it might
     * have some missing data.
     * </pre>
     *
     * <code>QUERY_ERROR = 2;</code>
     */
    public static final int QUERY_ERROR_VALUE = 2;
    /**
     * <pre>
     * The backend was unable to perform the query (e.g. the daemon couldn’t be
     * reached)
     * </pre>
     *
     * <code>QUERY_FAILED = 3;</code>
     */
    public static final int QUERY_FAILED_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static QueryReturnStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static QueryReturnStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return OK;
        case 2: return QUERY_ERROR;
        case 3: return QUERY_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<QueryReturnStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        QueryReturnStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<QueryReturnStatus>() {
            public QueryReturnStatus findValueByNumber(int number) {
              return QueryReturnStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.getDescriptor().getEnumTypes().get(0);
    }

    private static final QueryReturnStatus[] VALUES = values();

    public static QueryReturnStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private QueryReturnStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus)
  }

  private int bitField0_;
  public static final int METHOD_DURATION_MS_FIELD_NUMBER = 1;
  private long methodDurationMs_ = 0L;
  /**
   * <pre>
   *&#47; Data for all query types:
   * Time to perform the whole method
   * </pre>
   *
   * <code>optional uint64 method_duration_ms = 1;</code>
   * @return Whether the methodDurationMs field is set.
   */
  @java.lang.Override
  public boolean hasMethodDurationMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *&#47; Data for all query types:
   * Time to perform the whole method
   * </pre>
   *
   * <code>optional uint64 method_duration_ms = 1;</code>
   * @return The methodDurationMs.
   */
  @java.lang.Override
  public long getMethodDurationMs() {
    return methodDurationMs_;
  }

  public static final int GRPC_QUERY_DURATION_MS_FIELD_NUMBER = 2;
  private long grpcQueryDurationMs_ = 0L;
  /**
   * <pre>
   * Time to perform the gRPC query only
   * </pre>
   *
   * <code>optional uint64 grpc_query_duration_ms = 2;</code>
   * @return Whether the grpcQueryDurationMs field is set.
   */
  @java.lang.Override
  public boolean hasGrpcQueryDurationMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Time to perform the gRPC query only
   * </pre>
   *
   * <code>optional uint64 grpc_query_duration_ms = 2;</code>
   * @return The grpcQueryDurationMs.
   */
  @java.lang.Override
  public long getGrpcQueryDurationMs() {
    return grpcQueryDurationMs_;
  }

  public static final int QUERY_STATUS_FIELD_NUMBER = 3;
  private int queryStatus_ = 0;
  /**
   * <pre>
   * The return status of the query
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
   * @return Whether the queryStatus field is set.
   */
  @java.lang.Override public boolean hasQueryStatus() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The return status of the query
   * </pre>
   *
   * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
   * @return The queryStatus.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus getQueryStatus() {
    com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus result = com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus.forNumber(queryStatus_);
    return result == null ? com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus.UNKNOWN : result;
  }

  public static final int TRACE_SIZE_BYTES_FIELD_NUMBER = 100;
  private long traceSizeBytes_ = 0L;
  /**
   * <pre>
   *&#47; Set when |TPD_QUERY_LOAD_TRACE|
   * The file size in bytes of the trace we tried to load.
   * </pre>
   *
   * <code>optional uint64 trace_size_bytes = 100;</code>
   * @return Whether the traceSizeBytes field is set.
   */
  @java.lang.Override
  public boolean hasTraceSizeBytes() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   *&#47; Set when |TPD_QUERY_LOAD_TRACE|
   * The file size in bytes of the trace we tried to load.
   * </pre>
   *
   * <code>optional uint64 trace_size_bytes = 100;</code>
   * @return The traceSizeBytes.
   */
  @java.lang.Override
  public long getTraceSizeBytes() {
    return traceSizeBytes_;
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
      output.writeUInt64(1, methodDurationMs_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, grpcQueryDurationMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, queryStatus_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(100, traceSizeBytes_);
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
        .computeUInt64Size(1, methodDurationMs_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, grpcQueryDurationMs_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, queryStatus_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(100, traceSizeBytes_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats other = (com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats) obj;

    if (hasMethodDurationMs() != other.hasMethodDurationMs()) return false;
    if (hasMethodDurationMs()) {
      if (getMethodDurationMs()
          != other.getMethodDurationMs()) return false;
    }
    if (hasGrpcQueryDurationMs() != other.hasGrpcQueryDurationMs()) return false;
    if (hasGrpcQueryDurationMs()) {
      if (getGrpcQueryDurationMs()
          != other.getGrpcQueryDurationMs()) return false;
    }
    if (hasQueryStatus() != other.hasQueryStatus()) return false;
    if (hasQueryStatus()) {
      if (queryStatus_ != other.queryStatus_) return false;
    }
    if (hasTraceSizeBytes() != other.hasTraceSizeBytes()) return false;
    if (hasTraceSizeBytes()) {
      if (getTraceSizeBytes()
          != other.getTraceSizeBytes()) return false;
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
    if (hasMethodDurationMs()) {
      hash = (37 * hash) + METHOD_DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMethodDurationMs());
    }
    if (hasGrpcQueryDurationMs()) {
      hash = (37 * hash) + GRPC_QUERY_DURATION_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGrpcQueryDurationMs());
    }
    if (hasQueryStatus()) {
      hash = (37 * hash) + QUERY_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + queryStatus_;
    }
    if (hasTraceSizeBytes()) {
      hash = (37 * hash) + TRACE_SIZE_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTraceSizeBytes());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats prototype) {
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
   * Protobuf type {@code android_studio.TraceProcessorDaemonQueryStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.TraceProcessorDaemonQueryStats)
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonQueryStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonQueryStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.class, com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.newBuilder()
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
      methodDurationMs_ = 0L;
      grpcQueryDurationMs_ = 0L;
      queryStatus_ = 0;
      traceSizeBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TraceProcessorDaemonQueryStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats build() {
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats buildPartial() {
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats result = new com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.methodDurationMs_ = methodDurationMs_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grpcQueryDurationMs_ = grpcQueryDurationMs_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.queryStatus_ = queryStatus_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.traceSizeBytes_ = traceSizeBytes_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats other) {
      if (other == com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.getDefaultInstance()) return this;
      if (other.hasMethodDurationMs()) {
        setMethodDurationMs(other.getMethodDurationMs());
      }
      if (other.hasGrpcQueryDurationMs()) {
        setGrpcQueryDurationMs(other.getGrpcQueryDurationMs());
      }
      if (other.hasQueryStatus()) {
        setQueryStatus(other.getQueryStatus());
      }
      if (other.hasTraceSizeBytes()) {
        setTraceSizeBytes(other.getTraceSizeBytes());
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
            case 8: {
              methodDurationMs_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              grpcQueryDurationMs_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus tmpValue =
                  com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(3, tmpRaw);
              } else {
                queryStatus_ = tmpRaw;
                bitField0_ |= 0x00000004;
              }
              break;
            } // case 24
            case 800: {
              traceSizeBytes_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 800
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

    private long methodDurationMs_ ;
    /**
     * <pre>
     *&#47; Data for all query types:
     * Time to perform the whole method
     * </pre>
     *
     * <code>optional uint64 method_duration_ms = 1;</code>
     * @return Whether the methodDurationMs field is set.
     */
    @java.lang.Override
    public boolean hasMethodDurationMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *&#47; Data for all query types:
     * Time to perform the whole method
     * </pre>
     *
     * <code>optional uint64 method_duration_ms = 1;</code>
     * @return The methodDurationMs.
     */
    @java.lang.Override
    public long getMethodDurationMs() {
      return methodDurationMs_;
    }
    /**
     * <pre>
     *&#47; Data for all query types:
     * Time to perform the whole method
     * </pre>
     *
     * <code>optional uint64 method_duration_ms = 1;</code>
     * @param value The methodDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setMethodDurationMs(long value) {

      methodDurationMs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Data for all query types:
     * Time to perform the whole method
     * </pre>
     *
     * <code>optional uint64 method_duration_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethodDurationMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      methodDurationMs_ = 0L;
      onChanged();
      return this;
    }

    private long grpcQueryDurationMs_ ;
    /**
     * <pre>
     * Time to perform the gRPC query only
     * </pre>
     *
     * <code>optional uint64 grpc_query_duration_ms = 2;</code>
     * @return Whether the grpcQueryDurationMs field is set.
     */
    @java.lang.Override
    public boolean hasGrpcQueryDurationMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Time to perform the gRPC query only
     * </pre>
     *
     * <code>optional uint64 grpc_query_duration_ms = 2;</code>
     * @return The grpcQueryDurationMs.
     */
    @java.lang.Override
    public long getGrpcQueryDurationMs() {
      return grpcQueryDurationMs_;
    }
    /**
     * <pre>
     * Time to perform the gRPC query only
     * </pre>
     *
     * <code>optional uint64 grpc_query_duration_ms = 2;</code>
     * @param value The grpcQueryDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setGrpcQueryDurationMs(long value) {

      grpcQueryDurationMs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time to perform the gRPC query only
     * </pre>
     *
     * <code>optional uint64 grpc_query_duration_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrpcQueryDurationMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      grpcQueryDurationMs_ = 0L;
      onChanged();
      return this;
    }

    private int queryStatus_ = 0;
    /**
     * <pre>
     * The return status of the query
     * </pre>
     *
     * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
     * @return Whether the queryStatus field is set.
     */
    @java.lang.Override public boolean hasQueryStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The return status of the query
     * </pre>
     *
     * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
     * @return The queryStatus.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus getQueryStatus() {
      com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus result = com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus.forNumber(queryStatus_);
      return result == null ? com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus.UNKNOWN : result;
    }
    /**
     * <pre>
     * The return status of the query
     * </pre>
     *
     * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
     * @param value The queryStatus to set.
     * @return This builder for chaining.
     */
    public Builder setQueryStatus(com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats.QueryReturnStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      queryStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The return status of the query
     * </pre>
     *
     * <code>optional .android_studio.TraceProcessorDaemonQueryStats.QueryReturnStatus query_status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      queryStatus_ = 0;
      onChanged();
      return this;
    }

    private long traceSizeBytes_ ;
    /**
     * <pre>
     *&#47; Set when |TPD_QUERY_LOAD_TRACE|
     * The file size in bytes of the trace we tried to load.
     * </pre>
     *
     * <code>optional uint64 trace_size_bytes = 100;</code>
     * @return Whether the traceSizeBytes field is set.
     */
    @java.lang.Override
    public boolean hasTraceSizeBytes() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *&#47; Set when |TPD_QUERY_LOAD_TRACE|
     * The file size in bytes of the trace we tried to load.
     * </pre>
     *
     * <code>optional uint64 trace_size_bytes = 100;</code>
     * @return The traceSizeBytes.
     */
    @java.lang.Override
    public long getTraceSizeBytes() {
      return traceSizeBytes_;
    }
    /**
     * <pre>
     *&#47; Set when |TPD_QUERY_LOAD_TRACE|
     * The file size in bytes of the trace we tried to load.
     * </pre>
     *
     * <code>optional uint64 trace_size_bytes = 100;</code>
     * @param value The traceSizeBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTraceSizeBytes(long value) {

      traceSizeBytes_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Set when |TPD_QUERY_LOAD_TRACE|
     * The file size in bytes of the trace we tried to load.
     * </pre>
     *
     * <code>optional uint64 trace_size_bytes = 100;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraceSizeBytes() {
      bitField0_ = (bitField0_ & ~0x00000008);
      traceSizeBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.TraceProcessorDaemonQueryStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.TraceProcessorDaemonQueryStats)
  private static final com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats();
  }

  public static com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TraceProcessorDaemonQueryStats>
      PARSER = new com.google.protobuf.AbstractParser<TraceProcessorDaemonQueryStats>() {
    @java.lang.Override
    public TraceProcessorDaemonQueryStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<TraceProcessorDaemonQueryStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TraceProcessorDaemonQueryStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.TraceProcessorDaemonQueryStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

