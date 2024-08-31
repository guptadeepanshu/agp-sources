// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DeviceTestSpanProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DeviceTestSpanProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of device used in this test run
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.DeviceType device_type = 1;</code>
   * @return Whether the deviceType field is set.
   */
  boolean hasDeviceType();
  /**
   * <pre>
   * Type of device used in this test run
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.DeviceType device_type = 1;</code>
   * @return The deviceType.
   */
  com.google.wireless.android.sdk.stats.DeviceTestSpanProfile.DeviceType getDeviceType();

  /**
   * <pre>
   * Type of test being run on this device
   * </pre>
   *
   * <code>optional .android_studio.TestRun.TestKind test_kind = 2;</code>
   * @return Whether the testKind field is set.
   */
  boolean hasTestKind();
  /**
   * <pre>
   * Type of test being run on this device
   * </pre>
   *
   * <code>optional .android_studio.TestRun.TestKind test_kind = 2;</code>
   * @return The testKind.
   */
  com.google.wireless.android.sdk.stats.TestRun.TestKind getTestKind();

  /**
   * <pre>
   * Type of process that is used to install, run, and manage the test.
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.ProcessType process_type = 3;</code>
   * @return Whether the processType field is set.
   */
  boolean hasProcessType();
  /**
   * <pre>
   * Type of process that is used to install, run, and manage the test.
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.ProcessType process_type = 3;</code>
   * @return The processType.
   */
  com.google.wireless.android.sdk.stats.DeviceTestSpanProfile.ProcessType getProcessType();

  /**
   * <pre>
   * Span of how long the test waited for device(s) to become available.
   * These fields will only be set if a Gradle Managed Device is used and will
   * be the same across all shards in the same test run.
   * </pre>
   *
   * <code>optional int64 device_lock_wait_start_time_ms = 5;</code>
   * @return Whether the deviceLockWaitStartTimeMs field is set.
   */
  boolean hasDeviceLockWaitStartTimeMs();
  /**
   * <pre>
   * Span of how long the test waited for device(s) to become available.
   * These fields will only be set if a Gradle Managed Device is used and will
   * be the same across all shards in the same test run.
   * </pre>
   *
   * <code>optional int64 device_lock_wait_start_time_ms = 5;</code>
   * @return The deviceLockWaitStartTimeMs.
   */
  long getDeviceLockWaitStartTimeMs();

  /**
   * <code>optional int64 device_lock_wait_duration_ms = 6;</code>
   * @return Whether the deviceLockWaitDurationMs field is set.
   */
  boolean hasDeviceLockWaitDurationMs();
  /**
   * <code>optional int64 device_lock_wait_duration_ms = 6;</code>
   * @return The deviceLockWaitDurationMs.
   */
  long getDeviceLockWaitDurationMs();

  /**
   * <pre>
   * Span of how long the Unified Test Platform needed for internal setup before
   * requesting the device provider.
   * </pre>
   *
   * <code>optional int64 utp_setup_start_time_ms = 7;</code>
   * @return Whether the utpSetupStartTimeMs field is set.
   */
  boolean hasUtpSetupStartTimeMs();
  /**
   * <pre>
   * Span of how long the Unified Test Platform needed for internal setup before
   * requesting the device provider.
   * </pre>
   *
   * <code>optional int64 utp_setup_start_time_ms = 7;</code>
   * @return The utpSetupStartTimeMs.
   */
  long getUtpSetupStartTimeMs();

  /**
   * <code>optional int64 utp_setup_duration_ms = 8;</code>
   * @return Whether the utpSetupDurationMs field is set.
   */
  boolean hasUtpSetupDurationMs();
  /**
   * <code>optional int64 utp_setup_duration_ms = 8;</code>
   * @return The utpSetupDurationMs.
   */
  long getUtpSetupDurationMs();

  /**
   * <pre>
   * Span of how long the device took to be provisioned by the device provider
   * </pre>
   *
   * <code>optional int64 utp_provide_device_start_time_ms = 9;</code>
   * @return Whether the utpProvideDeviceStartTimeMs field is set.
   */
  boolean hasUtpProvideDeviceStartTimeMs();
  /**
   * <pre>
   * Span of how long the device took to be provisioned by the device provider
   * </pre>
   *
   * <code>optional int64 utp_provide_device_start_time_ms = 9;</code>
   * @return The utpProvideDeviceStartTimeMs.
   */
  long getUtpProvideDeviceStartTimeMs();

  /**
   * <code>optional int64 utp_provide_device_duration_ms = 10;</code>
   * @return Whether the utpProvideDeviceDurationMs field is set.
   */
  boolean hasUtpProvideDeviceDurationMs();
  /**
   * <code>optional int64 utp_provide_device_duration_ms = 10;</code>
   * @return The utpProvideDeviceDurationMs.
   */
  long getUtpProvideDeviceDurationMs();

  /**
   * <pre>
   * Span of how long the device took after device was provided, but before
   * tests start. This includes steps like installing testing and tested apks,
   * checking device state, and setting up test orchestration.
   * </pre>
   *
   * <code>optional int64 utp_test_setup_start_time_ms = 11;</code>
   * @return Whether the utpTestSetupStartTimeMs field is set.
   */
  boolean hasUtpTestSetupStartTimeMs();
  /**
   * <pre>
   * Span of how long the device took after device was provided, but before
   * tests start. This includes steps like installing testing and tested apks,
   * checking device state, and setting up test orchestration.
   * </pre>
   *
   * <code>optional int64 utp_test_setup_start_time_ms = 11;</code>
   * @return The utpTestSetupStartTimeMs.
   */
  long getUtpTestSetupStartTimeMs();

  /**
   * <code>optional int64 utp_test_setup_duration_ms = 12;</code>
   * @return Whether the utpTestSetupDurationMs field is set.
   */
  boolean hasUtpTestSetupDurationMs();
  /**
   * <code>optional int64 utp_test_setup_duration_ms = 12;</code>
   * @return The utpTestSetupDurationMs.
   */
  long getUtpTestSetupDurationMs();

  /**
   * <pre>
   * Span for how long the tests actually took to run.
   * </pre>
   *
   * <code>optional int64 utp_test_run_start_time_ms = 13;</code>
   * @return Whether the utpTestRunStartTimeMs field is set.
   */
  boolean hasUtpTestRunStartTimeMs();
  /**
   * <pre>
   * Span for how long the tests actually took to run.
   * </pre>
   *
   * <code>optional int64 utp_test_run_start_time_ms = 13;</code>
   * @return The utpTestRunStartTimeMs.
   */
  long getUtpTestRunStartTimeMs();

  /**
   * <code>optional int64 utp_test_run_duration_ms = 14;</code>
   * @return Whether the utpTestRunDurationMs field is set.
   */
  boolean hasUtpTestRunDurationMs();
  /**
   * <code>optional int64 utp_test_run_duration_ms = 14;</code>
   * @return The utpTestRunDurationMs.
   */
  long getUtpTestRunDurationMs();

  /**
   * <pre>
   * Span of how long it took to clean up the device and test process.
   * This step can include uninstalling apks, closing the managed device,
   * resetting device state, etc.
   * </pre>
   *
   * <code>optional int64 utp_tear_down_start_time_ms = 15;</code>
   * @return Whether the utpTearDownStartTimeMs field is set.
   */
  boolean hasUtpTearDownStartTimeMs();
  /**
   * <pre>
   * Span of how long it took to clean up the device and test process.
   * This step can include uninstalling apks, closing the managed device,
   * resetting device state, etc.
   * </pre>
   *
   * <code>optional int64 utp_tear_down_start_time_ms = 15;</code>
   * @return The utpTearDownStartTimeMs.
   */
  long getUtpTearDownStartTimeMs();

  /**
   * <code>optional int64 utp_tear_down_duration_ms = 16;</code>
   * @return Whether the utpTearDownDurationMs field is set.
   */
  boolean hasUtpTearDownDurationMs();
  /**
   * <code>optional int64 utp_tear_down_duration_ms = 16;</code>
   * @return The utpTearDownDurationMs.
   */
  long getUtpTearDownDurationMs();

  /**
   * <pre>
   * Whether or not the tests were able to finish, and, if failed, what caused
   * the failure.
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.TestProgressResult progress_result = 17;</code>
   * @return Whether the progressResult field is set.
   */
  boolean hasProgressResult();
  /**
   * <pre>
   * Whether or not the tests were able to finish, and, if failed, what caused
   * the failure.
   * </pre>
   *
   * <code>optional .android_studio.DeviceTestSpanProfile.TestProgressResult progress_result = 17;</code>
   * @return The progressResult.
   */
  com.google.wireless.android.sdk.stats.DeviceTestSpanProfile.TestProgressResult getProgressResult();
}
