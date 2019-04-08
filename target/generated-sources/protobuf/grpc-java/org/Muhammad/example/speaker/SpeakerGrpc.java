package org.Muhammad.example.speaker;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: speaker.proto")
public final class SpeakerGrpc {

  private SpeakerGrpc() {}

  public static final String SERVICE_NAME = "speaker.Speaker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerModeRequest,
      org.Muhammad.example.speaker.SpeakerModeResponse> getSpeakerModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeakerMode",
      requestType = org.Muhammad.example.speaker.SpeakerModeRequest.class,
      responseType = org.Muhammad.example.speaker.SpeakerModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerModeRequest,
      org.Muhammad.example.speaker.SpeakerModeResponse> getSpeakerModeMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerModeRequest, org.Muhammad.example.speaker.SpeakerModeResponse> getSpeakerModeMethod;
    if ((getSpeakerModeMethod = SpeakerGrpc.getSpeakerModeMethod) == null) {
      synchronized (SpeakerGrpc.class) {
        if ((getSpeakerModeMethod = SpeakerGrpc.getSpeakerModeMethod) == null) {
          SpeakerGrpc.getSpeakerModeMethod = getSpeakerModeMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.speaker.SpeakerModeRequest, org.Muhammad.example.speaker.SpeakerModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speaker.Speaker", "SpeakerMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.speaker.SpeakerModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.speaker.SpeakerModeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerMethodDescriptorSupplier("SpeakerMode"))
                  .build();
          }
        }
     }
     return getSpeakerModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerActionRequest,
      org.Muhammad.example.speaker.SpeakerActionResponse> getSpeakerActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeakerAction",
      requestType = org.Muhammad.example.speaker.SpeakerActionRequest.class,
      responseType = org.Muhammad.example.speaker.SpeakerActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerActionRequest,
      org.Muhammad.example.speaker.SpeakerActionResponse> getSpeakerActionMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.speaker.SpeakerActionRequest, org.Muhammad.example.speaker.SpeakerActionResponse> getSpeakerActionMethod;
    if ((getSpeakerActionMethod = SpeakerGrpc.getSpeakerActionMethod) == null) {
      synchronized (SpeakerGrpc.class) {
        if ((getSpeakerActionMethod = SpeakerGrpc.getSpeakerActionMethod) == null) {
          SpeakerGrpc.getSpeakerActionMethod = getSpeakerActionMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.speaker.SpeakerActionRequest, org.Muhammad.example.speaker.SpeakerActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speaker.Speaker", "SpeakerAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.speaker.SpeakerActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.speaker.SpeakerActionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerMethodDescriptorSupplier("SpeakerAction"))
                  .build();
          }
        }
     }
     return getSpeakerActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeakerStub newStub(io.grpc.Channel channel) {
    return new SpeakerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeakerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeakerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeakerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeakerFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeakerImplBase implements io.grpc.BindableService {

    /**
     */
    public void speakerMode(org.Muhammad.example.speaker.SpeakerModeRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerModeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeakerModeMethod(), responseObserver);
    }

    /**
     */
    public void speakerAction(org.Muhammad.example.speaker.SpeakerActionRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerActionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeakerActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpeakerModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.speaker.SpeakerModeRequest,
                org.Muhammad.example.speaker.SpeakerModeResponse>(
                  this, METHODID_SPEAKER_MODE)))
          .addMethod(
            getSpeakerActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.speaker.SpeakerActionRequest,
                org.Muhammad.example.speaker.SpeakerActionResponse>(
                  this, METHODID_SPEAKER_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class SpeakerStub extends io.grpc.stub.AbstractStub<SpeakerStub> {
    private SpeakerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerStub(channel, callOptions);
    }

    /**
     */
    public void speakerMode(org.Muhammad.example.speaker.SpeakerModeRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerModeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeakerModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void speakerAction(org.Muhammad.example.speaker.SpeakerActionRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerActionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeakerActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeakerBlockingStub extends io.grpc.stub.AbstractStub<SpeakerBlockingStub> {
    private SpeakerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.Muhammad.example.speaker.SpeakerModeResponse speakerMode(org.Muhammad.example.speaker.SpeakerModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeakerModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.Muhammad.example.speaker.SpeakerActionResponse speakerAction(org.Muhammad.example.speaker.SpeakerActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeakerActionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeakerFutureStub extends io.grpc.stub.AbstractStub<SpeakerFutureStub> {
    private SpeakerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.speaker.SpeakerModeResponse> speakerMode(
        org.Muhammad.example.speaker.SpeakerModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeakerModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.speaker.SpeakerActionResponse> speakerAction(
        org.Muhammad.example.speaker.SpeakerActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeakerActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPEAKER_MODE = 0;
  private static final int METHODID_SPEAKER_ACTION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeakerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeakerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPEAKER_MODE:
          serviceImpl.speakerMode((org.Muhammad.example.speaker.SpeakerModeRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerModeResponse>) responseObserver);
          break;
        case METHODID_SPEAKER_ACTION:
          serviceImpl.speakerAction((org.Muhammad.example.speaker.SpeakerActionRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.speaker.SpeakerActionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpeakerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeakerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.Muhammad.example.speaker.SpeakerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Speaker");
    }
  }

  private static final class SpeakerFileDescriptorSupplier
      extends SpeakerBaseDescriptorSupplier {
    SpeakerFileDescriptorSupplier() {}
  }

  private static final class SpeakerMethodDescriptorSupplier
      extends SpeakerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeakerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpeakerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeakerFileDescriptorSupplier())
              .addMethod(getSpeakerModeMethod())
              .addMethod(getSpeakerActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
