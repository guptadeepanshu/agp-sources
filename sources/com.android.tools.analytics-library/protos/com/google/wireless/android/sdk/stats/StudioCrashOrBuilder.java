// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface StudioCrashOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.StudioCrash)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * number of actions since last crash report.
   * </pre>
   *
   * <code>optional int64 actions = 1;</code>
   * @return Whether the actions field is set.
   */
  boolean hasActions();
  /**
   * <pre>
   * number of actions since last crash report.
   * </pre>
   *
   * <code>optional int64 actions = 1;</code>
   * @return The actions.
   */
  long getActions();

  /**
   * <pre>
   * number of exceptions since last crash report.
   * </pre>
   *
   * <code>optional int64 exceptions = 2;</code>
   * @return Whether the exceptions field is set.
   */
  boolean hasExceptions();
  /**
   * <pre>
   * number of exceptions since last crash report.
   * </pre>
   *
   * <code>optional int64 exceptions = 2;</code>
   * @return The exceptions.
   */
  long getExceptions();

  /**
   * <pre>
   * number of crashes since last crash report.
   * </pre>
   *
   * <code>optional int64 crashes = 3;</code>
   * @return Whether the crashes field is set.
   */
  boolean hasCrashes();
  /**
   * <pre>
   * number of crashes since last crash report.
   * </pre>
   *
   * <code>optional int64 crashes = 3;</code>
   * @return The crashes.
   */
  long getCrashes();

  /**
   * <pre>
   * number of exceptions from plugins bundled with Android Studio.
   * </pre>
   *
   * <code>optional int64 bundled_plugin_exceptions = 4;</code>
   * @return Whether the bundledPluginExceptions field is set.
   */
  boolean hasBundledPluginExceptions();
  /**
   * <pre>
   * number of exceptions from plugins bundled with Android Studio.
   * </pre>
   *
   * <code>optional int64 bundled_plugin_exceptions = 4;</code>
   * @return The bundledPluginExceptions.
   */
  long getBundledPluginExceptions();

  /**
   * <pre>
   * number of exceptions from plugins not bundled with Android Studio.
   * </pre>
   *
   * <code>optional int64 non_bundled_plugin_exceptions = 5;</code>
   * @return Whether the nonBundledPluginExceptions field is set.
   */
  boolean hasNonBundledPluginExceptions();
  /**
   * <pre>
   * number of exceptions from plugins not bundled with Android Studio.
   * </pre>
   *
   * <code>optional int64 non_bundled_plugin_exceptions = 5;</code>
   * @return The nonBundledPluginExceptions.
   */
  long getNonBundledPluginExceptions();

  /**
   * <pre>
   * details on each exception
   * </pre>
   *
   * <code>repeated .android_studio.StudioExceptionDetails details = 6;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.StudioExceptionDetails> 
      getDetailsList();
  /**
   * <pre>
   * details on each exception
   * </pre>
   *
   * <code>repeated .android_studio.StudioExceptionDetails details = 6;</code>
   */
  com.google.wireless.android.sdk.stats.StudioExceptionDetails getDetails(int index);
  /**
   * <pre>
   * details on each exception
   * </pre>
   *
   * <code>repeated .android_studio.StudioExceptionDetails details = 6;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * details on each exception
   * </pre>
   *
   * <code>repeated .android_studio.StudioExceptionDetails details = 6;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.StudioExceptionDetailsOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <pre>
   * details on each exception
   * </pre>
   *
   * <code>repeated .android_studio.StudioExceptionDetails details = 6;</code>
   */
  com.google.wireless.android.sdk.stats.StudioExceptionDetailsOrBuilder getDetailsOrBuilder(
      int index);
}
