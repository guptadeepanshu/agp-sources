// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Statistics regarding IntelliJ project sizes
 * </pre>
 *
 * Protobuf type {@code android_studio.IntellijProjectSizeStats}
 */
public final class IntellijProjectSizeStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.IntellijProjectSizeStats)
    IntellijProjectSizeStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntellijProjectSizeStats.newBuilder() to construct.
  private IntellijProjectSizeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntellijProjectSizeStats() {
    type_ = 0;
    scope_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntellijProjectSizeStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IntellijProjectSizeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IntellijProjectSizeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.class, com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.IntellijProjectSizeStats.FileType}
   */
  public enum FileType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_FILE_TYPE = 0;</code>
     */
    UNKNOWN_FILE_TYPE(0),
    /**
     * <code>JAVA = 1;</code>
     */
    JAVA(1),
    /**
     * <code>XML = 2;</code>
     */
    XML(2),
    /**
     * <code>DOT_CLASS = 3;</code>
     */
    DOT_CLASS(3),
    /**
     * <code>KOTLIN = 4;</code>
     */
    KOTLIN(4),
    /**
     * <code>NATIVE = 5;</code>
     */
    NATIVE(5),
    ;

    /**
     * <code>UNKNOWN_FILE_TYPE = 0;</code>
     */
    public static final int UNKNOWN_FILE_TYPE_VALUE = 0;
    /**
     * <code>JAVA = 1;</code>
     */
    public static final int JAVA_VALUE = 1;
    /**
     * <code>XML = 2;</code>
     */
    public static final int XML_VALUE = 2;
    /**
     * <code>DOT_CLASS = 3;</code>
     */
    public static final int DOT_CLASS_VALUE = 3;
    /**
     * <code>KOTLIN = 4;</code>
     */
    public static final int KOTLIN_VALUE = 4;
    /**
     * <code>NATIVE = 5;</code>
     */
    public static final int NATIVE_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FileType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FileType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_FILE_TYPE;
        case 1: return JAVA;
        case 2: return XML;
        case 3: return DOT_CLASS;
        case 4: return KOTLIN;
        case 5: return NATIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FileType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FileType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
            public FileType findValueByNumber(int number) {
              return FileType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.getDescriptor().getEnumTypes().get(0);
    }

    private static final FileType[] VALUES = values();

    public static FileType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FileType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.IntellijProjectSizeStats.FileType)
  }

  /**
   * <pre>
   * Search scope to decide counted file set
   * </pre>
   *
   * Protobuf enum {@code android_studio.IntellijProjectSizeStats.Scope}
   */
  public enum Scope
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_SCOPE = 0;</code>
     */
    UNKNOWN_SCOPE(0),
    /**
     * <pre>
     * Whole project including both user sources and libraries
     * </pre>
     *
     * <code>ALL = 1;</code>
     */
    ALL(1),
    /**
     * <pre>
     * All project libraries i.e. all jar files
     * </pre>
     *
     * <code>LIBRARY = 2;</code>
     */
    LIBRARY(2),
    /**
     * <pre>
     * Project files only
     * </pre>
     *
     * <code>PROJECT = 3;</code>
     */
    PROJECT(3),
    ;

    /**
     * <code>UNKNOWN_SCOPE = 0;</code>
     */
    public static final int UNKNOWN_SCOPE_VALUE = 0;
    /**
     * <pre>
     * Whole project including both user sources and libraries
     * </pre>
     *
     * <code>ALL = 1;</code>
     */
    public static final int ALL_VALUE = 1;
    /**
     * <pre>
     * All project libraries i.e. all jar files
     * </pre>
     *
     * <code>LIBRARY = 2;</code>
     */
    public static final int LIBRARY_VALUE = 2;
    /**
     * <pre>
     * Project files only
     * </pre>
     *
     * <code>PROJECT = 3;</code>
     */
    public static final int PROJECT_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Scope valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Scope forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_SCOPE;
        case 1: return ALL;
        case 2: return LIBRARY;
        case 3: return PROJECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Scope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Scope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Scope>() {
            public Scope findValueByNumber(int number) {
              return Scope.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.getDescriptor().getEnumTypes().get(1);
    }

    private static final Scope[] VALUES = values();

    public static Scope valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Scope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.IntellijProjectSizeStats.Scope)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType getType() {
    com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType result = com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType.forNumber(type_);
    return result == null ? com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType.UNKNOWN_FILE_TYPE : result;
  }

  public static final int SCOPE_FIELD_NUMBER = 2;
  private int scope_ = 0;
  /**
   * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
   * @return Whether the scope field is set.
   */
  @java.lang.Override public boolean hasScope() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
   * @return The scope.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope getScope() {
    com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope result = com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope.forNumber(scope_);
    return result == null ? com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope.UNKNOWN_SCOPE : result;
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private int count_ = 0;
  /**
   * <code>optional int32 count = 3;</code>
   * @return Whether the count field is set.
   */
  @java.lang.Override
  public boolean hasCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 count = 3;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
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
      output.writeEnum(2, scope_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, count_);
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, scope_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, count_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.IntellijProjectSizeStats)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.IntellijProjectSizeStats other = (com.google.wireless.android.sdk.stats.IntellijProjectSizeStats) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasScope() != other.hasScope()) return false;
    if (hasScope()) {
      if (scope_ != other.scope_) return false;
    }
    if (hasCount() != other.hasCount()) return false;
    if (hasCount()) {
      if (getCount()
          != other.getCount()) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasScope()) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + scope_;
    }
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.IntellijProjectSizeStats prototype) {
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
   * Statistics regarding IntelliJ project sizes
   * </pre>
   *
   * Protobuf type {@code android_studio.IntellijProjectSizeStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.IntellijProjectSizeStats)
      com.google.wireless.android.sdk.stats.IntellijProjectSizeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IntellijProjectSizeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IntellijProjectSizeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.class, com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.newBuilder()
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
      type_ = 0;
      scope_ = 0;
      count_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IntellijProjectSizeStats_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats build() {
      com.google.wireless.android.sdk.stats.IntellijProjectSizeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats buildPartial() {
      com.google.wireless.android.sdk.stats.IntellijProjectSizeStats result = new com.google.wireless.android.sdk.stats.IntellijProjectSizeStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.IntellijProjectSizeStats result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scope_ = scope_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.count_ = count_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.IntellijProjectSizeStats) {
        return mergeFrom((com.google.wireless.android.sdk.stats.IntellijProjectSizeStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.IntellijProjectSizeStats other) {
      if (other == com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasScope()) {
        setScope(other.getScope());
      }
      if (other.hasCount()) {
        setCount(other.getCount());
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
              com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType tmpValue =
                  com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope tmpValue =
                  com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                scope_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
            case 24: {
              count_ = input.readInt32();
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

    private int type_ = 0;
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType getType() {
      com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType result = com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType.forNumber(type_);
      return result == null ? com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType.UNKNOWN_FILE_TYPE : result;
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.FileType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.FileType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private int scope_ = 0;
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
     * @return Whether the scope field is set.
     */
    @java.lang.Override public boolean hasScope() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
     * @return The scope.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope getScope() {
      com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope result = com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope.forNumber(scope_);
      return result == null ? com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope.UNKNOWN_SCOPE : result;
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(com.google.wireless.android.sdk.stats.IntellijProjectSizeStats.Scope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      scope_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.IntellijProjectSizeStats.Scope scope = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scope_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>optional int32 count = 3;</code>
     * @return Whether the count field is set.
     */
    @java.lang.Override
    public boolean hasCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 count = 3;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>optional int32 count = 3;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.IntellijProjectSizeStats)
  }

  // @@protoc_insertion_point(class_scope:android_studio.IntellijProjectSizeStats)
  private static final com.google.wireless.android.sdk.stats.IntellijProjectSizeStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.IntellijProjectSizeStats();
  }

  public static com.google.wireless.android.sdk.stats.IntellijProjectSizeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<IntellijProjectSizeStats>
      PARSER = new com.google.protobuf.AbstractParser<IntellijProjectSizeStats>() {
    @java.lang.Override
    public IntellijProjectSizeStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntellijProjectSizeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntellijProjectSizeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.IntellijProjectSizeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

