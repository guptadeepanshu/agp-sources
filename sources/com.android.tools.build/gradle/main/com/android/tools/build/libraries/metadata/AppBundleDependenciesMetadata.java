// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_bundle_dependencies_metadata.proto

package com.android.tools.build.libraries.metadata;

public final class AppBundleDependenciesMetadata {
  private AppBundleDependenciesMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AppDependencies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AppDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LibraryDependencies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LibraryDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModuleDependencies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModuleDependencies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Library_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Library_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Library_Digests_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Library_Digests_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MavenLibrary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MavenLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Repository_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Repository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MavenRepo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MavenRepo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IvyRepo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IvyRepo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&app_bundle_dependencies_metadata.proto" +
      "\032\036google/protobuf/wrappers.proto\"\265\001\n\017App" +
      "Dependencies\022\031\n\007library\030\001 \003(\0132\010.Library\022" +
      "2\n\024library_dependencies\030\002 \003(\0132\024.LibraryD" +
      "ependencies\0220\n\023module_dependencies\030\003 \003(\013" +
      "2\023.ModuleDependencies\022!\n\014repositories\030\004 " +
      "\003(\0132\013.Repository\"G\n\023LibraryDependencies\022" +
      "\025\n\rlibrary_index\030\001 \001(\005\022\031\n\021library_dep_in" +
      "dex\030\002 \003(\005\"C\n\022ModuleDependencies\022\023\n\013modul" +
      "e_name\030\001 \001(\t\022\030\n\020dependency_index\030\002 \003(\005\"\261" +
      "\001\n\007Library\022&\n\rmaven_library\030\001 \001(\0132\r.Mave" +
      "nLibraryH\000\022!\n\007digests\030\002 \001(\0132\020.Library.Di" +
      "gests\022/\n\nrepo_index\030\003 \001(\0132\033.google.proto" +
      "buf.Int32Value\032\031\n\007Digests\022\016\n\006sha256\030\001 \001(" +
      "\014B\017\n\rlibrary_oneof\"k\n\014MavenLibrary\022\017\n\007gr" +
      "oupId\030\001 \001(\t\022\022\n\nartifactId\030\002 \001(\t\022\021\n\tpacka" +
      "ging\030\003 \001(\t\022\022\n\nclassifier\030\004 \001(\t\022\017\n\007versio" +
      "n\030\005 \001(\t\"Z\n\nRepository\022 \n\nmaven_repo\030\001 \001(" +
      "\0132\n.MavenRepoH\000\022\034\n\010ivy_repo\030\002 \001(\0132\010.IvyR" +
      "epoH\000B\014\n\nrepo_oneof\"\030\n\tMavenRepo\022\013\n\003url\030" +
      "\001 \001(\t\"\026\n\007IvyRepo\022\013\n\003url\030\001 \001(\tB.\n*com.and" +
      "roid.tools.build.libraries.metadataP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_AppDependencies_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AppDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AppDependencies_descriptor,
        new java.lang.String[] { "Library", "LibraryDependencies", "ModuleDependencies", "Repositories", });
    internal_static_LibraryDependencies_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LibraryDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LibraryDependencies_descriptor,
        new java.lang.String[] { "LibraryIndex", "LibraryDepIndex", });
    internal_static_ModuleDependencies_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ModuleDependencies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModuleDependencies_descriptor,
        new java.lang.String[] { "ModuleName", "DependencyIndex", });
    internal_static_Library_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Library_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Library_descriptor,
        new java.lang.String[] { "MavenLibrary", "Digests", "RepoIndex", "LibraryOneof", });
    internal_static_Library_Digests_descriptor =
      internal_static_Library_descriptor.getNestedTypes().get(0);
    internal_static_Library_Digests_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Library_Digests_descriptor,
        new java.lang.String[] { "Sha256", });
    internal_static_MavenLibrary_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MavenLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MavenLibrary_descriptor,
        new java.lang.String[] { "GroupId", "ArtifactId", "Packaging", "Classifier", "Version", });
    internal_static_Repository_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Repository_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Repository_descriptor,
        new java.lang.String[] { "MavenRepo", "IvyRepo", "RepoOneof", });
    internal_static_MavenRepo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_MavenRepo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MavenRepo_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_IvyRepo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_IvyRepo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IvyRepo_descriptor,
        new java.lang.String[] { "Url", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
