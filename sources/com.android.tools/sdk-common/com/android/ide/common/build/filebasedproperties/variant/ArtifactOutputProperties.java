// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/variant_properties.proto

package com.android.ide.common.build.filebasedproperties.variant;

/**
 * <pre>
 * Common properties for variant producing an APK or Bundle.
 * </pre>
 *
 * Protobuf type {@code ArtifactOutputProperties}
 */
public final class ArtifactOutputProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ArtifactOutputProperties)
    ArtifactOutputPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArtifactOutputProperties.newBuilder() to construct.
  private ArtifactOutputProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArtifactOutputProperties() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArtifactOutputProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ArtifactOutputProperties(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              manifestPlaceholders_ = com.google.protobuf.MapField.newMapField(
                  ManifestPlaceholdersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            manifestPlaceholders__ = input.readMessage(
                ManifestPlaceholdersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            manifestPlaceholders_.getMutableMap().put(
                manifestPlaceholders__.getKey(), manifestPlaceholders__.getValue());
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
    return com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetManifestPlaceholders();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.class, com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.Builder.class);
  }

  public static final int MANIFESTPLACEHOLDERS_FIELD_NUMBER = 1;
  private static final class ManifestPlaceholdersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_ManifestPlaceholdersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> manifestPlaceholders_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetManifestPlaceholders() {
    if (manifestPlaceholders_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ManifestPlaceholdersDefaultEntryHolder.defaultEntry);
    }
    return manifestPlaceholders_;
  }

  public int getManifestPlaceholdersCount() {
    return internalGetManifestPlaceholders().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */

  @java.lang.Override
  public boolean containsManifestPlaceholders(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetManifestPlaceholders().getMap().containsKey(key);
  }
  /**
   * Use {@link #getManifestPlaceholdersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getManifestPlaceholders() {
    return getManifestPlaceholdersMap();
  }
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getManifestPlaceholdersMap() {
    return internalGetManifestPlaceholders().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getManifestPlaceholdersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetManifestPlaceholders().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getManifestPlaceholdersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetManifestPlaceholders().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetManifestPlaceholders(),
        ManifestPlaceholdersDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetManifestPlaceholders().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      manifestPlaceholders__ = ManifestPlaceholdersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, manifestPlaceholders__);
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
    if (!(obj instanceof com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties)) {
      return super.equals(obj);
    }
    com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties other = (com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties) obj;

    if (!internalGetManifestPlaceholders().equals(
        other.internalGetManifestPlaceholders())) return false;
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
    if (!internalGetManifestPlaceholders().getMap().isEmpty()) {
      hash = (37 * hash) + MANIFESTPLACEHOLDERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetManifestPlaceholders().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parseFrom(
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
  public static Builder newBuilder(com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties prototype) {
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
   * Common properties for variant producing an APK or Bundle.
   * </pre>
   *
   * Protobuf type {@code ArtifactOutputProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ArtifactOutputProperties)
      com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetManifestPlaceholders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableManifestPlaceholders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.class, com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.Builder.class);
    }

    // Construct using com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.newBuilder()
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
      internalGetMutableManifestPlaceholders().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.ide.common.build.filebasedproperties.variant.VariantPropertiesOuterClass.internal_static_ArtifactOutputProperties_descriptor;
    }

    @java.lang.Override
    public com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties getDefaultInstanceForType() {
      return com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties build() {
      com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties buildPartial() {
      com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties result = new com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties(this);
      int from_bitField0_ = bitField0_;
      result.manifestPlaceholders_ = internalGetManifestPlaceholders();
      result.manifestPlaceholders_.makeImmutable();
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
      if (other instanceof com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties) {
        return mergeFrom((com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties other) {
      if (other == com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties.getDefaultInstance()) return this;
      internalGetMutableManifestPlaceholders().mergeFrom(
          other.internalGetManifestPlaceholders());
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
      com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> manifestPlaceholders_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetManifestPlaceholders() {
      if (manifestPlaceholders_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ManifestPlaceholdersDefaultEntryHolder.defaultEntry);
      }
      return manifestPlaceholders_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableManifestPlaceholders() {
      onChanged();;
      if (manifestPlaceholders_ == null) {
        manifestPlaceholders_ = com.google.protobuf.MapField.newMapField(
            ManifestPlaceholdersDefaultEntryHolder.defaultEntry);
      }
      if (!manifestPlaceholders_.isMutable()) {
        manifestPlaceholders_ = manifestPlaceholders_.copy();
      }
      return manifestPlaceholders_;
    }

    public int getManifestPlaceholdersCount() {
      return internalGetManifestPlaceholders().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */

    @java.lang.Override
    public boolean containsManifestPlaceholders(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetManifestPlaceholders().getMap().containsKey(key);
    }
    /**
     * Use {@link #getManifestPlaceholdersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getManifestPlaceholders() {
      return getManifestPlaceholdersMap();
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getManifestPlaceholdersMap() {
      return internalGetManifestPlaceholders().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getManifestPlaceholdersOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetManifestPlaceholders().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getManifestPlaceholdersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetManifestPlaceholders().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearManifestPlaceholders() {
      internalGetMutableManifestPlaceholders().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */

    public Builder removeManifestPlaceholders(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableManifestPlaceholders().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableManifestPlaceholders() {
      return internalGetMutableManifestPlaceholders().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */
    public Builder putManifestPlaceholders(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableManifestPlaceholders().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
     */

    public Builder putAllManifestPlaceholders(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableManifestPlaceholders().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:ArtifactOutputProperties)
  }

  // @@protoc_insertion_point(class_scope:ArtifactOutputProperties)
  private static final com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties();
  }

  public static com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArtifactOutputProperties>
      PARSER = new com.google.protobuf.AbstractParser<ArtifactOutputProperties>() {
    @java.lang.Override
    public ArtifactOutputProperties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ArtifactOutputProperties(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ArtifactOutputProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArtifactOutputProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.ide.common.build.filebasedproperties.variant.ArtifactOutputProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

