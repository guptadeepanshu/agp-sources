// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kotlin_multiplatform_android_models.proto

package com.android.kotlin.multiplatform.models;

/**
 * <pre>
 * The info of the unit test component of the android kotlin multiplatform target.
 * </pre>
 *
 * Protobuf type {@code UnitTestInfo}
 */
public final class UnitTestInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UnitTestInfo)
    UnitTestInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnitTestInfo.newBuilder() to construct.
  private UnitTestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnitTestInfo() {
    namespace_ = "";
    unitTestTaskName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnitTestInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.kotlin.multiplatform.models.KotlinMultiplatformAndroidModelsProto.internal_static_UnitTestInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.kotlin.multiplatform.models.KotlinMultiplatformAndroidModelsProto.internal_static_UnitTestInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.kotlin.multiplatform.models.UnitTestInfo.class, com.android.kotlin.multiplatform.models.UnitTestInfo.Builder.class);
  }

  private int bitField0_;
  public static final int NAMESPACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";
  /**
   * <code>optional string namespace = 1;</code>
   * @return Whether the namespace field is set.
   */
  @java.lang.Override
  public boolean hasNamespace() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string namespace = 1;</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <code>optional string namespace = 1;</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOCKABLE_PLATFORM_JAR_FIELD_NUMBER = 2;
  private com.android.builder.model.proto.ide.File mockablePlatformJar_;
  /**
   * <pre>
   * Path to the mockable platform generated jar if present.
   * </pre>
   *
   * <code>optional .File mockable_platform_jar = 2;</code>
   * @return Whether the mockablePlatformJar field is set.
   */
  @java.lang.Override
  public boolean hasMockablePlatformJar() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Path to the mockable platform generated jar if present.
   * </pre>
   *
   * <code>optional .File mockable_platform_jar = 2;</code>
   * @return The mockablePlatformJar.
   */
  @java.lang.Override
  public com.android.builder.model.proto.ide.File getMockablePlatformJar() {
    return mockablePlatformJar_ == null ? com.android.builder.model.proto.ide.File.getDefaultInstance() : mockablePlatformJar_;
  }
  /**
   * <pre>
   * Path to the mockable platform generated jar if present.
   * </pre>
   *
   * <code>optional .File mockable_platform_jar = 2;</code>
   */
  @java.lang.Override
  public com.android.builder.model.proto.ide.FileOrBuilder getMockablePlatformJarOrBuilder() {
    return mockablePlatformJar_ == null ? com.android.builder.model.proto.ide.File.getDefaultInstance() : mockablePlatformJar_;
  }

  public static final int UNIT_TEST_TASK_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object unitTestTaskName_ = "";
  /**
   * <pre>
   * name of the gradle task that runs the unit tests.
   * </pre>
   *
   * <code>optional string unit_test_task_name = 3;</code>
   * @return Whether the unitTestTaskName field is set.
   */
  @java.lang.Override
  public boolean hasUnitTestTaskName() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * name of the gradle task that runs the unit tests.
   * </pre>
   *
   * <code>optional string unit_test_task_name = 3;</code>
   * @return The unitTestTaskName.
   */
  @java.lang.Override
  public java.lang.String getUnitTestTaskName() {
    java.lang.Object ref = unitTestTaskName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unitTestTaskName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name of the gradle task that runs the unit tests.
   * </pre>
   *
   * <code>optional string unit_test_task_name = 3;</code>
   * @return The bytes for unitTestTaskName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnitTestTaskNameBytes() {
    java.lang.Object ref = unitTestTaskName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unitTestTaskName_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMockablePlatformJar());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unitTestTaskName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMockablePlatformJar());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unitTestTaskName_);
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
    if (!(obj instanceof com.android.kotlin.multiplatform.models.UnitTestInfo)) {
      return super.equals(obj);
    }
    com.android.kotlin.multiplatform.models.UnitTestInfo other = (com.android.kotlin.multiplatform.models.UnitTestInfo) obj;

    if (hasNamespace() != other.hasNamespace()) return false;
    if (hasNamespace()) {
      if (!getNamespace()
          .equals(other.getNamespace())) return false;
    }
    if (hasMockablePlatformJar() != other.hasMockablePlatformJar()) return false;
    if (hasMockablePlatformJar()) {
      if (!getMockablePlatformJar()
          .equals(other.getMockablePlatformJar())) return false;
    }
    if (hasUnitTestTaskName() != other.hasUnitTestTaskName()) return false;
    if (hasUnitTestTaskName()) {
      if (!getUnitTestTaskName()
          .equals(other.getUnitTestTaskName())) return false;
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
    if (hasNamespace()) {
      hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + getNamespace().hashCode();
    }
    if (hasMockablePlatformJar()) {
      hash = (37 * hash) + MOCKABLE_PLATFORM_JAR_FIELD_NUMBER;
      hash = (53 * hash) + getMockablePlatformJar().hashCode();
    }
    if (hasUnitTestTaskName()) {
      hash = (37 * hash) + UNIT_TEST_TASK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getUnitTestTaskName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.kotlin.multiplatform.models.UnitTestInfo parseFrom(
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
  public static Builder newBuilder(com.android.kotlin.multiplatform.models.UnitTestInfo prototype) {
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
   * The info of the unit test component of the android kotlin multiplatform target.
   * </pre>
   *
   * Protobuf type {@code UnitTestInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UnitTestInfo)
      com.android.kotlin.multiplatform.models.UnitTestInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.kotlin.multiplatform.models.KotlinMultiplatformAndroidModelsProto.internal_static_UnitTestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.kotlin.multiplatform.models.KotlinMultiplatformAndroidModelsProto.internal_static_UnitTestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.kotlin.multiplatform.models.UnitTestInfo.class, com.android.kotlin.multiplatform.models.UnitTestInfo.Builder.class);
    }

    // Construct using com.android.kotlin.multiplatform.models.UnitTestInfo.newBuilder()
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
        getMockablePlatformJarFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      namespace_ = "";
      mockablePlatformJar_ = null;
      if (mockablePlatformJarBuilder_ != null) {
        mockablePlatformJarBuilder_.dispose();
        mockablePlatformJarBuilder_ = null;
      }
      unitTestTaskName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.kotlin.multiplatform.models.KotlinMultiplatformAndroidModelsProto.internal_static_UnitTestInfo_descriptor;
    }

    @java.lang.Override
    public com.android.kotlin.multiplatform.models.UnitTestInfo getDefaultInstanceForType() {
      return com.android.kotlin.multiplatform.models.UnitTestInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.kotlin.multiplatform.models.UnitTestInfo build() {
      com.android.kotlin.multiplatform.models.UnitTestInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.kotlin.multiplatform.models.UnitTestInfo buildPartial() {
      com.android.kotlin.multiplatform.models.UnitTestInfo result = new com.android.kotlin.multiplatform.models.UnitTestInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.android.kotlin.multiplatform.models.UnitTestInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namespace_ = namespace_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mockablePlatformJar_ = mockablePlatformJarBuilder_ == null
            ? mockablePlatformJar_
            : mockablePlatformJarBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unitTestTaskName_ = unitTestTaskName_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.kotlin.multiplatform.models.UnitTestInfo) {
        return mergeFrom((com.android.kotlin.multiplatform.models.UnitTestInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.kotlin.multiplatform.models.UnitTestInfo other) {
      if (other == com.android.kotlin.multiplatform.models.UnitTestInfo.getDefaultInstance()) return this;
      if (other.hasNamespace()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMockablePlatformJar()) {
        mergeMockablePlatformJar(other.getMockablePlatformJar());
      }
      if (other.hasUnitTestTaskName()) {
        unitTestTaskName_ = other.unitTestTaskName_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 10: {
              namespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMockablePlatformJarFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              unitTestTaskName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object namespace_ = "";
    /**
     * <code>optional string namespace = 1;</code>
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string namespace = 1;</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string namespace = 1;</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string namespace = 1;</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string namespace = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string namespace = 1;</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.android.builder.model.proto.ide.File mockablePlatformJar_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.builder.model.proto.ide.File, com.android.builder.model.proto.ide.File.Builder, com.android.builder.model.proto.ide.FileOrBuilder> mockablePlatformJarBuilder_;
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     * @return Whether the mockablePlatformJar field is set.
     */
    public boolean hasMockablePlatformJar() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     * @return The mockablePlatformJar.
     */
    public com.android.builder.model.proto.ide.File getMockablePlatformJar() {
      if (mockablePlatformJarBuilder_ == null) {
        return mockablePlatformJar_ == null ? com.android.builder.model.proto.ide.File.getDefaultInstance() : mockablePlatformJar_;
      } else {
        return mockablePlatformJarBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public Builder setMockablePlatformJar(com.android.builder.model.proto.ide.File value) {
      if (mockablePlatformJarBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mockablePlatformJar_ = value;
      } else {
        mockablePlatformJarBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public Builder setMockablePlatformJar(
        com.android.builder.model.proto.ide.File.Builder builderForValue) {
      if (mockablePlatformJarBuilder_ == null) {
        mockablePlatformJar_ = builderForValue.build();
      } else {
        mockablePlatformJarBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public Builder mergeMockablePlatformJar(com.android.builder.model.proto.ide.File value) {
      if (mockablePlatformJarBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          mockablePlatformJar_ != null &&
          mockablePlatformJar_ != com.android.builder.model.proto.ide.File.getDefaultInstance()) {
          getMockablePlatformJarBuilder().mergeFrom(value);
        } else {
          mockablePlatformJar_ = value;
        }
      } else {
        mockablePlatformJarBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public Builder clearMockablePlatformJar() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mockablePlatformJar_ = null;
      if (mockablePlatformJarBuilder_ != null) {
        mockablePlatformJarBuilder_.dispose();
        mockablePlatformJarBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public com.android.builder.model.proto.ide.File.Builder getMockablePlatformJarBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMockablePlatformJarFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    public com.android.builder.model.proto.ide.FileOrBuilder getMockablePlatformJarOrBuilder() {
      if (mockablePlatformJarBuilder_ != null) {
        return mockablePlatformJarBuilder_.getMessageOrBuilder();
      } else {
        return mockablePlatformJar_ == null ?
            com.android.builder.model.proto.ide.File.getDefaultInstance() : mockablePlatformJar_;
      }
    }
    /**
     * <pre>
     * Path to the mockable platform generated jar if present.
     * </pre>
     *
     * <code>optional .File mockable_platform_jar = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.builder.model.proto.ide.File, com.android.builder.model.proto.ide.File.Builder, com.android.builder.model.proto.ide.FileOrBuilder> 
        getMockablePlatformJarFieldBuilder() {
      if (mockablePlatformJarBuilder_ == null) {
        mockablePlatformJarBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.builder.model.proto.ide.File, com.android.builder.model.proto.ide.File.Builder, com.android.builder.model.proto.ide.FileOrBuilder>(
                getMockablePlatformJar(),
                getParentForChildren(),
                isClean());
        mockablePlatformJar_ = null;
      }
      return mockablePlatformJarBuilder_;
    }

    private java.lang.Object unitTestTaskName_ = "";
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @return Whether the unitTestTaskName field is set.
     */
    public boolean hasUnitTestTaskName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @return The unitTestTaskName.
     */
    public java.lang.String getUnitTestTaskName() {
      java.lang.Object ref = unitTestTaskName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unitTestTaskName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @return The bytes for unitTestTaskName.
     */
    public com.google.protobuf.ByteString
        getUnitTestTaskNameBytes() {
      java.lang.Object ref = unitTestTaskName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unitTestTaskName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @param value The unitTestTaskName to set.
     * @return This builder for chaining.
     */
    public Builder setUnitTestTaskName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      unitTestTaskName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnitTestTaskName() {
      unitTestTaskName_ = getDefaultInstance().getUnitTestTaskName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the gradle task that runs the unit tests.
     * </pre>
     *
     * <code>optional string unit_test_task_name = 3;</code>
     * @param value The bytes for unitTestTaskName to set.
     * @return This builder for chaining.
     */
    public Builder setUnitTestTaskNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      unitTestTaskName_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:UnitTestInfo)
  }

  // @@protoc_insertion_point(class_scope:UnitTestInfo)
  private static final com.android.kotlin.multiplatform.models.UnitTestInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.kotlin.multiplatform.models.UnitTestInfo();
  }

  public static com.android.kotlin.multiplatform.models.UnitTestInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnitTestInfo>
      PARSER = new com.google.protobuf.AbstractParser<UnitTestInfo>() {
    @java.lang.Override
    public UnitTestInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnitTestInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnitTestInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.kotlin.multiplatform.models.UnitTestInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

