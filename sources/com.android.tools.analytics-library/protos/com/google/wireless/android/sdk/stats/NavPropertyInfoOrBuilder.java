// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface NavPropertyInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.NavPropertyInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The property affected.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   * <pre>
   * The property affected.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.Property property = 1;</code>
   * @return The property.
   */
  com.google.wireless.android.sdk.stats.NavPropertyInfo.Property getProperty();

  /**
   * <pre>
   * Type of the containing tag.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
   * @return Whether the containingTag field is set.
   */
  boolean hasContainingTag();
  /**
   * <pre>
   * Type of the containing tag.
   * </pre>
   *
   * <code>optional .android_studio.NavPropertyInfo.TagType containing_tag = 2;</code>
   * @return The containingTag.
   */
  com.google.wireless.android.sdk.stats.NavPropertyInfo.TagType getContainingTag();

  /**
   * <pre>
   * Whether the property was empty prior to being set just now.
   * </pre>
   *
   * <code>optional bool was_empty = 3;</code>
   * @return Whether the wasEmpty field is set.
   */
  boolean hasWasEmpty();
  /**
   * <pre>
   * Whether the property was empty prior to being set just now.
   * </pre>
   *
   * <code>optional bool was_empty = 3;</code>
   * @return The wasEmpty.
   */
  boolean getWasEmpty();
}
