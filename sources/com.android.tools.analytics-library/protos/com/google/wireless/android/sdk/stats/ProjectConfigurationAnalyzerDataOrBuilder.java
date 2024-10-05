// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface ProjectConfigurationAnalyzerDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.ProjectConfigurationAnalyzerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The configuration data for all subprojects configured during the build
   * </pre>
   *
   * <code>repeated .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData project_configuration_data = 1;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationData> 
      getProjectConfigurationDataList();
  /**
   * <pre>
   * The configuration data for all subprojects configured during the build
   * </pre>
   *
   * <code>repeated .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData project_configuration_data = 1;</code>
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationData getProjectConfigurationData(int index);
  /**
   * <pre>
   * The configuration data for all subprojects configured during the build
   * </pre>
   *
   * <code>repeated .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData project_configuration_data = 1;</code>
   */
  int getProjectConfigurationDataCount();
  /**
   * <pre>
   * The configuration data for all subprojects configured during the build
   * </pre>
   *
   * <code>repeated .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData project_configuration_data = 1;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationDataOrBuilder> 
      getProjectConfigurationDataOrBuilderList();
  /**
   * <pre>
   * The configuration data for all subprojects configured during the build
   * </pre>
   *
   * <code>repeated .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData project_configuration_data = 1;</code>
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationDataOrBuilder getProjectConfigurationDataOrBuilder(
      int index);

  /**
   * <pre>
   * The configuration data summed for all subproject configured during the
   * build
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData overall_configuration_data = 2 [lazy = true];</code>
   * @return Whether the overallConfigurationData field is set.
   */
  boolean hasOverallConfigurationData();
  /**
   * <pre>
   * The configuration data summed for all subproject configured during the
   * build
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData overall_configuration_data = 2 [lazy = true];</code>
   * @return The overallConfigurationData.
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationData getOverallConfigurationData();
  /**
   * <pre>
   * The configuration data summed for all subproject configured during the
   * build
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData.ProjectConfigurationData overall_configuration_data = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData.ProjectConfigurationDataOrBuilder getOverallConfigurationDataOrBuilder();
}
