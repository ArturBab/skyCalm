package com.skycalm.analyzer.analyzergrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: protocol.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnalyzerServiceGrpc {

  private AnalyzerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flightanalyzer.protocol.AnalyzerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket,
      com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> getAnalyzeFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeFlight",
      requestType = com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket.class,
      responseType = com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket,
      com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> getAnalyzeFlightMethod() {
    io.grpc.MethodDescriptor<com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket, com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> getAnalyzeFlightMethod;
    if ((getAnalyzeFlightMethod = AnalyzerServiceGrpc.getAnalyzeFlightMethod) == null) {
      synchronized (AnalyzerServiceGrpc.class) {
        if ((getAnalyzeFlightMethod = AnalyzerServiceGrpc.getAnalyzeFlightMethod) == null) {
          AnalyzerServiceGrpc.getAnalyzeFlightMethod = getAnalyzeFlightMethod =
              io.grpc.MethodDescriptor.<com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket, com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnalyzerServiceMethodDescriptorSupplier("AnalyzeFlight"))
              .build();
        }
      }
    }
    return getAnalyzeFlightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnalyzerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceStub>() {
        @java.lang.Override
        public AnalyzerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalyzerServiceStub(channel, callOptions);
        }
      };
    return AnalyzerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnalyzerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceBlockingStub>() {
        @java.lang.Override
        public AnalyzerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalyzerServiceBlockingStub(channel, callOptions);
        }
      };
    return AnalyzerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnalyzerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnalyzerServiceFutureStub>() {
        @java.lang.Override
        public AnalyzerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnalyzerServiceFutureStub(channel, callOptions);
        }
      };
    return AnalyzerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * analyze ticket
     * </pre>
     */
    default void analyzeFlight(com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeFlightMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnalyzerService.
   * <pre>
   * Service
   * </pre>
   */
  public static abstract class AnalyzerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnalyzerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnalyzerService.
   * <pre>
   * Service
   * </pre>
   */
  public static final class AnalyzerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnalyzerServiceStub> {
    private AnalyzerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalyzerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalyzerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * analyze ticket
     * </pre>
     */
    public void analyzeFlight(com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeFlightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnalyzerService.
   * <pre>
   * Service
   * </pre>
   */
  public static final class AnalyzerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnalyzerServiceBlockingStub> {
    private AnalyzerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalyzerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalyzerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * analyze ticket
     * </pre>
     */
    public com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse analyzeFlight(com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeFlightMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnalyzerService.
   * <pre>
   * Service
   * </pre>
   */
  public static final class AnalyzerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnalyzerServiceFutureStub> {
    private AnalyzerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalyzerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnalyzerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * analyze ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse> analyzeFlight(
        com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket request) {
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
          serviceImpl.analyzeFlight((com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket) request,
              (io.grpc.stub.StreamObserver<com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse>) responseObserver);
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
              com.skycalm.analyzer.analyzergrpc.RequestAirlineTicket,
              com.skycalm.analyzer.analyzergrpc.AnalyzeFlightResponse>(
                service, METHODID_ANALYZE_FLIGHT)))
        .build();
  }

  private static abstract class AnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnalyzerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skycalm.analyzer.analyzergrpc.Protocol.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnalyzerService");
    }
  }

  private static final class AnalyzerServiceFileDescriptorSupplier
      extends AnalyzerServiceBaseDescriptorSupplier {
    AnalyzerServiceFileDescriptorSupplier() {}
  }

  private static final class AnalyzerServiceMethodDescriptorSupplier
      extends AnalyzerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AnalyzerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AnalyzerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnalyzerServiceFileDescriptorSupplier())
              .addMethod(getAnalyzeFlightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
