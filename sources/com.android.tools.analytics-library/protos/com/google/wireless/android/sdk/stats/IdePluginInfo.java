// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.IdePluginInfo}
 */
public final class IdePluginInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.IdePluginInfo)
    IdePluginInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdePluginInfo.newBuilder() to construct.
  private IdePluginInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdePluginInfo() {
    plugins_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdePluginInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IdePluginInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IdePluginInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.IdePluginInfo.class, com.google.wireless.android.sdk.stats.IdePluginInfo.Builder.class);
  }

  public static final int PLUGINS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.wireless.android.sdk.stats.IdePlugin> plugins_;
  /**
   * <pre>
   * The set of plugins enabled for the current session.
   * </pre>
   *
   * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.wireless.android.sdk.stats.IdePlugin> getPluginsList() {
    return plugins_;
  }
  /**
   * <pre>
   * The set of plugins enabled for the current session.
   * </pre>
   *
   * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.wireless.android.sdk.stats.IdePluginOrBuilder> 
      getPluginsOrBuilderList() {
    return plugins_;
  }
  /**
   * <pre>
   * The set of plugins enabled for the current session.
   * </pre>
   *
   * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
   */
  @java.lang.Override
  public int getPluginsCount() {
    return plugins_.size();
  }
  /**
   * <pre>
   * The set of plugins enabled for the current session.
   * </pre>
   *
   * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
   */
  @java.lang.Override
  public com.google.wireless.android.sdk.stats.IdePlugin getPlugins(int index) {
    return plugins_.get(index);
  }
  /**
   * <pre>
   * The set of plugins enabled for the current session.
   * </pre>
   *
   * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
   */
  @java.lang.Override
  public com.google.wireless.android.sdk.stats.IdePluginOrBuilder getPluginsOrBuilder(
      int index) {
    return plugins_.get(index);
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
    for (int i = 0; i < plugins_.size(); i++) {
      output.writeMessage(1, plugins_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < plugins_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, plugins_.get(i));
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.IdePluginInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.IdePluginInfo other = (com.google.wireless.android.sdk.stats.IdePluginInfo) obj;

    if (!getPluginsList()
        .equals(other.getPluginsList())) return false;
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
    if (getPluginsCount() > 0) {
      hash = (37 * hash) + PLUGINS_FIELD_NUMBER;
      hash = (53 * hash) + getPluginsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.IdePluginInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.IdePluginInfo prototype) {
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
   * Protobuf type {@code android_studio.IdePluginInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.IdePluginInfo)
      com.google.wireless.android.sdk.stats.IdePluginInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IdePluginInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IdePluginInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.IdePluginInfo.class, com.google.wireless.android.sdk.stats.IdePluginInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.IdePluginInfo.newBuilder()
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
      if (pluginsBuilder_ == null) {
        plugins_ = java.util.Collections.emptyList();
      } else {
        plugins_ = null;
        pluginsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_IdePluginInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IdePluginInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.IdePluginInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IdePluginInfo build() {
      com.google.wireless.android.sdk.stats.IdePluginInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.IdePluginInfo buildPartial() {
      com.google.wireless.android.sdk.stats.IdePluginInfo result = new com.google.wireless.android.sdk.stats.IdePluginInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.wireless.android.sdk.stats.IdePluginInfo result) {
      if (pluginsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          plugins_ = java.util.Collections.unmodifiableList(plugins_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.plugins_ = plugins_;
      } else {
        result.plugins_ = pluginsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.IdePluginInfo result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.IdePluginInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.IdePluginInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.IdePluginInfo other) {
      if (other == com.google.wireless.android.sdk.stats.IdePluginInfo.getDefaultInstance()) return this;
      if (pluginsBuilder_ == null) {
        if (!other.plugins_.isEmpty()) {
          if (plugins_.isEmpty()) {
            plugins_ = other.plugins_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePluginsIsMutable();
            plugins_.addAll(other.plugins_);
          }
          onChanged();
        }
      } else {
        if (!other.plugins_.isEmpty()) {
          if (pluginsBuilder_.isEmpty()) {
            pluginsBuilder_.dispose();
            pluginsBuilder_ = null;
            plugins_ = other.plugins_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pluginsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPluginsFieldBuilder() : null;
          } else {
            pluginsBuilder_.addAllMessages(other.plugins_);
          }
        }
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
            case 10: {
              com.google.wireless.android.sdk.stats.IdePlugin m =
                  input.readMessage(
                      com.google.wireless.android.sdk.stats.IdePlugin.PARSER,
                      extensionRegistry);
              if (pluginsBuilder_ == null) {
                ensurePluginsIsMutable();
                plugins_.add(m);
              } else {
                pluginsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.wireless.android.sdk.stats.IdePlugin> plugins_ =
      java.util.Collections.emptyList();
    private void ensurePluginsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        plugins_ = new java.util.ArrayList<com.google.wireless.android.sdk.stats.IdePlugin>(plugins_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.wireless.android.sdk.stats.IdePlugin, com.google.wireless.android.sdk.stats.IdePlugin.Builder, com.google.wireless.android.sdk.stats.IdePluginOrBuilder> pluginsBuilder_;

    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public java.util.List<com.google.wireless.android.sdk.stats.IdePlugin> getPluginsList() {
      if (pluginsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(plugins_);
      } else {
        return pluginsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public int getPluginsCount() {
      if (pluginsBuilder_ == null) {
        return plugins_.size();
      } else {
        return pluginsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.IdePlugin getPlugins(int index) {
      if (pluginsBuilder_ == null) {
        return plugins_.get(index);
      } else {
        return pluginsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder setPlugins(
        int index, com.google.wireless.android.sdk.stats.IdePlugin value) {
      if (pluginsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePluginsIsMutable();
        plugins_.set(index, value);
        onChanged();
      } else {
        pluginsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder setPlugins(
        int index, com.google.wireless.android.sdk.stats.IdePlugin.Builder builderForValue) {
      if (pluginsBuilder_ == null) {
        ensurePluginsIsMutable();
        plugins_.set(index, builderForValue.build());
        onChanged();
      } else {
        pluginsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder addPlugins(com.google.wireless.android.sdk.stats.IdePlugin value) {
      if (pluginsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePluginsIsMutable();
        plugins_.add(value);
        onChanged();
      } else {
        pluginsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder addPlugins(
        int index, com.google.wireless.android.sdk.stats.IdePlugin value) {
      if (pluginsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePluginsIsMutable();
        plugins_.add(index, value);
        onChanged();
      } else {
        pluginsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder addPlugins(
        com.google.wireless.android.sdk.stats.IdePlugin.Builder builderForValue) {
      if (pluginsBuilder_ == null) {
        ensurePluginsIsMutable();
        plugins_.add(builderForValue.build());
        onChanged();
      } else {
        pluginsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder addPlugins(
        int index, com.google.wireless.android.sdk.stats.IdePlugin.Builder builderForValue) {
      if (pluginsBuilder_ == null) {
        ensurePluginsIsMutable();
        plugins_.add(index, builderForValue.build());
        onChanged();
      } else {
        pluginsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder addAllPlugins(
        java.lang.Iterable<? extends com.google.wireless.android.sdk.stats.IdePlugin> values) {
      if (pluginsBuilder_ == null) {
        ensurePluginsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, plugins_);
        onChanged();
      } else {
        pluginsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder clearPlugins() {
      if (pluginsBuilder_ == null) {
        plugins_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pluginsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public Builder removePlugins(int index) {
      if (pluginsBuilder_ == null) {
        ensurePluginsIsMutable();
        plugins_.remove(index);
        onChanged();
      } else {
        pluginsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.IdePlugin.Builder getPluginsBuilder(
        int index) {
      return getPluginsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.IdePluginOrBuilder getPluginsOrBuilder(
        int index) {
      if (pluginsBuilder_ == null) {
        return plugins_.get(index);  } else {
        return pluginsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public java.util.List<? extends com.google.wireless.android.sdk.stats.IdePluginOrBuilder> 
         getPluginsOrBuilderList() {
      if (pluginsBuilder_ != null) {
        return pluginsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(plugins_);
      }
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.IdePlugin.Builder addPluginsBuilder() {
      return getPluginsFieldBuilder().addBuilder(
          com.google.wireless.android.sdk.stats.IdePlugin.getDefaultInstance());
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public com.google.wireless.android.sdk.stats.IdePlugin.Builder addPluginsBuilder(
        int index) {
      return getPluginsFieldBuilder().addBuilder(
          index, com.google.wireless.android.sdk.stats.IdePlugin.getDefaultInstance());
    }
    /**
     * <pre>
     * The set of plugins enabled for the current session.
     * </pre>
     *
     * <code>repeated .android_studio.IdePlugin plugins = 1;</code>
     */
    public java.util.List<com.google.wireless.android.sdk.stats.IdePlugin.Builder> 
         getPluginsBuilderList() {
      return getPluginsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.wireless.android.sdk.stats.IdePlugin, com.google.wireless.android.sdk.stats.IdePlugin.Builder, com.google.wireless.android.sdk.stats.IdePluginOrBuilder> 
        getPluginsFieldBuilder() {
      if (pluginsBuilder_ == null) {
        pluginsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.wireless.android.sdk.stats.IdePlugin, com.google.wireless.android.sdk.stats.IdePlugin.Builder, com.google.wireless.android.sdk.stats.IdePluginOrBuilder>(
                plugins_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        plugins_ = null;
      }
      return pluginsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:android_studio.IdePluginInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.IdePluginInfo)
  private static final com.google.wireless.android.sdk.stats.IdePluginInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.IdePluginInfo();
  }

  public static com.google.wireless.android.sdk.stats.IdePluginInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<IdePluginInfo>
      PARSER = new com.google.protobuf.AbstractParser<IdePluginInfo>() {
    @java.lang.Override
    public IdePluginInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<IdePluginInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdePluginInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.IdePluginInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

