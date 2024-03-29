// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface InstantRunStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.InstantRunStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of artifacts built in this invocation.
   * e.g. COLD for when the changes cannot be hot-swapped, either due to the
   * app not running on the users device or the changes cannot be hot swapped.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.BuildMode build_mode = 1;</code>
   * @return Whether the buildMode field is set.
   */
  boolean hasBuildMode();
  /**
   * <pre>
   * The type of artifacts built in this invocation.
   * e.g. COLD for when the changes cannot be hot-swapped, either due to the
   * app not running on the users device or the changes cannot be hot swapped.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.BuildMode build_mode = 1;</code>
   * @return The buildMode.
   */
  com.google.wireless.android.sdk.stats.InstantRunStatus.BuildMode getBuildMode();

  /**
   * <pre>
   * The type of deploy that the build can generate artifacts for.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.PatchingPolicy patching_policy = 2;</code>
   * @return Whether the patchingPolicy field is set.
   */
  boolean hasPatchingPolicy();
  /**
   * <pre>
   * The type of deploy that the build can generate artifacts for.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.PatchingPolicy patching_policy = 2;</code>
   * @return The patchingPolicy.
   */
  com.google.wireless.android.sdk.stats.InstantRunStatus.PatchingPolicy getPatchingPolicy();

  /**
   * <pre>
   * The result of the verifier run, whether the users change can be hot-swapped
   * or requires a cold swap or full build is determined by the verifier.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.VerifierStatus verifier_status = 3;</code>
   * @return Whether the verifierStatus field is set.
   */
  boolean hasVerifierStatus();
  /**
   * <pre>
   * The result of the verifier run, whether the users change can be hot-swapped
   * or requires a cold swap or full build is determined by the verifier.
   * </pre>
   *
   * <code>optional .android_studio.InstantRunStatus.VerifierStatus verifier_status = 3;</code>
   * @return The verifierStatus.
   */
  com.google.wireless.android.sdk.stats.InstantRunStatus.VerifierStatus getVerifierStatus();

  /**
   * <pre>
   * The built artifacts stored in the build info.
   * Artifacts that were built, but superseeded (e.g. a main APK contains
   * resources, so the resources do not need to be reported separately) are
   * not included.
   * </pre>
   *
   * <code>repeated .android_studio.InstantRunArtifact artifact = 4;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.InstantRunArtifact> 
      getArtifactList();
  /**
   * <pre>
   * The built artifacts stored in the build info.
   * Artifacts that were built, but superseeded (e.g. a main APK contains
   * resources, so the resources do not need to be reported separately) are
   * not included.
   * </pre>
   *
   * <code>repeated .android_studio.InstantRunArtifact artifact = 4;</code>
   */
  com.google.wireless.android.sdk.stats.InstantRunArtifact getArtifact(int index);
  /**
   * <pre>
   * The built artifacts stored in the build info.
   * Artifacts that were built, but superseeded (e.g. a main APK contains
   * resources, so the resources do not need to be reported separately) are
   * not included.
   * </pre>
   *
   * <code>repeated .android_studio.InstantRunArtifact artifact = 4;</code>
   */
  int getArtifactCount();
  /**
   * <pre>
   * The built artifacts stored in the build info.
   * Artifacts that were built, but superseeded (e.g. a main APK contains
   * resources, so the resources do not need to be reported separately) are
   * not included.
   * </pre>
   *
   * <code>repeated .android_studio.InstantRunArtifact artifact = 4;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.InstantRunArtifactOrBuilder> 
      getArtifactOrBuilderList();
  /**
   * <pre>
   * The built artifacts stored in the build info.
   * Artifacts that were built, but superseeded (e.g. a main APK contains
   * resources, so the resources do not need to be reported separately) are
   * not included.
   * </pre>
   *
   * <code>repeated .android_studio.InstantRunArtifact artifact = 4;</code>
   */
  com.google.wireless.android.sdk.stats.InstantRunArtifactOrBuilder getArtifactOrBuilder(
      int index);
}
