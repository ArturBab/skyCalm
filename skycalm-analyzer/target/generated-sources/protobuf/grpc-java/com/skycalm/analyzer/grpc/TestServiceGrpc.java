package com.skycalm.analyzer.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: analyzer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flightanalyzer.TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest,
      com.skycalm.analyzer.grpc.TestMessageResponse> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Test",
      requestType = com.skycalm.analyzer.grpc.TestMessageRequest.class,
      responseType = com.skycalm.analyzer.grpc.TestMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest,
      com.skycalm.analyzer.grpc.TestMessageResponse> getTestMethod() {
    io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest, com.skycalm.analyzer.grpc.TestMessageResponse> getTestMethod;
    if ((getTestMethod = TestServiceGrpc.getTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getTestMethod = TestServiceGrpc.getTestMethod) == null) {
          TestServiceGrpc.getTestMethod = getTestMethod =
              io.grpc.MethodDescriptor.<com.skycalm.analyzer.grpc.TestMessageRequest, com.skycalm.analyzer.grpc.TestMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.TestMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.TestMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("Test"))
              .build();
        }
      }
    }
    return getTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest,
      com.skycalm.analyzer.grpc.TestMessageResponse> getSendTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendText",
      requestType = com.skycalm.analyzer.grpc.TestMessageRequest.class,
      responseType = com.skycalm.analyzer.grpc.TestMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest,
      com.skycalm.analyzer.grpc.TestMessageResponse> getSendTextMethod() {
    io.grpc.MethodDescriptor<com.skycalm.analyzer.grpc.TestMessageRequest, com.skycalm.analyzer.grpc.TestMessageResponse> getSendTextMethod;
    if ((getSendTextMethod = TestServiceGrpc.getSendTextMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSendTextMethod = TestServiceGrpc.getSendTextMethod) == null) {
          TestServiceGrpc.getSendTextMethod = getSendTextMethod =
              io.grpc.MethodDescriptor.<com.skycalm.analyzer.grpc.TestMessageRequest, com.skycalm.analyzer.grpc.TestMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.TestMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.TestMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("sendText"))
              .build();
        }
      }
    }
    return getSendTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.skycalm.analyzer.grpc.TestMessageResponse> getPingWithNoParametrsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pingWithNoParametrs",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.skycalm.analyzer.grpc.TestMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.skycalm.analyzer.grpc.TestMessageResponse> getPingWithNoParametrsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.skycalm.analyzer.grpc.TestMessageResponse> getPingWithNoParametrsMethod;
    if ((getPingWithNoParametrsMethod = TestServiceGrpc.getPingWithNoParametrsMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getPingWithNoParametrsMethod = TestServiceGrpc.getPingWithNoParametrsMethod) == null) {
          TestServiceGrpc.getPingWithNoParametrsMethod = getPingWithNoParametrsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.skycalm.analyzer.grpc.TestMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pingWithNoParametrs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skycalm.analyzer.grpc.TestMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("pingWithNoParametrs"))
              .build();
        }
      }
    }
    return getPingWithNoParametrsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceStub>() {
        @java.lang.Override
        public TestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceStub(channel, callOptions);
        }
      };
    return TestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub>() {
        @java.lang.Override
        public TestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceBlockingStub(channel, callOptions);
        }
      };
    return TestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub>() {
        @java.lang.Override
        public TestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceFutureStub(channel, callOptions);
        }
      };
    return TestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void test(com.skycalm.analyzer.grpc.TestMessageRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }

    /**
     */
    default void sendText(com.skycalm.analyzer.grpc.TestMessageRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTextMethod(), responseObserver);
    }

    /**
     */
    default void pingWithNoParametrs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingWithNoParametrsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TestService.
   */
  public static abstract class TestServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TestServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TestService.
   */
  public static final class TestServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TestServiceStub> {
    private TestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     */
    public void test(com.skycalm.analyzer.grpc.TestMessageRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendText(com.skycalm.analyzer.grpc.TestMessageRequest request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pingWithNoParametrs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingWithNoParametrsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TestService.
   */
  public static final class TestServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skycalm.analyzer.grpc.TestMessageResponse test(com.skycalm.analyzer.grpc.TestMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skycalm.analyzer.grpc.TestMessageResponse sendText(com.skycalm.analyzer.grpc.TestMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skycalm.analyzer.grpc.TestMessageResponse pingWithNoParametrs(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingWithNoParametrsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TestService.
   */
  public static final class TestServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TestServiceFutureStub> {
    private TestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skycalm.analyzer.grpc.TestMessageResponse> test(
        com.skycalm.analyzer.grpc.TestMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skycalm.analyzer.grpc.TestMessageResponse> sendText(
        com.skycalm.analyzer.grpc.TestMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skycalm.analyzer.grpc.TestMessageResponse> pingWithNoParametrs(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingWithNoParametrsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST = 0;
  private static final int METHODID_SEND_TEXT = 1;
  private static final int METHODID_PING_WITH_NO_PARAMETRS = 2;

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
        case METHODID_TEST:
          serviceImpl.test((com.skycalm.analyzer.grpc.TestMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse>) responseObserver);
          break;
        case METHODID_SEND_TEXT:
          serviceImpl.sendText((com.skycalm.analyzer.grpc.TestMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse>) responseObserver);
          break;
        case METHODID_PING_WITH_NO_PARAMETRS:
          serviceImpl.pingWithNoParametrs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.skycalm.analyzer.grpc.TestMessageResponse>) responseObserver);
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
          getTestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skycalm.analyzer.grpc.TestMessageRequest,
              com.skycalm.analyzer.grpc.TestMessageResponse>(
                service, METHODID_TEST)))
        .addMethod(
          getSendTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.skycalm.analyzer.grpc.TestMessageRequest,
              com.skycalm.analyzer.grpc.TestMessageResponse>(
                service, METHODID_SEND_TEXT)))
        .addMethod(
          getPingWithNoParametrsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.skycalm.analyzer.grpc.TestMessageResponse>(
                service, METHODID_PING_WITH_NO_PARAMETRS)))
        .build();
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skycalm.analyzer.grpc.Analyzer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TestServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getTestMethod())
              .addMethod(getSendTextMethod())
              .addMethod(getPingWithNoParametrsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
