// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface ProductDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.ProductDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The product this event relates to.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.ProductKind product = 1;</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <pre>
   * The product this event relates to.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.ProductKind product = 1;</code>
   * @return The product.
   */
  com.google.wireless.android.sdk.stats.ProductDetails.ProductKind getProduct();

  /**
   * <pre>
   * The build ID of Android Studio.
   * </pre>
   *
   * <code>optional string build = 2;</code>
   * @return Whether the build field is set.
   */
  boolean hasBuild();
  /**
   * <pre>
   * The build ID of Android Studio.
   * </pre>
   *
   * <code>optional string build = 2;</code>
   * @return The build.
   */
  java.lang.String getBuild();
  /**
   * <pre>
   * The build ID of Android Studio.
   * </pre>
   *
   * <code>optional string build = 2;</code>
   * @return The bytes for build.
   */
  com.google.protobuf.ByteString
      getBuildBytes();

  /**
   * <pre>
   * The version of the product.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * The version of the product.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version of the product.
   * </pre>
   *
   * <code>optional string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Historical: never used as it was not providing enough info. Use channel
   * instead as it distinguishes between different kinds of preview releases.
   * </pre>
   *
   * <code>optional bool preview = 4 [deprecated = true];</code>
   * @deprecated
   * @return Whether the preview field is set.
   */
  @java.lang.Deprecated boolean hasPreview();
  /**
   * <pre>
   * Historical: never used as it was not providing enough info. Use channel
   * instead as it distinguishes between different kinds of preview releases.
   * </pre>
   *
   * <code>optional bool preview = 4 [deprecated = true];</code>
   * @deprecated
   * @return The preview.
   */
  @java.lang.Deprecated boolean getPreview();

  /**
   * <pre>
   * The CPU architecture the product is running on.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.CpuArchitecture os_architecture = 5;</code>
   * @return Whether the osArchitecture field is set.
   */
  boolean hasOsArchitecture();
  /**
   * <pre>
   * The CPU architecture the product is running on.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.CpuArchitecture os_architecture = 5;</code>
   * @return The osArchitecture.
   */
  com.google.wireless.android.sdk.stats.ProductDetails.CpuArchitecture getOsArchitecture();

  /**
   * <pre>
   * The state in the software lifecycle of this product.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.SoftwareLifeCycleChannel channel = 6;</code>
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   * <pre>
   * The state in the software lifecycle of this product.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.SoftwareLifeCycleChannel channel = 6;</code>
   * @return The channel.
   */
  com.google.wireless.android.sdk.stats.ProductDetails.SoftwareLifeCycleChannel getChannel();

  /**
   * <pre>
   * Set when ProductKind = STUDIO, the look and feel of the product.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.IdeTheme theme = 7;</code>
   * @return Whether the theme field is set.
   */
  boolean hasTheme();
  /**
   * <pre>
   * Set when ProductKind = STUDIO, the look and feel of the product.
   * </pre>
   *
   * <code>optional .android_studio.ProductDetails.IdeTheme theme = 7;</code>
   * @return The theme.
   */
  com.google.wireless.android.sdk.stats.ProductDetails.IdeTheme getTheme();

  /**
   * <pre>
   * Optional list of strings identifying experiments turned on for
   * the installation of Android Studio this log is sent for.
   * experiment_id Strings are generated by the Android Studio team and do not
   * contain user data.
   * </pre>
   *
   * <code>repeated string experiment_id = 8;</code>
   * @return A list containing the experimentId.
   */
  java.util.List<java.lang.String>
      getExperimentIdList();
  /**
   * <pre>
   * Optional list of strings identifying experiments turned on for
   * the installation of Android Studio this log is sent for.
   * experiment_id Strings are generated by the Android Studio team and do not
   * contain user data.
   * </pre>
   *
   * <code>repeated string experiment_id = 8;</code>
   * @return The count of experimentId.
   */
  int getExperimentIdCount();
  /**
   * <pre>
   * Optional list of strings identifying experiments turned on for
   * the installation of Android Studio this log is sent for.
   * experiment_id Strings are generated by the Android Studio team and do not
   * contain user data.
   * </pre>
   *
   * <code>repeated string experiment_id = 8;</code>
   * @param index The index of the element to return.
   * @return The experimentId at the given index.
   */
  java.lang.String getExperimentId(int index);
  /**
   * <pre>
   * Optional list of strings identifying experiments turned on for
   * the installation of Android Studio this log is sent for.
   * experiment_id Strings are generated by the Android Studio team and do not
   * contain user data.
   * </pre>
   *
   * <code>repeated string experiment_id = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the experimentId at the given index.
   */
  com.google.protobuf.ByteString
      getExperimentIdBytes(int index);

  /**
   * <pre>
   * The changelist used to generate the server flags for this installation
   * </pre>
   *
   * <code>optional int64 server_flags_changelist = 9;</code>
   * @return Whether the serverFlagsChangelist field is set.
   */
  boolean hasServerFlagsChangelist();
  /**
   * <pre>
   * The changelist used to generate the server flags for this installation
   * </pre>
   *
   * <code>optional int64 server_flags_changelist = 9;</code>
   * @return The serverFlagsChangelist.
   */
  long getServerFlagsChangelist();
}
