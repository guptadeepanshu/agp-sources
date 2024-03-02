// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Track whether a GLES1 command is used or not
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorGLEScmUsages}
 */
public final class EmulatorGLEScmUsages extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorGLEScmUsages)
    EmulatorGLEScmUsagesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorGLEScmUsages.newBuilder() to construct.
  private EmulatorGLEScmUsages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorGLEScmUsages() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorGLEScmUsages();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLEScmUsages_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLEScmUsages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.class, com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.Builder.class);
  }

  private int bitField0_;
  public static final int IS_USED_FIELD_NUMBER = 1;
  private boolean isUsed_;
  /**
   * <pre>
   * Has the client create any GLES1 contexts
   * </pre>
   *
   * <code>optional bool is_used = 1;</code>
   * @return Whether the isUsed field is set.
   */
  @java.lang.Override
  public boolean hasIsUsed() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Has the client create any GLES1 contexts
   * </pre>
   *
   * <code>optional bool is_used = 1;</code>
   * @return The isUsed.
   */
  @java.lang.Override
  public boolean getIsUsed() {
    return isUsed_;
  }

  public static final int LIGHT_FIELD_NUMBER = 2;
  private boolean light_;
  /**
   * <pre>
   * Track glLight{f,fv,x,xv} command calls
   * </pre>
   *
   * <code>optional bool light = 2;</code>
   * @return Whether the light field is set.
   */
  @java.lang.Override
  public boolean hasLight() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Track glLight{f,fv,x,xv} command calls
   * </pre>
   *
   * <code>optional bool light = 2;</code>
   * @return The light.
   */
  @java.lang.Override
  public boolean getLight() {
    return light_;
  }

  public static final int TEX_GEN_FIELD_NUMBER = 3;
  private boolean texGen_;
  /**
   * <pre>
   * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
   * </pre>
   *
   * <code>optional bool tex_gen = 3;</code>
   * @return Whether the texGen field is set.
   */
  @java.lang.Override
  public boolean hasTexGen() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
   * </pre>
   *
   * <code>optional bool tex_gen = 3;</code>
   * @return The texGen.
   */
  @java.lang.Override
  public boolean getTexGen() {
    return texGen_;
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
      output.writeBool(1, isUsed_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, light_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, texGen_);
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
        .computeBoolSize(1, isUsed_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, light_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, texGen_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages other = (com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages) obj;

    if (hasIsUsed() != other.hasIsUsed()) return false;
    if (hasIsUsed()) {
      if (getIsUsed()
          != other.getIsUsed()) return false;
    }
    if (hasLight() != other.hasLight()) return false;
    if (hasLight()) {
      if (getLight()
          != other.getLight()) return false;
    }
    if (hasTexGen() != other.hasTexGen()) return false;
    if (hasTexGen()) {
      if (getTexGen()
          != other.getTexGen()) return false;
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
    if (hasIsUsed()) {
      hash = (37 * hash) + IS_USED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUsed());
    }
    if (hasLight()) {
      hash = (37 * hash) + LIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLight());
    }
    if (hasTexGen()) {
      hash = (37 * hash) + TEX_GEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTexGen());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages prototype) {
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
   * Track whether a GLES1 command is used or not
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorGLEScmUsages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorGLEScmUsages)
      com.google.wireless.android.sdk.stats.EmulatorGLEScmUsagesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLEScmUsages_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLEScmUsages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.class, com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isUsed_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      light_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      texGen_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorGLEScmUsages_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages build() {
      com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages result = new com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isUsed_ = isUsed_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.light_ = light_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.texGen_ = texGen_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages.getDefaultInstance()) return this;
      if (other.hasIsUsed()) {
        setIsUsed(other.getIsUsed());
      }
      if (other.hasLight()) {
        setLight(other.getLight());
      }
      if (other.hasTexGen()) {
        setTexGen(other.getTexGen());
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
              isUsed_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              light_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              texGen_ = input.readBool();
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

    private boolean isUsed_ ;
    /**
     * <pre>
     * Has the client create any GLES1 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return Whether the isUsed field is set.
     */
    @java.lang.Override
    public boolean hasIsUsed() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Has the client create any GLES1 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return The isUsed.
     */
    @java.lang.Override
    public boolean getIsUsed() {
      return isUsed_;
    }
    /**
     * <pre>
     * Has the client create any GLES1 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @param value The isUsed to set.
     * @return This builder for chaining.
     */
    public Builder setIsUsed(boolean value) {
      bitField0_ |= 0x00000001;
      isUsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Has the client create any GLES1 contexts
     * </pre>
     *
     * <code>optional bool is_used = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsUsed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isUsed_ = false;
      onChanged();
      return this;
    }

    private boolean light_ ;
    /**
     * <pre>
     * Track glLight{f,fv,x,xv} command calls
     * </pre>
     *
     * <code>optional bool light = 2;</code>
     * @return Whether the light field is set.
     */
    @java.lang.Override
    public boolean hasLight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Track glLight{f,fv,x,xv} command calls
     * </pre>
     *
     * <code>optional bool light = 2;</code>
     * @return The light.
     */
    @java.lang.Override
    public boolean getLight() {
      return light_;
    }
    /**
     * <pre>
     * Track glLight{f,fv,x,xv} command calls
     * </pre>
     *
     * <code>optional bool light = 2;</code>
     * @param value The light to set.
     * @return This builder for chaining.
     */
    public Builder setLight(boolean value) {
      bitField0_ |= 0x00000002;
      light_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glLight{f,fv,x,xv} command calls
     * </pre>
     *
     * <code>optional bool light = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      light_ = false;
      onChanged();
      return this;
    }

    private boolean texGen_ ;
    /**
     * <pre>
     * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
     * </pre>
     *
     * <code>optional bool tex_gen = 3;</code>
     * @return Whether the texGen field is set.
     */
    @java.lang.Override
    public boolean hasTexGen() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
     * </pre>
     *
     * <code>optional bool tex_gen = 3;</code>
     * @return The texGen.
     */
    @java.lang.Override
    public boolean getTexGen() {
      return texGen_;
    }
    /**
     * <pre>
     * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
     * </pre>
     *
     * <code>optional bool tex_gen = 3;</code>
     * @param value The texGen to set.
     * @return This builder for chaining.
     */
    public Builder setTexGen(boolean value) {
      bitField0_ |= 0x00000004;
      texGen_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Track glTexGen{f,fv,x,xv,i,iv}OES command calls
     * </pre>
     *
     * <code>optional bool tex_gen = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTexGen() {
      bitField0_ = (bitField0_ & ~0x00000004);
      texGen_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorGLEScmUsages)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorGLEScmUsages)
  private static final com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorGLEScmUsages>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorGLEScmUsages>() {
    @java.lang.Override
    public EmulatorGLEScmUsages parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmulatorGLEScmUsages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorGLEScmUsages> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorGLEScmUsages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

