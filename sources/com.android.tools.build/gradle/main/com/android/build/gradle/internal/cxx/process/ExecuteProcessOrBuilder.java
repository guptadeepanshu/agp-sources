// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_process.proto

package com.android.build.gradle.internal.cxx.process;

public interface ExecuteProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ExecuteProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The executable invoked to run the process
   * </pre>
   *
   * <code>string executable = 1;</code>
   * @return The executable.
   */
  java.lang.String getExecutable();
  /**
   * <pre>
   * The executable invoked to run the process
   * </pre>
   *
   * <code>string executable = 1;</code>
   * @return The bytes for executable.
   */
  com.google.protobuf.ByteString
      getExecutableBytes();

  /**
   * <pre>
   * The args passed to [executable]
   * </pre>
   *
   * <code>repeated string args = 2;</code>
   * @return A list containing the args.
   */
  java.util.List<java.lang.String>
      getArgsList();
  /**
   * <pre>
   * The args passed to [executable]
   * </pre>
   *
   * <code>repeated string args = 2;</code>
   * @return The count of args.
   */
  int getArgsCount();
  /**
   * <pre>
   * The args passed to [executable]
   * </pre>
   *
   * <code>repeated string args = 2;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   * <pre>
   * The args passed to [executable]
   * </pre>
   *
   * <code>repeated string args = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString
      getArgsBytes(int index);

  /**
   * <pre>
   * Context-defined description of the process
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Context-defined description of the process
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of key names for the environment
   * </pre>
   *
   * <code>repeated string environment_keys = 4;</code>
   * @return A list containing the environmentKeys.
   */
  java.util.List<java.lang.String>
      getEnvironmentKeysList();
  /**
   * <pre>
   * List of key names for the environment
   * </pre>
   *
   * <code>repeated string environment_keys = 4;</code>
   * @return The count of environmentKeys.
   */
  int getEnvironmentKeysCount();
  /**
   * <pre>
   * List of key names for the environment
   * </pre>
   *
   * <code>repeated string environment_keys = 4;</code>
   * @param index The index of the element to return.
   * @return The environmentKeys at the given index.
   */
  java.lang.String getEnvironmentKeys(int index);
  /**
   * <pre>
   * List of key names for the environment
   * </pre>
   *
   * <code>repeated string environment_keys = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the environmentKeys at the given index.
   */
  com.google.protobuf.ByteString
      getEnvironmentKeysBytes(int index);

  /**
   * <pre>
   * 1-to-1 list of values corresponding to key names
   * </pre>
   *
   * <code>repeated string environment_values = 5;</code>
   * @return A list containing the environmentValues.
   */
  java.util.List<java.lang.String>
      getEnvironmentValuesList();
  /**
   * <pre>
   * 1-to-1 list of values corresponding to key names
   * </pre>
   *
   * <code>repeated string environment_values = 5;</code>
   * @return The count of environmentValues.
   */
  int getEnvironmentValuesCount();
  /**
   * <pre>
   * 1-to-1 list of values corresponding to key names
   * </pre>
   *
   * <code>repeated string environment_values = 5;</code>
   * @param index The index of the element to return.
   * @return The environmentValues at the given index.
   */
  java.lang.String getEnvironmentValues(int index);
  /**
   * <pre>
   * 1-to-1 list of values corresponding to key names
   * </pre>
   *
   * <code>repeated string environment_values = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the environmentValues at the given index.
   */
  com.google.protobuf.ByteString
      getEnvironmentValuesBytes(int index);

  /**
   * <pre>
   * For JVM processes, the class path
   * </pre>
   *
   * <code>string jvm_class_path = 6;</code>
   * @return The jvmClassPath.
   */
  java.lang.String getJvmClassPath();
  /**
   * <pre>
   * For JVM processes, the class path
   * </pre>
   *
   * <code>string jvm_class_path = 6;</code>
   * @return The bytes for jvmClassPath.
   */
  com.google.protobuf.ByteString
      getJvmClassPathBytes();

  /**
   * <pre>
   * For JVM processes, the entry point
   * </pre>
   *
   * <code>string jvm_main_class = 7;</code>
   * @return The jvmMainClass.
   */
  java.lang.String getJvmMainClass();
  /**
   * <pre>
   * For JVM processes, the entry point
   * </pre>
   *
   * <code>string jvm_main_class = 7;</code>
   * @return The bytes for jvmMainClass.
   */
  com.google.protobuf.ByteString
      getJvmMainClassBytes();

  /**
   * <pre>
   * For JVM processes, the arguments passed to JVM
   * </pre>
   *
   * <code>repeated string jvm_args = 8;</code>
   * @return A list containing the jvmArgs.
   */
  java.util.List<java.lang.String>
      getJvmArgsList();
  /**
   * <pre>
   * For JVM processes, the arguments passed to JVM
   * </pre>
   *
   * <code>repeated string jvm_args = 8;</code>
   * @return The count of jvmArgs.
   */
  int getJvmArgsCount();
  /**
   * <pre>
   * For JVM processes, the arguments passed to JVM
   * </pre>
   *
   * <code>repeated string jvm_args = 8;</code>
   * @param index The index of the element to return.
   * @return The jvmArgs at the given index.
   */
  java.lang.String getJvmArgs(int index);
  /**
   * <pre>
   * For JVM processes, the arguments passed to JVM
   * </pre>
   *
   * <code>repeated string jvm_args = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the jvmArgs at the given index.
   */
  com.google.protobuf.ByteString
      getJvmArgsBytes(int index);

  /**
   * <pre>
   * Result code from the process when it completed
   * </pre>
   *
   * <code>int32 exit_code = 9;</code>
   * @return The exitCode.
   */
  int getExitCode();
}