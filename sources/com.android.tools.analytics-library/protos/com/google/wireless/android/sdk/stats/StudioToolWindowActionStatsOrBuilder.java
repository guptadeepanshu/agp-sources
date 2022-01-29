// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface StudioToolWindowActionStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.StudioToolWindowActionStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the tool window
   * e.g. 'Assistant'
   * </pre>
   *
   * <code>optional string tool_window_id = 1;</code>
   * @return Whether the toolWindowId field is set.
   */
  boolean hasToolWindowId();
  /**
   * <pre>
   * Id of the tool window
   * e.g. 'Assistant'
   * </pre>
   *
   * <code>optional string tool_window_id = 1;</code>
   * @return The toolWindowId.
   */
  java.lang.String getToolWindowId();
  /**
   * <pre>
   * Id of the tool window
   * e.g. 'Assistant'
   * </pre>
   *
   * <code>optional string tool_window_id = 1;</code>
   * @return The bytes for toolWindowId.
   */
  com.google.protobuf.ByteString
      getToolWindowIdBytes();

  /**
   * <code>optional .android_studio.StudioToolWindowActionStats.EventType event_type = 2;</code>
   * @return Whether the eventType field is set.
   */
  boolean hasEventType();
  /**
   * <code>optional .android_studio.StudioToolWindowActionStats.EventType event_type = 2;</code>
   * @return The eventType.
   */
  com.google.wireless.android.sdk.stats.StudioToolWindowActionStats.EventType getEventType();

  /**
   * <pre>
   * "View Mode" in the UI
   * </pre>
   *
   * <code>optional .android_studio.StudioToolWindowActionStats.ToolWindowType tool_window_type = 3;</code>
   * @return Whether the toolWindowType field is set.
   */
  boolean hasToolWindowType();
  /**
   * <pre>
   * "View Mode" in the UI
   * </pre>
   *
   * <code>optional .android_studio.StudioToolWindowActionStats.ToolWindowType tool_window_type = 3;</code>
   * @return The toolWindowType.
   */
  com.google.wireless.android.sdk.stats.StudioToolWindowActionStats.ToolWindowType getToolWindowType();
}
