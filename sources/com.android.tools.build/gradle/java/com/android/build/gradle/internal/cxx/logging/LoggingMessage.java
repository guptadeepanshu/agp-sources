// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_logging.proto

package com.android.build.gradle.internal.cxx.logging;

/**
 * <pre>
 **
 *A C/C++ logging message.
 * </pre>
 *
 * Protobuf type {@code LoggingMessage}
 */
public final class LoggingMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LoggingMessage)
    LoggingMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoggingMessage.newBuilder() to construct.
  private LoggingMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoggingMessage() {
    level_ = 0;
    message_ = "";
    file_ = "";
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoggingMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_LoggingMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_LoggingMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.build.gradle.internal.cxx.logging.LoggingMessage.class, com.android.build.gradle.internal.cxx.logging.LoggingMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code LoggingMessage.LoggingLevel}
   */
  public enum LoggingLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INFO = 0;</code>
     */
    INFO(0),
    /**
     * <code>LIFECYCLE = 1;</code>
     */
    LIFECYCLE(1),
    /**
     * <code>WARN = 2;</code>
     */
    WARN(2),
    /**
     * <code>ERROR = 3;</code>
     */
    ERROR(3),
    /**
     * <code>BUG = 4;</code>
     */
    BUG(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INFO = 0;</code>
     */
    public static final int INFO_VALUE = 0;
    /**
     * <code>LIFECYCLE = 1;</code>
     */
    public static final int LIFECYCLE_VALUE = 1;
    /**
     * <code>WARN = 2;</code>
     */
    public static final int WARN_VALUE = 2;
    /**
     * <code>ERROR = 3;</code>
     */
    public static final int ERROR_VALUE = 3;
    /**
     * <code>BUG = 4;</code>
     */
    public static final int BUG_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoggingLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LoggingLevel forNumber(int value) {
      switch (value) {
        case 0: return INFO;
        case 1: return LIFECYCLE;
        case 2: return WARN;
        case 3: return ERROR;
        case 4: return BUG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LoggingLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LoggingLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LoggingLevel>() {
            public LoggingLevel findValueByNumber(int number) {
              return LoggingLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.logging.LoggingMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final LoggingLevel[] VALUES = values();

    public static LoggingLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LoggingLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LoggingMessage.LoggingLevel)
  }

  public static final int LEVEL_FIELD_NUMBER = 1;
  private int level_ = 0;
  /**
   * <code>.LoggingMessage.LoggingLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  @java.lang.Override public int getLevelValue() {
    return level_;
  }
  /**
   * <code>.LoggingMessage.LoggingLevel level = 1;</code>
   * @return The level.
   */
  @java.lang.Override public com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel getLevel() {
    com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel result = com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.forNumber(level_);
    return result == null ? com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object file_ = "";
  /**
   * <code>string file = 3;</code>
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      file_ = s;
      return s;
    }
  }
  /**
   * <code>string file = 3;</code>
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileBytes() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      file_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tag_ = "";
  /**
   * <code>string tag = 4;</code>
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>string tag = 4;</code>
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIAGNOSTIC_CODE_FIELD_NUMBER = 5;
  private int diagnosticCode_ = 0;
  /**
   * <code>int32 diagnostic_code = 5;</code>
   * @return The diagnosticCode.
   */
  @java.lang.Override
  public int getDiagnosticCode() {
    return diagnosticCode_;
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
    if (level_ != com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.INFO.getNumber()) {
      output.writeEnum(1, level_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, file_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tag_);
    }
    if (diagnosticCode_ != 0) {
      output.writeInt32(5, diagnosticCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (level_ != com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.INFO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, level_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(file_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, file_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tag_);
    }
    if (diagnosticCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, diagnosticCode_);
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
    if (!(obj instanceof com.android.build.gradle.internal.cxx.logging.LoggingMessage)) {
      return super.equals(obj);
    }
    com.android.build.gradle.internal.cxx.logging.LoggingMessage other = (com.android.build.gradle.internal.cxx.logging.LoggingMessage) obj;

    if (level_ != other.level_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getFile()
        .equals(other.getFile())) return false;
    if (!getTag()
        .equals(other.getTag())) return false;
    if (getDiagnosticCode()
        != other.getDiagnosticCode()) return false;
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
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (37 * hash) + DIAGNOSTIC_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getDiagnosticCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage parseFrom(
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
  public static Builder newBuilder(com.android.build.gradle.internal.cxx.logging.LoggingMessage prototype) {
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
   **
   *A C/C++ logging message.
   * </pre>
   *
   * Protobuf type {@code LoggingMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LoggingMessage)
      com.android.build.gradle.internal.cxx.logging.LoggingMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_LoggingMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_LoggingMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.build.gradle.internal.cxx.logging.LoggingMessage.class, com.android.build.gradle.internal.cxx.logging.LoggingMessage.Builder.class);
    }

    // Construct using com.android.build.gradle.internal.cxx.logging.LoggingMessage.newBuilder()
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
      level_ = 0;
      message_ = "";
      file_ = "";
      tag_ = "";
      diagnosticCode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.build.gradle.internal.cxx.logging.CxxLogging.internal_static_LoggingMessage_descriptor;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.LoggingMessage getDefaultInstanceForType() {
      return com.android.build.gradle.internal.cxx.logging.LoggingMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.LoggingMessage build() {
      com.android.build.gradle.internal.cxx.logging.LoggingMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.LoggingMessage buildPartial() {
      com.android.build.gradle.internal.cxx.logging.LoggingMessage result = new com.android.build.gradle.internal.cxx.logging.LoggingMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.android.build.gradle.internal.cxx.logging.LoggingMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.level_ = level_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.file_ = file_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tag_ = tag_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.diagnosticCode_ = diagnosticCode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.build.gradle.internal.cxx.logging.LoggingMessage) {
        return mergeFrom((com.android.build.gradle.internal.cxx.logging.LoggingMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.build.gradle.internal.cxx.logging.LoggingMessage other) {
      if (other == com.android.build.gradle.internal.cxx.logging.LoggingMessage.getDefaultInstance()) return this;
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFile().isEmpty()) {
        file_ = other.file_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getDiagnosticCode() != 0) {
        setDiagnosticCode(other.getDiagnosticCode());
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
              level_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              file_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              tag_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              diagnosticCode_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int level_ = 0;
    /**
     * <code>.LoggingMessage.LoggingLevel level = 1;</code>
     * @return The enum numeric value on the wire for level.
     */
    @java.lang.Override public int getLevelValue() {
      return level_;
    }
    /**
     * <code>.LoggingMessage.LoggingLevel level = 1;</code>
     * @param value The enum numeric value on the wire for level to set.
     * @return This builder for chaining.
     */
    public Builder setLevelValue(int value) {
      level_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.LoggingMessage.LoggingLevel level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel getLevel() {
      com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel result = com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.forNumber(level_);
      return result == null ? com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.LoggingMessage.LoggingLevel level = 1;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(com.android.build.gradle.internal.cxx.logging.LoggingMessage.LoggingLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.LoggingMessage.LoggingLevel level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      level_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object file_ = "";
    /**
     * <code>string file = 3;</code>
     * @return The file.
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        file_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file = 3;</code>
     * @return The bytes for file.
     */
    public com.google.protobuf.ByteString
        getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file = 3;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      file_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string file = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      file_ = getDefaultInstance().getFile();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string file = 3;</code>
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      file_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     * <code>string tag = 4;</code>
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tag = 4;</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tag = 4;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tag_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      tag_ = getDefaultInstance().getTag();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string tag = 4;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tag_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int diagnosticCode_ ;
    /**
     * <code>int32 diagnostic_code = 5;</code>
     * @return The diagnosticCode.
     */
    @java.lang.Override
    public int getDiagnosticCode() {
      return diagnosticCode_;
    }
    /**
     * <code>int32 diagnostic_code = 5;</code>
     * @param value The diagnosticCode to set.
     * @return This builder for chaining.
     */
    public Builder setDiagnosticCode(int value) {

      diagnosticCode_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 diagnostic_code = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiagnosticCode() {
      bitField0_ = (bitField0_ & ~0x00000010);
      diagnosticCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:LoggingMessage)
  }

  // @@protoc_insertion_point(class_scope:LoggingMessage)
  private static final com.android.build.gradle.internal.cxx.logging.LoggingMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.build.gradle.internal.cxx.logging.LoggingMessage();
  }

  public static com.android.build.gradle.internal.cxx.logging.LoggingMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingMessage>
      PARSER = new com.google.protobuf.AbstractParser<LoggingMessage>() {
    @java.lang.Override
    public LoggingMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoggingMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.build.gradle.internal.cxx.logging.LoggingMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

