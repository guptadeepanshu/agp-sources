// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface PromptLibraryEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.PromptLibraryEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.PromptLibraryEvent.Update update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <code>optional .android_studio.PromptLibraryEvent.Update update = 1;</code>
   * @return The update.
   */
  com.google.wireless.android.sdk.stats.PromptLibraryEvent.Update getUpdate();
  /**
   * <code>optional .android_studio.PromptLibraryEvent.Update update = 1;</code>
   */
  com.google.wireless.android.sdk.stats.PromptLibraryEvent.UpdateOrBuilder getUpdateOrBuilder();

  /**
   * <code>optional .android_studio.PromptLibraryEvent.Invoke invoke = 2;</code>
   * @return Whether the invoke field is set.
   */
  boolean hasInvoke();
  /**
   * <code>optional .android_studio.PromptLibraryEvent.Invoke invoke = 2;</code>
   * @return The invoke.
   */
  com.google.wireless.android.sdk.stats.PromptLibraryEvent.Invoke getInvoke();
  /**
   * <code>optional .android_studio.PromptLibraryEvent.Invoke invoke = 2;</code>
   */
  com.google.wireless.android.sdk.stats.PromptLibraryEvent.InvokeOrBuilder getInvokeOrBuilder();
}
