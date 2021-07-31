// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface LayoutAttributeChangeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.LayoutAttributeChangeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The attribute changed by this event
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute attribute = 1;</code>
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();
  /**
   * <pre>
   * The attribute changed by this event
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute attribute = 1;</code>
   * @return The attribute.
   */
  com.google.wireless.android.sdk.stats.AndroidAttribute getAttribute();
  /**
   * <pre>
   * The attribute changed by this event
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute attribute = 1;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder getAttributeOrBuilder();

  /**
   * <pre>
   * The search option used when the attribute was changed
   * </pre>
   *
   * <code>optional .android_studio.SearchOption search_option = 2;</code>
   * @return Whether the searchOption field is set.
   */
  boolean hasSearchOption();
  /**
   * <pre>
   * The search option used when the attribute was changed
   * </pre>
   *
   * <code>optional .android_studio.SearchOption search_option = 2;</code>
   * @return The searchOption.
   */
  com.google.wireless.android.sdk.stats.SearchOption getSearchOption();

  /**
   * <pre>
   * The display option used when the attribute was changed
   * </pre>
   *
   * <code>optional .android_studio.LayoutAttributeChangeEvent.ViewType view_type = 3;</code>
   * @return Whether the viewType field is set.
   */
  boolean hasViewType();
  /**
   * <pre>
   * The display option used when the attribute was changed
   * </pre>
   *
   * <code>optional .android_studio.LayoutAttributeChangeEvent.ViewType view_type = 3;</code>
   * @return The viewType.
   */
  com.google.wireless.android.sdk.stats.LayoutAttributeChangeEvent.ViewType getViewType();

  /**
   * <pre>
   * The views where this attribute was changed for.
   * </pre>
   *
   * <code>repeated .android_studio.AndroidView view = 4;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AndroidView> 
      getViewList();
  /**
   * <pre>
   * The views where this attribute was changed for.
   * </pre>
   *
   * <code>repeated .android_studio.AndroidView view = 4;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidView getView(int index);
  /**
   * <pre>
   * The views where this attribute was changed for.
   * </pre>
   *
   * <code>repeated .android_studio.AndroidView view = 4;</code>
   */
  int getViewCount();
  /**
   * <pre>
   * The views where this attribute was changed for.
   * </pre>
   *
   * <code>repeated .android_studio.AndroidView view = 4;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AndroidViewOrBuilder> 
      getViewOrBuilderList();
  /**
   * <pre>
   * The views where this attribute was changed for.
   * </pre>
   *
   * <code>repeated .android_studio.AndroidView view = 4;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidViewOrBuilder getViewOrBuilder(
      int index);
}
