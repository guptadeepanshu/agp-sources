// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_bundle_dependencies_metadata.proto

package com.android.tools.build.libraries.metadata;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   * @return Whether the mavenRepo field is set.
   */
  boolean hasMavenRepo();
  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   * @return The mavenRepo.
   */
  com.android.tools.build.libraries.metadata.MavenRepo getMavenRepo();
  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   */
  com.android.tools.build.libraries.metadata.MavenRepoOrBuilder getMavenRepoOrBuilder();

  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   * @return Whether the ivyRepo field is set.
   */
  boolean hasIvyRepo();
  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   * @return The ivyRepo.
   */
  com.android.tools.build.libraries.metadata.IvyRepo getIvyRepo();
  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   */
  com.android.tools.build.libraries.metadata.IvyRepoOrBuilder getIvyRepoOrBuilder();

  public com.android.tools.build.libraries.metadata.Repository.RepoOneofCase getRepoOneofCase();
}
