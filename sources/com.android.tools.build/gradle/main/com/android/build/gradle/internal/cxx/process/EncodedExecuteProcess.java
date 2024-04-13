// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_process.proto

package com.android.build.gradle.internal.cxx.process;

/**
 * <pre>
 **
 *String and string list encoded version of [ExecuteProcess].
 * </pre>
 *
 * Protobuf type {@code EncodedExecuteProcess}
 */
public final class EncodedExecuteProcess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedExecuteProcess)
    EncodedExecuteProcessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedExecuteProcess.newBuilder() to construct.
  private EncodedExecuteProcess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedExecuteProcess() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedExecuteProcess();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncodedExecuteProcess(
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

            executableId_ = input.readInt32();
            break;
          }
          case 16: {

            argsId_ = input.readInt32();
            break;
          }
          case 24: {

            descriptionId_ = input.readInt32();
            break;
          }
          case 32: {

            environmentKeysId_ = input.readInt32();
            break;
          }
          case 40: {

            environmentValuesId_ = input.readInt32();
            break;
          }
          case 48: {

            jvmClassPathId_ = input.readInt32();
            break;
          }
          case 56: {

            jvmMainClassId_ = input.readInt32();
            break;
          }
          case 64: {

            jvmArgsId_ = input.readInt32();
            break;
          }
          case 72: {

            exitCode_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.process.CxxProcess.internal_static_EncodedExecuteProcess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.process.CxxProcess.internal_static_EncodedExecuteProcess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.class, com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.Builder.class);
  }

  public static final int EXECUTABLE_ID_FIELD_NUMBER = 1;
  private int executableId_;
  /**
   * <code>int32 executable_id = 1;</code>
   * @return The executableId.
   */
  @java.lang.Override
  public int getExecutableId() {
    return executableId_;
  }

  public static final int ARGS_ID_FIELD_NUMBER = 2;
  private int argsId_;
  /**
   * <code>int32 args_id = 2;</code>
   * @return The argsId.
   */
  @java.lang.Override
  public int getArgsId() {
    return argsId_;
  }

  public static final int DESCRIPTION_ID_FIELD_NUMBER = 3;
  private int descriptionId_;
  /**
   * <code>int32 description_id = 3;</code>
   * @return The descriptionId.
   */
  @java.lang.Override
  public int getDescriptionId() {
    return descriptionId_;
  }

  public static final int ENVIRONMENT_KEYS_ID_FIELD_NUMBER = 4;
  private int environmentKeysId_;
  /**
   * <code>int32 environment_keys_id = 4;</code>
   * @return The environmentKeysId.
   */
  @java.lang.Override
  public int getEnvironmentKeysId() {
    return environmentKeysId_;
  }

  public static final int ENVIRONMENT_VALUES_ID_FIELD_NUMBER = 5;
  private int environmentValuesId_;
  /**
   * <code>int32 environment_values_id = 5;</code>
   * @return The environmentValuesId.
   */
  @java.lang.Override
  public int getEnvironmentValuesId() {
    return environmentValuesId_;
  }

  public static final int JVM_CLASS_PATH_ID_FIELD_NUMBER = 6;
  private int jvmClassPathId_;
  /**
   * <code>int32 jvm_class_path_id = 6;</code>
   * @return The jvmClassPathId.
   */
  @java.lang.Override
  public int getJvmClassPathId() {
    return jvmClassPathId_;
  }

  public static final int JVM_MAIN_CLASS_ID_FIELD_NUMBER = 7;
  private int jvmMainClassId_;
  /**
   * <code>int32 jvm_main_class_id = 7;</code>
   * @return The jvmMainClassId.
   */
  @java.lang.Override
  public int getJvmMainClassId() {
    return jvmMainClassId_;
  }

  public static final int JVM_ARGS_ID_FIELD_NUMBER = 8;
  private int jvmArgsId_;
  /**
   * <code>int32 jvm_args_id = 8;</code>
   * @return The jvmArgsId.
   */
  @java.lang.Override
  public int getJvmArgsId() {
    return jvmArgsId_;
  }

  public static final int EXIT_CODE_FIELD_NUMBER = 9;
  private int exitCode_;
  /**
   * <code>int32 exit_code = 9;</code>
   * @return The exitCode.
   */
  @java.lang.Override
  public int getExitCode() {
    return exitCode_;
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
    if (executableId_ != 0) {
      output.writeInt32(1, executableId_);
    }
    if (argsId_ != 0) {
      output.writeInt32(2, argsId_);
    }
    if (descriptionId_ != 0) {
      output.writeInt32(3, descriptionId_);
    }
    if (environmentKeysId_ != 0) {
      output.writeInt32(4, environmentKeysId_);
    }
    if (environmentValuesId_ != 0) {
      output.writeInt32(5, environmentValuesId_);
    }
    if (jvmClassPathId_ != 0) {
      output.writeInt32(6, jvmClassPathId_);
    }
    if (jvmMainClassId_ != 0) {
      output.writeInt32(7, jvmMainClassId_);
    }
    if (jvmArgsId_ != 0) {
      output.writeInt32(8, jvmArgsId_);
    }
    if (exitCode_ != 0) {
      output.writeInt32(9, exitCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (executableId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, executableId_);
    }
    if (argsId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, argsId_);
    }
    if (descriptionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, descriptionId_);
    }
    if (environmentKeysId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, environmentKeysId_);
    }
    if (environmentValuesId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, environmentValuesId_);
    }
    if (jvmClassPathId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, jvmClassPathId_);
    }
    if (jvmMainClassId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, jvmMainClassId_);
    }
    if (jvmArgsId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, jvmArgsId_);
    }
    if (exitCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, exitCode_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess other = (com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess) obj;

    if (getExecutableId()
        != other.getExecutableId()) return false;
    if (getArgsId()
        != other.getArgsId()) return false;
    if (getDescriptionId()
        != other.getDescriptionId()) return false;
    if (getEnvironmentKeysId()
        != other.getEnvironmentKeysId()) return false;
    if (getEnvironmentValuesId()
        != other.getEnvironmentValuesId()) return false;
    if (getJvmClassPathId()
        != other.getJvmClassPathId()) return false;
    if (getJvmMainClassId()
        != other.getJvmMainClassId()) return false;
    if (getJvmArgsId()
        != other.getJvmArgsId()) return false;
    if (getExitCode()
        != other.getExitCode()) return false;
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
    hash = (37 * hash) + EXECUTABLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExecutableId();
    hash = (37 * hash) + ARGS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getArgsId();
    hash = (37 * hash) + DESCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDescriptionId();
    hash = (37 * hash) + ENVIRONMENT_KEYS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironmentKeysId();
    hash = (37 * hash) + ENVIRONMENT_VALUES_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironmentValuesId();
    hash = (37 * hash) + JVM_CLASS_PATH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJvmClassPathId();
    hash = (37 * hash) + JVM_MAIN_CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJvmMainClassId();
    hash = (37 * hash) + JVM_ARGS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJvmArgsId();
    hash = (37 * hash) + EXIT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getExitCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess prototype) {
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
   *String and string list encoded version of [ExecuteProcess].
   * </pre>
   *
   * Protobuf type {@code EncodedExecuteProcess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedExecuteProcess)
      com.android.build.gradle.internal.cxx.process.EncodedExecuteProcessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.process.CxxProcess.internal_static_EncodedExecuteProcess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.process.CxxProcess.internal_static_EncodedExecuteProcess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.class, com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.newBuilder()
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
      executableId_ = 0;

      argsId_ = 0;

      descriptionId_ = 0;

      environmentKeysId_ = 0;

      environmentValuesId_ = 0;

      jvmClassPathId_ = 0;

      jvmMainClassId_ = 0;

      jvmArgsId_ = 0;

      exitCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.process.CxxProcess.internal_static_EncodedExecuteProcess_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess build() {
      com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess buildPartial() {
      com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess result = new com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess(this);
      result.executableId_ = executableId_;
      result.argsId_ = argsId_;
      result.descriptionId_ = descriptionId_;
      result.environmentKeysId_ = environmentKeysId_;
      result.environmentValuesId_ = environmentValuesId_;
      result.jvmClassPathId_ = jvmClassPathId_;
      result.jvmMainClassId_ = jvmMainClassId_;
      result.jvmArgsId_ = jvmArgsId_;
      result.exitCode_ = exitCode_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess) {
        return mergeFrom((com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess other) {
      if (other == com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess.getDefaultInstance()) return this;
      if (other.getExecutableId() != 0) {
        setExecutableId(other.getExecutableId());
      }
      if (other.getArgsId() != 0) {
        setArgsId(other.getArgsId());
      }
      if (other.getDescriptionId() != 0) {
        setDescriptionId(other.getDescriptionId());
      }
      if (other.getEnvironmentKeysId() != 0) {
        setEnvironmentKeysId(other.getEnvironmentKeysId());
      }
      if (other.getEnvironmentValuesId() != 0) {
        setEnvironmentValuesId(other.getEnvironmentValuesId());
      }
      if (other.getJvmClassPathId() != 0) {
        setJvmClassPathId(other.getJvmClassPathId());
      }
      if (other.getJvmMainClassId() != 0) {
        setJvmMainClassId(other.getJvmMainClassId());
      }
      if (other.getJvmArgsId() != 0) {
        setJvmArgsId(other.getJvmArgsId());
      }
      if (other.getExitCode() != 0) {
        setExitCode(other.getExitCode());
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
      com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int executableId_ ;
    /**
     * <code>int32 executable_id = 1;</code>
     * @return The executableId.
     */
    @java.lang.Override
    public int getExecutableId() {
      return executableId_;
    }
    /**
     * <code>int32 executable_id = 1;</code>
     * @param value The executableId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutableId(int value) {
      
      executableId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 executable_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutableId() {
      
      executableId_ = 0;
      onChanged();
      return this;
    }

    private int argsId_ ;
    /**
     * <code>int32 args_id = 2;</code>
     * @return The argsId.
     */
    @java.lang.Override
    public int getArgsId() {
      return argsId_;
    }
    /**
     * <code>int32 args_id = 2;</code>
     * @param value The argsId to set.
     * @return This builder for chaining.
     */
    public Builder setArgsId(int value) {
      
      argsId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 args_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgsId() {
      
      argsId_ = 0;
      onChanged();
      return this;
    }

    private int descriptionId_ ;
    /**
     * <code>int32 description_id = 3;</code>
     * @return The descriptionId.
     */
    @java.lang.Override
    public int getDescriptionId() {
      return descriptionId_;
    }
    /**
     * <code>int32 description_id = 3;</code>
     * @param value The descriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionId(int value) {
      
      descriptionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 description_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescriptionId() {
      
      descriptionId_ = 0;
      onChanged();
      return this;
    }

    private int environmentKeysId_ ;
    /**
     * <code>int32 environment_keys_id = 4;</code>
     * @return The environmentKeysId.
     */
    @java.lang.Override
    public int getEnvironmentKeysId() {
      return environmentKeysId_;
    }
    /**
     * <code>int32 environment_keys_id = 4;</code>
     * @param value The environmentKeysId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentKeysId(int value) {
      
      environmentKeysId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 environment_keys_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentKeysId() {
      
      environmentKeysId_ = 0;
      onChanged();
      return this;
    }

    private int environmentValuesId_ ;
    /**
     * <code>int32 environment_values_id = 5;</code>
     * @return The environmentValuesId.
     */
    @java.lang.Override
    public int getEnvironmentValuesId() {
      return environmentValuesId_;
    }
    /**
     * <code>int32 environment_values_id = 5;</code>
     * @param value The environmentValuesId to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentValuesId(int value) {
      
      environmentValuesId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 environment_values_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironmentValuesId() {
      
      environmentValuesId_ = 0;
      onChanged();
      return this;
    }

    private int jvmClassPathId_ ;
    /**
     * <code>int32 jvm_class_path_id = 6;</code>
     * @return The jvmClassPathId.
     */
    @java.lang.Override
    public int getJvmClassPathId() {
      return jvmClassPathId_;
    }
    /**
     * <code>int32 jvm_class_path_id = 6;</code>
     * @param value The jvmClassPathId to set.
     * @return This builder for chaining.
     */
    public Builder setJvmClassPathId(int value) {
      
      jvmClassPathId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jvm_class_path_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearJvmClassPathId() {
      
      jvmClassPathId_ = 0;
      onChanged();
      return this;
    }

    private int jvmMainClassId_ ;
    /**
     * <code>int32 jvm_main_class_id = 7;</code>
     * @return The jvmMainClassId.
     */
    @java.lang.Override
    public int getJvmMainClassId() {
      return jvmMainClassId_;
    }
    /**
     * <code>int32 jvm_main_class_id = 7;</code>
     * @param value The jvmMainClassId to set.
     * @return This builder for chaining.
     */
    public Builder setJvmMainClassId(int value) {
      
      jvmMainClassId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jvm_main_class_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearJvmMainClassId() {
      
      jvmMainClassId_ = 0;
      onChanged();
      return this;
    }

    private int jvmArgsId_ ;
    /**
     * <code>int32 jvm_args_id = 8;</code>
     * @return The jvmArgsId.
     */
    @java.lang.Override
    public int getJvmArgsId() {
      return jvmArgsId_;
    }
    /**
     * <code>int32 jvm_args_id = 8;</code>
     * @param value The jvmArgsId to set.
     * @return This builder for chaining.
     */
    public Builder setJvmArgsId(int value) {
      
      jvmArgsId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jvm_args_id = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearJvmArgsId() {
      
      jvmArgsId_ = 0;
      onChanged();
      return this;
    }

    private int exitCode_ ;
    /**
     * <code>int32 exit_code = 9;</code>
     * @return The exitCode.
     */
    @java.lang.Override
    public int getExitCode() {
      return exitCode_;
    }
    /**
     * <code>int32 exit_code = 9;</code>
     * @param value The exitCode to set.
     * @return This builder for chaining.
     */
    public Builder setExitCode(int value) {
      
      exitCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exit_code = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearExitCode() {
      
      exitCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EncodedExecuteProcess)
  }

  // @@protoc_insertion_point(class_scope:EncodedExecuteProcess)
  private static final com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess();
  }

  public static com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedExecuteProcess>
      PARSER = new com.google.protobuf.AbstractParser<EncodedExecuteProcess>() {
    @java.lang.Override
    public EncodedExecuteProcess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncodedExecuteProcess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncodedExecuteProcess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedExecuteProcess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.process.EncodedExecuteProcess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
