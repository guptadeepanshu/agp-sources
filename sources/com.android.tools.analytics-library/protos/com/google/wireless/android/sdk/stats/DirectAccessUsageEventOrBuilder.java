// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DirectAccessUsageEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DirectAccessUsageEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.DirectAccessUsageEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.DirectAccessUsageEventType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.DirectAccessUsageEventType getType();

  /**
   * <pre>
   * Session ID of current reservation/session for tracking events
   * during a session
   * Client-side salted, sha256 of session ID with salt rotated every 28 day.
   * </pre>
   *
   * <code>optional string device_session_id = 2;</code>
   * @return Whether the deviceSessionId field is set.
   */
  boolean hasDeviceSessionId();
  /**
   * <pre>
   * Session ID of current reservation/session for tracking events
   * during a session
   * Client-side salted, sha256 of session ID with salt rotated every 28 day.
   * </pre>
   *
   * <code>optional string device_session_id = 2;</code>
   * @return The deviceSessionId.
   */
  java.lang.String getDeviceSessionId();
  /**
   * <pre>
   * Session ID of current reservation/session for tracking events
   * during a session
   * Client-side salted, sha256 of session ID with salt rotated every 28 day.
   * </pre>
   *
   * <code>optional string device_session_id = 2;</code>
   * @return The bytes for deviceSessionId.
   */
  com.google.protobuf.ByteString
      getDeviceSessionIdBytes();

  /**
   * <pre>
   * set when type = RESERVE_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ReserveDeviceDetails reserve_device_details = 3 [lazy = true];</code>
   * @return Whether the reserveDeviceDetails field is set.
   */
  boolean hasReserveDeviceDetails();
  /**
   * <pre>
   * set when type = RESERVE_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ReserveDeviceDetails reserve_device_details = 3 [lazy = true];</code>
   * @return The reserveDeviceDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ReserveDeviceDetails getReserveDeviceDetails();
  /**
   * <pre>
   * set when type = RESERVE_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ReserveDeviceDetails reserve_device_details = 3 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ReserveDeviceDetailsOrBuilder getReserveDeviceDetailsOrBuilder();

  /**
   * <pre>
   * set when type = CONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ConnectDeviceDetails connect_device_details = 4 [lazy = true];</code>
   * @return Whether the connectDeviceDetails field is set.
   */
  boolean hasConnectDeviceDetails();
  /**
   * <pre>
   * set when type = CONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ConnectDeviceDetails connect_device_details = 4 [lazy = true];</code>
   * @return The connectDeviceDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ConnectDeviceDetails getConnectDeviceDetails();
  /**
   * <pre>
   * set when type = CONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ConnectDeviceDetails connect_device_details = 4 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ConnectDeviceDetailsOrBuilder getConnectDeviceDetailsOrBuilder();

  /**
   * <pre>
   * set when type = STREAM_STARTED
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.StreamStartedDetails stream_started_details = 5 [lazy = true];</code>
   * @return Whether the streamStartedDetails field is set.
   */
  boolean hasStreamStartedDetails();
  /**
   * <pre>
   * set when type = STREAM_STARTED
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.StreamStartedDetails stream_started_details = 5 [lazy = true];</code>
   * @return The streamStartedDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.StreamStartedDetails getStreamStartedDetails();
  /**
   * <pre>
   * set when type = STREAM_STARTED
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.StreamStartedDetails stream_started_details = 5 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.StreamStartedDetailsOrBuilder getStreamStartedDetailsOrBuilder();

  /**
   * <pre>
   * set when type = EXTEND_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ExtendReservationDetails extend_reservation_details = 6 [lazy = true];</code>
   * @return Whether the extendReservationDetails field is set.
   */
  boolean hasExtendReservationDetails();
  /**
   * <pre>
   * set when type = EXTEND_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ExtendReservationDetails extend_reservation_details = 6 [lazy = true];</code>
   * @return The extendReservationDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ExtendReservationDetails getExtendReservationDetails();
  /**
   * <pre>
   * set when type = EXTEND_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.ExtendReservationDetails extend_reservation_details = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.ExtendReservationDetailsOrBuilder getExtendReservationDetailsOrBuilder();

  /**
   * <pre>
   * set when type = END_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.EndReservationDetails end_reservation_details = 7 [lazy = true];</code>
   * @return Whether the endReservationDetails field is set.
   */
  boolean hasEndReservationDetails();
  /**
   * <pre>
   * set when type = END_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.EndReservationDetails end_reservation_details = 7 [lazy = true];</code>
   * @return The endReservationDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.EndReservationDetails getEndReservationDetails();
  /**
   * <pre>
   * set when type = END_RESERVATION
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.EndReservationDetails end_reservation_details = 7 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.EndReservationDetailsOrBuilder getEndReservationDetailsOrBuilder();

  /**
   * <pre>
   * set when any of the above event fails (success bool is marked false)
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.FailureReason failure_reason = 8;</code>
   * @return Whether the failureReason field is set.
   */
  boolean hasFailureReason();
  /**
   * <pre>
   * set when any of the above event fails (success bool is marked false)
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.FailureReason failure_reason = 8;</code>
   * @return The failureReason.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.FailureReason getFailureReason();

  /**
   * <pre>
   * Set when type = DISCONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.DisconnectDeviceDetails disconnect_device_details = 9 [lazy = true];</code>
   * @return Whether the disconnectDeviceDetails field is set.
   */
  boolean hasDisconnectDeviceDetails();
  /**
   * <pre>
   * Set when type = DISCONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.DisconnectDeviceDetails disconnect_device_details = 9 [lazy = true];</code>
   * @return The disconnectDeviceDetails.
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.DisconnectDeviceDetails getDisconnectDeviceDetails();
  /**
   * <pre>
   * Set when type = DISCONNECT_DEVICE
   * </pre>
   *
   * <code>optional .android_studio.DirectAccessUsageEvent.DisconnectDeviceDetails disconnect_device_details = 9 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DirectAccessUsageEvent.DisconnectDeviceDetailsOrBuilder getDisconnectDeviceDetailsOrBuilder();
}
