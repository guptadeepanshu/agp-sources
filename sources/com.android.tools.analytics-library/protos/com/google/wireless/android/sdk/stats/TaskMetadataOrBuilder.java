// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface TaskMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.TaskMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of task recorded.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.ProfilerTaskType task_type = 1;</code>
   * @return Whether the taskType field is set.
   */
  boolean hasTaskType();
  /**
   * <pre>
   * The type of task recorded.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.ProfilerTaskType task_type = 1;</code>
   * @return The taskType.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.ProfilerTaskType getTaskType();

  /**
   * <pre>
   * The task id is the same to the id of the session backing the task. This id
   * is unique per Studio instance.
   * </pre>
   *
   * <code>optional int64 task_id = 2;</code>
   * @return Whether the taskId field is set.
   */
  boolean hasTaskId();
  /**
   * <pre>
   * The task id is the same to the id of the session backing the task. This id
   * is unique per Studio instance.
   * </pre>
   *
   * <code>optional int64 task_id = 2;</code>
   * @return The taskId.
   */
  long getTaskId();

  /**
   * <pre>
   * The origin of a task's recording data.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskDataOrigin task_data_origin = 3;</code>
   * @return Whether the taskDataOrigin field is set.
   */
  boolean hasTaskDataOrigin();
  /**
   * <pre>
   * The origin of a task's recording data.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskDataOrigin task_data_origin = 3;</code>
   * @return The taskDataOrigin.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.TaskDataOrigin getTaskDataOrigin();

  /**
   * <pre>
   * The point in the process lifecycle the task began. Only set to a
   * non-unspecified value if the |task_data_origin| is |NEW|.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskAttachmentPoint task_attachment_point = 4;</code>
   * @return Whether the taskAttachmentPoint field is set.
   */
  boolean hasTaskAttachmentPoint();
  /**
   * <pre>
   * The point in the process lifecycle the task began. Only set to a
   * non-unspecified value if the |task_data_origin| is |NEW|.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskAttachmentPoint task_attachment_point = 4;</code>
   * @return The taskAttachmentPoint.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.TaskAttachmentPoint getTaskAttachmentPoint();

  /**
   * <pre>
   * The exposure level of the process the task utilized. Only set to a
   * non-unspecified value if the |task_data_origin| is |NEW|.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.ExposureLevel exposure_level = 5;</code>
   * @return Whether the exposureLevel field is set.
   */
  boolean hasExposureLevel();
  /**
   * <pre>
   * The exposure level of the process the task utilized. Only set to a
   * non-unspecified value if the |task_data_origin| is |NEW|.
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.ExposureLevel exposure_level = 5;</code>
   * @return The exposureLevel.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.ExposureLevel getExposureLevel();

  /**
   * <pre>
   * The task configuration used (if the task has a customizable configuration).
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskConfig task_config = 6 [lazy = true];</code>
   * @return Whether the taskConfig field is set.
   */
  boolean hasTaskConfig();
  /**
   * <pre>
   * The task configuration used (if the task has a customizable configuration).
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskConfig task_config = 6 [lazy = true];</code>
   * @return The taskConfig.
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.TaskConfig getTaskConfig();
  /**
   * <pre>
   * The task configuration used (if the task has a customizable configuration).
   * </pre>
   *
   * <code>optional .android_studio.TaskMetadata.TaskConfig task_config = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.TaskMetadata.TaskConfigOrBuilder getTaskConfigOrBuilder();
}
