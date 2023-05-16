// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Reference to an attribute of an Android view.
 * </pre>
 *
 * Protobuf type {@code android_studio.AndroidAttribute}
 */
public final class AndroidAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AndroidAttribute)
    AndroidAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AndroidAttribute.newBuilder() to construct.
  private AndroidAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AndroidAttribute() {
    attributeName_ = "";
    attributeNamespace_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AndroidAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidAttribute(
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
            attributeName_ = bs;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace value = com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              attributeNamespace_ = rawValue;
            }
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AndroidAttribute.class, com.google.wireless.android.sdk.stats.AndroidAttribute.Builder.class);
  }

  /**
   * <pre>
   * Namespace of the attribute changed
   * </pre>
   *
   * Protobuf enum {@code android_studio.AndroidAttribute.AttributeNamespace}
   */
  public enum AttributeNamespace
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_NAMESPACE = 0;</code>
     */
    UNKNOWN_NAMESPACE(0),
    /**
     * <pre>
     * This attribute is defined in the Google framework.
     * </pre>
     *
     * <code>ANDROID = 1;</code>
     */
    ANDROID(1),
    /**
     * <pre>
     * This attribute is defined in the application.
     * The attribute is either a custom attribute or an attribute on a View from
     * a Google library.
     * </pre>
     *
     * <code>APPLICATION = 2;</code>
     */
    APPLICATION(2),
    /**
     * <pre>
     * This attribute is used in the design preview only. It does not affect
     * the Android application at runtime.
     * </pre>
     *
     * <code>TOOLS = 3;</code>
     */
    TOOLS(3),
    ;

    /**
     * <code>UNKNOWN_NAMESPACE = 0;</code>
     */
    public static final int UNKNOWN_NAMESPACE_VALUE = 0;
    /**
     * <pre>
     * This attribute is defined in the Google framework.
     * </pre>
     *
     * <code>ANDROID = 1;</code>
     */
    public static final int ANDROID_VALUE = 1;
    /**
     * <pre>
     * This attribute is defined in the application.
     * The attribute is either a custom attribute or an attribute on a View from
     * a Google library.
     * </pre>
     *
     * <code>APPLICATION = 2;</code>
     */
    public static final int APPLICATION_VALUE = 2;
    /**
     * <pre>
     * This attribute is used in the design preview only. It does not affect
     * the Android application at runtime.
     * </pre>
     *
     * <code>TOOLS = 3;</code>
     */
    public static final int TOOLS_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AttributeNamespace valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AttributeNamespace forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_NAMESPACE;
        case 1: return ANDROID;
        case 2: return APPLICATION;
        case 3: return TOOLS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AttributeNamespace>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AttributeNamespace> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AttributeNamespace>() {
            public AttributeNamespace findValueByNumber(int number) {
              return AttributeNamespace.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidAttribute.getDescriptor().getEnumTypes().get(0);
    }

    private static final AttributeNamespace[] VALUES = values();

    public static AttributeNamespace valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AttributeNamespace(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.AndroidAttribute.AttributeNamespace)
  }

  private int bitField0_;
  public static final int ATTRIBUTE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object attributeName_;
  /**
   * <pre>
   * Specifies an attribute name of an Android View class or Navigation element.
   * Only properties defined on Google View classes or Google-provided
   * Navigation destinations will be specified by name.
   * Properties defined on custom views or destinations, or custom properties on
   * Google-provided destinations will be left unspecified.
   * </pre>
   *
   * <code>optional string attribute_name = 1;</code>
   * @return Whether the attributeName field is set.
   */
  @java.lang.Override
  public boolean hasAttributeName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies an attribute name of an Android View class or Navigation element.
   * Only properties defined on Google View classes or Google-provided
   * Navigation destinations will be specified by name.
   * Properties defined on custom views or destinations, or custom properties on
   * Google-provided destinations will be left unspecified.
   * </pre>
   *
   * <code>optional string attribute_name = 1;</code>
   * @return The attributeName.
   */
  @java.lang.Override
  public java.lang.String getAttributeName() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        attributeName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Specifies an attribute name of an Android View class or Navigation element.
   * Only properties defined on Google View classes or Google-provided
   * Navigation destinations will be specified by name.
   * Properties defined on custom views or destinations, or custom properties on
   * Google-provided destinations will be left unspecified.
   * </pre>
   *
   * <code>optional string attribute_name = 1;</code>
   * @return The bytes for attributeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeNameBytes() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTE_NAMESPACE_FIELD_NUMBER = 2;
  private int attributeNamespace_;
  /**
   * <pre>
   * The namespace of this attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
   * @return Whether the attributeNamespace field is set.
   */
  @java.lang.Override public boolean hasAttributeNamespace() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The namespace of this attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
   * @return The attributeNamespace.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace getAttributeNamespace() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace result = com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace.valueOf(attributeNamespace_);
    return result == null ? com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace.UNKNOWN_NAMESPACE : result;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attributeName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, attributeNamespace_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attributeName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, attributeNamespace_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AndroidAttribute)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AndroidAttribute other = (com.google.wireless.android.sdk.stats.AndroidAttribute) obj;

    if (hasAttributeName() != other.hasAttributeName()) return false;
    if (hasAttributeName()) {
      if (!getAttributeName()
          .equals(other.getAttributeName())) return false;
    }
    if (hasAttributeNamespace() != other.hasAttributeNamespace()) return false;
    if (hasAttributeNamespace()) {
      if (attributeNamespace_ != other.attributeNamespace_) return false;
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
    if (hasAttributeName()) {
      hash = (37 * hash) + ATTRIBUTE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeName().hashCode();
    }
    if (hasAttributeNamespace()) {
      hash = (37 * hash) + ATTRIBUTE_NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + attributeNamespace_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AndroidAttribute parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AndroidAttribute prototype) {
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
   * Reference to an attribute of an Android view.
   * </pre>
   *
   * Protobuf type {@code android_studio.AndroidAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AndroidAttribute)
      com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AndroidAttribute.class, com.google.wireless.android.sdk.stats.AndroidAttribute.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AndroidAttribute.newBuilder()
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
      attributeName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      attributeNamespace_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AndroidAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidAttribute getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AndroidAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidAttribute build() {
      com.google.wireless.android.sdk.stats.AndroidAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidAttribute buildPartial() {
      com.google.wireless.android.sdk.stats.AndroidAttribute result = new com.google.wireless.android.sdk.stats.AndroidAttribute(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.attributeName_ = attributeName_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.attributeNamespace_ = attributeNamespace_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.AndroidAttribute) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AndroidAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AndroidAttribute other) {
      if (other == com.google.wireless.android.sdk.stats.AndroidAttribute.getDefaultInstance()) return this;
      if (other.hasAttributeName()) {
        bitField0_ |= 0x00000001;
        attributeName_ = other.attributeName_;
        onChanged();
      }
      if (other.hasAttributeNamespace()) {
        setAttributeNamespace(other.getAttributeNamespace());
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
      com.google.wireless.android.sdk.stats.AndroidAttribute parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.AndroidAttribute) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object attributeName_ = "";
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @return Whether the attributeName field is set.
     */
    public boolean hasAttributeName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @return The attributeName.
     */
    public java.lang.String getAttributeName() {
      java.lang.Object ref = attributeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          attributeName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @return The bytes for attributeName.
     */
    public com.google.protobuf.ByteString
        getAttributeNameBytes() {
      java.lang.Object ref = attributeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @param value The attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      attributeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attributeName_ = getDefaultInstance().getAttributeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies an attribute name of an Android View class or Navigation element.
     * Only properties defined on Google View classes or Google-provided
     * Navigation destinations will be specified by name.
     * Properties defined on custom views or destinations, or custom properties on
     * Google-provided destinations will be left unspecified.
     * </pre>
     *
     * <code>optional string attribute_name = 1;</code>
     * @param value The bytes for attributeName to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      attributeName_ = value;
      onChanged();
      return this;
    }

    private int attributeNamespace_ = 0;
    /**
     * <pre>
     * The namespace of this attribute
     * </pre>
     *
     * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
     * @return Whether the attributeNamespace field is set.
     */
    @java.lang.Override public boolean hasAttributeNamespace() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The namespace of this attribute
     * </pre>
     *
     * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
     * @return The attributeNamespace.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace getAttributeNamespace() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace result = com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace.valueOf(attributeNamespace_);
      return result == null ? com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace.UNKNOWN_NAMESPACE : result;
    }
    /**
     * <pre>
     * The namespace of this attribute
     * </pre>
     *
     * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
     * @param value The attributeNamespace to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeNamespace(com.google.wireless.android.sdk.stats.AndroidAttribute.AttributeNamespace value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      attributeNamespace_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The namespace of this attribute
     * </pre>
     *
     * <code>optional .android_studio.AndroidAttribute.AttributeNamespace attribute_namespace = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeNamespace() {
      bitField0_ = (bitField0_ & ~0x00000002);
      attributeNamespace_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AndroidAttribute)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AndroidAttribute)
  private static final com.google.wireless.android.sdk.stats.AndroidAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AndroidAttribute();
  }

  public static com.google.wireless.android.sdk.stats.AndroidAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AndroidAttribute>
      PARSER = new com.google.protobuf.AbstractParser<AndroidAttribute>() {
    @java.lang.Override
    public AndroidAttribute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidAttribute(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AndroidAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AndroidAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

