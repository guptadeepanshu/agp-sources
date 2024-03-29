// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface IntelliJNewUISwitchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.IntelliJNewUISwitch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Source of the new ui status switch
   * </pre>
   *
   * <code>optional .android_studio.IntelliJNewUISwitch.SwitchSource switch_source = 1;</code>
   * @return Whether the switchSource field is set.
   */
  boolean hasSwitchSource();
  /**
   * <pre>
   * Source of the new ui status switch
   * </pre>
   *
   * <code>optional .android_studio.IntelliJNewUISwitch.SwitchSource switch_source = 1;</code>
   * @return The switchSource.
   */
  com.google.wireless.android.sdk.stats.IntelliJNewUISwitch.SwitchSource getSwitchSource();

  /**
   * <pre>
   * updated status of new ui
   * </pre>
   *
   * <code>optional bool new_ui = 2;</code>
   * @return Whether the newUi field is set.
   */
  boolean hasNewUi();
  /**
   * <pre>
   * updated status of new ui
   * </pre>
   *
   * <code>optional bool new_ui = 2;</code>
   * @return The newUi.
   */
  boolean getNewUi();
}
