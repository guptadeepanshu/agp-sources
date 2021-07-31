// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface UpgradeAssistantEventInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.UpgradeAssistantEventInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The kind of event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * The kind of event.
   * </pre>
   *
   * <code>optional .android_studio.UpgradeAssistantEventInfo.UpgradeAssistantEventKind kind = 1;</code>
   * @return The kind.
   */
  com.google.wireless.android.sdk.stats.UpgradeAssistantEventInfo.UpgradeAssistantEventKind getKind();

  /**
   * <pre>
   * The number of usages.  Will be set if kind is FIND_USAGES,
   * PREVIEW_REFACTORING or EXECUTE.
   * </pre>
   *
   * <code>optional int32 usages = 2;</code>
   * @return Whether the usages field is set.
   */
  boolean hasUsages();
  /**
   * <pre>
   * The number of usages.  Will be set if kind is FIND_USAGES,
   * PREVIEW_REFACTORING or EXECUTE.
   * </pre>
   *
   * <code>optional int32 usages = 2;</code>
   * @return The usages.
   */
  int getUsages();
}
