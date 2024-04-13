// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_io.proto

package com.android.build.gradle.internal.cxx.io;

/**
 * Protobuf type {@code EncodedSynchronizeFile}
 */
public final class EncodedSynchronizeFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedSynchronizeFile)
    EncodedSynchronizeFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedSynchronizeFile.newBuilder() to construct.
  private EncodedSynchronizeFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedSynchronizeFile() {
    initialFileComparison_ = 0;
    outcome_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedSynchronizeFile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncodedSynchronizeFile(
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

            workingDirectoryId_ = input.readInt32();
            break;
          }
          case 16: {

            sourceFileId_ = input.readInt32();
            break;
          }
          case 24: {

            destinationFileId_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            initialFileComparison_ = rawValue;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            outcome_ = rawValue;
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
    return com.android.build.gradle.internal.cxx.io.CxxIo.internal_static_EncodedSynchronizeFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.io.CxxIo.internal_static_EncodedSynchronizeFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.class, com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.Builder.class);
  }

  public static final int WORKING_DIRECTORY_ID_FIELD_NUMBER = 1;
  private int workingDirectoryId_;
  /**
   * <code>int32 working_directory_id = 1;</code>
   * @return The workingDirectoryId.
   */
  @java.lang.Override
  public int getWorkingDirectoryId() {
    return workingDirectoryId_;
  }

  public static final int SOURCE_FILE_ID_FIELD_NUMBER = 2;
  private int sourceFileId_;
  /**
   * <code>int32 source_file_id = 2;</code>
   * @return The sourceFileId.
   */
  @java.lang.Override
  public int getSourceFileId() {
    return sourceFileId_;
  }

  public static final int DESTINATION_FILE_ID_FIELD_NUMBER = 3;
  private int destinationFileId_;
  /**
   * <code>int32 destination_file_id = 3;</code>
   * @return The destinationFileId.
   */
  @java.lang.Override
  public int getDestinationFileId() {
    return destinationFileId_;
  }

  public static final int INITIAL_FILE_COMPARISON_FIELD_NUMBER = 4;
  private int initialFileComparison_;
  /**
   * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
   * @return The enum numeric value on the wire for initialFileComparison.
   */
  @java.lang.Override public int getInitialFileComparisonValue() {
    return initialFileComparison_;
  }
  /**
   * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
   * @return The initialFileComparison.
   */
  @java.lang.Override public com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison getInitialFileComparison() {
    @SuppressWarnings("deprecation")
    com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison result = com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.valueOf(initialFileComparison_);
    return result == null ? com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.UNRECOGNIZED : result;
  }

  public static final int OUTCOME_FIELD_NUMBER = 5;
  private int outcome_;
  /**
   * <code>.SynchronizeFile.Outcome outcome = 5;</code>
   * @return The enum numeric value on the wire for outcome.
   */
  @java.lang.Override public int getOutcomeValue() {
    return outcome_;
  }
  /**
   * <code>.SynchronizeFile.Outcome outcome = 5;</code>
   * @return The outcome.
   */
  @java.lang.Override public com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome getOutcome() {
    @SuppressWarnings("deprecation")
    com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome result = com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.valueOf(outcome_);
    return result == null ? com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.UNRECOGNIZED : result;
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
    if (workingDirectoryId_ != 0) {
      output.writeInt32(1, workingDirectoryId_);
    }
    if (sourceFileId_ != 0) {
      output.writeInt32(2, sourceFileId_);
    }
    if (destinationFileId_ != 0) {
      output.writeInt32(3, destinationFileId_);
    }
    if (initialFileComparison_ != com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.UNKNOWN_COMPARISON.getNumber()) {
      output.writeEnum(4, initialFileComparison_);
    }
    if (outcome_ != com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.UNKNOWN_OUTCOME.getNumber()) {
      output.writeEnum(5, outcome_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workingDirectoryId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, workingDirectoryId_);
    }
    if (sourceFileId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sourceFileId_);
    }
    if (destinationFileId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, destinationFileId_);
    }
    if (initialFileComparison_ != com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.UNKNOWN_COMPARISON.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, initialFileComparison_);
    }
    if (outcome_ != com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.UNKNOWN_OUTCOME.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, outcome_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile other = (com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile) obj;

    if (getWorkingDirectoryId()
        != other.getWorkingDirectoryId()) return false;
    if (getSourceFileId()
        != other.getSourceFileId()) return false;
    if (getDestinationFileId()
        != other.getDestinationFileId()) return false;
    if (initialFileComparison_ != other.initialFileComparison_) return false;
    if (outcome_ != other.outcome_) return false;
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
    hash = (37 * hash) + WORKING_DIRECTORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkingDirectoryId();
    hash = (37 * hash) + SOURCE_FILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSourceFileId();
    hash = (37 * hash) + DESTINATION_FILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationFileId();
    hash = (37 * hash) + INITIAL_FILE_COMPARISON_FIELD_NUMBER;
    hash = (53 * hash) + initialFileComparison_;
    hash = (37 * hash) + OUTCOME_FIELD_NUMBER;
    hash = (53 * hash) + outcome_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile prototype) {
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
   * Protobuf type {@code EncodedSynchronizeFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedSynchronizeFile)
      com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.io.CxxIo.internal_static_EncodedSynchronizeFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.io.CxxIo.internal_static_EncodedSynchronizeFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.class, com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.newBuilder()
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
      workingDirectoryId_ = 0;

      sourceFileId_ = 0;

      destinationFileId_ = 0;

      initialFileComparison_ = 0;

      outcome_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.io.CxxIo.internal_static_EncodedSynchronizeFile_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile build() {
      com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile buildPartial() {
      com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile result = new com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile(this);
      result.workingDirectoryId_ = workingDirectoryId_;
      result.sourceFileId_ = sourceFileId_;
      result.destinationFileId_ = destinationFileId_;
      result.initialFileComparison_ = initialFileComparison_;
      result.outcome_ = outcome_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile) {
        return mergeFrom((com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile other) {
      if (other == com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile.getDefaultInstance()) return this;
      if (other.getWorkingDirectoryId() != 0) {
        setWorkingDirectoryId(other.getWorkingDirectoryId());
      }
      if (other.getSourceFileId() != 0) {
        setSourceFileId(other.getSourceFileId());
      }
      if (other.getDestinationFileId() != 0) {
        setDestinationFileId(other.getDestinationFileId());
      }
      if (other.initialFileComparison_ != 0) {
        setInitialFileComparisonValue(other.getInitialFileComparisonValue());
      }
      if (other.outcome_ != 0) {
        setOutcomeValue(other.getOutcomeValue());
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
      com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int workingDirectoryId_ ;
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @return The workingDirectoryId.
     */
    @java.lang.Override
    public int getWorkingDirectoryId() {
      return workingDirectoryId_;
    }
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @param value The workingDirectoryId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkingDirectoryId(int value) {
      
      workingDirectoryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 working_directory_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkingDirectoryId() {
      
      workingDirectoryId_ = 0;
      onChanged();
      return this;
    }

    private int sourceFileId_ ;
    /**
     * <code>int32 source_file_id = 2;</code>
     * @return The sourceFileId.
     */
    @java.lang.Override
    public int getSourceFileId() {
      return sourceFileId_;
    }
    /**
     * <code>int32 source_file_id = 2;</code>
     * @param value The sourceFileId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFileId(int value) {
      
      sourceFileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 source_file_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceFileId() {
      
      sourceFileId_ = 0;
      onChanged();
      return this;
    }

    private int destinationFileId_ ;
    /**
     * <code>int32 destination_file_id = 3;</code>
     * @return The destinationFileId.
     */
    @java.lang.Override
    public int getDestinationFileId() {
      return destinationFileId_;
    }
    /**
     * <code>int32 destination_file_id = 3;</code>
     * @param value The destinationFileId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationFileId(int value) {
      
      destinationFileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 destination_file_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationFileId() {
      
      destinationFileId_ = 0;
      onChanged();
      return this;
    }

    private int initialFileComparison_ = 0;
    /**
     * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
     * @return The enum numeric value on the wire for initialFileComparison.
     */
    @java.lang.Override public int getInitialFileComparisonValue() {
      return initialFileComparison_;
    }
    /**
     * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
     * @param value The enum numeric value on the wire for initialFileComparison to set.
     * @return This builder for chaining.
     */
    public Builder setInitialFileComparisonValue(int value) {
      
      initialFileComparison_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
     * @return The initialFileComparison.
     */
    @java.lang.Override
    public com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison getInitialFileComparison() {
      @SuppressWarnings("deprecation")
      com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison result = com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.valueOf(initialFileComparison_);
      return result == null ? com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison.UNRECOGNIZED : result;
    }
    /**
     * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
     * @param value The initialFileComparison to set.
     * @return This builder for chaining.
     */
    public Builder setInitialFileComparison(com.android.build.gradle.internal.cxx.io.SynchronizeFile.Comparison value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      initialFileComparison_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SynchronizeFile.Comparison initial_file_comparison = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialFileComparison() {
      
      initialFileComparison_ = 0;
      onChanged();
      return this;
    }

    private int outcome_ = 0;
    /**
     * <code>.SynchronizeFile.Outcome outcome = 5;</code>
     * @return The enum numeric value on the wire for outcome.
     */
    @java.lang.Override public int getOutcomeValue() {
      return outcome_;
    }
    /**
     * <code>.SynchronizeFile.Outcome outcome = 5;</code>
     * @param value The enum numeric value on the wire for outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcomeValue(int value) {
      
      outcome_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.SynchronizeFile.Outcome outcome = 5;</code>
     * @return The outcome.
     */
    @java.lang.Override
    public com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome getOutcome() {
      @SuppressWarnings("deprecation")
      com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome result = com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.valueOf(outcome_);
      return result == null ? com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome.UNRECOGNIZED : result;
    }
    /**
     * <code>.SynchronizeFile.Outcome outcome = 5;</code>
     * @param value The outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcome(com.android.build.gradle.internal.cxx.io.SynchronizeFile.Outcome value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      outcome_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SynchronizeFile.Outcome outcome = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutcome() {
      
      outcome_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EncodedSynchronizeFile)
  }

  // @@protoc_insertion_point(class_scope:EncodedSynchronizeFile)
  private static final com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile();
  }

  public static com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedSynchronizeFile>
      PARSER = new com.google.protobuf.AbstractParser<EncodedSynchronizeFile>() {
    @java.lang.Override
    public EncodedSynchronizeFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncodedSynchronizeFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncodedSynchronizeFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedSynchronizeFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.io.EncodedSynchronizeFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
