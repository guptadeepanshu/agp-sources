// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_configure.proto

package com.android.build.gradle.internal.cxx.configure;

public interface EncodedChangedFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EncodedChangedFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 file_name = 1;</code>
   * @return The fileName.
   */
  int getFileName();

  /**
   * <code>.ChangedFile.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.ChangedFile.Type type = 2;</code>
   * @return The type.
   */
  com.android.build.gradle.internal.cxx.configure.ChangedFile.Type getType();
}
