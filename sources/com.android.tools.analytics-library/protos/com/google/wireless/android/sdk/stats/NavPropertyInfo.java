// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.NavPropertyInfo}
 */
public  final class NavPropertyInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.NavPropertyInfo)
    NavPropertyInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NavPropertyInfo.newBuilder() to construct.
  private NavPropertyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NavPropertyInfo() {
    property_ = 0;
    containingTag_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NavPropertyInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NavPropertyInfo(
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
            com.google.wireless.android.sdk.stats.NavPropertyInfo.Property value = com.google.wireless.android.sdk.stats.NavPropertyInfo.Property.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              property_ = rawValue;
            }
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType value = com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              containingTag_ = rawValue;
            }
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            wasEmpty_ = input.readBool();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavPropertyInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavPropertyInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.NavPropertyInfo.class, com.google.wireless.android.sdk.stats.NavPropertyInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.NavPropertyInfo.Property}
   */
  public enum Property
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>CUSTOM = 1;</code>
     */
    CUSTOM(1),
    /**
     * <code>ACTION = 2;</code>
     */
    ACTION(2),
    /**
     * <code>ARG_TYPE = 3;</code>
     */
    ARG_TYPE(3),
    /**
     * <code>AUTO_VERIFY = 4;</code>
     */
    AUTO_VERIFY(4),
    /**
     * <code>UNUSED_1 = 5;</code>
     */
    UNUSED_1(5),
    /**
     * <code>DATA = 6;</code>
     */
    DATA(6),
    /**
     * <code>DATA_PATTERN = 7;</code>
     */
    DATA_PATTERN(7),
    /**
     * <code>DEFAULT_NAV_HOST = 8;</code>
     */
    DEFAULT_NAV_HOST(8),
    /**
     * <code>DEFAULT_VALUE = 9;</code>
     */
    DEFAULT_VALUE(9),
    /**
     * <code>DESTINATION = 10;</code>
     */
    DESTINATION(10),
    /**
     * <code>ENTER_ANIM = 11;</code>
     */
    ENTER_ANIM(11),
    /**
     * <code>EXIT_ANIM = 12;</code>
     */
    EXIT_ANIM(12),
    /**
     * <code>GRAPH = 13;</code>
     */
    GRAPH(13),
    /**
     * <code>ID = 14;</code>
     */
    ID(14),
    /**
     * <code>LABEL = 15;</code>
     */
    LABEL(15),
    /**
     * <code>UNUSED_2 = 16;</code>
     */
    UNUSED_2(16),
    /**
     * <code>LAUNCH_SINGLE_TOP = 17;</code>
     */
    LAUNCH_SINGLE_TOP(17),
    /**
     * <code>NAME = 18;</code>
     */
    NAME(18),
    /**
     * <code>NAV_GRAPH = 19;</code>
     */
    NAV_GRAPH(19),
    /**
     * <code>NULLABLE = 20;</code>
     */
    NULLABLE(20),
    /**
     * <code>POP_ENTER_ANIM = 21;</code>
     */
    POP_ENTER_ANIM(21),
    /**
     * <code>POP_EXIT_ANIM = 22;</code>
     */
    POP_EXIT_ANIM(22),
    /**
     * <code>POP_UP_TO = 23;</code>
     */
    POP_UP_TO(23),
    /**
     * <code>POP_UP_TO_INCLUSIVE = 24;</code>
     */
    POP_UP_TO_INCLUSIVE(24),
    /**
     * <code>START_DESTINATION = 25;</code>
     */
    START_DESTINATION(25),
    /**
     * <code>URI = 26;</code>
     */
    URI(26),
    /**
     * <code>MIME_TYPE = 27;</code>
     */
    MIME_TYPE(27),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>CUSTOM = 1;</code>
     */
    public static final int CUSTOM_VALUE = 1;
    /**
     * <code>ACTION = 2;</code>
     */
    public static final int ACTION_VALUE = 2;
    /**
     * <code>ARG_TYPE = 3;</code>
     */
    public static final int ARG_TYPE_VALUE = 3;
    /**
     * <code>AUTO_VERIFY = 4;</code>
     */
    public static final int AUTO_VERIFY_VALUE = 4;
    /**
     * <code>UNUSED_1 = 5;</code>
     */
    public static final int UNUSED_1_VALUE = 5;
    /**
     * <code>DATA = 6;</code>
     */
    public static final int DATA_VALUE = 6;
    /**
     * <code>DATA_PATTERN = 7;</code>
     */
    public static final int DATA_PATTERN_VALUE = 7;
    /**
     * <code>DEFAULT_NAV_HOST = 8;</code>
     */
    public static final int DEFAULT_NAV_HOST_VALUE = 8;
    /**
     * <code>DEFAULT_VALUE = 9;</code>
     */
    public static final int DEFAULT_VALUE_VALUE = 9;
    /**
     * <code>DESTINATION = 10;</code>
     */
    public static final int DESTINATION_VALUE = 10;
    /**
     * <code>ENTER_ANIM = 11;</code>
     */
    public static final int ENTER_ANIM_VALUE = 11;
    /**
     * <code>EXIT_ANIM = 12;</code>
     */
    public static final int EXIT_ANIM_VALUE = 12;
    /**
     * <code>GRAPH = 13;</code>
     */
    public static final int GRAPH_VALUE = 13;
    /**
     * <code>ID = 14;</code>
     */
    public static final int ID_VALUE = 14;
    /**
     * <code>LABEL = 15;</code>
     */
    public static final int LABEL_VALUE = 15;
    /**
     * <code>UNUSED_2 = 16;</code>
     */
    public static final int UNUSED_2_VALUE = 16;
    /**
     * <code>LAUNCH_SINGLE_TOP = 17;</code>
     */
    public static final int LAUNCH_SINGLE_TOP_VALUE = 17;
    /**
     * <code>NAME = 18;</code>
     */
    public static final int NAME_VALUE = 18;
    /**
     * <code>NAV_GRAPH = 19;</code>
     */
    public static final int NAV_GRAPH_VALUE = 19;
    /**
     * <code>NULLABLE = 20;</code>
     */
    public static final int NULLABLE_VALUE = 20;
    /**
     * <code>POP_ENTER_ANIM = 21;</code>
     */
    public static final int POP_ENTER_ANIM_VALUE = 21;
    /**
     * <code>POP_EXIT_ANIM = 22;</code>
     */
    public static final int POP_EXIT_ANIM_VALUE = 22;
    /**
     * <code>POP_UP_TO = 23;</code>
     */
    public static final int POP_UP_TO_VALUE = 23;
    /**
     * <code>POP_UP_TO_INCLUSIVE = 24;</code>
     */
    public static final int POP_UP_TO_INCLUSIVE_VALUE = 24;
    /**
     * <code>START_DESTINATION = 25;</code>
     */
    public static final int START_DESTINATION_VALUE = 25;
    /**
     * <code>URI = 26;</code>
     */
    public static final int URI_VALUE = 26;
    /**
     * <code>MIME_TYPE = 27;</code>
     */
    public static final int MIME_TYPE_VALUE = 27;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Property valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Property forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return CUSTOM;
        case 2: return ACTION;
        case 3: return ARG_TYPE;
        case 4: return AUTO_VERIFY;
        case 5: return UNUSED_1;
        case 6: return DATA;
        case 7: return DATA_PATTERN;
        case 8: return DEFAULT_NAV_HOST;
        case 9: return DEFAULT_VALUE;
        case 10: return DESTINATION;
        case 11: return ENTER_ANIM;
        case 12: return EXIT_ANIM;
        case 13: return GRAPH;
        case 14: return ID;
        case 15: return LABEL;
        case 16: return UNUSED_2;
        case 17: return LAUNCH_SINGLE_TOP;
        case 18: return NAME;
        case 19: return NAV_GRAPH;
        case 20: return NULLABLE;
        case 21: return POP_ENTER_ANIM;
        case 22: return POP_EXIT_ANIM;
        case 23: return POP_UP_TO;
        case 24: return POP_UP_TO_INCLUSIVE;
        case 25: return START_DESTINATION;
        case 26: return URI;
        case 27: return MIME_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Property>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Property> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Property>() {
            public Property findValueByNumber(int number) {
              return Property.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.NavPropertyInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final Property[] VALUES = values();

    public static Property valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Property(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.NavPropertyInfo.Property)
  }

  /**
   * Protobuf enum {@code android_studio.NavPropertyInfo.TagType}
   */
  public enum TagType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_TAG = 0;</code>
     */
    UNKNOWN_TAG(0),
    /**
     * <code>CUSTOM_TAG = 1;</code>
     */
    CUSTOM_TAG(1),
    /**
     * <code>ACTION_TAG = 2;</code>
     */
    ACTION_TAG(2),
    /**
     * <code>DEEPLINK_TAG = 3;</code>
     */
    DEEPLINK_TAG(3),
    /**
     * <code>FRAGMENT_TAG = 4;</code>
     */
    FRAGMENT_TAG(4),
    /**
     * <code>ACTIVITY_TAG = 5;</code>
     */
    ACTIVITY_TAG(5),
    /**
     * <code>NAVIGATION_TAG = 6;</code>
     */
    NAVIGATION_TAG(6),
    /**
     * <code>INCLUDE_TAG = 7;</code>
     */
    INCLUDE_TAG(7),
    /**
     * <code>ARGUMENT_TAG = 8;</code>
     */
    ARGUMENT_TAG(8),
    ;

    /**
     * <code>UNKNOWN_TAG = 0;</code>
     */
    public static final int UNKNOWN_TAG_VALUE = 0;
    /**
     * <code>CUSTOM_TAG = 1;</code>
     */
    public static final int CUSTOM_TAG_VALUE = 1;
    /**
     * <code>ACTION_TAG = 2;</code>
     */
    public static final int ACTION_TAG_VALUE = 2;
    /**
     * <code>DEEPLINK_TAG = 3;</code>
     */
    public static final int DEEPLINK_TAG_VALUE = 3;
    /**
     * <code>FRAGMENT_TAG = 4;</code>
     */
    public static final int FRAGMENT_TAG_VALUE = 4;
    /**
     * <code>ACTIVITY_TAG = 5;</code>
     */
    public static final int ACTIVITY_TAG_VALUE = 5;
    /**
     * <code>NAVIGATION_TAG = 6;</code>
     */
    public static final int NAVIGATION_TAG_VALUE = 6;
    /**
     * <code>INCLUDE_TAG = 7;</code>
     */
    public static final int INCLUDE_TAG_VALUE = 7;
    /**
     * <code>ARGUMENT_TAG = 8;</code>
     */
    public static final int ARGUMENT_TAG_VALUE = 8;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TagType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TagType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_TAG;
        case 1: return CUSTOM_TAG;
        case 2: return ACTION_TAG;
        case 3: return DEEPLINK_TAG;
        case 4: return FRAGMENT_TAG;
        case 5: return ACTIVITY_TAG;
        case 6: return NAVIGATION_TAG;
        case 7: return INCLUDE_TAG;
        case 8: return ARGUMENT_TAG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TagType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TagType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TagType>() {
            public TagType findValueByNumber(int number) {
              return TagType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.NavPropertyInfo.getDescriptor().getEnumTypes().get(1);
    }

    private static final TagType[] VALUES = values();

    public static TagType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TagType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.NavPropertyInfo.TagType)
  }

  private int bitField0_;
  public static final int PROPERTY_FIELD_NUMBER = 1;
  private int property_;
  /**
   * <pre>
   * The property affected.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
   * @return Whether the property field is set.
   */
  public boolean hasProperty() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The property affected.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
   * @return The property.
   */
  public com.google.wireless.android.sdk.stats.NavPropertyInfo.Property getProperty() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.NavPropertyInfo.Property result = com.google.wireless.android.sdk.stats.NavPropertyInfo.Property.valueOf(property_);
    return result == null ? com.google.wireless.android.sdk.stats.NavPropertyInfo.Property.UNKNOWN : result;
  }

  public static final int CONTAINING_TAG_FIELD_NUMBER = 2;
  private int containingTag_;
  /**
   * <pre>
   * Type of the containing tag.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
   * @return Whether the containingTag field is set.
   */
  public boolean hasContainingTag() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Type of the containing tag.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
   * @return The containingTag.
   */
  public com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType getContainingTag() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType result = com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType.valueOf(containingTag_);
    return result == null ? com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType.UNKNOWN_TAG : result;
  }

  public static final int WAS_EMPTY_FIELD_NUMBER = 3;
  private boolean wasEmpty_;
  /**
   * <pre>
   * Whether the property was empty prior to being set just now.
   * </pre>
   *
   * <code>optional bool was_empty = 3;</code>
   * @return Whether the wasEmpty field is set.
   */
  public boolean hasWasEmpty() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether the property was empty prior to being set just now.
   * </pre>
   *
   * <code>optional bool was_empty = 3;</code>
   * @return The wasEmpty.
   */
  public boolean getWasEmpty() {
    return wasEmpty_;
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
      output.writeEnum(1, property_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, containingTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, wasEmpty_);
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
        .computeEnumSize(1, property_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, containingTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, wasEmpty_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.NavPropertyInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.NavPropertyInfo other = (com.google.wireless.android.sdk.stats.NavPropertyInfo) obj;

    if (hasProperty() != other.hasProperty()) return false;
    if (hasProperty()) {
      if (property_ != other.property_) return false;
    }
    if (hasContainingTag() != other.hasContainingTag()) return false;
    if (hasContainingTag()) {
      if (containingTag_ != other.containingTag_) return false;
    }
    if (hasWasEmpty() != other.hasWasEmpty()) return false;
    if (hasWasEmpty()) {
      if (getWasEmpty()
          != other.getWasEmpty()) return false;
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
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + property_;
    }
    if (hasContainingTag()) {
      hash = (37 * hash) + CONTAINING_TAG_FIELD_NUMBER;
      hash = (53 * hash) + containingTag_;
    }
    if (hasWasEmpty()) {
      hash = (37 * hash) + WAS_EMPTY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getWasEmpty());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.NavPropertyInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.NavPropertyInfo prototype) {
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
   * Protobuf type {@code android_studio.NavPropertyInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.NavPropertyInfo)
      com.google.wireless.android.sdk.stats.NavPropertyInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavPropertyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavPropertyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.NavPropertyInfo.class, com.google.wireless.android.sdk.stats.NavPropertyInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.NavPropertyInfo.newBuilder()
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
      property_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      containingTag_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      wasEmpty_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_NavPropertyInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavPropertyInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.NavPropertyInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavPropertyInfo build() {
      com.google.wireless.android.sdk.stats.NavPropertyInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.NavPropertyInfo buildPartial() {
      com.google.wireless.android.sdk.stats.NavPropertyInfo result = new com.google.wireless.android.sdk.stats.NavPropertyInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.property_ = property_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.containingTag_ = containingTag_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.wasEmpty_ = wasEmpty_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.NavPropertyInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.NavPropertyInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.NavPropertyInfo other) {
      if (other == com.google.wireless.android.sdk.stats.NavPropertyInfo.getDefaultInstance()) return this;
      if (other.hasProperty()) {
        setProperty(other.getProperty());
      }
      if (other.hasContainingTag()) {
        setContainingTag(other.getContainingTag());
      }
      if (other.hasWasEmpty()) {
        setWasEmpty(other.getWasEmpty());
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
      com.google.wireless.android.sdk.stats.NavPropertyInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.NavPropertyInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int property_ = 0;
    /**
     * <pre>
     * The property affected.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
     * @return Whether the property field is set.
     */
    public boolean hasProperty() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The property affected.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
     * @return The property.
     */
    public com.google.wireless.android.sdk.stats.NavPropertyInfo.Property getProperty() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.NavPropertyInfo.Property result = com.google.wireless.android.sdk.stats.NavPropertyInfo.Property.valueOf(property_);
      return result == null ? com.google.wireless.android.sdk.stats.NavPropertyInfo.Property.UNKNOWN : result;
    }
    /**
     * <pre>
     * The property affected.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
     * @param value The property to set.
     * @return This builder for chaining.
     */
    public Builder setProperty(com.google.wireless.android.sdk.stats.NavPropertyInfo.Property value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      property_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The property affected.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProperty() {
      bitField0_ = (bitField0_ & ~0x00000001);
      property_ = 0;
      onChanged();
      return this;
    }

    private int containingTag_ = 0;
    /**
     * <pre>
     * Type of the containing tag.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
     * @return Whether the containingTag field is set.
     */
    public boolean hasContainingTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Type of the containing tag.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
     * @return The containingTag.
     */
    public com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType getContainingTag() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType result = com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType.valueOf(containingTag_);
      return result == null ? com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType.UNKNOWN_TAG : result;
    }
    /**
     * <pre>
     * Type of the containing tag.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
     * @param value The containingTag to set.
     * @return This builder for chaining.
     */
    public Builder setContainingTag(com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      containingTag_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the containing tag.
     * </pre>
     *
     * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContainingTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      containingTag_ = 0;
      onChanged();
      return this;
    }

    private boolean wasEmpty_ ;
    /**
     * <pre>
     * Whether the property was empty prior to being set just now.
     * </pre>
     *
     * <code>optional bool was_empty = 3;</code>
     * @return Whether the wasEmpty field is set.
     */
    public boolean hasWasEmpty() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Whether the property was empty prior to being set just now.
     * </pre>
     *
     * <code>optional bool was_empty = 3;</code>
     * @return The wasEmpty.
     */
    public boolean getWasEmpty() {
      return wasEmpty_;
    }
    /**
     * <pre>
     * Whether the property was empty prior to being set just now.
     * </pre>
     *
     * <code>optional bool was_empty = 3;</code>
     * @param value The wasEmpty to set.
     * @return This builder for chaining.
     */
    public Builder setWasEmpty(boolean value) {
      bitField0_ |= 0x00000004;
      wasEmpty_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the property was empty prior to being set just now.
     * </pre>
     *
     * <code>optional bool was_empty = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWasEmpty() {
      bitField0_ = (bitField0_ & ~0x00000004);
      wasEmpty_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.NavPropertyInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.NavPropertyInfo)
  private static final com.google.wireless.android.sdk.stats.NavPropertyInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.NavPropertyInfo();
  }

  public static com.google.wireless.android.sdk.stats.NavPropertyInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<NavPropertyInfo>
      PARSER = new com.google.protobuf.AbstractParser<NavPropertyInfo>() {
    @java.lang.Override
    public NavPropertyInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NavPropertyInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NavPropertyInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NavPropertyInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.NavPropertyInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

