// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * all types of build can now register artifacts so we can find non InstantRun
 * related artifact types like full slits and aar.
 * </pre>
 *
 * Protobuf type {@code android_studio.InstantRunArtifact}
 */
public final class InstantRunArtifact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.InstantRunArtifact)
    InstantRunArtifactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstantRunArtifact.newBuilder() to construct.
  private InstantRunArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstantRunArtifact() {
    type_ = 1;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstantRunArtifact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstantRunArtifact(
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
            com.google.wireless.android.sdk.stats.InstantRunArtifact.Type value = com.google.wireless.android.sdk.stats.InstantRunArtifact.Type.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              type_ = rawValue;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_InstantRunArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_InstantRunArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.InstantRunArtifact.class, com.google.wireless.android.sdk.stats.InstantRunArtifact.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.InstantRunArtifact.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Main APK file for 19, and 21 platforms when using
     * PatchingPolicy.MULTI_DEX.
     * </pre>
     *
     * <code>MAIN = 1;</code>
     */
    MAIN(1),
    /**
     * <pre>
     * Main APK file when application is using PatchingPolicy.MULTI_DEX.
     * </pre>
     *
     * <code>SPLIT_MAIN = 2;</code>
     */
    SPLIT_MAIN(2),
    /**
     * <pre>
     * Reload dex file that can be used to patch application live.
     * </pre>
     *
     * <code>RELOAD_DEX = 3;</code>
     */
    RELOAD_DEX(3),
    /**
     * <pre>
     * Restart.dex file that can be used for Dalvik to restart applications
     * with minimum set of changes delivered.
     * </pre>
     *
     * <code>RESTART_DEX = 4;</code>
     */
    RESTART_DEX(4),
    /**
     * <pre>
     * Shard dex file that can be used to replace originally installed
     * multi-dex shard.
     * </pre>
     *
     * <code>DEX = 5;</code>
     */
    DEX(5),
    /**
     * <pre>
     * Pure split (code only) that can be installed individually on M+ devices.
     * </pre>
     *
     * <code>SPLIT = 6;</code>
     */
    SPLIT(6),
    /**
     * <pre>
     * Resources: res.ap_ file
     * </pre>
     *
     * <code>RESOURCES = 7;</code>
     */
    RESOURCES(7),
    /**
     * <pre>
     * Full split, main apk file with reduced set of configs
     * </pre>
     *
     * <code>FULL_SPLIT = 8;</code>
     */
    FULL_SPLIT(8),
    /**
     * <pre>
     * AAR file.
     * </pre>
     *
     * <code>AAR = 9;</code>
     */
    AAR(9),
    ;

    /**
     * <pre>
     * Main APK file for 19, and 21 platforms when using
     * PatchingPolicy.MULTI_DEX.
     * </pre>
     *
     * <code>MAIN = 1;</code>
     */
    public static final int MAIN_VALUE = 1;
    /**
     * <pre>
     * Main APK file when application is using PatchingPolicy.MULTI_DEX.
     * </pre>
     *
     * <code>SPLIT_MAIN = 2;</code>
     */
    public static final int SPLIT_MAIN_VALUE = 2;
    /**
     * <pre>
     * Reload dex file that can be used to patch application live.
     * </pre>
     *
     * <code>RELOAD_DEX = 3;</code>
     */
    public static final int RELOAD_DEX_VALUE = 3;
    /**
     * <pre>
     * Restart.dex file that can be used for Dalvik to restart applications
     * with minimum set of changes delivered.
     * </pre>
     *
     * <code>RESTART_DEX = 4;</code>
     */
    public static final int RESTART_DEX_VALUE = 4;
    /**
     * <pre>
     * Shard dex file that can be used to replace originally installed
     * multi-dex shard.
     * </pre>
     *
     * <code>DEX = 5;</code>
     */
    public static final int DEX_VALUE = 5;
    /**
     * <pre>
     * Pure split (code only) that can be installed individually on M+ devices.
     * </pre>
     *
     * <code>SPLIT = 6;</code>
     */
    public static final int SPLIT_VALUE = 6;
    /**
     * <pre>
     * Resources: res.ap_ file
     * </pre>
     *
     * <code>RESOURCES = 7;</code>
     */
    public static final int RESOURCES_VALUE = 7;
    /**
     * <pre>
     * Full split, main apk file with reduced set of configs
     * </pre>
     *
     * <code>FULL_SPLIT = 8;</code>
     */
    public static final int FULL_SPLIT_VALUE = 8;
    /**
     * <pre>
     * AAR file.
     * </pre>
     *
     * <code>AAR = 9;</code>
     */
    public static final int AAR_VALUE = 9;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 1: return MAIN;
        case 2: return SPLIT_MAIN;
        case 3: return RELOAD_DEX;
        case 4: return RESTART_DEX;
        case 5: return DEX;
        case 6: return SPLIT;
        case 7: return RESOURCES;
        case 8: return FULL_SPLIT;
        case 9: return AAR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.InstantRunArtifact.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.InstantRunArtifact.Type)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.InstantRunArtifact.Type getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.InstantRunArtifact.Type result = com.google.wireless.android.sdk.stats.InstantRunArtifact.Type.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.InstantRunArtifact.Type.MAIN : result;
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.InstantRunArtifact)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.InstantRunArtifact other = (com.google.wireless.android.sdk.stats.InstantRunArtifact) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.InstantRunArtifact parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.InstantRunArtifact prototype) {
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
   * all types of build can now register artifacts so we can find non InstantRun
   * related artifact types like full slits and aar.
   * </pre>
   *
   * Protobuf type {@code android_studio.InstantRunArtifact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.InstantRunArtifact)
      com.google.wireless.android.sdk.stats.InstantRunArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_InstantRunArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_InstantRunArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.InstantRunArtifact.class, com.google.wireless.android.sdk.stats.InstantRunArtifact.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.InstantRunArtifact.newBuilder()
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
      type_ = 1;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_InstantRunArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.InstantRunArtifact getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.InstantRunArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.InstantRunArtifact build() {
      com.google.wireless.android.sdk.stats.InstantRunArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.InstantRunArtifact buildPartial() {
      com.google.wireless.android.sdk.stats.InstantRunArtifact result = new com.google.wireless.android.sdk.stats.InstantRunArtifact(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.InstantRunArtifact) {
        return mergeFrom((com.google.wireless.android.sdk.stats.InstantRunArtifact)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.InstantRunArtifact other) {
      if (other == com.google.wireless.android.sdk.stats.InstantRunArtifact.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
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
      com.google.wireless.android.sdk.stats.InstantRunArtifact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.InstantRunArtifact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 1;
    /**
     * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.InstantRunArtifact.Type getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.InstantRunArtifact.Type result = com.google.wireless.android.sdk.stats.InstantRunArtifact.Type.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.InstantRunArtifact.Type.MAIN : result;
    }
    /**
     * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.InstantRunArtifact.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.InstantRunArtifact.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 1;
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


    // @@protoc_insertion_point(builder_scope:android_studio.InstantRunArtifact)
  }

  // @@protoc_insertion_point(class_scope:android_studio.InstantRunArtifact)
  private static final com.google.wireless.android.sdk.stats.InstantRunArtifact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.InstantRunArtifact();
  }

  public static com.google.wireless.android.sdk.stats.InstantRunArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<InstantRunArtifact>
      PARSER = new com.google.protobuf.AbstractParser<InstantRunArtifact>() {
    @java.lang.Override
    public InstantRunArtifact parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstantRunArtifact(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstantRunArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstantRunArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.InstantRunArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

