// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/android_additional_test_output_config.proto

package com.android.tools.utp.plugins.host.additionaltestoutput.proto;

public final class AndroidAdditionalTestOutputConfigProto {
  private AndroidAdditionalTestOutputConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AndroidAdditionalTestOutputConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * A path to the output directory on device.
     * Tests may output additional test outputs into this directory.
     * After each test case, files in the directory are copied to the
     * host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_device = 1;</code>
     * @return The additionalOutputDirectoryOnDevice.
     */
    java.lang.String getAdditionalOutputDirectoryOnDevice();
    /**
     * <pre>
     * A path to the output directory on device.
     * Tests may output additional test outputs into this directory.
     * After each test case, files in the directory are copied to the
     * host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_device = 1;</code>
     * @return The bytes for additionalOutputDirectoryOnDevice.
     */
    com.google.protobuf.ByteString
        getAdditionalOutputDirectoryOnDeviceBytes();

    /**
     * <pre>
     * A path to the output directory on host.
     * This is the destination directory. After each test case,
     * files on test device are copied into this directory on host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_host = 2;</code>
     * @return The additionalOutputDirectoryOnHost.
     */
    java.lang.String getAdditionalOutputDirectoryOnHost();
    /**
     * <pre>
     * A path to the output directory on host.
     * This is the destination directory. After each test case,
     * files on test device are copied into this directory on host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_host = 2;</code>
     * @return The bytes for additionalOutputDirectoryOnHost.
     */
    com.google.protobuf.ByteString
        getAdditionalOutputDirectoryOnHostBytes();
  }
  /**
   * <pre>
   * A configuration of AndroidAdditionalTestOutput plugin.
   * </pre>
   *
   * Protobuf type {@code com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig}
   */
  public static final class AndroidAdditionalTestOutputConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig)
      AndroidAdditionalTestOutputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AndroidAdditionalTestOutputConfig.newBuilder() to construct.
    private AndroidAdditionalTestOutputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AndroidAdditionalTestOutputConfig() {
      additionalOutputDirectoryOnDevice_ = "";
      additionalOutputDirectoryOnHost_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AndroidAdditionalTestOutputConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AndroidAdditionalTestOutputConfig(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              java.lang.String s = input.readStringRequireUtf8();

              additionalOutputDirectoryOnDevice_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              additionalOutputDirectoryOnHost_ = s;
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
      return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.class, com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.Builder.class);
    }

    public static final int ADDITIONAL_OUTPUT_DIRECTORY_ON_DEVICE_FIELD_NUMBER = 1;
    private volatile java.lang.Object additionalOutputDirectoryOnDevice_;
    /**
     * <pre>
     * A path to the output directory on device.
     * Tests may output additional test outputs into this directory.
     * After each test case, files in the directory are copied to the
     * host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_device = 1;</code>
     * @return The additionalOutputDirectoryOnDevice.
     */
    @java.lang.Override
    public java.lang.String getAdditionalOutputDirectoryOnDevice() {
      java.lang.Object ref = additionalOutputDirectoryOnDevice_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        additionalOutputDirectoryOnDevice_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * A path to the output directory on device.
     * Tests may output additional test outputs into this directory.
     * After each test case, files in the directory are copied to the
     * host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_device = 1;</code>
     * @return The bytes for additionalOutputDirectoryOnDevice.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdditionalOutputDirectoryOnDeviceBytes() {
      java.lang.Object ref = additionalOutputDirectoryOnDevice_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        additionalOutputDirectoryOnDevice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDITIONAL_OUTPUT_DIRECTORY_ON_HOST_FIELD_NUMBER = 2;
    private volatile java.lang.Object additionalOutputDirectoryOnHost_;
    /**
     * <pre>
     * A path to the output directory on host.
     * This is the destination directory. After each test case,
     * files on test device are copied into this directory on host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_host = 2;</code>
     * @return The additionalOutputDirectoryOnHost.
     */
    @java.lang.Override
    public java.lang.String getAdditionalOutputDirectoryOnHost() {
      java.lang.Object ref = additionalOutputDirectoryOnHost_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        additionalOutputDirectoryOnHost_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * A path to the output directory on host.
     * This is the destination directory. After each test case,
     * files on test device are copied into this directory on host machine.
     * </pre>
     *
     * <code>string additional_output_directory_on_host = 2;</code>
     * @return The bytes for additionalOutputDirectoryOnHost.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdditionalOutputDirectoryOnHostBytes() {
      java.lang.Object ref = additionalOutputDirectoryOnHost_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        additionalOutputDirectoryOnHost_ = b;
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
      if (!getAdditionalOutputDirectoryOnDeviceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, additionalOutputDirectoryOnDevice_);
      }
      if (!getAdditionalOutputDirectoryOnHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, additionalOutputDirectoryOnHost_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAdditionalOutputDirectoryOnDeviceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, additionalOutputDirectoryOnDevice_);
      }
      if (!getAdditionalOutputDirectoryOnHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, additionalOutputDirectoryOnHost_);
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
      if (!(obj instanceof com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig)) {
        return super.equals(obj);
      }
      com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig other = (com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig) obj;

      if (!getAdditionalOutputDirectoryOnDevice()
          .equals(other.getAdditionalOutputDirectoryOnDevice())) return false;
      if (!getAdditionalOutputDirectoryOnHost()
          .equals(other.getAdditionalOutputDirectoryOnHost())) return false;
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
      hash = (37 * hash) + ADDITIONAL_OUTPUT_DIRECTORY_ON_DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalOutputDirectoryOnDevice().hashCode();
      hash = (37 * hash) + ADDITIONAL_OUTPUT_DIRECTORY_ON_HOST_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalOutputDirectoryOnHost().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parseFrom(
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
    public static Builder newBuilder(com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig prototype) {
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
     * A configuration of AndroidAdditionalTestOutput plugin.
     * </pre>
     *
     * Protobuf type {@code com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig)
        com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.class, com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.Builder.class);
      }

      // Construct using com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.newBuilder()
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
        additionalOutputDirectoryOnDevice_ = "";

        additionalOutputDirectoryOnHost_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor;
      }

      @java.lang.Override
      public com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig getDefaultInstanceForType() {
        return com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.getDefaultInstance();
      }

      @java.lang.Override
      public com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig build() {
        com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig buildPartial() {
        com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig result = new com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig(this);
        result.additionalOutputDirectoryOnDevice_ = additionalOutputDirectoryOnDevice_;
        result.additionalOutputDirectoryOnHost_ = additionalOutputDirectoryOnHost_;
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
        if (other instanceof com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig) {
          return mergeFrom((com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig other) {
        if (other == com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig.getDefaultInstance()) return this;
        if (!other.getAdditionalOutputDirectoryOnDevice().isEmpty()) {
          additionalOutputDirectoryOnDevice_ = other.additionalOutputDirectoryOnDevice_;
          onChanged();
        }
        if (!other.getAdditionalOutputDirectoryOnHost().isEmpty()) {
          additionalOutputDirectoryOnHost_ = other.additionalOutputDirectoryOnHost_;
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
        com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object additionalOutputDirectoryOnDevice_ = "";
      /**
       * <pre>
       * A path to the output directory on device.
       * Tests may output additional test outputs into this directory.
       * After each test case, files in the directory are copied to the
       * host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_device = 1;</code>
       * @return The additionalOutputDirectoryOnDevice.
       */
      public java.lang.String getAdditionalOutputDirectoryOnDevice() {
        java.lang.Object ref = additionalOutputDirectoryOnDevice_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          additionalOutputDirectoryOnDevice_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * A path to the output directory on device.
       * Tests may output additional test outputs into this directory.
       * After each test case, files in the directory are copied to the
       * host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_device = 1;</code>
       * @return The bytes for additionalOutputDirectoryOnDevice.
       */
      public com.google.protobuf.ByteString
          getAdditionalOutputDirectoryOnDeviceBytes() {
        java.lang.Object ref = additionalOutputDirectoryOnDevice_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          additionalOutputDirectoryOnDevice_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * A path to the output directory on device.
       * Tests may output additional test outputs into this directory.
       * After each test case, files in the directory are copied to the
       * host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_device = 1;</code>
       * @param value The additionalOutputDirectoryOnDevice to set.
       * @return This builder for chaining.
       */
      public Builder setAdditionalOutputDirectoryOnDevice(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        additionalOutputDirectoryOnDevice_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A path to the output directory on device.
       * Tests may output additional test outputs into this directory.
       * After each test case, files in the directory are copied to the
       * host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_device = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAdditionalOutputDirectoryOnDevice() {
        
        additionalOutputDirectoryOnDevice_ = getDefaultInstance().getAdditionalOutputDirectoryOnDevice();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A path to the output directory on device.
       * Tests may output additional test outputs into this directory.
       * After each test case, files in the directory are copied to the
       * host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_device = 1;</code>
       * @param value The bytes for additionalOutputDirectoryOnDevice to set.
       * @return This builder for chaining.
       */
      public Builder setAdditionalOutputDirectoryOnDeviceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        additionalOutputDirectoryOnDevice_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object additionalOutputDirectoryOnHost_ = "";
      /**
       * <pre>
       * A path to the output directory on host.
       * This is the destination directory. After each test case,
       * files on test device are copied into this directory on host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_host = 2;</code>
       * @return The additionalOutputDirectoryOnHost.
       */
      public java.lang.String getAdditionalOutputDirectoryOnHost() {
        java.lang.Object ref = additionalOutputDirectoryOnHost_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          additionalOutputDirectoryOnHost_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * A path to the output directory on host.
       * This is the destination directory. After each test case,
       * files on test device are copied into this directory on host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_host = 2;</code>
       * @return The bytes for additionalOutputDirectoryOnHost.
       */
      public com.google.protobuf.ByteString
          getAdditionalOutputDirectoryOnHostBytes() {
        java.lang.Object ref = additionalOutputDirectoryOnHost_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          additionalOutputDirectoryOnHost_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * A path to the output directory on host.
       * This is the destination directory. After each test case,
       * files on test device are copied into this directory on host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_host = 2;</code>
       * @param value The additionalOutputDirectoryOnHost to set.
       * @return This builder for chaining.
       */
      public Builder setAdditionalOutputDirectoryOnHost(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        additionalOutputDirectoryOnHost_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A path to the output directory on host.
       * This is the destination directory. After each test case,
       * files on test device are copied into this directory on host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_host = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAdditionalOutputDirectoryOnHost() {
        
        additionalOutputDirectoryOnHost_ = getDefaultInstance().getAdditionalOutputDirectoryOnHost();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A path to the output directory on host.
       * This is the destination directory. After each test case,
       * files on test device are copied into this directory on host machine.
       * </pre>
       *
       * <code>string additional_output_directory_on_host = 2;</code>
       * @param value The bytes for additionalOutputDirectoryOnHost to set.
       * @return This builder for chaining.
       */
      public Builder setAdditionalOutputDirectoryOnHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        additionalOutputDirectoryOnHost_ = value;
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


      // @@protoc_insertion_point(builder_scope:com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig)
    }

    // @@protoc_insertion_point(class_scope:com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfig)
    private static final com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig();
    }

    public static com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AndroidAdditionalTestOutputConfig>
        PARSER = new com.google.protobuf.AbstractParser<AndroidAdditionalTestOutputConfig>() {
      @java.lang.Override
      public AndroidAdditionalTestOutputConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AndroidAdditionalTestOutputConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AndroidAdditionalTestOutputConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AndroidAdditionalTestOutputConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.android.tools.utp.plugins.host.additionaltestoutput.proto.AndroidAdditionalTestOutputConfigProto.AndroidAdditionalTestOutputConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:src/main/proto/android_additional_test" +
      "_output_config.proto\022=com.android.tools." +
      "utp.plugins.host.additionaltestoutput.pr" +
      "oto\"\177\n!AndroidAdditionalTestOutputConfig" +
      "\022-\n%additional_output_directory_on_devic" +
      "e\030\001 \001(\t\022+\n#additional_output_directory_o" +
      "n_host\030\002 \001(\tBg\n=com.android.tools.utp.pl" +
      "ugins.host.additionaltestoutput.protoB&A" +
      "ndroidAdditionalTestOutputConfigProtob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_android_tools_utp_plugins_host_additionaltestoutput_proto_AndroidAdditionalTestOutputConfig_descriptor,
        new java.lang.String[] { "AdditionalOutputDirectoryOnDevice", "AdditionalOutputDirectoryOnHost", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
