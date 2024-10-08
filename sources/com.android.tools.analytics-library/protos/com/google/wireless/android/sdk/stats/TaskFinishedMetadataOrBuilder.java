// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface TaskFinishedMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.TaskFinishedMetadata)
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

  /**
   * <pre>
   * The state of the task on finish.
   * </pre>
   *
   * <code>optional .android_studio.TaskFinishedMetadata.TaskFinishedState task_finished_state = 2;</code>
   * @return Whether the taskFinishedState field is set.
   */
  boolean hasTaskFinishedState();
  /**
   * <pre>
   * The state of the task on finish.
   * </pre>
   *
   * <code>optional .android_studio.TaskFinishedMetadata.TaskFinishedState task_finished_state = 2;</code>
   * @return The taskFinishedState.
   */
  com.google.wireless.android.sdk.stats.TaskFinishedMetadata.TaskFinishedState getTaskFinishedState();
}
