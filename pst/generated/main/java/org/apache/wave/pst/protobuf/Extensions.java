// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/apache/wave/pst/protobuf/extensions.proto

package org.apache.wave.pst.protobuf;

public final class Extensions {
  private Extensions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(org.apache.wave.pst.protobuf.Extensions.int52);
  }
  public static final int INT52_FIELD_NUMBER = 50000;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   *
   * <pre>
   * Annotates an int64, noting that only the lower 52 bits are important.
   * This allows languages without 64-bit primitives (like JavaScript) to use
   * other primtive types instead.
   * Annotation ids are apparently meant to be globally unique.  Not sure why,
   * given that proto names and field ids do not have to be globally unique.
   * If it becomes an issue, get a unique number from the number distributor.
   * </pre>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> int52 = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-org/apache/wave/pst/protobuf/extension" +
      "s.proto\032 google/protobuf/descriptor.prot" +
      "o:5\n\005int52\022\035.google.protobuf.FieldOption" +
      "s\030\320\206\003 \001(\010:\005falseB*\n\034org.apache.wave.pst." +
      "protobufB\nExtensions"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    int52.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}