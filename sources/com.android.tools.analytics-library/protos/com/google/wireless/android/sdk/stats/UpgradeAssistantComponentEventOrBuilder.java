// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface UpgradeAssistantComponentEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.UpgradeAssistantComponentEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The uuid for a session of the upgrade assistant.
   * </pre>
   *
   * <code>optional string upgrade_uuid = 1;</code>
   * @return Whether the upgradeUuid field is set.
   */
  boolean hasUpgradeUuid();
  /**
   * <pre>
   * The uuid for a session of the upgrade assistant.
   * </pre>
   *
   * <code>optional string upgrade_uuid = 1;</code>
   * @return The upgradeUuid.
   */
  java.lang.String getUpgradeUuid();
  /**
   * <pre>
   * The uuid for a session of the upgrade assistant.
   * </pre>
   *
   * <code>optional string upgrade_uuid = 1;</code>
   * @return The bytes for upgradeUuid.
   */
  com.google.protobuf.ByteString
      getUpgradeUuidBytes();

  /**
   * <pre>
   * The software version of AGP used by the project.
   * </pre>
   *
   * <code>optional string current_agp_version = 2;</code>
   * @return Whether the currentAgpVersion field is set.
   */
  boolean hasCurrentAgpVersion();
  /**
   * <pre>
   * The software version of AGP used by the project.
   * </pre>
   *
   * <code>optional string current_agp_version = 2;</code>
   * @return The currentAgpVersion.
   */
  java.lang.String getCurrentAgpVersion();
  /**
   * <pre>
   * The software version of AGP used by the project.
   * </pre>
   *
   * <code>optional string current_agp_version = 2;</code>
   * @return The bytes for currentAgpVersion.
   */
  com.google.protobuf.ByteString
      getCurrentAgpVersionBytes();

  /**
   * <pre>
   * The software version of AGP after upgrade.
   * </pre>
   *
   * <code>optional string new_agp_version = 3;</code>
   * @return Whether the newAgpVersion field is set.
   */
  boolean hasNewAgpVersion();
  /**
   * <pre>
   * The software version of AGP after upgrade.
   * </pre>
   *
   * <code>optional string new_agp_version = 3;</code>
   * @return The newAgpVersion.
   */
  java.lang.String getNewAgpVersion();
  /**
   * <pre>
   * The software version of AGP after upgrade.
   * </pre>
   *
   * <code>optional string new_agp_version = 3;</code>
   * @return The bytes for newAgpVersion.
   */
  com.google.protobuf.ByteString
      getNewAgpVersionBytes();

  /**
   * <pre>
   * The software version of Gradle used by the project.
   * </pre>
   *
   * <code>optional string current_gradle_version = 4;</code>
   * @return Whether the currentGradleVersion field is set.
   */
  boolean hasCurrentGradleVersion();
  /**
   * <pre>
   * The software version of Gradle used by the project.
   * </pre>
   *
   * <code>optional string current_gradle_version = 4;</code>
   * @return The currentGradleVersion.
   */
  java.lang.String getCurrentGradleVersion();
  /**
   * <pre>
   * The software version of Gradle used by the project.
   * </pre>
   *
   * <code>optional string current_gradle_version = 4;</code>
   * @return The bytes for currentGradleVersion.
   */
  com.google.protobuf.ByteString
      getCurrentGradleVersionBytes();

  /**
   * <pre>
   * The software version of Gradle after upgrade.
   * </pre>
   *
   * <code>optional string new_gradle_version = 5;</code>
   * @return Whether the newGradleVersion field is set.
   */
  boolean hasNewGradleVersion();
  /**
   * <pre>
   * The software version of Gradle after upgrade.
   * </pre>
   *
   * <code>optional string new_gradle_version = 5;</code>
   * @return The newGradleVersion.
   */
  java.lang.String getNewGradleVersion();
  /**
   * <pre>
   * The software version of Gradle after upgrade.
   * </pre>
   *
   * <code>optional string new_gradle_version = 5;</code>
   * @return The bytes for newGradleVersion.
   */
  com.google.protobuf.ByteString
      getNewGradleVersionBytes();

  /**
   * <pre>
   * Information about the component involved in the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantComponentInfo component_info = 6 [lazy = true];</code>
   * @return Whether the componentInfo field is set.
   */
  boolean hasComponentInfo();
  /**
   * <pre>
   * Information about the component involved in the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantComponentInfo component_info = 6 [lazy = true];</code>
   * @return The componentInfo.
   */
  com.google.wireless.android.sdk.stats.UpgradeAssistantComponentInfo getComponentInfo();
  /**
   * <pre>
   * Information about the component involved in the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantComponentInfo component_info = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.UpgradeAssistantComponentInfoOrBuilder getComponentInfoOrBuilder();

  /**
   * <pre>
   * Information about the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo event_info = 7 [lazy = true];</code>
   * @return Whether the eventInfo field is set.
   */
  boolean hasEventInfo();
  /**
   * <pre>
   * Information about the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo event_info = 7 [lazy = true];</code>
   * @return The eventInfo.
   */
  com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo getEventInfo();
  /**
   * <pre>
   * Information about the event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo event_info = 7 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfoOrBuilder getEventInfoOrBuilder();
}
