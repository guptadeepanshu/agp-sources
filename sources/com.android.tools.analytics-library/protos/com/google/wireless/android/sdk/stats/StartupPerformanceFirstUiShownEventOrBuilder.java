// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface StartupPerformanceFirstUiShownEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.StartupPerformanceFirstUiShownEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 duration_ms = 1;</code>
   * @return Whether the durationMs field is set.
   */
  boolean hasDurationMs();
  /**
   * <code>optional uint32 duration_ms = 1;</code>
   * @return The durationMs.
   */
  int getDurationMs();

  /**
   * <code>optional .android_studio.StartupPerformanceFirstUiShownEvent.UiResponseType type = 2;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .android_studio.StartupPerformanceFirstUiShownEvent.UiResponseType type = 2;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.StartupPerformanceFirstUiShownEvent.UiResponseType getType();
}
