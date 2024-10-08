// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface BuildAttributionAnalyzersDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.BuildAttributionAnalyzersData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Total build time in microseconds
   * </pre>
   *
   * <code>optional int64 total_build_time_ms = 1;</code>
   * @return Whether the totalBuildTimeMs field is set.
   */
  boolean hasTotalBuildTimeMs();
  /**
   * <pre>
   * Total build time in microseconds
   * </pre>
   *
   * <code>optional int64 total_build_time_ms = 1;</code>
   * @return The totalBuildTimeMs.
   */
  long getTotalBuildTimeMs();

  /**
   * <pre>
   * Data from the always running tasks analyzer
   * </pre>
   *
   * <code>optional .android_studio.AlwaysRunTasksAnalyzerData always_run_tasks_analyzer_data = 2 [lazy = true];</code>
   * @return Whether the alwaysRunTasksAnalyzerData field is set.
   */
  boolean hasAlwaysRunTasksAnalyzerData();
  /**
   * <pre>
   * Data from the always running tasks analyzer
   * </pre>
   *
   * <code>optional .android_studio.AlwaysRunTasksAnalyzerData always_run_tasks_analyzer_data = 2 [lazy = true];</code>
   * @return The alwaysRunTasksAnalyzerData.
   */
  com.google.wireless.android.sdk.stats.AlwaysRunTasksAnalyzerData getAlwaysRunTasksAnalyzerData();
  /**
   * <pre>
   * Data from the always running tasks analyzer
   * </pre>
   *
   * <code>optional .android_studio.AlwaysRunTasksAnalyzerData always_run_tasks_analyzer_data = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AlwaysRunTasksAnalyzerDataOrBuilder getAlwaysRunTasksAnalyzerDataOrBuilder();

  /**
   * <pre>
   * Data from the annotation processors analyzer
   * </pre>
   *
   * <code>optional .android_studio.AnnotationProcessorsAnalyzerData annotation_processors_analyzer_data = 3 [lazy = true];</code>
   * @return Whether the annotationProcessorsAnalyzerData field is set.
   */
  boolean hasAnnotationProcessorsAnalyzerData();
  /**
   * <pre>
   * Data from the annotation processors analyzer
   * </pre>
   *
   * <code>optional .android_studio.AnnotationProcessorsAnalyzerData annotation_processors_analyzer_data = 3 [lazy = true];</code>
   * @return The annotationProcessorsAnalyzerData.
   */
  com.google.wireless.android.sdk.stats.AnnotationProcessorsAnalyzerData getAnnotationProcessorsAnalyzerData();
  /**
   * <pre>
   * Data from the annotation processors analyzer
   * </pre>
   *
   * <code>optional .android_studio.AnnotationProcessorsAnalyzerData annotation_processors_analyzer_data = 3 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.AnnotationProcessorsAnalyzerDataOrBuilder getAnnotationProcessorsAnalyzerDataOrBuilder();

  /**
   * <pre>
   * Data from the critical path analyzer
   * </pre>
   *
   * <code>optional .android_studio.CriticalPathAnalyzerData critical_path_analyzer_data = 4 [lazy = true];</code>
   * @return Whether the criticalPathAnalyzerData field is set.
   */
  boolean hasCriticalPathAnalyzerData();
  /**
   * <pre>
   * Data from the critical path analyzer
   * </pre>
   *
   * <code>optional .android_studio.CriticalPathAnalyzerData critical_path_analyzer_data = 4 [lazy = true];</code>
   * @return The criticalPathAnalyzerData.
   */
  com.google.wireless.android.sdk.stats.CriticalPathAnalyzerData getCriticalPathAnalyzerData();
  /**
   * <pre>
   * Data from the critical path analyzer
   * </pre>
   *
   * <code>optional .android_studio.CriticalPathAnalyzerData critical_path_analyzer_data = 4 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.CriticalPathAnalyzerDataOrBuilder getCriticalPathAnalyzerDataOrBuilder();

  /**
   * <pre>
   * Data from the project configuration analyzer
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData project_configuration_analyzer_data = 5 [lazy = true];</code>
   * @return Whether the projectConfigurationAnalyzerData field is set.
   */
  boolean hasProjectConfigurationAnalyzerData();
  /**
   * <pre>
   * Data from the project configuration analyzer
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData project_configuration_analyzer_data = 5 [lazy = true];</code>
   * @return The projectConfigurationAnalyzerData.
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerData getProjectConfigurationAnalyzerData();
  /**
   * <pre>
   * Data from the project configuration analyzer
   * </pre>
   *
   * <code>optional .android_studio.ProjectConfigurationAnalyzerData project_configuration_analyzer_data = 5 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ProjectConfigurationAnalyzerDataOrBuilder getProjectConfigurationAnalyzerDataOrBuilder();

  /**
   * <pre>
   * Data from the tasks configuration issues analyzer
   * </pre>
   *
   * <code>optional .android_studio.TasksConfigurationIssuesAnalyzerData tasks_configuration_issues_analyzer_data = 6 [lazy = true];</code>
   * @return Whether the tasksConfigurationIssuesAnalyzerData field is set.
   */
  boolean hasTasksConfigurationIssuesAnalyzerData();
  /**
   * <pre>
   * Data from the tasks configuration issues analyzer
   * </pre>
   *
   * <code>optional .android_studio.TasksConfigurationIssuesAnalyzerData tasks_configuration_issues_analyzer_data = 6 [lazy = true];</code>
   * @return The tasksConfigurationIssuesAnalyzerData.
   */
  com.google.wireless.android.sdk.stats.TasksConfigurationIssuesAnalyzerData getTasksConfigurationIssuesAnalyzerData();
  /**
   * <pre>
   * Data from the tasks configuration issues analyzer
   * </pre>
   *
   * <code>optional .android_studio.TasksConfigurationIssuesAnalyzerData tasks_configuration_issues_analyzer_data = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.TasksConfigurationIssuesAnalyzerDataOrBuilder getTasksConfigurationIssuesAnalyzerDataOrBuilder();

  /**
   * <pre>
   * Data from configuration caching compatibility analyzer
   * </pre>
   *
   * <code>optional .android_studio.ConfigurationCacheCompatibilityData configuration_cache_compatibility_data = 7 [lazy = true];</code>
   * @return Whether the configurationCacheCompatibilityData field is set.
   */
  boolean hasConfigurationCacheCompatibilityData();
  /**
   * <pre>
   * Data from configuration caching compatibility analyzer
   * </pre>
   *
   * <code>optional .android_studio.ConfigurationCacheCompatibilityData configuration_cache_compatibility_data = 7 [lazy = true];</code>
   * @return The configurationCacheCompatibilityData.
   */
  com.google.wireless.android.sdk.stats.ConfigurationCacheCompatibilityData getConfigurationCacheCompatibilityData();
  /**
   * <pre>
   * Data from configuration caching compatibility analyzer
   * </pre>
   *
   * <code>optional .android_studio.ConfigurationCacheCompatibilityData configuration_cache_compatibility_data = 7 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ConfigurationCacheCompatibilityDataOrBuilder getConfigurationCacheCompatibilityDataOrBuilder();

  /**
   * <pre>
   * Data from jetifier usage analyzer
   * </pre>
   *
   * <code>optional .android_studio.JetifierUsageData jetifier_usage_data = 8 [lazy = true];</code>
   * @return Whether the jetifierUsageData field is set.
   */
  boolean hasJetifierUsageData();
  /**
   * <pre>
   * Data from jetifier usage analyzer
   * </pre>
   *
   * <code>optional .android_studio.JetifierUsageData jetifier_usage_data = 8 [lazy = true];</code>
   * @return The jetifierUsageData.
   */
  com.google.wireless.android.sdk.stats.JetifierUsageData getJetifierUsageData();
  /**
   * <pre>
   * Data from jetifier usage analyzer
   * </pre>
   *
   * <code>optional .android_studio.JetifierUsageData jetifier_usage_data = 8 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.JetifierUsageDataOrBuilder getJetifierUsageDataOrBuilder();

  /**
   * <pre>
   * Data from downloads analyzer
   * </pre>
   *
   * <code>optional .android_studio.BuildDownloadsAnalysisData downloads_analysis_data = 9 [lazy = true];</code>
   * @return Whether the downloadsAnalysisData field is set.
   */
  boolean hasDownloadsAnalysisData();
  /**
   * <pre>
   * Data from downloads analyzer
   * </pre>
   *
   * <code>optional .android_studio.BuildDownloadsAnalysisData downloads_analysis_data = 9 [lazy = true];</code>
   * @return The downloadsAnalysisData.
   */
  com.google.wireless.android.sdk.stats.BuildDownloadsAnalysisData getDownloadsAnalysisData();
  /**
   * <pre>
   * Data from downloads analyzer
   * </pre>
   *
   * <code>optional .android_studio.BuildDownloadsAnalysisData downloads_analysis_data = 9 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.BuildDownloadsAnalysisDataOrBuilder getDownloadsAnalysisDataOrBuilder();

  /**
   * <pre>
   * Data from task category issues
   * </pre>
   *
   * <code>optional .android_studio.TaskCategoryIssuesData task_category_issues_data = 10 [lazy = true];</code>
   * @return Whether the taskCategoryIssuesData field is set.
   */
  boolean hasTaskCategoryIssuesData();
  /**
   * <pre>
   * Data from task category issues
   * </pre>
   *
   * <code>optional .android_studio.TaskCategoryIssuesData task_category_issues_data = 10 [lazy = true];</code>
   * @return The taskCategoryIssuesData.
   */
  com.google.wireless.android.sdk.stats.TaskCategoryIssuesData getTaskCategoryIssuesData();
  /**
   * <pre>
   * Data from task category issues
   * </pre>
   *
   * <code>optional .android_studio.TaskCategoryIssuesData task_category_issues_data = 10 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.TaskCategoryIssuesDataOrBuilder getTaskCategoryIssuesDataOrBuilder();
}
