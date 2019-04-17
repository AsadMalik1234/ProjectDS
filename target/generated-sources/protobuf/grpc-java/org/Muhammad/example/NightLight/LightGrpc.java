package org.Muhammad.example.NightLight;

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
    comments = "Source: nightLight.proto")
public final class LightGrpc {

  private LightGrpc() {}

  public static final String SERVICE_NAME = "NightLight.Light";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOnRequest,
      org.Muhammad.example.NightLight.LightOnResponse> getLightOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LightOn",
      requestType = org.Muhammad.example.NightLight.LightOnRequest.class,
      responseType = org.Muhammad.example.NightLight.LightOnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOnRequest,
      org.Muhammad.example.NightLight.LightOnResponse> getLightOnMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOnRequest, org.Muhammad.example.NightLight.LightOnResponse> getLightOnMethod;
    if ((getLightOnMethod = LightGrpc.getLightOnMethod) == null) {
      synchronized (LightGrpc.class) {
        if ((getLightOnMethod = LightGrpc.getLightOnMethod) == null) {
          LightGrpc.getLightOnMethod = getLightOnMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.NightLight.LightOnRequest, org.Muhammad.example.NightLight.LightOnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NightLight.Light", "LightOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.LightOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.LightOnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightMethodDescriptorSupplier("LightOn"))
                  .build();
          }
        }
     }
     return getLightOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOffRequest,
      org.Muhammad.example.NightLight.LightOffResponse> getLightOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LightOff",
      requestType = org.Muhammad.example.NightLight.LightOffRequest.class,
      responseType = org.Muhammad.example.NightLight.LightOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOffRequest,
      org.Muhammad.example.NightLight.LightOffResponse> getLightOffMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.LightOffRequest, org.Muhammad.example.NightLight.LightOffResponse> getLightOffMethod;
    if ((getLightOffMethod = LightGrpc.getLightOffMethod) == null) {
      synchronized (LightGrpc.class) {
        if ((getLightOffMethod = LightGrpc.getLightOffMethod) == null) {
          LightGrpc.getLightOffMethod = getLightOffMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.NightLight.LightOffRequest, org.Muhammad.example.NightLight.LightOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NightLight.Light", "LightOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.LightOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.LightOffResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightMethodDescriptorSupplier("LightOff"))
                  .build();
          }
        }
     }
     return getLightOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.ChangeColourRequest,
      org.Muhammad.example.NightLight.ChangeColourResponse> getChangeColourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeColour",
      requestType = org.Muhammad.example.NightLight.ChangeColourRequest.class,
      responseType = org.Muhammad.example.NightLight.ChangeColourResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.ChangeColourRequest,
      org.Muhammad.example.NightLight.ChangeColourResponse> getChangeColourMethod() {
    io.grpc.MethodDescriptor<org.Muhammad.example.NightLight.ChangeColourRequest, org.Muhammad.example.NightLight.ChangeColourResponse> getChangeColourMethod;
    if ((getChangeColourMethod = LightGrpc.getChangeColourMethod) == null) {
      synchronized (LightGrpc.class) {
        if ((getChangeColourMethod = LightGrpc.getChangeColourMethod) == null) {
          LightGrpc.getChangeColourMethod = getChangeColourMethod = 
              io.grpc.MethodDescriptor.<org.Muhammad.example.NightLight.ChangeColourRequest, org.Muhammad.example.NightLight.ChangeColourResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NightLight.Light", "ChangeColour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.ChangeColourRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.Muhammad.example.NightLight.ChangeColourResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightMethodDescriptorSupplier("ChangeColour"))
                  .build();
          }
        }
     }
     return getChangeColourMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightStub newStub(io.grpc.Channel channel) {
    return new LightStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightFutureStub(channel);
  }

  /**
   */
  public static abstract class LightImplBase implements io.grpc.BindableService {

    /**
     */
    public void lightOn(org.Muhammad.example.NightLight.LightOnRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightOnMethod(), responseObserver);
    }

    /**
     */
    public void lightOff(org.Muhammad.example.NightLight.LightOffRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOffResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightOffMethod(), responseObserver);
    }

    /**
     */
    public void changeColour(org.Muhammad.example.NightLight.ChangeColourRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.ChangeColourResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeColourMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLightOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.NightLight.LightOnRequest,
                org.Muhammad.example.NightLight.LightOnResponse>(
                  this, METHODID_LIGHT_ON)))
          .addMethod(
            getLightOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.NightLight.LightOffRequest,
                org.Muhammad.example.NightLight.LightOffResponse>(
                  this, METHODID_LIGHT_OFF)))
          .addMethod(
            getChangeColourMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.Muhammad.example.NightLight.ChangeColourRequest,
                org.Muhammad.example.NightLight.ChangeColourResponse>(
                  this, METHODID_CHANGE_COLOUR)))
          .build();
    }
  }

  /**
   */
  public static final class LightStub extends io.grpc.stub.AbstractStub<LightStub> {
    private LightStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightStub(channel, callOptions);
    }

    /**
     */
    public void lightOn(org.Muhammad.example.NightLight.LightOnRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightOff(org.Muhammad.example.NightLight.LightOffRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOffResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeColour(org.Muhammad.example.NightLight.ChangeColourRequest request,
        io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.ChangeColourResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeColourMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightBlockingStub extends io.grpc.stub.AbstractStub<LightBlockingStub> {
    private LightBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.Muhammad.example.NightLight.LightOnResponse lightOn(org.Muhammad.example.NightLight.LightOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.Muhammad.example.NightLight.LightOffResponse lightOff(org.Muhammad.example.NightLight.LightOffRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.Muhammad.example.NightLight.ChangeColourResponse changeColour(org.Muhammad.example.NightLight.ChangeColourRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeColourMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightFutureStub extends io.grpc.stub.AbstractStub<LightFutureStub> {
    private LightFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.NightLight.LightOnResponse> lightOn(
        org.Muhammad.example.NightLight.LightOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.NightLight.LightOffResponse> lightOff(
        org.Muhammad.example.NightLight.LightOffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.Muhammad.example.NightLight.ChangeColourResponse> changeColour(
        org.Muhammad.example.NightLight.ChangeColourRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeColourMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIGHT_ON = 0;
  private static final int METHODID_LIGHT_OFF = 1;
  private static final int METHODID_CHANGE_COLOUR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIGHT_ON:
          serviceImpl.lightOn((org.Muhammad.example.NightLight.LightOnRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOnResponse>) responseObserver);
          break;
        case METHODID_LIGHT_OFF:
          serviceImpl.lightOff((org.Muhammad.example.NightLight.LightOffRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.LightOffResponse>) responseObserver);
          break;
        case METHODID_CHANGE_COLOUR:
          serviceImpl.changeColour((org.Muhammad.example.NightLight.ChangeColourRequest) request,
              (io.grpc.stub.StreamObserver<org.Muhammad.example.NightLight.ChangeColourResponse>) responseObserver);
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

  private static abstract class LightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.Muhammad.example.NightLight.NightLightProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Light");
    }
  }

  private static final class LightFileDescriptorSupplier
      extends LightBaseDescriptorSupplier {
    LightFileDescriptorSupplier() {}
  }

  private static final class LightMethodDescriptorSupplier
      extends LightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightFileDescriptorSupplier())
              .addMethod(getLightOnMethod())
              .addMethod(getLightOffMethod())
              .addMethod(getChangeColourMethod())
              .build();
        }
      }
    }
    return result;
  }
}
