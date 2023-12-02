// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_configure.proto

package com.android.build.gradle.internal.cxx.configure;

/**
 * Protobuf type {@code EncodedNativeModelBuilderOutcome}
 */
public final class EncodedNativeModelBuilderOutcome extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EncodedNativeModelBuilderOutcome)
    EncodedNativeModelBuilderOutcomeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncodedNativeModelBuilderOutcome.newBuilder() to construct.
  private EncodedNativeModelBuilderOutcome(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncodedNativeModelBuilderOutcome() {
    outcome_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncodedNativeModelBuilderOutcome();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncodedNativeModelBuilderOutcome(
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
            int rawValue = input.readEnum();

            outcome_ = rawValue;
            break;
          }
          case 16: {

            gradlePath_ = input.readInt32();
            break;
          }
          case 24: {

            requestedAbis_ = input.readInt32();
            break;
          }
          case 32: {

            requestedVariants_ = input.readInt32();
            break;
          }
          case 40: {

            availableVariantAbis_ = input.readInt32();
            break;
          }
          case 48: {

            successfullyConfiguredVariantAbis_ = input.readInt32();
            break;
          }
          case 56: {

            failedConfigureVariantAbis_ = input.readInt32();
            break;
          }
          case 64: {

            failedConfigureMessages_ = input.readInt32();
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
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedNativeModelBuilderOutcome_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedNativeModelBuilderOutcome_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.class, com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.Builder.class);
  }

  public static final int OUTCOME_FIELD_NUMBER = 1;
  private int outcome_;
  /**
   * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
   * @return The enum numeric value on the wire for outcome.
   */
  @java.lang.Override public int getOutcomeValue() {
    return outcome_;
  }
  /**
   * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
   * @return The outcome.
   */
  @java.lang.Override public com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome getOutcome() {
    @SuppressWarnings("deprecation")
    com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome result = com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.valueOf(outcome_);
    return result == null ? com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.UNRECOGNIZED : result;
  }

  public static final int GRADLE_PATH_FIELD_NUMBER = 2;
  private int gradlePath_;
  /**
   * <code>int32 gradle_path = 2;</code>
   * @return The gradlePath.
   */
  @java.lang.Override
  public int getGradlePath() {
    return gradlePath_;
  }

  public static final int REQUESTED_ABIS_FIELD_NUMBER = 3;
  private int requestedAbis_;
  /**
   * <code>int32 requested_abis = 3;</code>
   * @return The requestedAbis.
   */
  @java.lang.Override
  public int getRequestedAbis() {
    return requestedAbis_;
  }

  public static final int REQUESTED_VARIANTS_FIELD_NUMBER = 4;
  private int requestedVariants_;
  /**
   * <code>int32 requested_variants = 4;</code>
   * @return The requestedVariants.
   */
  @java.lang.Override
  public int getRequestedVariants() {
    return requestedVariants_;
  }

  public static final int AVAILABLE_VARIANT_ABIS_FIELD_NUMBER = 5;
  private int availableVariantAbis_;
  /**
   * <code>int32 available_variant_abis = 5;</code>
   * @return The availableVariantAbis.
   */
  @java.lang.Override
  public int getAvailableVariantAbis() {
    return availableVariantAbis_;
  }

  public static final int SUCCESSFULLY_CONFIGURED_VARIANT_ABIS_FIELD_NUMBER = 6;
  private int successfullyConfiguredVariantAbis_;
  /**
   * <code>int32 successfully_configured_variant_abis = 6;</code>
   * @return The successfullyConfiguredVariantAbis.
   */
  @java.lang.Override
  public int getSuccessfullyConfiguredVariantAbis() {
    return successfullyConfiguredVariantAbis_;
  }

  public static final int FAILED_CONFIGURE_VARIANT_ABIS_FIELD_NUMBER = 7;
  private int failedConfigureVariantAbis_;
  /**
   * <code>int32 failed_configure_variant_abis = 7;</code>
   * @return The failedConfigureVariantAbis.
   */
  @java.lang.Override
  public int getFailedConfigureVariantAbis() {
    return failedConfigureVariantAbis_;
  }

  public static final int FAILED_CONFIGURE_MESSAGES_FIELD_NUMBER = 8;
  private int failedConfigureMessages_;
  /**
   * <code>int32 failed_configure_messages = 8;</code>
   * @return The failedConfigureMessages.
   */
  @java.lang.Override
  public int getFailedConfigureMessages() {
    return failedConfigureMessages_;
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
    if (outcome_ != com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.UNKNOWN.getNumber()) {
      output.writeEnum(1, outcome_);
    }
    if (gradlePath_ != 0) {
      output.writeInt32(2, gradlePath_);
    }
    if (requestedAbis_ != 0) {
      output.writeInt32(3, requestedAbis_);
    }
    if (requestedVariants_ != 0) {
      output.writeInt32(4, requestedVariants_);
    }
    if (availableVariantAbis_ != 0) {
      output.writeInt32(5, availableVariantAbis_);
    }
    if (successfullyConfiguredVariantAbis_ != 0) {
      output.writeInt32(6, successfullyConfiguredVariantAbis_);
    }
    if (failedConfigureVariantAbis_ != 0) {
      output.writeInt32(7, failedConfigureVariantAbis_);
    }
    if (failedConfigureMessages_ != 0) {
      output.writeInt32(8, failedConfigureMessages_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (outcome_ != com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, outcome_);
    }
    if (gradlePath_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, gradlePath_);
    }
    if (requestedAbis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, requestedAbis_);
    }
    if (requestedVariants_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, requestedVariants_);
    }
    if (availableVariantAbis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, availableVariantAbis_);
    }
    if (successfullyConfiguredVariantAbis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, successfullyConfiguredVariantAbis_);
    }
    if (failedConfigureVariantAbis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, failedConfigureVariantAbis_);
    }
    if (failedConfigureMessages_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, failedConfigureMessages_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome other = (com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome) obj;

    if (outcome_ != other.outcome_) return false;
    if (getGradlePath()
        != other.getGradlePath()) return false;
    if (getRequestedAbis()
        != other.getRequestedAbis()) return false;
    if (getRequestedVariants()
        != other.getRequestedVariants()) return false;
    if (getAvailableVariantAbis()
        != other.getAvailableVariantAbis()) return false;
    if (getSuccessfullyConfiguredVariantAbis()
        != other.getSuccessfullyConfiguredVariantAbis()) return false;
    if (getFailedConfigureVariantAbis()
        != other.getFailedConfigureVariantAbis()) return false;
    if (getFailedConfigureMessages()
        != other.getFailedConfigureMessages()) return false;
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
    hash = (37 * hash) + OUTCOME_FIELD_NUMBER;
    hash = (53 * hash) + outcome_;
    hash = (37 * hash) + GRADLE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getGradlePath();
    hash = (37 * hash) + REQUESTED_ABIS_FIELD_NUMBER;
    hash = (53 * hash) + getRequestedAbis();
    hash = (37 * hash) + REQUESTED_VARIANTS_FIELD_NUMBER;
    hash = (53 * hash) + getRequestedVariants();
    hash = (37 * hash) + AVAILABLE_VARIANT_ABIS_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableVariantAbis();
    hash = (37 * hash) + SUCCESSFULLY_CONFIGURED_VARIANT_ABIS_FIELD_NUMBER;
    hash = (53 * hash) + getSuccessfullyConfiguredVariantAbis();
    hash = (37 * hash) + FAILED_CONFIGURE_VARIANT_ABIS_FIELD_NUMBER;
    hash = (53 * hash) + getFailedConfigureVariantAbis();
    hash = (37 * hash) + FAILED_CONFIGURE_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + getFailedConfigureMessages();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome prototype) {
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
   * Protobuf type {@code EncodedNativeModelBuilderOutcome}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EncodedNativeModelBuilderOutcome)
      com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcomeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedNativeModelBuilderOutcome_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedNativeModelBuilderOutcome_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.class, com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.newBuilder()
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
      outcome_ = 0;

      gradlePath_ = 0;

      requestedAbis_ = 0;

      requestedVariants_ = 0;

      availableVariantAbis_ = 0;

      successfullyConfiguredVariantAbis_ = 0;

      failedConfigureVariantAbis_ = 0;

      failedConfigureMessages_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.configure.CxxConfigure.internal_static_EncodedNativeModelBuilderOutcome_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome build() {
      com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome buildPartial() {
      com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome result = new com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome(this);
      result.outcome_ = outcome_;
      result.gradlePath_ = gradlePath_;
      result.requestedAbis_ = requestedAbis_;
      result.requestedVariants_ = requestedVariants_;
      result.availableVariantAbis_ = availableVariantAbis_;
      result.successfullyConfiguredVariantAbis_ = successfullyConfiguredVariantAbis_;
      result.failedConfigureVariantAbis_ = failedConfigureVariantAbis_;
      result.failedConfigureMessages_ = failedConfigureMessages_;
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
      if (other instanceof com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome) {
        return mergeFrom((com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome other) {
      if (other == com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome.getDefaultInstance()) return this;
      if (other.outcome_ != 0) {
        setOutcomeValue(other.getOutcomeValue());
      }
      if (other.getGradlePath() != 0) {
        setGradlePath(other.getGradlePath());
      }
      if (other.getRequestedAbis() != 0) {
        setRequestedAbis(other.getRequestedAbis());
      }
      if (other.getRequestedVariants() != 0) {
        setRequestedVariants(other.getRequestedVariants());
      }
      if (other.getAvailableVariantAbis() != 0) {
        setAvailableVariantAbis(other.getAvailableVariantAbis());
      }
      if (other.getSuccessfullyConfiguredVariantAbis() != 0) {
        setSuccessfullyConfiguredVariantAbis(other.getSuccessfullyConfiguredVariantAbis());
      }
      if (other.getFailedConfigureVariantAbis() != 0) {
        setFailedConfigureVariantAbis(other.getFailedConfigureVariantAbis());
      }
      if (other.getFailedConfigureMessages() != 0) {
        setFailedConfigureMessages(other.getFailedConfigureMessages());
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
      com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int outcome_ = 0;
    /**
     * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
     * @return The enum numeric value on the wire for outcome.
     */
    @java.lang.Override public int getOutcomeValue() {
      return outcome_;
    }
    /**
     * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
     * @param value The enum numeric value on the wire for outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcomeValue(int value) {
      
      outcome_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
     * @return The outcome.
     */
    @java.lang.Override
    public com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome getOutcome() {
      @SuppressWarnings("deprecation")
      com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome result = com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.valueOf(outcome_);
      return result == null ? com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome.UNRECOGNIZED : result;
    }
    /**
     * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
     * @param value The outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcome(com.android.build.gradle.internal.cxx.configure.NativeModelBuilderOutcome.Outcome value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      outcome_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.NativeModelBuilderOutcome.Outcome outcome = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutcome() {
      
      outcome_ = 0;
      onChanged();
      return this;
    }

    private int gradlePath_ ;
    /**
     * <code>int32 gradle_path = 2;</code>
     * @return The gradlePath.
     */
    @java.lang.Override
    public int getGradlePath() {
      return gradlePath_;
    }
    /**
     * <code>int32 gradle_path = 2;</code>
     * @param value The gradlePath to set.
     * @return This builder for chaining.
     */
    public Builder setGradlePath(int value) {
      
      gradlePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gradle_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGradlePath() {
      
      gradlePath_ = 0;
      onChanged();
      return this;
    }

    private int requestedAbis_ ;
    /**
     * <code>int32 requested_abis = 3;</code>
     * @return The requestedAbis.
     */
    @java.lang.Override
    public int getRequestedAbis() {
      return requestedAbis_;
    }
    /**
     * <code>int32 requested_abis = 3;</code>
     * @param value The requestedAbis to set.
     * @return This builder for chaining.
     */
    public Builder setRequestedAbis(int value) {
      
      requestedAbis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 requested_abis = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestedAbis() {
      
      requestedAbis_ = 0;
      onChanged();
      return this;
    }

    private int requestedVariants_ ;
    /**
     * <code>int32 requested_variants = 4;</code>
     * @return The requestedVariants.
     */
    @java.lang.Override
    public int getRequestedVariants() {
      return requestedVariants_;
    }
    /**
     * <code>int32 requested_variants = 4;</code>
     * @param value The requestedVariants to set.
     * @return This builder for chaining.
     */
    public Builder setRequestedVariants(int value) {
      
      requestedVariants_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 requested_variants = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestedVariants() {
      
      requestedVariants_ = 0;
      onChanged();
      return this;
    }

    private int availableVariantAbis_ ;
    /**
     * <code>int32 available_variant_abis = 5;</code>
     * @return The availableVariantAbis.
     */
    @java.lang.Override
    public int getAvailableVariantAbis() {
      return availableVariantAbis_;
    }
    /**
     * <code>int32 available_variant_abis = 5;</code>
     * @param value The availableVariantAbis to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableVariantAbis(int value) {
      
      availableVariantAbis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 available_variant_abis = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableVariantAbis() {
      
      availableVariantAbis_ = 0;
      onChanged();
      return this;
    }

    private int successfullyConfiguredVariantAbis_ ;
    /**
     * <code>int32 successfully_configured_variant_abis = 6;</code>
     * @return The successfullyConfiguredVariantAbis.
     */
    @java.lang.Override
    public int getSuccessfullyConfiguredVariantAbis() {
      return successfullyConfiguredVariantAbis_;
    }
    /**
     * <code>int32 successfully_configured_variant_abis = 6;</code>
     * @param value The successfullyConfiguredVariantAbis to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfullyConfiguredVariantAbis(int value) {
      
      successfullyConfiguredVariantAbis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 successfully_configured_variant_abis = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccessfullyConfiguredVariantAbis() {
      
      successfullyConfiguredVariantAbis_ = 0;
      onChanged();
      return this;
    }

    private int failedConfigureVariantAbis_ ;
    /**
     * <code>int32 failed_configure_variant_abis = 7;</code>
     * @return The failedConfigureVariantAbis.
     */
    @java.lang.Override
    public int getFailedConfigureVariantAbis() {
      return failedConfigureVariantAbis_;
    }
    /**
     * <code>int32 failed_configure_variant_abis = 7;</code>
     * @param value The failedConfigureVariantAbis to set.
     * @return This builder for chaining.
     */
    public Builder setFailedConfigureVariantAbis(int value) {
      
      failedConfigureVariantAbis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 failed_configure_variant_abis = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedConfigureVariantAbis() {
      
      failedConfigureVariantAbis_ = 0;
      onChanged();
      return this;
    }

    private int failedConfigureMessages_ ;
    /**
     * <code>int32 failed_configure_messages = 8;</code>
     * @return The failedConfigureMessages.
     */
    @java.lang.Override
    public int getFailedConfigureMessages() {
      return failedConfigureMessages_;
    }
    /**
     * <code>int32 failed_configure_messages = 8;</code>
     * @param value The failedConfigureMessages to set.
     * @return This builder for chaining.
     */
    public Builder setFailedConfigureMessages(int value) {
      
      failedConfigureMessages_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 failed_configure_messages = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedConfigureMessages() {
      
      failedConfigureMessages_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EncodedNativeModelBuilderOutcome)
  }

  // @@protoc_insertion_point(class_scope:EncodedNativeModelBuilderOutcome)
  private static final com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome();
  }

  public static com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncodedNativeModelBuilderOutcome>
      PARSER = new com.google.protobuf.AbstractParser<EncodedNativeModelBuilderOutcome>() {
    @java.lang.Override
    public EncodedNativeModelBuilderOutcome parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncodedNativeModelBuilderOutcome(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncodedNativeModelBuilderOutcome> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncodedNativeModelBuilderOutcome> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.configure.EncodedNativeModelBuilderOutcome getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

