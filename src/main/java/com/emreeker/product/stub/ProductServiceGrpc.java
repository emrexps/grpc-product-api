package com.emreeker.product.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ProductRequest,
      com.emreeker.product.stub.ProductOuterClass.ProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = com.emreeker.product.stub.ProductOuterClass.ProductRequest.class,
      responseType = com.emreeker.product.stub.ProductOuterClass.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ProductRequest,
      com.emreeker.product.stub.ProductOuterClass.ProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ProductRequest, com.emreeker.product.stub.ProductOuterClass.ProductResponse> getAddProductMethod;
    if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getAddProductMethod = ProductServiceGrpc.getAddProductMethod) == null) {
          ProductServiceGrpc.getAddProductMethod = getAddProductMethod = 
              io.grpc.MethodDescriptor.<com.emreeker.product.stub.ProductOuterClass.ProductRequest, com.emreeker.product.stub.ProductOuterClass.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("AddProduct"))
                  .build();
          }
        }
     }
     return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest,
      com.emreeker.product.stub.ProductOuterClass.ManyProductResponse> getSendManyProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendManyProduct",
      requestType = com.emreeker.product.stub.ProductOuterClass.ManyProductRequest.class,
      responseType = com.emreeker.product.stub.ProductOuterClass.ManyProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest,
      com.emreeker.product.stub.ProductOuterClass.ManyProductResponse> getSendManyProductMethod() {
    io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest, com.emreeker.product.stub.ProductOuterClass.ManyProductResponse> getSendManyProductMethod;
    if ((getSendManyProductMethod = ProductServiceGrpc.getSendManyProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSendManyProductMethod = ProductServiceGrpc.getSendManyProductMethod) == null) {
          ProductServiceGrpc.getSendManyProductMethod = getSendManyProductMethod = 
              io.grpc.MethodDescriptor.<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest, com.emreeker.product.stub.ProductOuterClass.ManyProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "SendManyProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.ManyProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.ManyProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("SendManyProduct"))
                  .build();
          }
        }
     }
     return getSendManyProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.EmptyRequest,
      com.emreeker.product.stub.ProductOuterClass.ProductList> getSendProductListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendProductList",
      requestType = com.emreeker.product.stub.ProductOuterClass.EmptyRequest.class,
      responseType = com.emreeker.product.stub.ProductOuterClass.ProductList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.EmptyRequest,
      com.emreeker.product.stub.ProductOuterClass.ProductList> getSendProductListMethod() {
    io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.EmptyRequest, com.emreeker.product.stub.ProductOuterClass.ProductList> getSendProductListMethod;
    if ((getSendProductListMethod = ProductServiceGrpc.getSendProductListMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSendProductListMethod = ProductServiceGrpc.getSendProductListMethod) == null) {
          ProductServiceGrpc.getSendProductListMethod = getSendProductListMethod = 
              io.grpc.MethodDescriptor.<com.emreeker.product.stub.ProductOuterClass.EmptyRequest, com.emreeker.product.stub.ProductOuterClass.ProductList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "SendProductList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.ProductList.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("SendProductList"))
                  .build();
          }
        }
     }
     return getSendProductListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest,
      com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest.class,
      responseType = com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest,
      com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest, com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
          ProductServiceGrpc.getDeleteProductMethod = getDeleteProductMethod = 
              io.grpc.MethodDescriptor.<com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest, com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProduct"))
                  .build();
          }
        }
     }
     return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProduct(com.emreeker.product.stub.ProductOuterClass.ProductRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest> sendManyProduct(
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ManyProductResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendManyProductMethod(), responseObserver);
    }

    /**
     */
    public void sendProductList(com.emreeker.product.stub.ProductOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductList> responseObserver) {
      asyncUnimplementedUnaryCall(getSendProductListMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.emreeker.product.stub.ProductOuterClass.ProductRequest,
                com.emreeker.product.stub.ProductOuterClass.ProductResponse>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getSendManyProductMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.emreeker.product.stub.ProductOuterClass.ManyProductRequest,
                com.emreeker.product.stub.ProductOuterClass.ManyProductResponse>(
                  this, METHODID_SEND_MANY_PRODUCT)))
          .addMethod(
            getSendProductListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.emreeker.product.stub.ProductOuterClass.EmptyRequest,
                com.emreeker.product.stub.ProductOuterClass.ProductList>(
                  this, METHODID_SEND_PRODUCT_LIST)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest,
                com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void addProduct(com.emreeker.product.stub.ProductOuterClass.ProductRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ManyProductRequest> sendManyProduct(
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ManyProductResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendManyProductMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sendProductList(com.emreeker.product.stub.ProductOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductList> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendProductListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.emreeker.product.stub.ProductOuterClass.ProductResponse addProduct(com.emreeker.product.stub.ProductOuterClass.ProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.emreeker.product.stub.ProductOuterClass.ProductList> sendProductList(
        com.emreeker.product.stub.ProductOuterClass.EmptyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSendProductListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse deleteProduct(com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emreeker.product.stub.ProductOuterClass.ProductResponse> addProduct(
        com.emreeker.product.stub.ProductOuterClass.ProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse> deleteProduct(
        com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;
  private static final int METHODID_SEND_PRODUCT_LIST = 1;
  private static final int METHODID_DELETE_PRODUCT = 2;
  private static final int METHODID_SEND_MANY_PRODUCT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.emreeker.product.stub.ProductOuterClass.ProductRequest) request,
              (io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductResponse>) responseObserver);
          break;
        case METHODID_SEND_PRODUCT_LIST:
          serviceImpl.sendProductList((com.emreeker.product.stub.ProductOuterClass.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ProductList>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse>) responseObserver);
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
        case METHODID_SEND_MANY_PRODUCT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendManyProduct(
              (io.grpc.stub.StreamObserver<com.emreeker.product.stub.ProductOuterClass.ManyProductResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.emreeker.product.stub.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getAddProductMethod())
              .addMethod(getSendManyProductMethod())
              .addMethod(getSendProductListMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
