// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_logging.proto

package com.android.build.gradle.internal.cxx.logging;

/**
 * <pre>
 **
 *Message that indicates a user-define message is arriving next.
 *The type of that message is encoded in type_id which should be
 *a string usable by a JVM class loader to instantiate the coming
 *message.
 * </pre>
 *
 * Protobuf type {@code PayloadHeader}
 */
public final class PayloadHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PayloadHeader)
    PayloadHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PayloadHeader.newBuilder() to construct.
  private PayloadHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PayloadHeader() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PayloadHeader();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PayloadHeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            timeStampMs_ = input.readInt64();
            break;
          }
          case 16: {

            typeId_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_PayloadHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_PayloadHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.logging.PayloadHeader.class, com.android.build.gradle.internal.cxx.logging.PayloadHeader.Builder.class);
  }

  public static final int TIME_STAMP_MS_FIELD_NUMBER = 1;
  private long timeStampMs_;
  /**
   * <code>int64 time_stamp_ms = 1;</code>
   * @return The timeStampMs.
   */
  @java.lang.Override
  public long getTimeStampMs() {
    return timeStampMs_;
  }

  public static final int TYPE_ID_FIELD_NUMBER = 2;
  private int typeId_;
  /**
   * <code>int32 type_id = 2;</code>
   * @return The typeId.
   */
  @java.lang.Override
  public int getTypeId() {
    return typeId_;
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
    if (timeStampMs_ != 0L) {
      output.writeInt64(1, timeStampMs_);
    }
    if (typeId_ != 0) {
      output.writeInt32(2, typeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeStampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timeStampMs_);
    }
    if (typeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, typeId_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.logging.PayloadHeader)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.logging.PayloadHeader other = (com.android.build.gradle.internal.cxx.logging.PayloadHeader) obj;

    if (getTimeStampMs()
        != other.getTimeStampMs()) return false;
    if (getTypeId()
        != other.getTypeId()) return false;
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
    hash = (37 * hash) + TIME_STAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeStampMs());
    hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTypeId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.logging.PayloadHeader prototype) {
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
   *Message that indicates a user-define message is arriving next.
   *The type of that message is encoded in type_id which should be
   *a string usable by a JVM class loader to instantiate the coming
   *message.
   * </pre>
   *
   * Protobuf type {@code PayloadHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PayloadHeader)
      com.android.build.gradle.internal.cxx.logging.PayloadHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_PayloadHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_PayloadHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.logging.PayloadHeader.class, com.android.build.gradle.internal.cxx.logging.PayloadHeader.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.logging.PayloadHeader.newBuilder()
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
      timeStampMs_ = 0L;

      typeId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_PayloadHeader_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.PayloadHeader getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.logging.PayloadHeader.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.PayloadHeader build() {
      com.android.build.gradle.internal.cxx.logging.PayloadHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.PayloadHeader buildPartial() {
      com.android.build.gradle.internal.cxx.logging.PayloadHeader result = new com.android.build.gradle.internal.cxx.logging.PayloadHeader(this);
      result.timeStampMs_ = timeStampMs_;
      result.typeId_ = typeId_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.logging.PayloadHeader) {
        return mergeFrom((com.android.build.gradle.internal.cxx.logging.PayloadHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.logging.PayloadHeader other) {
      if (other == com.android.build.gradle.internal.cxx.logging.PayloadHeader.getDefaultInstance()) return this;
      if (other.getTimeStampMs() != 0L) {
        setTimeStampMs(other.getTimeStampMs());
      }
      if (other.getTypeId() != 0) {
        setTypeId(other.getTypeId());
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
      com.android.build.gradle.internal.cxx.logging.PayloadHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.logging.PayloadHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long timeStampMs_ ;
    /**
     * <code>int64 time_stamp_ms = 1;</code>
     * @return The timeStampMs.
     */
    @java.lang.Override
    public long getTimeStampMs() {
      return timeStampMs_;
    }
    /**
     * <code>int64 time_stamp_ms = 1;</code>
     * @param value The timeStampMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeStampMs(long value) {
      
      timeStampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time_stamp_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeStampMs() {
      
      timeStampMs_ = 0L;
      onChanged();
      return this;
    }

    private int typeId_ ;
    /**
     * <code>int32 type_id = 2;</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
    }
    /**
     * <code>int32 type_id = 2;</code>
     * @param value The typeId to set.
     * @return This builder for chaining.
     */
    public Builder setTypeId(int value) {
      
      typeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeId() {
      
      typeId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:PayloadHeader)
  }

  // @@protoc_insertion_point(class_scope:PayloadHeader)
  private static final com.android.build.gradle.internal.cxx.logging.PayloadHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.logging.PayloadHeader();
  }

  public static com.android.build.gradle.internal.cxx.logging.PayloadHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PayloadHeader>
      PARSER = new com.google.protobuf.AbstractParser<PayloadHeader>() {
    @java.lang.Override
    public PayloadHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PayloadHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PayloadHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PayloadHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.logging.PayloadHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

