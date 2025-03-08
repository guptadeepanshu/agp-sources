// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Event related to the resource manager
 * </pre>
 *
 * Protobuf type {@code android_studio.ResourceManagerEvent}
 */
public final class ResourceManagerEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ResourceManagerEvent)
    ResourceManagerEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceManagerEvent.newBuilder() to construct.
  private ResourceManagerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceManagerEvent() {
    kind_ = 0;
    resourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceManagerEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ResourceManagerEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ResourceManagerEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ResourceManagerEvent.class, com.google.wireless.android.sdk.stats.ResourceManagerEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ResourceManagerEvent.Kind}
   */
  public enum Kind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_KIND = 0;</code>
     */
    UNKNOWN_EVENT_KIND(0),
    /**
     * <pre>
     * Resource Manager tool window is openend
     * </pre>
     *
     * <code>TOOL_WINDOW_OPEN = 1;</code>
     */
    TOOL_WINDOW_OPEN(1),
    /**
     * <pre>
     * Resource Manager opened as Resource Picker Dialog
     * </pre>
     *
     * <code>RESOURCE_PICKER_DIALOG_OPEN = 17;</code>
     */
    RESOURCE_PICKER_DIALOG_OPEN(17),
    /**
     * <pre>
     * Asset added pressing the "Import Drawable" action
     * </pre>
     *
     * <code>ASSET_ADDED_VIA_BUTTON = 2;</code>
     */
    ASSET_ADDED_VIA_BUTTON(2),
    /**
     * <pre>
     * Asset added using Drag and Drop on the resource manager
     * </pre>
     *
     * <code>ASSET_ADDED_VIA_DND = 3;</code>
     */
    ASSET_ADDED_VIA_DND(3),
    /**
     * <pre>
     * User open the view showing the different version of a resource
     * </pre>
     *
     * <code>DETAIL_VIEW_OPENED = 4;</code>
     */
    DETAIL_VIEW_OPENED(4),
    /**
     * <pre>
     * A resource has been opened via the resource manager
     * </pre>
     *
     * <code>ASSET_OPENED = 5;</code>
     */
    ASSET_OPENED(5),
    /**
     * <pre>
     * List mode has been changed to grid or list
     * </pre>
     *
     * <code>LIST_MODE_CHANGED = 6;</code>
     */
    LIST_MODE_CHANGED(6),
    /**
     * <pre>
     * User shows or hides dependent module assets
     * </pre>
     *
     * <code>DEPENDENT_MODULES_SHOWN = 18;</code>
     */
    DEPENDENT_MODULES_SHOWN(18),
    /**
     * <code>DEPENDENT_MODULES_HIDDEN = 19;</code>
     */
    DEPENDENT_MODULES_HIDDEN(19),
    /**
     * <pre>
     * User shows or hides libraries assets
     * </pre>
     *
     * <code>LIBRARIES_SHOWN = 7;</code>
     */
    LIBRARIES_SHOWN(7),
    /**
     * <code>LIBRARIES_HIDDEN = 8;</code>
     */
    LIBRARIES_HIDDEN(8),
    /**
     * <pre>
     * User shows or hides framework assets
     * </pre>
     *
     * <code>FRAMEWORK_SHOWN = 20;</code>
     */
    FRAMEWORK_SHOWN(20),
    /**
     * <code>FRAMEWORK_HIDDEN = 21;</code>
     */
    FRAMEWORK_HIDDEN(21),
    /**
     * <pre>
     * User shows or hides theme attributes assets
     * </pre>
     *
     * <code>THEME_ATTR_SHOWN = 22;</code>
     */
    THEME_ATTR_SHOWN(22),
    /**
     * <code>THEME_ATTR_HIDDEN = 23;</code>
     */
    THEME_ATTR_HIDDEN(23),
    /**
     * <pre>
     * User enables a filter by resource type (E.g: Filter 'vector' Drawables)
     * </pre>
     *
     * <code>ENABLE_FILTER_BY_TYPE = 24;</code>
     */
    ENABLE_FILTER_BY_TYPE(24),
    /**
     * <pre>
     * A density indicator was present in the imported file
     * </pre>
     *
     * <code>DENSITY_INFERED = 9;</code>
     */
    DENSITY_INFERED(9),
    /**
     * <pre>
     * Drop events
     * </pre>
     *
     * <code>DROP_ON_XML_BLANK_SPACE = 10;</code>
     */
    DROP_ON_XML_BLANK_SPACE(10),
    /**
     * <code>DROP_ON_XML_TAG = 11;</code>
     */
    DROP_ON_XML_TAG(11),
    /**
     * <code>DROP_ON_XML_ATTRIBUTE = 12;</code>
     */
    DROP_ON_XML_ATTRIBUTE(12),
    /**
     * <code>DROP_ON_LAYOUT_VIEW = 13;</code>
     */
    DROP_ON_LAYOUT_VIEW(13),
    /**
     * <code>DROP_ON_LAYOUT_VIEWGROUP = 14;</code>
     */
    DROP_ON_LAYOUT_VIEWGROUP(14),
    /**
     * <pre>
     * Default drop type when the target does not recognize the resource url
     * type
     * </pre>
     *
     * <code>DROP_AS_TEXT = 15;</code>
     */
    DROP_AS_TEXT(15),
    /**
     * <pre>
     * When user tries to import more resources than the supported number
     * </pre>
     *
     * <code>IMPORT_LIMIT_REACHED = 16;</code>
     */
    IMPORT_LIMIT_REACHED(16),
    /**
     * <pre>
     * When the user manually refreshes the preview of a resource
     * </pre>
     *
     * <code>REFRESH_RES_PREVIEW = 25;</code>
     */
    REFRESH_RES_PREVIEW(25),
    /**
     * <pre>
     * When the user manually refreshes all previews whithin a ResourceType
     * </pre>
     *
     * <code>REFRESH_ALL_RES_TYPE_PREVIEWS = 26;</code>
     */
    REFRESH_ALL_RES_TYPE_PREVIEWS(26),
    ;

    /**
     * <code>UNKNOWN_EVENT_KIND = 0;</code>
     */
    public static final int UNKNOWN_EVENT_KIND_VALUE = 0;
    /**
     * <pre>
     * Resource Manager tool window is openend
     * </pre>
     *
     * <code>TOOL_WINDOW_OPEN = 1;</code>
     */
    public static final int TOOL_WINDOW_OPEN_VALUE = 1;
    /**
     * <pre>
     * Resource Manager opened as Resource Picker Dialog
     * </pre>
     *
     * <code>RESOURCE_PICKER_DIALOG_OPEN = 17;</code>
     */
    public static final int RESOURCE_PICKER_DIALOG_OPEN_VALUE = 17;
    /**
     * <pre>
     * Asset added pressing the "Import Drawable" action
     * </pre>
     *
     * <code>ASSET_ADDED_VIA_BUTTON = 2;</code>
     */
    public static final int ASSET_ADDED_VIA_BUTTON_VALUE = 2;
    /**
     * <pre>
     * Asset added using Drag and Drop on the resource manager
     * </pre>
     *
     * <code>ASSET_ADDED_VIA_DND = 3;</code>
     */
    public static final int ASSET_ADDED_VIA_DND_VALUE = 3;
    /**
     * <pre>
     * User open the view showing the different version of a resource
     * </pre>
     *
     * <code>DETAIL_VIEW_OPENED = 4;</code>
     */
    public static final int DETAIL_VIEW_OPENED_VALUE = 4;
    /**
     * <pre>
     * A resource has been opened via the resource manager
     * </pre>
     *
     * <code>ASSET_OPENED = 5;</code>
     */
    public static final int ASSET_OPENED_VALUE = 5;
    /**
     * <pre>
     * List mode has been changed to grid or list
     * </pre>
     *
     * <code>LIST_MODE_CHANGED = 6;</code>
     */
    public static final int LIST_MODE_CHANGED_VALUE = 6;
    /**
     * <pre>
     * User shows or hides dependent module assets
     * </pre>
     *
     * <code>DEPENDENT_MODULES_SHOWN = 18;</code>
     */
    public static final int DEPENDENT_MODULES_SHOWN_VALUE = 18;
    /**
     * <code>DEPENDENT_MODULES_HIDDEN = 19;</code>
     */
    public static final int DEPENDENT_MODULES_HIDDEN_VALUE = 19;
    /**
     * <pre>
     * User shows or hides libraries assets
     * </pre>
     *
     * <code>LIBRARIES_SHOWN = 7;</code>
     */
    public static final int LIBRARIES_SHOWN_VALUE = 7;
    /**
     * <code>LIBRARIES_HIDDEN = 8;</code>
     */
    public static final int LIBRARIES_HIDDEN_VALUE = 8;
    /**
     * <pre>
     * User shows or hides framework assets
     * </pre>
     *
     * <code>FRAMEWORK_SHOWN = 20;</code>
     */
    public static final int FRAMEWORK_SHOWN_VALUE = 20;
    /**
     * <code>FRAMEWORK_HIDDEN = 21;</code>
     */
    public static final int FRAMEWORK_HIDDEN_VALUE = 21;
    /**
     * <pre>
     * User shows or hides theme attributes assets
     * </pre>
     *
     * <code>THEME_ATTR_SHOWN = 22;</code>
     */
    public static final int THEME_ATTR_SHOWN_VALUE = 22;
    /**
     * <code>THEME_ATTR_HIDDEN = 23;</code>
     */
    public static final int THEME_ATTR_HIDDEN_VALUE = 23;
    /**
     * <pre>
     * User enables a filter by resource type (E.g: Filter 'vector' Drawables)
     * </pre>
     *
     * <code>ENABLE_FILTER_BY_TYPE = 24;</code>
     */
    public static final int ENABLE_FILTER_BY_TYPE_VALUE = 24;
    /**
     * <pre>
     * A density indicator was present in the imported file
     * </pre>
     *
     * <code>DENSITY_INFERED = 9;</code>
     */
    public static final int DENSITY_INFERED_VALUE = 9;
    /**
     * <pre>
     * Drop events
     * </pre>
     *
     * <code>DROP_ON_XML_BLANK_SPACE = 10;</code>
     */
    public static final int DROP_ON_XML_BLANK_SPACE_VALUE = 10;
    /**
     * <code>DROP_ON_XML_TAG = 11;</code>
     */
    public static final int DROP_ON_XML_TAG_VALUE = 11;
    /**
     * <code>DROP_ON_XML_ATTRIBUTE = 12;</code>
     */
    public static final int DROP_ON_XML_ATTRIBUTE_VALUE = 12;
    /**
     * <code>DROP_ON_LAYOUT_VIEW = 13;</code>
     */
    public static final int DROP_ON_LAYOUT_VIEW_VALUE = 13;
    /**
     * <code>DROP_ON_LAYOUT_VIEWGROUP = 14;</code>
     */
    public static final int DROP_ON_LAYOUT_VIEWGROUP_VALUE = 14;
    /**
     * <pre>
     * Default drop type when the target does not recognize the resource url
     * type
     * </pre>
     *
     * <code>DROP_AS_TEXT = 15;</code>
     */
    public static final int DROP_AS_TEXT_VALUE = 15;
    /**
     * <pre>
     * When user tries to import more resources than the supported number
     * </pre>
     *
     * <code>IMPORT_LIMIT_REACHED = 16;</code>
     */
    public static final int IMPORT_LIMIT_REACHED_VALUE = 16;
    /**
     * <pre>
     * When the user manually refreshes the preview of a resource
     * </pre>
     *
     * <code>REFRESH_RES_PREVIEW = 25;</code>
     */
    public static final int REFRESH_RES_PREVIEW_VALUE = 25;
    /**
     * <pre>
     * When the user manually refreshes all previews whithin a ResourceType
     * </pre>
     *
     * <code>REFRESH_ALL_RES_TYPE_PREVIEWS = 26;</code>
     */
    public static final int REFRESH_ALL_RES_TYPE_PREVIEWS_VALUE = 26;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Kind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Kind forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_KIND;
        case 1: return TOOL_WINDOW_OPEN;
        case 17: return RESOURCE_PICKER_DIALOG_OPEN;
        case 2: return ASSET_ADDED_VIA_BUTTON;
        case 3: return ASSET_ADDED_VIA_DND;
        case 4: return DETAIL_VIEW_OPENED;
        case 5: return ASSET_OPENED;
        case 6: return LIST_MODE_CHANGED;
        case 18: return DEPENDENT_MODULES_SHOWN;
        case 19: return DEPENDENT_MODULES_HIDDEN;
        case 7: return LIBRARIES_SHOWN;
        case 8: return LIBRARIES_HIDDEN;
        case 20: return FRAMEWORK_SHOWN;
        case 21: return FRAMEWORK_HIDDEN;
        case 22: return THEME_ATTR_SHOWN;
        case 23: return THEME_ATTR_HIDDEN;
        case 24: return ENABLE_FILTER_BY_TYPE;
        case 9: return DENSITY_INFERED;
        case 10: return DROP_ON_XML_BLANK_SPACE;
        case 11: return DROP_ON_XML_TAG;
        case 12: return DROP_ON_XML_ATTRIBUTE;
        case 13: return DROP_ON_LAYOUT_VIEW;
        case 14: return DROP_ON_LAYOUT_VIEWGROUP;
        case 15: return DROP_AS_TEXT;
        case 16: return IMPORT_LIMIT_REACHED;
        case 25: return REFRESH_RES_PREVIEW;
        case 26: return REFRESH_ALL_RES_TYPE_PREVIEWS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Kind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Kind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
            public Kind findValueByNumber(int number) {
              return Kind.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ResourceManagerEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Kind[] VALUES = values();

    public static Kind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Kind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ResourceManagerEvent.Kind)
  }

  /**
   * <pre>
   * The type of the resource. It could be an Android type (e.g drawable)
   * or an external type (e.g SVG, PNG)
   * </pre>
   *
   * Protobuf enum {@code android_studio.ResourceManagerEvent.ResourceType}
   */
  public enum ResourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>DRAWABLE = 1;</code>
     */
    DRAWABLE(1),
    /**
     * <code>COLOR = 2;</code>
     */
    COLOR(2),
    /**
     * <code>LAYOUT = 3;</code>
     */
    LAYOUT(3),
    /**
     * <code>STRING = 4;</code>
     */
    STRING(4),
    /**
     * <code>FONT = 5;</code>
     */
    FONT(5),
    /**
     * <code>SVG = 6;</code>
     */
    SVG(6),
    /**
     * <code>RASTER = 7;</code>
     */
    RASTER(7),
    /**
     * <code>NAVIGATION = 8;</code>
     */
    NAVIGATION(8),
    /**
     * <code>MENU = 9;</code>
     */
    MENU(9),
    /**
     * <pre>
     * Animation related resources (animator, interpolator, transition, etc.)
     * </pre>
     *
     * <code>ANIMATION = 10;</code>
     */
    ANIMATION(10),
    /**
     * <code>STYLE = 11;</code>
     */
    STYLE(11),
    /**
     * <pre>
     * Any other value-like resource (plurals, integers, etc.)
     * </pre>
     *
     * <code>VALUE = 12;</code>
     */
    VALUE(12),
    /**
     * <code>XML = 13;</code>
     */
    XML(13),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>DRAWABLE = 1;</code>
     */
    public static final int DRAWABLE_VALUE = 1;
    /**
     * <code>COLOR = 2;</code>
     */
    public static final int COLOR_VALUE = 2;
    /**
     * <code>LAYOUT = 3;</code>
     */
    public static final int LAYOUT_VALUE = 3;
    /**
     * <code>STRING = 4;</code>
     */
    public static final int STRING_VALUE = 4;
    /**
     * <code>FONT = 5;</code>
     */
    public static final int FONT_VALUE = 5;
    /**
     * <code>SVG = 6;</code>
     */
    public static final int SVG_VALUE = 6;
    /**
     * <code>RASTER = 7;</code>
     */
    public static final int RASTER_VALUE = 7;
    /**
     * <code>NAVIGATION = 8;</code>
     */
    public static final int NAVIGATION_VALUE = 8;
    /**
     * <code>MENU = 9;</code>
     */
    public static final int MENU_VALUE = 9;
    /**
     * <pre>
     * Animation related resources (animator, interpolator, transition, etc.)
     * </pre>
     *
     * <code>ANIMATION = 10;</code>
     */
    public static final int ANIMATION_VALUE = 10;
    /**
     * <code>STYLE = 11;</code>
     */
    public static final int STYLE_VALUE = 11;
    /**
     * <pre>
     * Any other value-like resource (plurals, integers, etc.)
     * </pre>
     *
     * <code>VALUE = 12;</code>
     */
    public static final int VALUE_VALUE = 12;
    /**
     * <code>XML = 13;</code>
     */
    public static final int XML_VALUE = 13;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResourceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResourceType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return DRAWABLE;
        case 2: return COLOR;
        case 3: return LAYOUT;
        case 4: return STRING;
        case 5: return FONT;
        case 6: return SVG;
        case 7: return RASTER;
        case 8: return NAVIGATION;
        case 9: return MENU;
        case 10: return ANIMATION;
        case 11: return STYLE;
        case 12: return VALUE;
        case 13: return XML;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
            public ResourceType findValueByNumber(int number) {
              return ResourceType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ResourceManagerEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final ResourceType[] VALUES = values();

    public static ResourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ResourceManagerEvent.ResourceType)
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  @java.lang.Override public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind getKind() {
    com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind result = com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind.forNumber(kind_);
    return result == null ? com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind.UNKNOWN_EVENT_KIND : result;
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 2;
  private int resourceType_ = 0;
  /**
   * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
   * @return Whether the resourceType field is set.
   */
  @java.lang.Override public boolean hasResourceType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
   * @return The resourceType.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType getResourceType() {
    com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType result = com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType.forNumber(resourceType_);
    return result == null ? com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType.UNKNOWN : result;
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
      output.writeEnum(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, resourceType_);
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
        .computeEnumSize(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resourceType_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ResourceManagerEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ResourceManagerEvent other = (com.google.wireless.android.sdk.stats.ResourceManagerEvent) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (kind_ != other.kind_) return false;
    }
    if (hasResourceType() != other.hasResourceType()) return false;
    if (hasResourceType()) {
      if (resourceType_ != other.resourceType_) return false;
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
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + kind_;
    }
    if (hasResourceType()) {
      hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + resourceType_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ResourceManagerEvent prototype) {
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
   * Event related to the resource manager
   * </pre>
   *
   * Protobuf type {@code android_studio.ResourceManagerEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ResourceManagerEvent)
      com.google.wireless.android.sdk.stats.ResourceManagerEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ResourceManagerEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ResourceManagerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ResourceManagerEvent.class, com.google.wireless.android.sdk.stats.ResourceManagerEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ResourceManagerEvent.newBuilder()
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
      kind_ = 0;
      resourceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ResourceManagerEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ResourceManagerEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ResourceManagerEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ResourceManagerEvent build() {
      com.google.wireless.android.sdk.stats.ResourceManagerEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ResourceManagerEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ResourceManagerEvent result = new com.google.wireless.android.sdk.stats.ResourceManagerEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.ResourceManagerEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceType_ = resourceType_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.ResourceManagerEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ResourceManagerEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ResourceManagerEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ResourceManagerEvent.getDefaultInstance()) return this;
      if (other.hasKind()) {
        setKind(other.getKind());
      }
      if (other.hasResourceType()) {
        setResourceType(other.getResourceType());
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
              com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind tmpValue =
                  com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                kind_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType tmpValue =
                  com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                resourceType_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
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

    private int kind_ = 0;
    /**
     * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
     * @return Whether the kind field is set.
     */
    @java.lang.Override public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind getKind() {
      com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind result = com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind.forNumber(kind_);
      return result == null ? com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind.UNKNOWN_EVENT_KIND : result;
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.google.wireless.android.sdk.stats.ResourceManagerEvent.Kind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.Kind kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private int resourceType_ = 0;
    /**
     * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
     * @return Whether the resourceType field is set.
     */
    @java.lang.Override public boolean hasResourceType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
     * @return The resourceType.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType getResourceType() {
      com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType result = com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType.forNumber(resourceType_);
      return result == null ? com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType.UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(com.google.wireless.android.sdk.stats.ResourceManagerEvent.ResourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.ResourceManagerEvent.ResourceType resource_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resourceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ResourceManagerEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ResourceManagerEvent)
  private static final com.google.wireless.android.sdk.stats.ResourceManagerEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ResourceManagerEvent();
  }

  public static com.google.wireless.android.sdk.stats.ResourceManagerEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ResourceManagerEvent>
      PARSER = new com.google.protobuf.AbstractParser<ResourceManagerEvent>() {
    @java.lang.Override
    public ResourceManagerEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceManagerEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceManagerEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ResourceManagerEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

