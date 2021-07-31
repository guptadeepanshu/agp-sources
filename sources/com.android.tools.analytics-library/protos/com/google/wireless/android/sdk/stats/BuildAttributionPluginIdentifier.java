// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * The plugin identifier used in build attribution
 * </pre>
 *
 * Protobuf type {@code android_studio.BuildAttributionPluginIdentifier}
 */
public  final class BuildAttributionPluginIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.BuildAttributionPluginIdentifier)
    BuildAttributionPluginIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildAttributionPluginIdentifier.newBuilder() to construct.
  private BuildAttributionPluginIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildAttributionPluginIdentifier() {
    type_ = 0;
    pluginDisplayName_ = "";
    pluginClassName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildAttributionPluginIdentifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuildAttributionPluginIdentifier(
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
          case 8: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType value = com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
            }
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            pluginDisplayName_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            pluginClassName_ = bs;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildAttributionPluginIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildAttributionPluginIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.class, com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.BuildAttributionPluginIdentifier.PluginType}
   */
  public enum PluginType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    UNKNOWN_TYPE(0),
    /**
     * <code>BUILD_SCRIPT = 1;</code>
     */
    BUILD_SCRIPT(1),
    /**
     * <pre>
     * Deprecated, use OTHER_PLUGIN instead
     * </pre>
     *
     * <code>BINARY_PLUGIN = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    BINARY_PLUGIN(2),
    /**
     * <code>BUILD_SRC = 3;</code>
     */
    BUILD_SRC(3),
    /**
     * <code>OTHER_PLUGIN = 4;</code>
     */
    OTHER_PLUGIN(4),
    ;

    /**
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    public static final int UNKNOWN_TYPE_VALUE = 0;
    /**
     * <code>BUILD_SCRIPT = 1;</code>
     */
    public static final int BUILD_SCRIPT_VALUE = 1;
    /**
     * <pre>
     * Deprecated, use OTHER_PLUGIN instead
     * </pre>
     *
     * <code>BINARY_PLUGIN = 2 [deprecated = true];</code>
     */
    public static final int BINARY_PLUGIN_VALUE = 2;
    /**
     * <code>BUILD_SRC = 3;</code>
     */
    public static final int BUILD_SRC_VALUE = 3;
    /**
     * <code>OTHER_PLUGIN = 4;</code>
     */
    public static final int OTHER_PLUGIN_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PluginType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PluginType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_TYPE;
        case 1: return BUILD_SCRIPT;
        case 2: return BINARY_PLUGIN;
        case 3: return BUILD_SRC;
        case 4: return OTHER_PLUGIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PluginType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PluginType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PluginType>() {
            public PluginType findValueByNumber(int number) {
              return PluginType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.getDescriptor().getEnumTypes().get(0);
    }

    private static final PluginType[] VALUES = values();

    public static PluginType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PluginType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.BuildAttributionPluginIdentifier.PluginType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Either a binary plugin or a build script plugin
   * </pre>
   *
   * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Either a binary plugin or a build script plugin
   * </pre>
   *
   * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
   * @return The type.
   */
  public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType result = com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType.UNKNOWN_TYPE : result;
  }

  public static final int PLUGIN_DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object pluginDisplayName_;
  /**
   * <pre>
   * The display name of the plugin, that is the string used in the build script
   * when calling apply. ex: com.android.application, kotlin-android
   * Should not be set in the case of a build script
   * </pre>
   *
   * <code>optional string plugin_display_name = 2;</code>
   * @return Whether the pluginDisplayName field is set.
   */
  public boolean hasPluginDisplayName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The display name of the plugin, that is the string used in the build script
   * when calling apply. ex: com.android.application, kotlin-android
   * Should not be set in the case of a build script
   * </pre>
   *
   * <code>optional string plugin_display_name = 2;</code>
   * @return The pluginDisplayName.
   */
  public java.lang.String getPluginDisplayName() {
    java.lang.Object ref = pluginDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        pluginDisplayName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The display name of the plugin, that is the string used in the build script
   * when calling apply. ex: com.android.application, kotlin-android
   * Should not be set in the case of a build script
   * </pre>
   *
   * <code>optional string plugin_display_name = 2;</code>
   * @return The bytes for pluginDisplayName.
   */
  public com.google.protobuf.ByteString
      getPluginDisplayNameBytes() {
    java.lang.Object ref = pluginDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pluginDisplayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLUGIN_CLASS_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object pluginClassName_;
  /**
   * <pre>
   * The class name of the gradle plugin.
   * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
   * </pre>
   *
   * <code>optional string plugin_class_name = 3;</code>
   * @return Whether the pluginClassName field is set.
   */
  public boolean hasPluginClassName() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The class name of the gradle plugin.
   * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
   * </pre>
   *
   * <code>optional string plugin_class_name = 3;</code>
   * @return The pluginClassName.
   */
  public java.lang.String getPluginClassName() {
    java.lang.Object ref = pluginClassName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        pluginClassName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The class name of the gradle plugin.
   * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
   * </pre>
   *
   * <code>optional string plugin_class_name = 3;</code>
   * @return The bytes for pluginClassName.
   */
  public com.google.protobuf.ByteString
      getPluginClassNameBytes() {
    java.lang.Object ref = pluginClassName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pluginClassName_ = b;
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
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pluginDisplayName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pluginClassName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pluginDisplayName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pluginClassName_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier other = (com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasPluginDisplayName() != other.hasPluginDisplayName()) return false;
    if (hasPluginDisplayName()) {
      if (!getPluginDisplayName()
          .equals(other.getPluginDisplayName())) return false;
    }
    if (hasPluginClassName() != other.hasPluginClassName()) return false;
    if (hasPluginClassName()) {
      if (!getPluginClassName()
          .equals(other.getPluginClassName())) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasPluginDisplayName()) {
      hash = (37 * hash) + PLUGIN_DISPLAY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPluginDisplayName().hashCode();
    }
    if (hasPluginClassName()) {
      hash = (37 * hash) + PLUGIN_CLASS_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPluginClassName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier prototype) {
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
   * The plugin identifier used in build attribution
   * </pre>
   *
   * Protobuf type {@code android_studio.BuildAttributionPluginIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.BuildAttributionPluginIdentifier)
      com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildAttributionPluginIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildAttributionPluginIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.class, com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.newBuilder()
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
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      pluginDisplayName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      pluginClassName_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildAttributionPluginIdentifier_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier build() {
      com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier buildPartial() {
      com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier result = new com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.pluginDisplayName_ = pluginDisplayName_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.pluginClassName_ = pluginClassName_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier) {
        return mergeFrom((com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier other) {
      if (other == com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasPluginDisplayName()) {
        bitField0_ |= 0x00000002;
        pluginDisplayName_ = other.pluginDisplayName_;
        onChanged();
      }
      if (other.hasPluginClassName()) {
        bitField0_ |= 0x00000004;
        pluginClassName_ = other.pluginClassName_;
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
      com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * Either a binary plugin or a build script plugin
     * </pre>
     *
     * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Either a binary plugin or a build script plugin
     * </pre>
     *
     * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
     * @return The type.
     */
    public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType result = com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType.UNKNOWN_TYPE : result;
    }
    /**
     * <pre>
     * Either a binary plugin or a build script plugin
     * </pre>
     *
     * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier.PluginType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Either a binary plugin or a build script plugin
     * </pre>
     *
     * <code>optional .android_studio.BuildAttributionPluginIdentifier.PluginType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pluginDisplayName_ = "";
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @return Whether the pluginDisplayName field is set.
     */
    public boolean hasPluginDisplayName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @return The pluginDisplayName.
     */
    public java.lang.String getPluginDisplayName() {
      java.lang.Object ref = pluginDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pluginDisplayName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @return The bytes for pluginDisplayName.
     */
    public com.google.protobuf.ByteString
        getPluginDisplayNameBytes() {
      java.lang.Object ref = pluginDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @param value The pluginDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setPluginDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      pluginDisplayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPluginDisplayName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pluginDisplayName_ = getDefaultInstance().getPluginDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display name of the plugin, that is the string used in the build script
     * when calling apply. ex: com.android.application, kotlin-android
     * Should not be set in the case of a build script
     * </pre>
     *
     * <code>optional string plugin_display_name = 2;</code>
     * @param value The bytes for pluginDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setPluginDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      pluginDisplayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pluginClassName_ = "";
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @return Whether the pluginClassName field is set.
     */
    public boolean hasPluginClassName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @return The pluginClassName.
     */
    public java.lang.String getPluginClassName() {
      java.lang.Object ref = pluginClassName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pluginClassName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @return The bytes for pluginClassName.
     */
    public com.google.protobuf.ByteString
        getPluginClassNameBytes() {
      java.lang.Object ref = pluginClassName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginClassName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @param value The pluginClassName to set.
     * @return This builder for chaining.
     */
    public Builder setPluginClassName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      pluginClassName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPluginClassName() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pluginClassName_ = getDefaultInstance().getPluginClassName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The class name of the gradle plugin.
     * ex: org.jetbrains.kotlin.gradle.plugin.KotlinAndroidPluginWrapper
     * </pre>
     *
     * <code>optional string plugin_class_name = 3;</code>
     * @param value The bytes for pluginClassName to set.
     * @return This builder for chaining.
     */
    public Builder setPluginClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      pluginClassName_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.BuildAttributionPluginIdentifier)
  }

  // @@protoc_insertion_point(class_scope:android_studio.BuildAttributionPluginIdentifier)
  private static final com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier();
  }

  public static com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BuildAttributionPluginIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<BuildAttributionPluginIdentifier>() {
    @java.lang.Override
    public BuildAttributionPluginIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuildAttributionPluginIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildAttributionPluginIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildAttributionPluginIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.BuildAttributionPluginIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
