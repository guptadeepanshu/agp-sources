// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface VsPluginEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.VsPluginEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.VsPluginEvent.VsPluginEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .android_studio.VsPluginEvent.VsPluginEventType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.VsPluginEvent.VsPluginEventType getType();

  /**
   * <code>optional .android_studio.VsPluginEvent.BuildEvent build_event = 2;</code>
   * @return Whether the buildEvent field is set.
   */
  boolean hasBuildEvent();
  /**
   * <code>optional .android_studio.VsPluginEvent.BuildEvent build_event = 2;</code>
   * @return The buildEvent.
   */
  com.google.wireless.android.sdk.stats.VsPluginEvent.BuildEvent getBuildEvent();
  /**
   * <code>optional .android_studio.VsPluginEvent.BuildEvent build_event = 2;</code>
   */
  com.google.wireless.android.sdk.stats.VsPluginEvent.BuildEventOrBuilder getBuildEventOrBuilder();

  /**
   * <code>optional .android_studio.VsPluginEvent.DebugEvent debug_event = 3;</code>
   * @return Whether the debugEvent field is set.
   */
  boolean hasDebugEvent();
  /**
   * <code>optional .android_studio.VsPluginEvent.DebugEvent debug_event = 3;</code>
   * @return The debugEvent.
   */
  com.google.wireless.android.sdk.stats.VsPluginEvent.DebugEvent getDebugEvent();
  /**
   * <code>optional .android_studio.VsPluginEvent.DebugEvent debug_event = 3;</code>
   */
  com.google.wireless.android.sdk.stats.VsPluginEvent.DebugEventOrBuilder getDebugEventOrBuilder();
}
