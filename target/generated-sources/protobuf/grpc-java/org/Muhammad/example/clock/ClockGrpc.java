package org.Muhammad.example.clock;

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
    comments = "Source: clock.proto")
public final class ClockGrpc {

  private ClockGrpc() {}

  public static final String SERVICE_NAME = "clock.Clock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.clock.ClockActionRequest,
      org.Muhammad.example.clock.ClockActionResponse> getClockActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClockAction",
      requestType = org.Muhammad.example.clock.ClockActionRequest.class,
      responseType = org.Muhammad.example.clock.ClockActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.clock.ClockActionRequest,
      org.Muhammad.example.clock.ClockActionResponse> getClockActionMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.clock.ClockActionRequest, org.Muhammad.example.clock.ClockActionResponse> getClockActionMethod;
    if ((getClockActionMethod = ClockGrpc.getClockActionMethod) == null) {
      synchronized (ClockGrpc.class) {
        if ((getClockActionMethod = ClockGrpc.getClockActionMethod) == null) {
          ClockGrpc.getClockActionMethod = getClockActionMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.clock.ClockActionRequest, org.Muhammad.example.clock.ClockActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "clock.Clock", "ClockAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.clock.ClockActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.clock.ClockActionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClockMethodDescriptorSupplier("ClockAction"))
                  .build();
          }
        }
     }
     return getClockActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClockStub newStub(io.grpc.Channel channel) {
    return new ClockStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClockBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClockFutureStub(channel);
  }

  /**
   */
  public static abstract class ClockImplBase implements io.grpc.BindableService {

    /**
     */
    public void clockAction(org.Muhammad.example.clock.ClockActionRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.clock.ClockActionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClockActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClockActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.clock.ClockActionRequest,
                org.Muhammad.example.clock.ClockActionResponse>(
                  this, METHODID_CLOCK_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class ClockStub extends io.grpc.stub.AbstractStub<ClockStub> {
    private ClockStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockStub(channel, callOptions);
    }

    /**
     */
    public void clockAction(org.Muhammad.example.clock.ClockActionRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.clock.ClockActionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClockActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClockBlockingStub extends io.grpc.stub.AbstractStub<ClockBlockingStub> {
    private ClockBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.Muhammad.example.clock.ClockActionResponse clockAction(org.Muhammad.example.clock.ClockActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getClockActionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClockFutureStub extends io.grpc.stub.AbstractStub<ClockFutureStub> {
    private ClockFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.clock.ClockActionResponse> clockAction(
        org.Muhammad.example.clock.ClockActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClockActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLOCK_ACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLOCK_ACTION:
          serviceImpl.clockAction((org.Muhammad.example.clock.ClockActionRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.clock.ClockActionResponse>) responseObserver);
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

  private static abstract class ClockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.Muhammad.example.clock.ClockProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Clock");
    }
  }

  private static final class ClockFileDescriptorSupplier
      extends ClockBaseDescriptorSupplier {
    ClockFileDescriptorSupplier() {}
  }

  private static final class ClockMethodDescriptorSupplier
      extends ClockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClockMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClockFileDescriptorSupplier())
              .addMethod(getClockActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
