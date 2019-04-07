package org.Muhammad.example.tv;

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
    comments = "Source: tv.proto")
public final class TvGrpc {

  private TvGrpc() {}

  public static final String SERVICE_NAME = "Tv";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvModeRequest,
      org.Muhammad.example.tv.TvModeResponse> getTvModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TvMode",
      requestType = org.Muhammad.example.tv.TvModeRequest.class,
      responseType = org.Muhammad.example.tv.TvModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvModeRequest,
      org.Muhammad.example.tv.TvModeResponse> getTvModeMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvModeRequest, org.Muhammad.example.tv.TvModeResponse> getTvModeMethod;
    if ((getTvModeMethod = TvGrpc.getTvModeMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getTvModeMethod = TvGrpc.getTvModeMethod) == null) {
          TvGrpc.getTvModeMethod = getTvModeMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.tv.TvModeRequest, org.Muhammad.example.tv.TvModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Tv", "TvMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.tv.TvModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.tv.TvModeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvMethodDescriptorSupplier("TvMode"))
                  .build();
          }
        }
     }
     return getTvModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvChannelRequest,
      org.Muhammad.example.tv.TvChannelResponse> getTvChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TvChannel",
      requestType = org.Muhammad.example.tv.TvChannelRequest.class,
      responseType = org.Muhammad.example.tv.TvChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvChannelRequest,
      org.Muhammad.example.tv.TvChannelResponse> getTvChannelMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.tv.TvChannelRequest, org.Muhammad.example.tv.TvChannelResponse> getTvChannelMethod;
    if ((getTvChannelMethod = TvGrpc.getTvChannelMethod) == null) {
      synchronized (TvGrpc.class) {
        if ((getTvChannelMethod = TvGrpc.getTvChannelMethod) == null) {
          TvGrpc.getTvChannelMethod = getTvChannelMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.tv.TvChannelRequest, org.Muhammad.example.tv.TvChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Tv", "TvChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.tv.TvChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.tv.TvChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TvMethodDescriptorSupplier("TvChannel"))
                  .build();
          }
        }
     }
     return getTvChannelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TvStub newStub(io.grpc.Channel channel) {
    return new TvStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TvBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TvBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TvFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TvFutureStub(channel);
  }

  /**
   */
  public static abstract class TvImplBase implements io.grpc.BindableService {

    /**
     */
    public void tvMode(org.Muhammad.example.tv.TvModeRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvModeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTvModeMethod(), responseObserver);
    }

    /**
     */
    public void tvChannel(org.Muhammad.example.tv.TvChannelRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvChannelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTvChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTvModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.tv.TvModeRequest,
                org.Muhammad.example.tv.TvModeResponse>(
                  this, METHODID_TV_MODE)))
          .addMethod(
            getTvChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.tv.TvChannelRequest,
                org.Muhammad.example.tv.TvChannelResponse>(
                  this, METHODID_TV_CHANNEL)))
          .build();
    }
  }

  /**
   */
  public static final class TvStub extends io.grpc.stub.AbstractStub<TvStub> {
    private TvStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvStub(channel, callOptions);
    }

    /**
     */
    public void tvMode(org.Muhammad.example.tv.TvModeRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvModeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTvModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tvChannel(org.Muhammad.example.tv.TvChannelRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvChannelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTvChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TvBlockingStub extends io.grpc.stub.AbstractStub<TvBlockingStub> {
    private TvBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.Muhammad.example.tv.TvModeResponse tvMode(org.Muhammad.example.tv.TvModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getTvModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.Muhammad.example.tv.TvChannelResponse tvChannel(org.Muhammad.example.tv.TvChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getTvChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TvFutureStub extends io.grpc.stub.AbstractStub<TvFutureStub> {
    private TvFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TvFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TvFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TvFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.tv.TvModeResponse> tvMode(
        org.Muhammad.example.tv.TvModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTvModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.tv.TvChannelResponse> tvChannel(
        org.Muhammad.example.tv.TvChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTvChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TV_MODE = 0;
  private static final int METHODID_TV_CHANNEL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TvImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TvImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TV_MODE:
          serviceImpl.tvMode((org.Muhammad.example.tv.TvModeRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvModeResponse>) responseObserver);
          break;
        case METHODID_TV_CHANNEL:
          serviceImpl.tvChannel((org.Muhammad.example.tv.TvChannelRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.tv.TvChannelResponse>) responseObserver);
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

  private static abstract class TvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TvBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.Muhammad.example.tv.TvProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tv");
    }
  }

  private static final class TvFileDescriptorSupplier
      extends TvBaseDescriptorSupplier {
    TvFileDescriptorSupplier() {}
  }

  private static final class TvMethodDescriptorSupplier
      extends TvBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TvMethodDescriptorSupplier(String methodName) {
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
      synchronized (TvGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TvFileDescriptorSupplier())
              .addMethod(getTvModeMethod())
              .addMethod(getTvChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
