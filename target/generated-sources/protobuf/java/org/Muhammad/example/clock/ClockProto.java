// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clock.proto

package org.Muhammad.example.clock;

public final class ClockProto {
  private ClockProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clock_ClockActionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clock_ClockActionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clock_ClockResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clock_ClockResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clock_ClockResetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clock_ClockResetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013clock.proto\022\005clock\032\033google/protobuf/em" +
      "pty.proto\"(\n\023ClockActionResponse\022\021\n\tcloc" +
      "kTime\030\001 \001(\005\".\n\021ClockResetRequest\022\031\n\021cloc" +
      "kResetRequest\030\001 \001(\t\"0\n\022ClockResetRespons" +
      "e\022\032\n\022clockResetResponse\030\001 \001(\t2\223\001\n\005Clock\022" +
      "E\n\013ClockAction\022\026.google.protobuf.Empty\032\032" +
      ".clock.ClockActionResponse\"\0000\001\022C\n\nResetC" +
      "lock\022\030.clock.ClockResetRequest\032\031.clock.C" +
      "lockResetResponse\"\000B*\n\032org.Muhammad.exam" +
      "ple.clockB\nClockProtoP\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_clock_ClockActionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clock_ClockActionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clock_ClockActionResponse_descriptor,
        new java.lang.String[] { "ClockTime", });
    internal_static_clock_ClockResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_clock_ClockResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clock_ClockResetRequest_descriptor,
        new java.lang.String[] { "ClockResetRequest", });
    internal_static_clock_ClockResetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_clock_ClockResetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clock_ClockResetResponse_descriptor,
        new java.lang.String[] { "ClockResetResponse", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
