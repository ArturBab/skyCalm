package com.skycalm.analyzer.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: FlightAnalyzer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlightAnalyzerServiceGrpc {

  private FlightAnalyzerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flightanalyzer.FlightAnalyzerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.FlightRequest,
      com.skycalm.analyzer.grpc.FlightResponse> getAnalyzeFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeFlight",
      requestType = com.skycalm.analyzer.grpc.FlightRequest.class,
      responseType = com.skycalm.analyzer.grpc.FlightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.FlightRequest,
      com.skycalm.analyzer.grpc.FlightResponse> getAnalyzeFlightMethod() {
    io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.FlightRequest, com.skycalm.analyzer.grpc.FlightResponse> getAnalyzeFlightMethod;
    if ((getAnalyzeFlightMethod = FlightAnalyzerServiceGrpc.getAnalyzeFlightMethod) == null) {
      synchronized (FlightAnalyzerServiceGrpc.class) {
        if ((getAnalyzeFlightMethod = FlightAnalyzerServiceGrpc.getAnalyzeFlightMethod) == null) {
          FlightAnalyzerServiceGrpc.getAnalyzeFlightMethod = getAnalyzeFlightMethod =
              io.grpc.MethodDescriptor.<com.skycalm.analyzer.grpc.FlightRequest, com.skycalm.analyzer.grpc.FlightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.FlightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.FlightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlightAnalyzerServiceMethodDescriptorSupplier("AnalyzeFlight"))
              .build();
        }
      }
    }
    return getAnalyzeFlightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlightAnalyzerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceStub>() {
        @java.lang.Override
        public FlightAnalyzerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightAnalyzerServiceStub(channel, callOptions);
        }
      };
    return FlightAnalyzerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlightAnalyzerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceBlockingStub>() {
        @java.lang.Override
        public FlightAnalyzerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightAnalyzerServiceBlockingStub(channel, callOptions);
        }
      };
    return FlightAnalyzerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlightAnalyzerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightAnalyzerServiceFutureStub>() {
        @java.lang.Override
        public FlightAnalyzerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightAnalyzerServiceFutureStub(channel, callOptions);
        }
      };
    return FlightAnalyzerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void analyzeFlight(com.skycalm.analyzer.grpc.FlightRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.FlightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeFlightMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FlightAnalyzerService.
   */
  public static abstract class FlightAnalyzerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FlightAnalyzerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FlightAnalyzerService.
   */
  public static final class FlightAnalyzerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FlightAnalyzerServiceStub> {
    private FlightAnalyzerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightAnalyzerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightAnalyzerServiceStub(channel, callOptions);
    }

    /**
     */
    public void analyzeFlight(com.skycalm.analyzer.grpc.FlightRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.FlightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeFlightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FlightAnalyzerService.
   */
  public static final class FlightAnalyzerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FlightAnalyzerServiceBlockingStub> {
    private FlightAnalyzerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightAnalyzerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightAnalyzerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skycalm.analyzer.grpc.FlightResponse analyzeFlight(com.skycalm.analyzer.grpc.FlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeFlightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FlightAnalyzerService.
   */
  public static final class FlightAnalyzerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FlightAnalyzerServiceFutureStub> {
    private FlightAnalyzerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightAnalyzerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightAnalyzerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skycalm.analyzer.grpc.FlightResponse> analyzeFlight(
        com.skycalm.analyzer.grpc.FlightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeFlightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_FLIGHT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALYZE_FLIGHT:
          serviceImpl.analyzeFlight((com.skycalm.analyzer.grpc.FlightRequest) request,
              (io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.FlightResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAnalyzeFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skycalm.analyzer.grpc.FlightRequest,
              com.skycalm.analyzer.grpc.FlightResponse>(
                service, METHODID_ANALYZE_FLIGHT)))
        .build();
  }

  private static abstract class FlightAnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlightAnalyzerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skycalm.analyzer.grpc.FlightAnalyzerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlightAnalyzerService");
    }
  }

  private static final class FlightAnalyzerServiceFileDescriptorSupplier
      extends FlightAnalyzerServiceBaseDescriptorSupplier {
    FlightAnalyzerServiceFileDescriptorSupplier() {}
  }

  private static final class FlightAnalyzerServiceMethodDescriptorSupplier
      extends FlightAnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FlightAnalyzerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FlightAnalyzerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlightAnalyzerServiceFileDescriptorSupplier())
              .addMethod(getAnalyzeFlightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
