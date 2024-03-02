// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.KotlinSupportDeclined}
 */
public final class KotlinSupportDeclined extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.KotlinSupportDeclined)
    KotlinSupportDeclinedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KotlinSupportDeclined.newBuilder() to construct.
  private KotlinSupportDeclined(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KotlinSupportDeclined() {
    templateRenderer_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KotlinSupportDeclined();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupportDeclined_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupportDeclined_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.KotlinSupportDeclined.class, com.google.wireless.android.sdk.stats.KotlinSupportDeclined.Builder.class);
  }

  private int bitField0_;
  public static final int TEMPLATE_RENDERER_FIELD_NUMBER = 1;
  private int templateRenderer_;
  /**
   * <pre>
   * template renderer used
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
   * @return Whether the templateRenderer field is set.
   */
  @java.lang.Override public boolean hasTemplateRenderer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * template renderer used
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
   * @return The templateRenderer.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer getTemplateRenderer() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer result = com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer.valueOf(templateRenderer_);
    return result == null ? com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer.UNKNOWN_TEMPLATE_RENDERER : result;
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
      output.writeEnum(1, templateRenderer_);
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
        .computeEnumSize(1, templateRenderer_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.KotlinSupportDeclined)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.KotlinSupportDeclined other = (com.google.wireless.android.sdk.stats.KotlinSupportDeclined) obj;

    if (hasTemplateRenderer() != other.hasTemplateRenderer()) return false;
    if (hasTemplateRenderer()) {
      if (templateRenderer_ != other.templateRenderer_) return false;
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
    if (hasTemplateRenderer()) {
      hash = (37 * hash) + TEMPLATE_RENDERER_FIELD_NUMBER;
      hash = (53 * hash) + templateRenderer_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.KotlinSupportDeclined prototype) {
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
   * Protobuf type {@code android_studio.KotlinSupportDeclined}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.KotlinSupportDeclined)
      com.google.wireless.android.sdk.stats.KotlinSupportDeclinedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupportDeclined_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupportDeclined_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.KotlinSupportDeclined.class, com.google.wireless.android.sdk.stats.KotlinSupportDeclined.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.KotlinSupportDeclined.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      templateRenderer_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_KotlinSupportDeclined_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupportDeclined getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.KotlinSupportDeclined.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupportDeclined build() {
      com.google.wireless.android.sdk.stats.KotlinSupportDeclined result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.KotlinSupportDeclined buildPartial() {
      com.google.wireless.android.sdk.stats.KotlinSupportDeclined result = new com.google.wireless.android.sdk.stats.KotlinSupportDeclined(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.templateRenderer_ = templateRenderer_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.KotlinSupportDeclined) {
        return mergeFrom((com.google.wireless.android.sdk.stats.KotlinSupportDeclined)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.KotlinSupportDeclined other) {
      if (other == com.google.wireless.android.sdk.stats.KotlinSupportDeclined.getDefaultInstance()) return this;
      if (other.hasTemplateRenderer()) {
        setTemplateRenderer(other.getTemplateRenderer());
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
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer tmpValue =
                  com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                templateRenderer_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
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

    private int templateRenderer_ = 0;
    /**
     * <pre>
     * template renderer used
     * </pre>
     *
     * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
     * @return Whether the templateRenderer field is set.
     */
    @java.lang.Override public boolean hasTemplateRenderer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * template renderer used
     * </pre>
     *
     * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
     * @return The templateRenderer.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer getTemplateRenderer() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer result = com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer.valueOf(templateRenderer_);
      return result == null ? com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer.UNKNOWN_TEMPLATE_RENDERER : result;
    }
    /**
     * <pre>
     * template renderer used
     * </pre>
     *
     * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
     * @param value The templateRenderer to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateRenderer(com.google.wireless.android.sdk.stats.AndroidStudioEvent.TemplateRenderer value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      templateRenderer_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * template renderer used
     * </pre>
     *
     * <code>optional .android_studio.AndroidStudioEvent.TemplateRenderer template_renderer = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateRenderer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      templateRenderer_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.KotlinSupportDeclined)
  }

  // @@protoc_insertion_point(class_scope:android_studio.KotlinSupportDeclined)
  private static final com.google.wireless.android.sdk.stats.KotlinSupportDeclined DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.KotlinSupportDeclined();
  }

  public static com.google.wireless.android.sdk.stats.KotlinSupportDeclined getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<KotlinSupportDeclined>
      PARSER = new com.google.protobuf.AbstractParser<KotlinSupportDeclined>() {
    @java.lang.Override
    public KotlinSupportDeclined parsePartialFrom(
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

  public static com.google.protobuf.Parser<KotlinSupportDeclined> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KotlinSupportDeclined> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.KotlinSupportDeclined getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

