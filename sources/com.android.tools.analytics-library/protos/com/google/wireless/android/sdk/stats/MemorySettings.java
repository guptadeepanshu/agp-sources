// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.MemorySettings}
 */
public final class MemorySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.MemorySettings)
    MemorySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemorySettings.newBuilder() to construct.
  private MemorySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemorySettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemorySettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MemorySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MemorySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.MemorySettings.class, com.google.wireless.android.sdk.stats.MemorySettings.Builder.class);
  }

  private int bitField0_;
  public static final int IDE_XMX_FIELD_NUMBER = 1;
  private int ideXmx_ = 0;
  /**
   * <code>optional int32 ide_xmx = 1;</code>
   * @return Whether the ideXmx field is set.
   */
  @java.lang.Override
  public boolean hasIdeXmx() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 ide_xmx = 1;</code>
   * @return The ideXmx.
   */
  @java.lang.Override
  public int getIdeXmx() {
    return ideXmx_;
  }

  public static final int GRADLE_DAEMON_XMX_FIELD_NUMBER = 2;
  private int gradleDaemonXmx_ = 0;
  /**
   * <code>optional int32 gradle_daemon_xmx = 2;</code>
   * @return Whether the gradleDaemonXmx field is set.
   */
  @java.lang.Override
  public boolean hasGradleDaemonXmx() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 gradle_daemon_xmx = 2;</code>
   * @return The gradleDaemonXmx.
   */
  @java.lang.Override
  public int getGradleDaemonXmx() {
    return gradleDaemonXmx_;
  }

  public static final int KOTLIN_DAEMON_XMX_FIELD_NUMBER = 3;
  private int kotlinDaemonXmx_ = 0;
  /**
   * <code>optional int32 kotlin_daemon_xmx = 3;</code>
   * @return Whether the kotlinDaemonXmx field is set.
   */
  @java.lang.Override
  public boolean hasKotlinDaemonXmx() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 kotlin_daemon_xmx = 3;</code>
   * @return The kotlinDaemonXmx.
   */
  @java.lang.Override
  public int getKotlinDaemonXmx() {
    return kotlinDaemonXmx_;
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
      output.writeInt32(1, ideXmx_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, gradleDaemonXmx_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, kotlinDaemonXmx_);
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
        .computeInt32Size(1, ideXmx_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, gradleDaemonXmx_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, kotlinDaemonXmx_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.MemorySettings)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.MemorySettings other = (com.google.wireless.android.sdk.stats.MemorySettings) obj;

    if (hasIdeXmx() != other.hasIdeXmx()) return false;
    if (hasIdeXmx()) {
      if (getIdeXmx()
          != other.getIdeXmx()) return false;
    }
    if (hasGradleDaemonXmx() != other.hasGradleDaemonXmx()) return false;
    if (hasGradleDaemonXmx()) {
      if (getGradleDaemonXmx()
          != other.getGradleDaemonXmx()) return false;
    }
    if (hasKotlinDaemonXmx() != other.hasKotlinDaemonXmx()) return false;
    if (hasKotlinDaemonXmx()) {
      if (getKotlinDaemonXmx()
          != other.getKotlinDaemonXmx()) return false;
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
    if (hasIdeXmx()) {
      hash = (37 * hash) + IDE_XMX_FIELD_NUMBER;
      hash = (53 * hash) + getIdeXmx();
    }
    if (hasGradleDaemonXmx()) {
      hash = (37 * hash) + GRADLE_DAEMON_XMX_FIELD_NUMBER;
      hash = (53 * hash) + getGradleDaemonXmx();
    }
    if (hasKotlinDaemonXmx()) {
      hash = (37 * hash) + KOTLIN_DAEMON_XMX_FIELD_NUMBER;
      hash = (53 * hash) + getKotlinDaemonXmx();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.MemorySettings parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.MemorySettings prototype) {
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
   * Protobuf type {@code android_studio.MemorySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.MemorySettings)
      com.google.wireless.android.sdk.stats.MemorySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MemorySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MemorySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.MemorySettings.class, com.google.wireless.android.sdk.stats.MemorySettings.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.MemorySettings.newBuilder()
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
      ideXmx_ = 0;
      gradleDaemonXmx_ = 0;
      kotlinDaemonXmx_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_MemorySettings_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MemorySettings getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.MemorySettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MemorySettings build() {
      com.google.wireless.android.sdk.stats.MemorySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.MemorySettings buildPartial() {
      com.google.wireless.android.sdk.stats.MemorySettings result = new com.google.wireless.android.sdk.stats.MemorySettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.MemorySettings result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ideXmx_ = ideXmx_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gradleDaemonXmx_ = gradleDaemonXmx_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.kotlinDaemonXmx_ = kotlinDaemonXmx_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.MemorySettings) {
        return mergeFrom((com.google.wireless.android.sdk.stats.MemorySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.MemorySettings other) {
      if (other == com.google.wireless.android.sdk.stats.MemorySettings.getDefaultInstance()) return this;
      if (other.hasIdeXmx()) {
        setIdeXmx(other.getIdeXmx());
      }
      if (other.hasGradleDaemonXmx()) {
        setGradleDaemonXmx(other.getGradleDaemonXmx());
      }
      if (other.hasKotlinDaemonXmx()) {
        setKotlinDaemonXmx(other.getKotlinDaemonXmx());
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
              ideXmx_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              gradleDaemonXmx_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              kotlinDaemonXmx_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int ideXmx_ ;
    /**
     * <code>optional int32 ide_xmx = 1;</code>
     * @return Whether the ideXmx field is set.
     */
    @java.lang.Override
    public boolean hasIdeXmx() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 ide_xmx = 1;</code>
     * @return The ideXmx.
     */
    @java.lang.Override
    public int getIdeXmx() {
      return ideXmx_;
    }
    /**
     * <code>optional int32 ide_xmx = 1;</code>
     * @param value The ideXmx to set.
     * @return This builder for chaining.
     */
    public Builder setIdeXmx(int value) {

      ideXmx_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ide_xmx = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdeXmx() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ideXmx_ = 0;
      onChanged();
      return this;
    }

    private int gradleDaemonXmx_ ;
    /**
     * <code>optional int32 gradle_daemon_xmx = 2;</code>
     * @return Whether the gradleDaemonXmx field is set.
     */
    @java.lang.Override
    public boolean hasGradleDaemonXmx() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 gradle_daemon_xmx = 2;</code>
     * @return The gradleDaemonXmx.
     */
    @java.lang.Override
    public int getGradleDaemonXmx() {
      return gradleDaemonXmx_;
    }
    /**
     * <code>optional int32 gradle_daemon_xmx = 2;</code>
     * @param value The gradleDaemonXmx to set.
     * @return This builder for chaining.
     */
    public Builder setGradleDaemonXmx(int value) {

      gradleDaemonXmx_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 gradle_daemon_xmx = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGradleDaemonXmx() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gradleDaemonXmx_ = 0;
      onChanged();
      return this;
    }

    private int kotlinDaemonXmx_ ;
    /**
     * <code>optional int32 kotlin_daemon_xmx = 3;</code>
     * @return Whether the kotlinDaemonXmx field is set.
     */
    @java.lang.Override
    public boolean hasKotlinDaemonXmx() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 kotlin_daemon_xmx = 3;</code>
     * @return The kotlinDaemonXmx.
     */
    @java.lang.Override
    public int getKotlinDaemonXmx() {
      return kotlinDaemonXmx_;
    }
    /**
     * <code>optional int32 kotlin_daemon_xmx = 3;</code>
     * @param value The kotlinDaemonXmx to set.
     * @return This builder for chaining.
     */
    public Builder setKotlinDaemonXmx(int value) {

      kotlinDaemonXmx_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 kotlin_daemon_xmx = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKotlinDaemonXmx() {
      bitField0_ = (bitField0_ & ~0x00000004);
      kotlinDaemonXmx_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.MemorySettings)
  }

  // @@protoc_insertion_point(class_scope:android_studio.MemorySettings)
  private static final com.google.wireless.android.sdk.stats.MemorySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.MemorySettings();
  }

  public static com.google.wireless.android.sdk.stats.MemorySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MemorySettings>
      PARSER = new com.google.protobuf.AbstractParser<MemorySettings>() {
    @java.lang.Override
    public MemorySettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<MemorySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemorySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.MemorySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

