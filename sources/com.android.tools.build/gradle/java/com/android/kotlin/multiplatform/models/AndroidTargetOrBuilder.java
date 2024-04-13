// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kotlin_multiplatform_android_models.proto

package com.android.kotlin.multiplatform.models;

public interface AndroidTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the android gradle plugin.
   * </pre>
   *
   * <code>optional string agp_version = 1;</code>
   * @return Whether the agpVersion field is set.
   */
  boolean hasAgpVersion();
  /**
   * <pre>
   * Version of the android gradle plugin.
   * </pre>
   *
   * <code>optional string agp_version = 1;</code>
   * @return The agpVersion.
   */
  java.lang.String getAgpVersion();
  /**
   * <pre>
   * Version of the android gradle plugin.
   * </pre>
   *
   * <code>optional string agp_version = 1;</code>
   * @return The bytes for agpVersion.
   */
  com.google.protobuf.ByteString
      getAgpVersionBytes();

  /**
   * <pre>
   * The gradle path of the module.
   * </pre>
   *
   * <code>optional string project_path = 2;</code>
   * @return Whether the projectPath field is set.
   */
  boolean hasProjectPath();
  /**
   * <pre>
   * The gradle path of the module.
   * </pre>
   *
   * <code>optional string project_path = 2;</code>
   * @return The projectPath.
   */
  java.lang.String getProjectPath();
  /**
   * <pre>
   * The gradle path of the module.
   * </pre>
   *
   * <code>optional string project_path = 2;</code>
   * @return The bytes for projectPath.
   */
  com.google.protobuf.ByteString
      getProjectPathBytes();

  /**
   * <pre>
   * The gradle build folder of the project.
   * </pre>
   *
   * <code>optional .File build_dir = 3;</code>
   * @return Whether the buildDir field is set.
   */
  boolean hasBuildDir();
  /**
   * <pre>
   * The gradle build folder of the project.
   * </pre>
   *
   * <code>optional .File build_dir = 3;</code>
   * @return The buildDir.
   */
  com.android.builder.model.proto.ide.File getBuildDir();
  /**
   * <pre>
   * The gradle build folder of the project.
   * </pre>
   *
   * <code>optional .File build_dir = 3;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getBuildDirOrBuilder();

  /**
   * <pre>
   * The boot classpath matching the compile target. This is typically android.jar plus
   * other optional libraries.
   * </pre>
   *
   * <code>repeated .File boot_classpath = 4;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getBootClasspathList();
  /**
   * <pre>
   * The boot classpath matching the compile target. This is typically android.jar plus
   * other optional libraries.
   * </pre>
   *
   * <code>repeated .File boot_classpath = 4;</code>
   */
  com.android.builder.model.proto.ide.File getBootClasspath(int index);
  /**
   * <pre>
   * The boot classpath matching the compile target. This is typically android.jar plus
   * other optional libraries.
   * </pre>
   *
   * <code>repeated .File boot_classpath = 4;</code>
   */
  int getBootClasspathCount();
  /**
   * <pre>
   * The boot classpath matching the compile target. This is typically android.jar plus
   * other optional libraries.
   * </pre>
   *
   * <code>repeated .File boot_classpath = 4;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getBootClasspathOrBuilderList();
  /**
   * <pre>
   * The boot classpath matching the compile target. This is typically android.jar plus
   * other optional libraries.
   * </pre>
   *
   * <code>repeated .File boot_classpath = 4;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getBootClasspathOrBuilder(
      int index);

  /**
   * <pre>
   * The instrumented test info if enabled.
   * </pre>
   *
   * <code>optional .TestInfo test_info = 5;</code>
   * @return Whether the testInfo field is set.
   */
  boolean hasTestInfo();
  /**
   * <pre>
   * The instrumented test info if enabled.
   * </pre>
   *
   * <code>optional .TestInfo test_info = 5;</code>
   * @return The testInfo.
   */
  com.android.builder.model.proto.ide.TestInfo getTestInfo();
  /**
   * <pre>
   * The instrumented test info if enabled.
   * </pre>
   *
   * <code>optional .TestInfo test_info = 5;</code>
   */
  com.android.builder.model.proto.ide.TestInfoOrBuilder getTestInfoOrBuilder();

  /**
   * <pre>
   * The android gradle plugin flags for this project.
   * </pre>
   *
   * <code>optional .AndroidGradlePluginProjectFlags flags = 6;</code>
   * @return Whether the flags field is set.
   */
  boolean hasFlags();
  /**
   * <pre>
   * The android gradle plugin flags for this project.
   * </pre>
   *
   * <code>optional .AndroidGradlePluginProjectFlags flags = 6;</code>
   * @return The flags.
   */
  com.android.builder.model.proto.ide.AndroidGradlePluginProjectFlags getFlags();
  /**
   * <pre>
   * The android gradle plugin flags for this project.
   * </pre>
   *
   * <code>optional .AndroidGradlePluginProjectFlags flags = 6;</code>
   */
  com.android.builder.model.proto.ide.AndroidGradlePluginProjectFlagsOrBuilder getFlagsOrBuilder();

  /**
   * <pre>
   * The lint jars that this module uses to run extra lint checks on this project.
   * This is the resolution of the `lintCheck` configuration.
   * </pre>
   *
   * <code>repeated .File lint_checks_jars = 7;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getLintChecksJarsList();
  /**
   * <pre>
   * The lint jars that this module uses to run extra lint checks on this project.
   * This is the resolution of the `lintCheck` configuration.
   * </pre>
   *
   * <code>repeated .File lint_checks_jars = 7;</code>
   */
  com.android.builder.model.proto.ide.File getLintChecksJars(int index);
  /**
   * <pre>
   * The lint jars that this module uses to run extra lint checks on this project.
   * This is the resolution of the `lintCheck` configuration.
   * </pre>
   *
   * <code>repeated .File lint_checks_jars = 7;</code>
   */
  int getLintChecksJarsCount();
  /**
   * <pre>
   * The lint jars that this module uses to run extra lint checks on this project.
   * This is the resolution of the `lintCheck` configuration.
   * </pre>
   *
   * <code>repeated .File lint_checks_jars = 7;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getLintChecksJarsOrBuilderList();
  /**
   * <pre>
   * The lint jars that this module uses to run extra lint checks on this project.
   * This is the resolution of the `lintCheck` configuration.
   * </pre>
   *
   * <code>repeated .File lint_checks_jars = 7;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getLintChecksJarsOrBuilder(
      int index);

  /**
   * <pre>
   * Whether core library desugaring is enabled, false otherwise.
   * </pre>
   *
   * <code>optional bool is_core_library_desugaring_enabled = 8;</code>
   * @return Whether the isCoreLibraryDesugaringEnabled field is set.
   */
  boolean hasIsCoreLibraryDesugaringEnabled();
  /**
   * <pre>
   * Whether core library desugaring is enabled, false otherwise.
   * </pre>
   *
   * <code>optional bool is_core_library_desugaring_enabled = 8;</code>
   * @return The isCoreLibraryDesugaringEnabled.
   */
  boolean getIsCoreLibraryDesugaringEnabled();

  /**
   * <pre>
   * Returns desugar.json configuration files for library desugaring, or empty when library
   * desugaring is not enabled. Currently, there would only be one desugar.json file for the
   * entire project, but could be more in the future if r8 team decides to publish more.
   * </pre>
   *
   * <code>repeated .File desugar_lib_config = 9;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getDesugarLibConfigList();
  /**
   * <pre>
   * Returns desugar.json configuration files for library desugaring, or empty when library
   * desugaring is not enabled. Currently, there would only be one desugar.json file for the
   * entire project, but could be more in the future if r8 team decides to publish more.
   * </pre>
   *
   * <code>repeated .File desugar_lib_config = 9;</code>
   */
  com.android.builder.model.proto.ide.File getDesugarLibConfig(int index);
  /**
   * <pre>
   * Returns desugar.json configuration files for library desugaring, or empty when library
   * desugaring is not enabled. Currently, there would only be one desugar.json file for the
   * entire project, but could be more in the future if r8 team decides to publish more.
   * </pre>
   *
   * <code>repeated .File desugar_lib_config = 9;</code>
   */
  int getDesugarLibConfigCount();
  /**
   * <pre>
   * Returns desugar.json configuration files for library desugaring, or empty when library
   * desugaring is not enabled. Currently, there would only be one desugar.json file for the
   * entire project, but could be more in the future if r8 team decides to publish more.
   * </pre>
   *
   * <code>repeated .File desugar_lib_config = 9;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getDesugarLibConfigOrBuilderList();
  /**
   * <pre>
   * Returns desugar.json configuration files for library desugaring, or empty when library
   * desugaring is not enabled. Currently, there would only be one desugar.json file for the
   * entire project, but could be more in the future if r8 team decides to publish more.
   * </pre>
   *
   * <code>repeated .File desugar_lib_config = 9;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getDesugarLibConfigOrBuilder(
      int index);

  /**
   * <pre>
   * Returns the optional group-id of the artifact represented by this project.
   * </pre>
   *
   * <code>optional string group_id = 10;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <pre>
   * Returns the optional group-id of the artifact represented by this project.
   * </pre>
   *
   * <code>optional string group_id = 10;</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * Returns the optional group-id of the artifact represented by this project.
   * </pre>
   *
   * <code>optional string group_id = 10;</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The build tools version used by this module.
   * </pre>
   *
   * <code>optional string build_tools_version = 11;</code>
   * @return Whether the buildToolsVersion field is set.
   */
  boolean hasBuildToolsVersion();
  /**
   * <pre>
   * The build tools version used by this module.
   * </pre>
   *
   * <code>optional string build_tools_version = 11;</code>
   * @return The buildToolsVersion.
   */
  java.lang.String getBuildToolsVersion();
  /**
   * <pre>
   * The build tools version used by this module.
   * </pre>
   *
   * <code>optional string build_tools_version = 11;</code>
   * @return The bytes for buildToolsVersion.
   */
  com.google.protobuf.ByteString
      getBuildToolsVersionBytes();

  /**
   * <pre>
   * Files listing any D8 backported desugared methods or core library desugared methods for this
   * artifact.
   * </pre>
   *
   * <code>repeated .File desugared_methods_files = 12;</code>
   */
  java.util.List<com.android.builder.model.proto.ide.File> 
      getDesugaredMethodsFilesList();
  /**
   * <pre>
   * Files listing any D8 backported desugared methods or core library desugared methods for this
   * artifact.
   * </pre>
   *
   * <code>repeated .File desugared_methods_files = 12;</code>
   */
  com.android.builder.model.proto.ide.File getDesugaredMethodsFiles(int index);
  /**
   * <pre>
   * Files listing any D8 backported desugared methods or core library desugared methods for this
   * artifact.
   * </pre>
   *
   * <code>repeated .File desugared_methods_files = 12;</code>
   */
  int getDesugaredMethodsFilesCount();
  /**
   * <pre>
   * Files listing any D8 backported desugared methods or core library desugared methods for this
   * artifact.
   * </pre>
   *
   * <code>repeated .File desugared_methods_files = 12;</code>
   */
  java.util.List<? extends com.android.builder.model.proto.ide.FileOrBuilder> 
      getDesugaredMethodsFilesOrBuilderList();
  /**
   * <pre>
   * Files listing any D8 backported desugared methods or core library desugared methods for this
   * artifact.
   * </pre>
   *
   * <code>repeated .File desugared_methods_files = 12;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getDesugaredMethodsFilesOrBuilder(
      int index);

  /**
   * <pre>
   * The build ID (directory containing the settings file) of the root build of this project.
   * </pre>
   *
   * <code>optional .File root_build_id = 13;</code>
   * @return Whether the rootBuildId field is set.
   */
  boolean hasRootBuildId();
  /**
   * <pre>
   * The build ID (directory containing the settings file) of the root build of this project.
   * </pre>
   *
   * <code>optional .File root_build_id = 13;</code>
   * @return The rootBuildId.
   */
  com.android.builder.model.proto.ide.File getRootBuildId();
  /**
   * <pre>
   * The build ID (directory containing the settings file) of the root build of this project.
   * </pre>
   *
   * <code>optional .File root_build_id = 13;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getRootBuildIdOrBuilder();

  /**
   * <pre>
   * The build ID (directory containing the settings file) of the (included) build containing this
   * project.
   * </pre>
   *
   * <code>optional .File build_id = 14;</code>
   * @return Whether the buildId field is set.
   */
  boolean hasBuildId();
  /**
   * <pre>
   * The build ID (directory containing the settings file) of the (included) build containing this
   * project.
   * </pre>
   *
   * <code>optional .File build_id = 14;</code>
   * @return The buildId.
   */
  com.android.builder.model.proto.ide.File getBuildId();
  /**
   * <pre>
   * The build ID (directory containing the settings file) of the (included) build containing this
   * project.
   * </pre>
   *
   * <code>optional .File build_id = 14;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getBuildIdOrBuilder();

  /**
   * <pre>
   * Whether java compilation is enabled.
   * </pre>
   *
   * <code>optional bool with_java = 15;</code>
   * @return Whether the withJava field is set.
   */
  boolean hasWithJava();
  /**
   * <pre>
   * Whether java compilation is enabled.
   * </pre>
   *
   * <code>optional bool with_java = 15;</code>
   * @return The withJava.
   */
  boolean getWithJava();
}