// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradlePluginDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradlePluginData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return Whether the className field is set.
   */
  boolean hasClassName();
  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return The className.
   */
  java.lang.String getClassName();
  /**
   * <pre>
   * The name of the plugin class. e.g. com.android.build.gradle.LintPlugin
   * </pre>
   *
   * <code>optional string class_name = 1;</code>
   * @return The bytes for className.
   */
  com.google.protobuf.ByteString
      getClassNameBytes();

  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return Whether the jarName field is set.
   */
  boolean hasJarName();
  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return The jarName.
   */
  java.lang.String getJarName();
  /**
   * <pre>
   * The name of the jar containing the plugin class, will be on the form:
   * artifactId-version. e.g. "kotlin-gradle-plugin-1.5.30"
   * </pre>
   *
   * <code>optional string jar_name = 2;</code>
   * @return The bytes for jarName.
   */
  com.google.protobuf.ByteString
      getJarNameBytes();
}