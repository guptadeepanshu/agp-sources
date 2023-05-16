// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Data of a gradle plugin.
 * </pre>
 *
 * Protobuf type {@code android_studio.GradlePluginData}
 */
public final class GradlePluginData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.GradlePluginData)
    GradlePluginDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GradlePluginData.newBuilder() to construct.
  private GradlePluginData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GradlePluginData() {
    className_ = "";
    jarName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GradlePluginData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GradlePluginData(
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
            className_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            jarName_ = bs;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GradlePluginData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GradlePluginData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.GradlePluginData.class, com.google.wireless.android.sdk.stats.GradlePluginData.Builder.class);
  }

  private int bitField0_;
  public static final int CLASS_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object className_;
  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return Whether the className field is set.
   */
  @java.lang.Override
  public boolean hasClassName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return The className.
   */
  @java.lang.Override
  public java.lang.String getClassName() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        className_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return The bytes for className.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassNameBytes() {
    java.lang.Object ref = className_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      className_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JAR_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object jarName_;
  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return Whether the jarName field is set.
   */
  @java.lang.Override
  public boolean hasJarName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return The jarName.
   */
  @java.lang.Override
  public java.lang.String getJarName() {
    java.lang.Object ref = jarName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        jarName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return The bytes for jarName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJarNameBytes() {
    java.lang.Object ref = jarName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jarName_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, className_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jarName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, className_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jarName_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.GradlePluginData)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.GradlePluginData other = (com.google.wireless.android.sdk.stats.GradlePluginData) obj;

    if (hasClassName() != other.hasClassName()) return false;
    if (hasClassName()) {
      if (!getClassName()
          .equals(other.getClassName())) return false;
    }
    if (hasJarName() != other.hasJarName()) return false;
    if (hasJarName()) {
      if (!getJarName()
          .equals(other.getJarName())) return false;
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
    if (hasClassName()) {
      hash = (37 * hash) + CLASS_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getClassName().hashCode();
    }
    if (hasJarName()) {
      hash = (37 * hash) + JAR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getJarName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.GradlePluginData parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.GradlePluginData prototype) {
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
   * Data of a gradle plugin.
   * </pre>
   *
   * Protobuf type {@code android_studio.GradlePluginData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.GradlePluginData)
      com.google.wireless.android.sdk.stats.GradlePluginDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GradlePluginData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GradlePluginData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.GradlePluginData.class, com.google.wireless.android.sdk.stats.GradlePluginData.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.GradlePluginData.newBuilder()
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
      className_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      jarName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_GradlePluginData_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GradlePluginData getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.GradlePluginData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GradlePluginData build() {
      com.google.wireless.android.sdk.stats.GradlePluginData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.GradlePluginData buildPartial() {
      com.google.wireless.android.sdk.stats.GradlePluginData result = new com.google.wireless.android.sdk.stats.GradlePluginData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.className_ = className_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.jarName_ = jarName_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.GradlePluginData) {
        return mergeFrom((com.google.wireless.android.sdk.stats.GradlePluginData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.GradlePluginData other) {
      if (other == com.google.wireless.android.sdk.stats.GradlePluginData.getDefaultInstance()) return this;
      if (other.hasClassName()) {
        bitField0_ |= 0x00000001;
        className_ = other.className_;
        onChanged();
      }
      if (other.hasJarName()) {
        bitField0_ |= 0x00000002;
        jarName_ = other.jarName_;
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
      com.google.wireless.android.sdk.stats.GradlePluginData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.GradlePluginData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object className_ = "";
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @return Whether the className field is set.
     */
    public boolean hasClassName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @return The className.
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          className_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @return The bytes for className.
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @param value The className to set.
     * @return This builder for chaining.
     */
    public Builder setClassName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      className_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClassName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      className_ = getDefaultInstance().getClassName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
     * </pre>
     *
     * <code>optional string class_name = 1;</code>
     * @param value The bytes for className to set.
     * @return This builder for chaining.
     */
    public Builder setClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      className_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jarName_ = "";
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @return Whether the jarName field is set.
     */
    public boolean hasJarName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @return The jarName.
     */
    public java.lang.String getJarName() {
      java.lang.Object ref = jarName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          jarName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @return The bytes for jarName.
     */
    public com.google.protobuf.ByteString
        getJarNameBytes() {
      java.lang.Object ref = jarName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jarName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @param value The jarName to set.
     * @return This builder for chaining.
     */
    public Builder setJarName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      jarName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJarName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      jarName_ = getDefaultInstance().getJarName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the jar containing the plugin class, will be on the form:
     * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
     * </pre>
     *
     * <code>optional string jar_name = 2;</code>
     * @param value The bytes for jarName to set.
     * @return This builder for chaining.
     */
    public Builder setJarNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      jarName_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.GradlePluginData)
  }

  // @@protoc_insertion_point(class_scope:android_studio.GradlePluginData)
  private static final com.google.wireless.android.sdk.stats.GradlePluginData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.GradlePluginData();
  }

  public static com.google.wireless.android.sdk.stats.GradlePluginData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GradlePluginData>
      PARSER = new com.google.protobuf.AbstractParser<GradlePluginData>() {
    @java.lang.Override
    public GradlePluginData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GradlePluginData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GradlePluginData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GradlePluginData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.GradlePluginData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

