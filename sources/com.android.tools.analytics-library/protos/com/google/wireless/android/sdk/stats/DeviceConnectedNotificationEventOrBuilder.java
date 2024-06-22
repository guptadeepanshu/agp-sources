// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DeviceConnectedNotificationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DeviceConnectedNotificationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.DeviceConnectedNotificationEvent.DeviceConnectionType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .android_studio.DeviceConnectedNotificationEvent.DeviceConnectionType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.DeviceConnectedNotificationEvent.DeviceConnectionType getType();

  /**
   * <pre>
   * ADB's detected device maximum speed (Mbps)
   * </pre>
   *
   * <code>optional uint64 max_speed_mbps = 2;</code>
   * @return Whether the maxSpeedMbps field is set.
   */
  boolean hasMaxSpeedMbps();
  /**
   * <pre>
   * ADB's detected device maximum speed (Mbps)
   * </pre>
   *
   * <code>optional uint64 max_speed_mbps = 2;</code>
   * @return The maxSpeedMbps.
   */
  long getMaxSpeedMbps();

  /**
   * <pre>
   * ADB's detected device negotiated speed (Mbps)
   * </pre>
   *
   * <code>optional uint64 negotiated_speed_mbps = 3;</code>
   * @return Whether the negotiatedSpeedMbps field is set.
   */
  boolean hasNegotiatedSpeedMbps();
  /**
   * <pre>
   * ADB's detected device negotiated speed (Mbps)
   * </pre>
   *
   * <code>optional uint64 negotiated_speed_mbps = 3;</code>
   * @return The negotiatedSpeedMbps.
   */
  long getNegotiatedSpeedMbps();

  /**
   * <pre>
   * Is the notification disabled by StudioFlags
   * </pre>
   *
   * <code>optional bool speed_notifications_studio_disabled = 4;</code>
   * @return Whether the speedNotificationsStudioDisabled field is set.
   */
  boolean hasSpeedNotificationsStudioDisabled();
  /**
   * <pre>
   * Is the notification disabled by StudioFlags
   * </pre>
   *
   * <code>optional bool speed_notifications_studio_disabled = 4;</code>
   * @return The speedNotificationsStudioDisabled.
   */
  boolean getSpeedNotificationsStudioDisabled();

  /**
   * <pre>
   * Is the notification disabled by user preferences
   * </pre>
   *
   * <code>optional bool speed_notifications_user_disabled = 5;</code>
   * @return Whether the speedNotificationsUserDisabled field is set.
   */
  boolean hasSpeedNotificationsUserDisabled();
  /**
   * <pre>
   * Is the notification disabled by user preferences
   * </pre>
   *
   * <code>optional bool speed_notifications_user_disabled = 5;</code>
   * @return The speedNotificationsUserDisabled.
   */
  boolean getSpeedNotificationsUserDisabled();
}
