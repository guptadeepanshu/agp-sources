// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DeviceManagerEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DeviceManagerEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The kind of DeviceManagerEvent
   * </pre>
   *
   * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * The kind of DeviceManagerEvent
   * </pre>
   *
   * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
   * @return The kind.
   */
  com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind getKind();

  /**
   * <pre>
   * The count of devices under the Virtual tab. Set when kind =
   * VIRTUAL_DEVICE_COUNT.
   * </pre>
   *
   * <code>optional int32 virtual_device_count = 2;</code>
   * @return Whether the virtualDeviceCount field is set.
   */
  boolean hasVirtualDeviceCount();
  /**
   * <pre>
   * The count of devices under the Virtual tab. Set when kind =
   * VIRTUAL_DEVICE_COUNT.
   * </pre>
   *
   * <code>optional int32 virtual_device_count = 2;</code>
   * @return The virtualDeviceCount.
   */
  int getVirtualDeviceCount();
}
