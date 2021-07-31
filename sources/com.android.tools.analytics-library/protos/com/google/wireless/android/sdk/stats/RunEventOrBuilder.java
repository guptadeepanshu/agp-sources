// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface RunEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.RunEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.RunEvent.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .android_studio.RunEvent.Status status = 1;</code>
   * @return The status.
   */
  com.google.wireless.android.sdk.stats.RunEvent.Status getStatus();

  /**
   * <pre>
   * The executor used, from Executor::getId()
   * </pre>
   *
   * <code>optional string executor = 2;</code>
   * @return Whether the executor field is set.
   */
  boolean hasExecutor();
  /**
   * <pre>
   * The executor used, from Executor::getId()
   * </pre>
   *
   * <code>optional string executor = 2;</code>
   * @return The executor.
   */
  java.lang.String getExecutor();
  /**
   * <pre>
   * The executor used, from Executor::getId()
   * </pre>
   *
   * <code>optional string executor = 2;</code>
   * @return The bytes for executor.
   */
  com.google.protobuf.ByteString
      getExecutorBytes();

  /**
   * <pre>
   * Whether the app is debuggable
   * </pre>
   *
   * <code>optional bool debuggable = 3;</code>
   * @return Whether the debuggable field is set.
   */
  boolean hasDebuggable();
  /**
   * <pre>
   * Whether the app is debuggable
   * </pre>
   *
   * <code>optional bool debuggable = 3;</code>
   * @return The debuggable.
   */
  boolean getDebuggable();

  /**
   * <pre>
   * Whether instant run is enabled
   * </pre>
   *
   * <code>optional bool instant_run_enabled = 4;</code>
   * @return Whether the instantRunEnabled field is set.
   */
  boolean hasInstantRunEnabled();
  /**
   * <pre>
   * Whether instant run is enabled
   * </pre>
   *
   * <code>optional bool instant_run_enabled = 4;</code>
   * @return The instantRunEnabled.
   */
  boolean getInstantRunEnabled();

  /**
   * <pre>
   * Whether the apply changes button was used
   * </pre>
   *
   * <code>optional bool apply_changes = 5;</code>
   * @return Whether the applyChanges field is set.
   */
  boolean hasApplyChanges();
  /**
   * <pre>
   * Whether the apply changes button was used
   * </pre>
   *
   * <code>optional bool apply_changes = 5;</code>
   * @return The applyChanges.
   */
  boolean getApplyChanges();

  /**
   * <pre>
   * Whether the device dialog was open
   * </pre>
   *
   * <code>optional bool user_selected_target = 6;</code>
   * @return Whether the userSelectedTarget field is set.
   */
  boolean hasUserSelectedTarget();
  /**
   * <pre>
   * Whether the device dialog was open
   * </pre>
   *
   * <code>optional bool user_selected_target = 6;</code>
   * @return The userSelectedTarget.
   */
  boolean getUserSelectedTarget();

  /**
   * <pre>
   * Weather a device, like the emulator, was launched
   * </pre>
   *
   * <code>optional bool launched_devices = 7;</code>
   * @return Whether the launchedDevices field is set.
   */
  boolean hasLaunchedDevices();
  /**
   * <pre>
   * Weather a device, like the emulator, was launched
   * </pre>
   *
   * <code>optional bool launched_devices = 7;</code>
   * @return The launchedDevices.
   */
  boolean getLaunchedDevices();

  /**
   * <pre>
   * How many devices were targeted
   * </pre>
   *
   * <code>optional int32 device_count = 8;</code>
   * @return Whether the deviceCount field is set.
   */
  boolean hasDeviceCount();
  /**
   * <pre>
   * How many devices were targeted
   * </pre>
   *
   * <code>optional int32 device_count = 8;</code>
   * @return The deviceCount.
   */
  int getDeviceCount();

  /**
   * <pre>
   * True if this run event started mid-way
   * </pre>
   *
   * <code>optional bool partial = 9;</code>
   * @return Whether the partial field is set.
   */
  boolean hasPartial();
  /**
   * <pre>
   * True if this run event started mid-way
   * </pre>
   *
   * <code>optional bool partial = 9;</code>
   * @return The partial.
   */
  boolean getPartial();

  /**
   * <pre>
   * All the launch tasks executed during deploy
   * </pre>
   *
   * <code>repeated .android_studio.LaunchTaskDetail launch_task_detail = 10;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.LaunchTaskDetail> 
      getLaunchTaskDetailList();
  /**
   * <pre>
   * All the launch tasks executed during deploy
   * </pre>
   *
   * <code>repeated .android_studio.LaunchTaskDetail launch_task_detail = 10;</code>
   */
  com.google.wireless.android.sdk.stats.LaunchTaskDetail getLaunchTaskDetail(int index);
  /**
   * <pre>
   * All the launch tasks executed during deploy
   * </pre>
   *
   * <code>repeated .android_studio.LaunchTaskDetail launch_task_detail = 10;</code>
   */
  int getLaunchTaskDetailCount();
  /**
   * <pre>
   * All the launch tasks executed during deploy
   * </pre>
   *
   * <code>repeated .android_studio.LaunchTaskDetail launch_task_detail = 10;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.LaunchTaskDetailOrBuilder> 
      getLaunchTaskDetailOrBuilderList();
  /**
   * <pre>
   * All the launch tasks executed during deploy
   * </pre>
   *
   * <code>repeated .android_studio.LaunchTaskDetail launch_task_detail = 10;</code>
   */
  com.google.wireless.android.sdk.stats.LaunchTaskDetailOrBuilder getLaunchTaskDetailOrBuilder(
      int index);

  /**
   * <pre>
   * Timestamps in expected order
   * The run cycle begins
   * </pre>
   *
   * <code>optional int64 begin_timestamp_ms = 11;</code>
   * @return Whether the beginTimestampMs field is set.
   */
  boolean hasBeginTimestampMs();
  /**
   * <pre>
   * Timestamps in expected order
   * The run cycle begins
   * </pre>
   *
   * <code>optional int64 begin_timestamp_ms = 11;</code>
   * @return The beginTimestampMs.
   */
  long getBeginTimestampMs();

  /**
   * <pre>
   * The before-run tasks start (i.e. running gradle)
   * </pre>
   *
   * <code>optional int64 begin_before_run_tasks_timestamp_ms = 12;</code>
   * @return Whether the beginBeforeRunTasksTimestampMs field is set.
   */
  boolean hasBeginBeforeRunTasksTimestampMs();
  /**
   * <pre>
   * The before-run tasks start (i.e. running gradle)
   * </pre>
   *
   * <code>optional int64 begin_before_run_tasks_timestamp_ms = 12;</code>
   * @return The beginBeforeRunTasksTimestampMs.
   */
  long getBeginBeforeRunTasksTimestampMs();

  /**
   * <pre>
   * End of the before-run tasks
   * </pre>
   *
   * <code>optional int64 end_before_run_tasks_timestamp_ms = 13;</code>
   * @return Whether the endBeforeRunTasksTimestampMs field is set.
   */
  boolean hasEndBeforeRunTasksTimestampMs();
  /**
   * <pre>
   * End of the before-run tasks
   * </pre>
   *
   * <code>optional int64 end_before_run_tasks_timestamp_ms = 13;</code>
   * @return The endBeforeRunTasksTimestampMs.
   */
  long getEndBeforeRunTasksTimestampMs();

  /**
   * <pre>
   * Before launching, we must wait for devices
   * </pre>
   *
   * <code>optional int64 begin_wait_for_device_timestamp_ms = 14;</code>
   * @return Whether the beginWaitForDeviceTimestampMs field is set.
   */
  boolean hasBeginWaitForDeviceTimestampMs();
  /**
   * <pre>
   * Before launching, we must wait for devices
   * </pre>
   *
   * <code>optional int64 begin_wait_for_device_timestamp_ms = 14;</code>
   * @return The beginWaitForDeviceTimestampMs.
   */
  long getBeginWaitForDeviceTimestampMs();

  /**
   * <pre>
   * All devices are now ready
   * </pre>
   *
   * <code>optional int64 end_wait_for_device_timestamp_ms = 15;</code>
   * @return Whether the endWaitForDeviceTimestampMs field is set.
   */
  boolean hasEndWaitForDeviceTimestampMs();
  /**
   * <pre>
   * All devices are now ready
   * </pre>
   *
   * <code>optional int64 end_wait_for_device_timestamp_ms = 15;</code>
   * @return The endWaitForDeviceTimestampMs.
   */
  long getEndWaitForDeviceTimestampMs();

  /**
   * <pre>
   * Launch tasks start being executed
   * </pre>
   *
   * <code>optional int64 begin_launch_tasks_timestamp_ms = 16;</code>
   * @return Whether the beginLaunchTasksTimestampMs field is set.
   */
  boolean hasBeginLaunchTasksTimestampMs();
  /**
   * <pre>
   * Launch tasks start being executed
   * </pre>
   *
   * <code>optional int64 begin_launch_tasks_timestamp_ms = 16;</code>
   * @return The beginLaunchTasksTimestampMs.
   */
  long getBeginLaunchTasksTimestampMs();

  /**
   * <pre>
   * All launch tasks completed
   * </pre>
   *
   * <code>optional int64 end_launch_tasks_timestamp_ms = 17;</code>
   * @return Whether the endLaunchTasksTimestampMs field is set.
   */
  boolean hasEndLaunchTasksTimestampMs();
  /**
   * <pre>
   * All launch tasks completed
   * </pre>
   *
   * <code>optional int64 end_launch_tasks_timestamp_ms = 17;</code>
   * @return The endLaunchTasksTimestampMs.
   */
  long getEndLaunchTasksTimestampMs();

  /**
   * <pre>
   * The run cycle finished
   * </pre>
   *
   * <code>optional int64 end_timestamp_ms = 18;</code>
   * @return Whether the endTimestampMs field is set.
   */
  boolean hasEndTimestampMs();
  /**
   * <pre>
   * The run cycle finished
   * </pre>
   *
   * <code>optional int64 end_timestamp_ms = 18;</code>
   * @return The endTimestampMs.
   */
  long getEndTimestampMs();

  /**
   * <pre>
   * Whether the run configuration was set to deploy as instant
   * </pre>
   *
   * <code>optional bool deployed_as_instant = 19;</code>
   * @return Whether the deployedAsInstant field is set.
   */
  boolean hasDeployedAsInstant();
  /**
   * <pre>
   * Whether the run configuration was set to deploy as instant
   * </pre>
   *
   * <code>optional bool deployed_as_instant = 19;</code>
   * @return The deployedAsInstant.
   */
  boolean getDeployedAsInstant();

  /**
   * <pre>
   * Whether the run configuration was set to deploy from app bundle
   * </pre>
   *
   * <code>optional bool deployed_from_bundle = 20;</code>
   * @return Whether the deployedFromBundle field is set.
   */
  boolean hasDeployedFromBundle();
  /**
   * <pre>
   * Whether the run configuration was set to deploy from app bundle
   * </pre>
   *
   * <code>optional bool deployed_from_bundle = 20;</code>
   * @return The deployedFromBundle.
   */
  boolean getDeployedFromBundle();

  /**
   * <pre>
   * Enum name representing deploy failure reason
   * </pre>
   *
   * <code>optional string deploy_failure_id = 21;</code>
   * @return Whether the deployFailureId field is set.
   */
  boolean hasDeployFailureId();
  /**
   * <pre>
   * Enum name representing deploy failure reason
   * </pre>
   *
   * <code>optional string deploy_failure_id = 21;</code>
   * @return The deployFailureId.
   */
  java.lang.String getDeployFailureId();
  /**
   * <pre>
   * Enum name representing deploy failure reason
   * </pre>
   *
   * <code>optional string deploy_failure_id = 21;</code>
   * @return The bytes for deployFailureId.
   */
  com.google.protobuf.ByteString
      getDeployFailureIdBytes();

  /**
   * <pre>
   * Whether the user configured AC to fall back to Run
   * </pre>
   *
   * <code>optional bool apply_changes_fallback_to_run = 22;</code>
   * @return Whether the applyChangesFallbackToRun field is set.
   */
  boolean hasApplyChangesFallbackToRun();
  /**
   * <pre>
   * Whether the user configured AC to fall back to Run
   * </pre>
   *
   * <code>optional bool apply_changes_fallback_to_run = 22;</code>
   * @return The applyChangesFallbackToRun.
   */
  boolean getApplyChangesFallbackToRun();

  /**
   * <pre>
   * Whether the user configured ACC to fall back to Run
   * </pre>
   *
   * <code>optional bool apply_code_changes_fallback_to_run = 23;</code>
   * @return Whether the applyCodeChangesFallbackToRun field is set.
   */
  boolean hasApplyCodeChangesFallbackToRun();
  /**
   * <pre>
   * Whether the user configured ACC to fall back to Run
   * </pre>
   *
   * <code>optional bool apply_code_changes_fallback_to_run = 23;</code>
   * @return The applyCodeChangesFallbackToRun.
   */
  boolean getApplyCodeChangesFallbackToRun();
}
