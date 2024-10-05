// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface LayoutFavoriteAttributeChangeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.LayoutFavoriteAttributeChangeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This attribute was added as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute added = 1 [lazy = true];</code>
   * @return Whether the added field is set.
   */
  boolean hasAdded();
  /**
   * <pre>
   * This attribute was added as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute added = 1 [lazy = true];</code>
   * @return The added.
   */
  com.google.wireless.android.sdk.stats.AndroidAttribute getAdded();
  /**
   * <pre>
   * This attribute was added as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute added = 1 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder getAddedOrBuilder();

  /**
   * <pre>
   * This attribute was removed as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute removed = 2 [lazy = true];</code>
   * @return Whether the removed field is set.
   */
  boolean hasRemoved();
  /**
   * <pre>
   * This attribute was removed as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute removed = 2 [lazy = true];</code>
   * @return The removed.
   */
  com.google.wireless.android.sdk.stats.AndroidAttribute getRemoved();
  /**
   * <pre>
   * This attribute was removed as a favorite attribute
   * </pre>
   *
   * <code>optional .android_studio.AndroidAttribute removed = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder getRemovedOrBuilder();

  /**
   * <pre>
   * These are the resulting active favorite attibutes
   * </pre>
   *
   * <code>repeated .android_studio.AndroidAttribute active = 3;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AndroidAttribute> 
      getActiveList();
  /**
   * <pre>
   * These are the resulting active favorite attibutes
   * </pre>
   *
   * <code>repeated .android_studio.AndroidAttribute active = 3;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidAttribute getActive(int index);
  /**
   * <pre>
   * These are the resulting active favorite attibutes
   * </pre>
   *
   * <code>repeated .android_studio.AndroidAttribute active = 3;</code>
   */
  int getActiveCount();
  /**
   * <pre>
   * These are the resulting active favorite attibutes
   * </pre>
   *
   * <code>repeated .android_studio.AndroidAttribute active = 3;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder> 
      getActiveOrBuilderList();
  /**
   * <pre>
   * These are the resulting active favorite attibutes
   * </pre>
   *
   * <code>repeated .android_studio.AndroidAttribute active = 3;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidAttributeOrBuilder getActiveOrBuilder(
      int index);
}
