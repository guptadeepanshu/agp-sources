// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface IDeviceUsageEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.IDeviceUsageEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 'IDevice' method
   * </pre>
   *
   * <code>optional .android_studio.IDeviceUsageEvent.Method method = 1;</code>
   * @return Whether the method field is set.
   */
  boolean hasMethod();
  /**
   * <pre>
   * 'IDevice' method
   * </pre>
   *
   * <code>optional .android_studio.IDeviceUsageEvent.Method method = 1;</code>
   * @return The method.
   */
  com.google.wireless.android.sdk.stats.IDeviceUsageEvent.Method getMethod();

  /**
   * <pre>
   * `IDevice` implementation
   * </pre>
   *
   * <code>optional .android_studio.IDeviceUsageEvent.SourceType source_type = 2;</code>
   * @return Whether the sourceType field is set.
   */
  boolean hasSourceType();
  /**
   * <pre>
   * `IDevice` implementation
   * </pre>
   *
   * <code>optional .android_studio.IDeviceUsageEvent.SourceType source_type = 2;</code>
   * @return The sourceType.
   */
  com.google.wireless.android.sdk.stats.IDeviceUsageEvent.SourceType getSourceType();

  /**
   * <pre>
   * Whether method threw an exception
   * </pre>
   *
   * <code>optional bool is_exception = 3;</code>
   * @return Whether the isException field is set.
   */
  boolean hasIsException();
  /**
   * <pre>
   * Whether method threw an exception
   * </pre>
   *
   * <code>optional bool is_exception = 3;</code>
   * @return The isException.
   */
  boolean getIsException();
}
