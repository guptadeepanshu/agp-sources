// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_caching.proto

package com.android.build.gradle.internal.cxx.caching;

public interface EncodedCompilationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EncodedCompilation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 working_directory_id = 1;</code>
   * @return The workingDirectoryId.
   */
  int getWorkingDirectoryId();

  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   * @return Whether the objectFileKey field is set.
   */
  boolean hasObjectFileKey();
  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   * @return The objectFileKey.
   */
  com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKey getObjectFileKey();
  /**
   * <code>.EncodedObjectFileKey object_file_key = 2;</code>
   */
  com.android.build.gradle.internal.cxx.caching.EncodedObjectFileKeyOrBuilder getObjectFileKeyOrBuilder();

  /**
   * <code>int32 object_file_id = 3;</code>
   * @return The objectFileId.
   */
  int getObjectFileId();
}
