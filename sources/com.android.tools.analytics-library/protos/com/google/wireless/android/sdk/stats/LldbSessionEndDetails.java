// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.LldbSessionEndDetails}
 */
public final class LldbSessionEndDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.LldbSessionEndDetails)
    LldbSessionEndDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LldbSessionEndDetails.newBuilder() to construct.
  private LldbSessionEndDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LldbSessionEndDetails() {
    debugSessionId_ = "";
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LldbSessionEndDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LldbSessionEndDetails(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            debugSessionId_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            failureMessage_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            stops_ = input.readUInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            errors_ = input.readUInt64();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbSessionEndDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbSessionEndDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.LldbSessionEndDetails.class, com.google.wireless.android.sdk.stats.LldbSessionEndDetails.Builder.class);
  }

  private int bitField0_;
  public static final int DEBUG_SESSION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object debugSessionId_;
  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return Whether the debugSessionId field is set.
   */
  @java.lang.Override
  public boolean hasDebugSessionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return The debugSessionId.
   */
  @java.lang.Override
  public java.lang.String getDebugSessionId() {
    java.lang.Object ref = debugSessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        debugSessionId_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return The bytes for debugSessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDebugSessionIdBytes() {
    java.lang.Object ref = debugSessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debugSessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object failureMessage_;
  /**
   * <pre>
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return Whether the failureMessage field is set.
   */
  @java.lang.Override
  public boolean hasFailureMessage() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        failureMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOPS_FIELD_NUMBER = 3;
  private long stops_;
  /**
   * <pre>
   * Number of times the program was stopped by the debugger.
   * Proxy for use of the session to compute error rates.
   * </pre>
   *
   * <code>optional uint64 stops = 3;</code>
   * @return Whether the stops field is set.
   */
  @java.lang.Override
  public boolean hasStops() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Number of times the program was stopped by the debugger.
   * Proxy for use of the session to compute error rates.
   * </pre>
   *
   * <code>optional uint64 stops = 3;</code>
   * @return The stops.
   */
  @java.lang.Override
  public long getStops() {
    return stops_;
  }

  public static final int ERRORS_FIELD_NUMBER = 4;
  private long errors_;
  /**
   * <pre>
   * Number of errors encountered during the session.
   * Includes both fatal and non-fatal errors.
   * </pre>
   *
   * <code>optional uint64 errors = 4;</code>
   * @return Whether the errors field is set.
   */
  @java.lang.Override
  public boolean hasErrors() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Number of errors encountered during the session.
   * Includes both fatal and non-fatal errors.
   * </pre>
   *
   * <code>optional uint64 errors = 4;</code>
   * @return The errors.
   */
  @java.lang.Override
  public long getErrors() {
    return errors_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debugSessionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, failureMessage_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt64(3, stops_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt64(4, errors_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debugSessionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, failureMessage_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, stops_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, errors_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.LldbSessionEndDetails)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.LldbSessionEndDetails other = (com.google.wireless.android.sdk.stats.LldbSessionEndDetails) obj;

    if (hasDebugSessionId() != other.hasDebugSessionId()) return false;
    if (hasDebugSessionId()) {
      if (!getDebugSessionId()
          .equals(other.getDebugSessionId())) return false;
    }
    if (hasFailureMessage() != other.hasFailureMessage()) return false;
    if (hasFailureMessage()) {
      if (!getFailureMessage()
          .equals(other.getFailureMessage())) return false;
    }
    if (hasStops() != other.hasStops()) return false;
    if (hasStops()) {
      if (getStops()
          != other.getStops()) return false;
    }
    if (hasErrors() != other.hasErrors()) return false;
    if (hasErrors()) {
      if (getErrors()
          != other.getErrors()) return false;
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
    if (hasDebugSessionId()) {
      hash = (37 * hash) + DEBUG_SESSION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDebugSessionId().hashCode();
    }
    if (hasFailureMessage()) {
      hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getFailureMessage().hashCode();
    }
    if (hasStops()) {
      hash = (37 * hash) + STOPS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStops());
    }
    if (hasErrors()) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getErrors());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.LldbSessionEndDetails prototype) {
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
   * Protobuf type {@code android_studio.LldbSessionEndDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.LldbSessionEndDetails)
      com.google.wireless.android.sdk.stats.LldbSessionEndDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbSessionEndDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbSessionEndDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.LldbSessionEndDetails.class, com.google.wireless.android.sdk.stats.LldbSessionEndDetails.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.LldbSessionEndDetails.newBuilder()
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
      debugSessionId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      failureMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      stops_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      errors_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LldbSessionEndDetails_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbSessionEndDetails getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.LldbSessionEndDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbSessionEndDetails build() {
      com.google.wireless.android.sdk.stats.LldbSessionEndDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LldbSessionEndDetails buildPartial() {
      com.google.wireless.android.sdk.stats.LldbSessionEndDetails result = new com.google.wireless.android.sdk.stats.LldbSessionEndDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.debugSessionId_ = debugSessionId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.failureMessage_ = failureMessage_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.stops_ = stops_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.errors_ = errors_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.wireless.android.sdk.stats.LldbSessionEndDetails) {
        return mergeFrom((com.google.wireless.android.sdk.stats.LldbSessionEndDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.LldbSessionEndDetails other) {
      if (other == com.google.wireless.android.sdk.stats.LldbSessionEndDetails.getDefaultInstance()) return this;
      if (other.hasDebugSessionId()) {
        bitField0_ |= 0x00000001;
        debugSessionId_ = other.debugSessionId_;
        onChanged();
      }
      if (other.hasFailureMessage()) {
        bitField0_ |= 0x00000002;
        failureMessage_ = other.failureMessage_;
        onChanged();
      }
      if (other.hasStops()) {
        setStops(other.getStops());
      }
      if (other.hasErrors()) {
        setErrors(other.getErrors());
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
      com.google.wireless.android.sdk.stats.LldbSessionEndDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.LldbSessionEndDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object debugSessionId_ = "";
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @return Whether the debugSessionId field is set.
     */
    public boolean hasDebugSessionId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @return The debugSessionId.
     */
    public java.lang.String getDebugSessionId() {
      java.lang.Object ref = debugSessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          debugSessionId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @return The bytes for debugSessionId.
     */
    public com.google.protobuf.ByteString
        getDebugSessionIdBytes() {
      java.lang.Object ref = debugSessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debugSessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @param value The debugSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setDebugSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      debugSessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDebugSessionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      debugSessionId_ = getDefaultInstance().getDebugSessionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A UUID used to relate start and end of a native debug session.
     * </pre>
     *
     * <code>optional string debug_session_id = 1;</code>
     * @param value The bytes for debugSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setDebugSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      debugSessionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object failureMessage_ = "";
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @return Whether the failureMessage field is set.
     */
    public boolean hasFailureMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          failureMessage_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString
        getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      failureMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failureMessage_ = getDefaultInstance().getFailureMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the session ended with a failure, the related message.
     * e.g. 'failed to get reply to handshake packet'
     * </pre>
     *
     * <code>optional string failure_message = 2;</code>
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      failureMessage_ = value;
      onChanged();
      return this;
    }

    private long stops_ ;
    /**
     * <pre>
     * Number of times the program was stopped by the debugger.
     * Proxy for use of the session to compute error rates.
     * </pre>
     *
     * <code>optional uint64 stops = 3;</code>
     * @return Whether the stops field is set.
     */
    @java.lang.Override
    public boolean hasStops() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Number of times the program was stopped by the debugger.
     * Proxy for use of the session to compute error rates.
     * </pre>
     *
     * <code>optional uint64 stops = 3;</code>
     * @return The stops.
     */
    @java.lang.Override
    public long getStops() {
      return stops_;
    }
    /**
     * <pre>
     * Number of times the program was stopped by the debugger.
     * Proxy for use of the session to compute error rates.
     * </pre>
     *
     * <code>optional uint64 stops = 3;</code>
     * @param value The stops to set.
     * @return This builder for chaining.
     */
    public Builder setStops(long value) {
      bitField0_ |= 0x00000004;
      stops_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times the program was stopped by the debugger.
     * Proxy for use of the session to compute error rates.
     * </pre>
     *
     * <code>optional uint64 stops = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStops() {
      bitField0_ = (bitField0_ & ~0x00000004);
      stops_ = 0L;
      onChanged();
      return this;
    }

    private long errors_ ;
    /**
     * <pre>
     * Number of errors encountered during the session.
     * Includes both fatal and non-fatal errors.
     * </pre>
     *
     * <code>optional uint64 errors = 4;</code>
     * @return Whether the errors field is set.
     */
    @java.lang.Override
    public boolean hasErrors() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Number of errors encountered during the session.
     * Includes both fatal and non-fatal errors.
     * </pre>
     *
     * <code>optional uint64 errors = 4;</code>
     * @return The errors.
     */
    @java.lang.Override
    public long getErrors() {
      return errors_;
    }
    /**
     * <pre>
     * Number of errors encountered during the session.
     * Includes both fatal and non-fatal errors.
     * </pre>
     *
     * <code>optional uint64 errors = 4;</code>
     * @param value The errors to set.
     * @return This builder for chaining.
     */
    public Builder setErrors(long value) {
      bitField0_ |= 0x00000008;
      errors_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of errors encountered during the session.
     * Includes both fatal and non-fatal errors.
     * </pre>
     *
     * <code>optional uint64 errors = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrors() {
      bitField0_ = (bitField0_ & ~0x00000008);
      errors_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.LldbSessionEndDetails)
  }

  // @@protoc_insertion_point(class_scope:android_studio.LldbSessionEndDetails)
  private static final com.google.wireless.android.sdk.stats.LldbSessionEndDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.LldbSessionEndDetails();
  }

  public static com.google.wireless.android.sdk.stats.LldbSessionEndDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LldbSessionEndDetails>
      PARSER = new com.google.protobuf.AbstractParser<LldbSessionEndDetails>() {
    @java.lang.Override
    public LldbSessionEndDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LldbSessionEndDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LldbSessionEndDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LldbSessionEndDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.LldbSessionEndDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

