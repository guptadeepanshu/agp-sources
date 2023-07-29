// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_attribution.proto

package com.android.build.gradle.internal.cxx.attribution;

/**
 * <pre>
 **
 * Represents a single C/C++ build transformation. Typically, these are
 * compile from .cpp to .o and link from .o to .so. The only way to
 * differentiate these is by looking at output_file.
 * The ultimate source of this information is the .ninja_log file.
 * </pre>
 *
 * Protobuf type {@code BuildTaskAttribution}
 */
public final class BuildTaskAttribution extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BuildTaskAttribution)
    BuildTaskAttributionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildTaskAttribution.newBuilder() to construct.
  private BuildTaskAttribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildTaskAttribution() {
    outputFile_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildTaskAttribution();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuildTaskAttribution(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            outputFile_ = s;
            break;
          }
          case 24: {

            startTimeOffsetMs_ = input.readInt32();
            break;
          }
          case 32: {

            endTimeOffsetMs_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_BuildTaskAttribution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_BuildTaskAttribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.class, com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.Builder.class);
  }

  public static final int OUTPUT_FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object outputFile_;
  /**
   * <pre>
   * The output file, usually .o or .so, created by the build step
   * </pre>
   *
   * <code>string output_file = 1;</code>
   * @return The outputFile.
   */
  @java.lang.Override
  public java.lang.String getOutputFile() {
    java.lang.Object ref = outputFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputFile_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The output file, usually .o or .so, created by the build step
   * </pre>
   *
   * <code>string output_file = 1;</code>
   * @return The bytes for outputFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputFileBytes() {
    java.lang.Object ref = outputFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_TIME_OFFSET_MS_FIELD_NUMBER = 3;
  private int startTimeOffsetMs_;
  /**
   * <pre>
   * Start time offset in milliseconds of this single build task.
   * Relative to BuildTaskAttribution#build_start_time_ms.
   * </pre>
   *
   * <code>int32 start_time_offset_ms = 3;</code>
   * @return The startTimeOffsetMs.
   */
  @java.lang.Override
  public int getStartTimeOffsetMs() {
    return startTimeOffsetMs_;
  }

  public static final int END_TIME_OFFSET_MS_FIELD_NUMBER = 4;
  private int endTimeOffsetMs_;
  /**
   * <pre>
   * End time offset in milliseconds
   * </pre>
   *
   * <code>int32 end_time_offset_ms = 4;</code>
   * @return The endTimeOffsetMs.
   */
  @java.lang.Override
  public int getEndTimeOffsetMs() {
    return endTimeOffsetMs_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputFile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputFile_);
    }
    if (startTimeOffsetMs_ != 0) {
      output.writeInt32(3, startTimeOffsetMs_);
    }
    if (endTimeOffsetMs_ != 0) {
      output.writeInt32(4, endTimeOffsetMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputFile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputFile_);
    }
    if (startTimeOffsetMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, startTimeOffsetMs_);
    }
    if (endTimeOffsetMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, endTimeOffsetMs_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution other = (com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution) obj;

    if (!getOutputFile()
        .equals(other.getOutputFile())) return false;
    if (getStartTimeOffsetMs()
        != other.getStartTimeOffsetMs()) return false;
    if (getEndTimeOffsetMs()
        != other.getEndTimeOffsetMs()) return false;
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
    hash = (37 * hash) + OUTPUT_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getOutputFile().hashCode();
    hash = (37 * hash) + START_TIME_OFFSET_MS_FIELD_NUMBER;
    hash = (53 * hash) + getStartTimeOffsetMs();
    hash = (37 * hash) + END_TIME_OFFSET_MS_FIELD_NUMBER;
    hash = (53 * hash) + getEndTimeOffsetMs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution prototype) {
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
   * Represents a single C/C++ build transformation. Typically, these are
   * compile from .cpp to .o and link from .o to .so. The only way to
   * differentiate these is by looking at output_file.
   * The ultimate source of this information is the .ninja_log file.
   * </pre>
   *
   * Protobuf type {@code BuildTaskAttribution}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BuildTaskAttribution)
      com.android.build.gradle.internal.cxx.attribution.BuildTaskAttributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_BuildTaskAttribution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_BuildTaskAttribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.class, com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.newBuilder()
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
      outputFile_ = "";

      startTimeOffsetMs_ = 0;

      endTimeOffsetMs_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.attribution.CxxAttribution.internal_static_BuildTaskAttribution_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution build() {
      com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution buildPartial() {
      com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution result = new com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution(this);
      result.outputFile_ = outputFile_;
      result.startTimeOffsetMs_ = startTimeOffsetMs_;
      result.endTimeOffsetMs_ = endTimeOffsetMs_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution) {
        return mergeFrom((com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution other) {
      if (other == com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution.getDefaultInstance()) return this;
      if (!other.getOutputFile().isEmpty()) {
        outputFile_ = other.outputFile_;
        onChanged();
      }
      if (other.getStartTimeOffsetMs() != 0) {
        setStartTimeOffsetMs(other.getStartTimeOffsetMs());
      }
      if (other.getEndTimeOffsetMs() != 0) {
        setEndTimeOffsetMs(other.getEndTimeOffsetMs());
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
      com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outputFile_ = "";
    /**
     * <pre>
     * The output file, usually .o or .so, created by the build step
     * </pre>
     *
     * <code>string output_file = 1;</code>
     * @return The outputFile.
     */
    public java.lang.String getOutputFile() {
      java.lang.Object ref = outputFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputFile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The output file, usually .o or .so, created by the build step
     * </pre>
     *
     * <code>string output_file = 1;</code>
     * @return The bytes for outputFile.
     */
    public com.google.protobuf.ByteString
        getOutputFileBytes() {
      java.lang.Object ref = outputFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The output file, usually .o or .so, created by the build step
     * </pre>
     *
     * <code>string output_file = 1;</code>
     * @param value The outputFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output file, usually .o or .so, created by the build step
     * </pre>
     *
     * <code>string output_file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputFile() {
      
      outputFile_ = getDefaultInstance().getOutputFile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output file, usually .o or .so, created by the build step
     * </pre>
     *
     * <code>string output_file = 1;</code>
     * @param value The bytes for outputFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputFile_ = value;
      onChanged();
      return this;
    }

    private int startTimeOffsetMs_ ;
    /**
     * <pre>
     * Start time offset in milliseconds of this single build task.
     * Relative to BuildTaskAttribution#build_start_time_ms.
     * </pre>
     *
     * <code>int32 start_time_offset_ms = 3;</code>
     * @return The startTimeOffsetMs.
     */
    @java.lang.Override
    public int getStartTimeOffsetMs() {
      return startTimeOffsetMs_;
    }
    /**
     * <pre>
     * Start time offset in milliseconds of this single build task.
     * Relative to BuildTaskAttribution#build_start_time_ms.
     * </pre>
     *
     * <code>int32 start_time_offset_ms = 3;</code>
     * @param value The startTimeOffsetMs to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeOffsetMs(int value) {
      
      startTimeOffsetMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start time offset in milliseconds of this single build task.
     * Relative to BuildTaskAttribution#build_start_time_ms.
     * </pre>
     *
     * <code>int32 start_time_offset_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimeOffsetMs() {
      
      startTimeOffsetMs_ = 0;
      onChanged();
      return this;
    }

    private int endTimeOffsetMs_ ;
    /**
     * <pre>
     * End time offset in milliseconds
     * </pre>
     *
     * <code>int32 end_time_offset_ms = 4;</code>
     * @return The endTimeOffsetMs.
     */
    @java.lang.Override
    public int getEndTimeOffsetMs() {
      return endTimeOffsetMs_;
    }
    /**
     * <pre>
     * End time offset in milliseconds
     * </pre>
     *
     * <code>int32 end_time_offset_ms = 4;</code>
     * @param value The endTimeOffsetMs to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeOffsetMs(int value) {
      
      endTimeOffsetMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * End time offset in milliseconds
     * </pre>
     *
     * <code>int32 end_time_offset_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTimeOffsetMs() {
      
      endTimeOffsetMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BuildTaskAttribution)
  }

  // @@protoc_insertion_point(class_scope:BuildTaskAttribution)
  private static final com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution();
  }

  public static com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildTaskAttribution>
      PARSER = new com.google.protobuf.AbstractParser<BuildTaskAttribution>() {
    @java.lang.Override
    public BuildTaskAttribution parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuildTaskAttribution(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildTaskAttribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildTaskAttribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.attribution.BuildTaskAttribution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

