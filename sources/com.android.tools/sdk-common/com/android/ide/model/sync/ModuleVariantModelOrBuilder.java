// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sync_variant.proto

package com.android.ide.model.sync;

public interface ModuleVariantModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModuleVariantModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  int getManifestPlaceholdersCount();
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  boolean containsManifestPlaceholders(
      java.lang.String key);
  /**
   * Use {@link #getManifestPlaceholdersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getManifestPlaceholders();
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getManifestPlaceholdersMap();
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */

  java.lang.String getManifestPlaceholdersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; manifestPlaceholders = 1;</code>
   */

  java.lang.String getManifestPlaceholdersOrThrow(
      java.lang.String key);
}