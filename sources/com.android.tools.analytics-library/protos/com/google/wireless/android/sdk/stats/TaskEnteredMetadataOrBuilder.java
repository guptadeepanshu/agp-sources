// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface TaskEnteredMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.TaskEnteredMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The task data.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata task_data = 1 [lazy = true];</code>
   * @return Whether the taskData field is set.
   */
  boolean hasTaskData();
  /**
   * <pre>
   * The task data.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata task_data = 1 [lazy = true];</code>
   * @return The taskData.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata getTaskData();
  /**
   * <pre>
   * The task data.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata task_data = 1 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.TaskMetadataOrBuilder getTaskDataOrBuilder();
}
