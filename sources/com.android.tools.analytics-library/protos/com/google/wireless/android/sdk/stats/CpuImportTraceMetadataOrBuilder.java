// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface CpuImportTraceMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.CpuImportTraceMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status of the import trace action.
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata.ImportStatus import_status = 1;</code>
   * @return Whether the importStatus field is set.
   */
  boolean hasImportStatus();
  /**
   * <pre>
   * Status of the import trace action.
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata.ImportStatus import_status = 1;</code>
   * @return The importStatus.
   */
  com.google.wireless.android.sdk.stats.CpuImportTraceMetadata.ImportStatus getImportStatus();

  /**
   * <pre>
   * Technology used to generate the trace imported.
   * Technologies supported are ART, simpleperf and atrace.
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata.Technology technology = 2;</code>
   * @return Whether the technology field is set.
   */
  boolean hasTechnology();
  /**
   * <pre>
   * Technology used to generate the trace imported.
   * Technologies supported are ART, simpleperf and atrace.
   * </pre>
   *
   * <code>optional .android_studio.CpuImportTraceMetadata.Technology technology = 2;</code>
   * @return The technology.
   */
  com.google.wireless.android.sdk.stats.CpuImportTraceMetadata.Technology getTechnology();

  /**
   * <pre>
   * Whether the trace contains Compose Tracing nodes
   * </pre>
   *
   * <code>optional bool has_compose_tracing_nodes = 3;</code>
   * @return Whether the hasComposeTracingNodes field is set.
   */
  boolean hasHasComposeTracingNodes();
  /**
   * <pre>
   * Whether the trace contains Compose Tracing nodes
   * </pre>
   *
   * <code>optional bool has_compose_tracing_nodes = 3;</code>
   * @return The hasComposeTracingNodes.
   */
  boolean getHasComposeTracingNodes();
}
