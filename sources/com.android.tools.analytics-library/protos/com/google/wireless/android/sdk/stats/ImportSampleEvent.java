// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for import sample event
 * </pre>
 *
 * Protobuf type {@code android_studio.ImportSampleEvent}
 */
public  final class ImportSampleEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ImportSampleEvent)
    ImportSampleEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportSampleEvent.newBuilder() to construct.
  private ImportSampleEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportSampleEvent() {
    importSampleId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportSampleEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportSampleEvent(
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
            importSampleId_ = bs;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ImportSampleEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ImportSampleEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ImportSampleEvent.class, com.google.wireless.android.sdk.stats.ImportSampleEvent.Builder.class);
  }

  private int bitField0_;
  public static final int IMPORT_SAMPLE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object importSampleId_;
  /**
   * <pre>
   * The ID of the sample imported. This is not user content, it will always be
   * a string generated by us since we publish the samples to the GitHub
   * repositories
   * </pre>
   *
   * <code>optional string import_sample_id = 1;</code>
   * @return Whether the importSampleId field is set.
   */
  public boolean hasImportSampleId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The ID of the sample imported. This is not user content, it will always be
   * a string generated by us since we publish the samples to the GitHub
   * repositories
   * </pre>
   *
   * <code>optional string import_sample_id = 1;</code>
   * @return The importSampleId.
   */
  public java.lang.String getImportSampleId() {
    java.lang.Object ref = importSampleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        importSampleId_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the sample imported. This is not user content, it will always be
   * a string generated by us since we publish the samples to the GitHub
   * repositories
   * </pre>
   *
   * <code>optional string import_sample_id = 1;</code>
   * @return The bytes for importSampleId.
   */
  public com.google.protobuf.ByteString
      getImportSampleIdBytes() {
    java.lang.Object ref = importSampleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      importSampleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, importSampleId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, importSampleId_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ImportSampleEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ImportSampleEvent other = (com.google.wireless.android.sdk.stats.ImportSampleEvent) obj;

    if (hasImportSampleId() != other.hasImportSampleId()) return false;
    if (hasImportSampleId()) {
      if (!getImportSampleId()
          .equals(other.getImportSampleId())) return false;
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
    if (hasImportSampleId()) {
      hash = (37 * hash) + IMPORT_SAMPLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getImportSampleId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ImportSampleEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ImportSampleEvent prototype) {
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
   * Details for import sample event
   * </pre>
   *
   * Protobuf type {@code android_studio.ImportSampleEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ImportSampleEvent)
      com.google.wireless.android.sdk.stats.ImportSampleEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ImportSampleEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ImportSampleEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ImportSampleEvent.class, com.google.wireless.android.sdk.stats.ImportSampleEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ImportSampleEvent.newBuilder()
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
      importSampleId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ImportSampleEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ImportSampleEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ImportSampleEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ImportSampleEvent build() {
      com.google.wireless.android.sdk.stats.ImportSampleEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ImportSampleEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ImportSampleEvent result = new com.google.wireless.android.sdk.stats.ImportSampleEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.importSampleId_ = importSampleId_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ImportSampleEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ImportSampleEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ImportSampleEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ImportSampleEvent.getDefaultInstance()) return this;
      if (other.hasImportSampleId()) {
        bitField0_ |= 0x00000001;
        importSampleId_ = other.importSampleId_;
        onChanged();
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
      com.google.wireless.android.sdk.stats.ImportSampleEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.ImportSampleEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object importSampleId_ = "";
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @return Whether the importSampleId field is set.
     */
    public boolean hasImportSampleId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @return The importSampleId.
     */
    public java.lang.String getImportSampleId() {
      java.lang.Object ref = importSampleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          importSampleId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @return The bytes for importSampleId.
     */
    public com.google.protobuf.ByteString
        getImportSampleIdBytes() {
      java.lang.Object ref = importSampleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        importSampleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @param value The importSampleId to set.
     * @return This builder for chaining.
     */
    public Builder setImportSampleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      importSampleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImportSampleId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      importSampleId_ = getDefaultInstance().getImportSampleId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the sample imported. This is not user content, it will always be
     * a string generated by us since we publish the samples to the GitHub
     * repositories
     * </pre>
     *
     * <code>optional string import_sample_id = 1;</code>
     * @param value The bytes for importSampleId to set.
     * @return This builder for chaining.
     */
    public Builder setImportSampleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      importSampleId_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ImportSampleEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ImportSampleEvent)
  private static final com.google.wireless.android.sdk.stats.ImportSampleEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ImportSampleEvent();
  }

  public static com.google.wireless.android.sdk.stats.ImportSampleEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ImportSampleEvent>
      PARSER = new com.google.protobuf.AbstractParser<ImportSampleEvent>() {
    @java.lang.Override
    public ImportSampleEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportSampleEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportSampleEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSampleEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ImportSampleEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

