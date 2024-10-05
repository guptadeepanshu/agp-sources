// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface ApplyAtfFixEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.ApplyAtfFixEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1 [lazy = true];</code>
   * @return Whether the atfResult field is set.
   */
  boolean hasAtfResult();
  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1 [lazy = true];</code>
   * @return The atfResult.
   */
  com.google.wireless.android.sdk.stats.AtfResultDetail getAtfResult();
  /**
   * <pre>
   * Details related to the ATF result which has been fixed
   * </pre>
   *
   * <code>optional .android_studio.AtfResultDetail atf_result = 1 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AtfResultDetailOrBuilder getAtfResultOrBuilder();

  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2 [lazy = true];</code>
   * @return Whether the atfFix field is set.
   */
  boolean hasAtfFix();
  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2 [lazy = true];</code>
   * @return The atfFix.
   */
  com.google.wireless.android.sdk.stats.AtfFixDetail getAtfFix();
  /**
   * <pre>
   * Details related to the ATF fix which has been applied
   * </pre>
   *
   * <code>optional .android_studio.AtfFixDetail atf_fix = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AtfFixDetailOrBuilder getAtfFixOrBuilder();
}
