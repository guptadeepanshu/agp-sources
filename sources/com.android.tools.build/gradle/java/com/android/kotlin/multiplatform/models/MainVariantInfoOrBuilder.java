// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kotlin_multiplatform_android_models.proto

package com.android.kotlin.multiplatform.models;

public interface MainVariantInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MainVariantInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string namespace = 1;</code>
   * @return Whether the namespace field is set.
   */
  boolean hasNamespace();
  /**
   * <code>optional string namespace = 1;</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 1;</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <pre>
   * The compilation target as a string. This is the full extended target hash string.
   * </pre>
   *
   * <code>optional string compile_sdk_target = 2;</code>
   * @return Whether the compileSdkTarget field is set.
   */
  boolean hasCompileSdkTarget();
  /**
   * <pre>
   * The compilation target as a string. This is the full extended target hash string.
   * </pre>
   *
   * <code>optional string compile_sdk_target = 2;</code>
   * @return The compileSdkTarget.
   */
  java.lang.String getCompileSdkTarget();
  /**
   * <pre>
   * The compilation target as a string. This is the full extended target hash string.
   * </pre>
   *
   * <code>optional string compile_sdk_target = 2;</code>
   * @return The bytes for compileSdkTarget.
   */
  com.google.protobuf.ByteString
      getCompileSdkTargetBytes();

  /**
   * <pre>
   * The min SDK version of this artifact.
   * </pre>
   *
   * <code>optional .AndroidVersion min_sdk_version = 3;</code>
   * @return Whether the minSdkVersion field is set.
   */
  boolean hasMinSdkVersion();
  /**
   * <pre>
   * The min SDK version of this artifact.
   * </pre>
   *
   * <code>optional .AndroidVersion min_sdk_version = 3;</code>
   * @return The minSdkVersion.
   */
  com.android.builder.model.proto.ide.AndroidVersion getMinSdkVersion();
  /**
   * <pre>
   * The min SDK version of this artifact.
   * </pre>
   *
   * <code>optional .AndroidVersion min_sdk_version = 3;</code>
   */
  com.android.builder.model.proto.ide.AndroidVersionOrBuilder getMinSdkVersionOrBuilder();

  /**
   * <pre>
   * The max SDK version of this artifact.
   * </pre>
   *
   * <code>optional int32 max_sdk_version = 4;</code>
   * @return Whether the maxSdkVersion field is set.
   */
  boolean hasMaxSdkVersion();
  /**
   * <pre>
   * The max SDK version of this artifact.
   * </pre>
   *
   * <code>optional int32 max_sdk_version = 4;</code>
   * @return The maxSdkVersion.
   */
  int getMaxSdkVersion();

  /**
   * <pre>
   * Specifies the ProGuard configuration files that the plugin should use.
   * There are two ProGuard rules files that ship with the Android plugin and are used by
   * default:
   *   * proguard-android.txt
   *   * proguard-android-optimize.txt
   * `proguard-android-optimize.txt` is identical to `proguard-android.txt`,
   * except with optimizations enabled.
   * </pre>
   *
   * <code>repeated .File proguard_files = 5;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getProguardFilesList();
  /**
   * <pre>
   * Specifies the ProGuard configuration files that the plugin should use.
   * There are two ProGuard rules files that ship with the Android plugin and are used by
   * default:
   *   * proguard-android.txt
   *   * proguard-android-optimize.txt
   * `proguard-android-optimize.txt` is identical to `proguard-android.txt`,
   * except with optimizations enabled.
   * </pre>
   *
   * <code>repeated .File proguard_files = 5;</code>
   */
  com.android.builder.model.proto.ide.File getProguardFiles(int index);
  /**
   * <pre>
   * Specifies the ProGuard configuration files that the plugin should use.
   * There are two ProGuard rules files that ship with the Android plugin and are used by
   * default:
   *   * proguard-android.txt
   *   * proguard-android-optimize.txt
   * `proguard-android-optimize.txt` is identical to `proguard-android.txt`,
   * except with optimizations enabled.
   * </pre>
   *
   * <code>repeated .File proguard_files = 5;</code>
   */
  int getProguardFilesCount();
  /**
   * <pre>
   * Specifies the ProGuard configuration files that the plugin should use.
   * There are two ProGuard rules files that ship with the Android plugin and are used by
   * default:
   *   * proguard-android.txt
   *   * proguard-android-optimize.txt
   * `proguard-android-optimize.txt` is identical to `proguard-android.txt`,
   * except with optimizations enabled.
   * </pre>
   *
   * <code>repeated .File proguard_files = 5;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getProguardFilesOrBuilderList();
  /**
   * <pre>
   * Specifies the ProGuard configuration files that the plugin should use.
   * There are two ProGuard rules files that ship with the Android plugin and are used by
   * default:
   *   * proguard-android.txt
   *   * proguard-android-optimize.txt
   * `proguard-android-optimize.txt` is identical to `proguard-android.txt`,
   * except with optimizations enabled.
   * </pre>
   *
   * <code>repeated .File proguard_files = 5;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getProguardFilesOrBuilder(
      int index);

  /**
   * <pre>
   * The collection of proguard rule files for consumers of the library to use.
   * </pre>
   *
   * <code>repeated .File consumer_proguard_files = 6;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getConsumerProguardFilesList();
  /**
   * <pre>
   * The collection of proguard rule files for consumers of the library to use.
   * </pre>
   *
   * <code>repeated .File consumer_proguard_files = 6;</code>
   */
  com.android.builder.model.proto.ide.File getConsumerProguardFiles(int index);
  /**
   * <pre>
   * The collection of proguard rule files for consumers of the library to use.
   * </pre>
   *
   * <code>repeated .File consumer_proguard_files = 6;</code>
   */
  int getConsumerProguardFilesCount();
  /**
   * <pre>
   * The collection of proguard rule files for consumers of the library to use.
   * </pre>
   *
   * <code>repeated .File consumer_proguard_files = 6;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getConsumerProguardFilesOrBuilderList();
  /**
   * <pre>
   * The collection of proguard rule files for consumers of the library to use.
   * </pre>
   *
   * <code>repeated .File consumer_proguard_files = 6;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getConsumerProguardFilesOrBuilder(
      int index);

  /**
   * <pre>
   * Whether code shrinking is enabled.
   * </pre>
   *
   * <code>optional bool minification_enabled = 7;</code>
   * @return Whether the minificationEnabled field is set.
   */
  boolean hasMinificationEnabled();
  /**
   * <pre>
   * Whether code shrinking is enabled.
   * </pre>
   *
   * <code>optional bool minification_enabled = 7;</code>
   * @return The minificationEnabled.
   */
  boolean getMinificationEnabled();
}