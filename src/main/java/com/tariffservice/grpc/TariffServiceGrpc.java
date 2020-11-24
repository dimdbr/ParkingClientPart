package com.tariffservice.grpc;

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
    comments = "Source: TariffService.proto")
public final class TariffServiceGrpc {

  private TariffServiceGrpc() {}

  public static final String SERVICE_NAME = "TariffService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.Tariff> getGrpcGetTariffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetTariff",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Id.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Tariff.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.Tariff> getGrpcGetTariffMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.Tariff> getGrpcGetTariffMethod;
    if ((getGrpcGetTariffMethod = TariffServiceGrpc.getGrpcGetTariffMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcGetTariffMethod = TariffServiceGrpc.getGrpcGetTariffMethod) == null) {
          TariffServiceGrpc.getGrpcGetTariffMethod = getGrpcGetTariffMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.Tariff>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcGetTariff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Tariff.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcGetTariff"))
                  .build();
          }
        }
     }
     return getGrpcGetTariffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> getGrpcGetAllTariffsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllTariffs",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Tariffs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> getGrpcGetAllTariffsMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> getGrpcGetAllTariffsMethod;
    if ((getGrpcGetAllTariffsMethod = TariffServiceGrpc.getGrpcGetAllTariffsMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcGetAllTariffsMethod = TariffServiceGrpc.getGrpcGetAllTariffsMethod) == null) {
          TariffServiceGrpc.getGrpcGetAllTariffsMethod = getGrpcGetAllTariffsMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.Tariffs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcGetAllTariffs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Tariffs.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcGetAllTariffs"))
                  .build();
          }
        }
     }
     return getGrpcGetAllTariffsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Tariff,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcUpdateTariffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcUpdateTariff",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Tariff.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Tariff,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcUpdateTariffMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Tariff, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcUpdateTariffMethod;
    if ((getGrpcUpdateTariffMethod = TariffServiceGrpc.getGrpcUpdateTariffMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcUpdateTariffMethod = TariffServiceGrpc.getGrpcUpdateTariffMethod) == null) {
          TariffServiceGrpc.getGrpcUpdateTariffMethod = getGrpcUpdateTariffMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Tariff, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcUpdateTariff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Tariff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcUpdateTariff"))
                  .build();
          }
        }
     }
     return getGrpcUpdateTariffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> getGrpcGetCoOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetCoOwner",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Id.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.CoOwner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> getGrpcGetCoOwnerMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> getGrpcGetCoOwnerMethod;
    if ((getGrpcGetCoOwnerMethod = TariffServiceGrpc.getGrpcGetCoOwnerMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcGetCoOwnerMethod = TariffServiceGrpc.getGrpcGetCoOwnerMethod) == null) {
          TariffServiceGrpc.getGrpcGetCoOwnerMethod = getGrpcGetCoOwnerMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.CoOwner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcGetCoOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.CoOwner.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcGetCoOwner"))
                  .build();
          }
        }
     }
     return getGrpcGetCoOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> getGrpcGetAllCoOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllCoOwners",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.CoOwners.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> getGrpcGetAllCoOwnersMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> getGrpcGetAllCoOwnersMethod;
    if ((getGrpcGetAllCoOwnersMethod = TariffServiceGrpc.getGrpcGetAllCoOwnersMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcGetAllCoOwnersMethod = TariffServiceGrpc.getGrpcGetAllCoOwnersMethod) == null) {
          TariffServiceGrpc.getGrpcGetAllCoOwnersMethod = getGrpcGetAllCoOwnersMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.CoOwners>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcGetAllCoOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.CoOwners.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcGetAllCoOwners"))
                  .build();
          }
        }
     }
     return getGrpcGetAllCoOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcAddToBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddToBalance",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcAddToBalanceMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcAddToBalanceMethod;
    if ((getGrpcAddToBalanceMethod = TariffServiceGrpc.getGrpcAddToBalanceMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcAddToBalanceMethod = TariffServiceGrpc.getGrpcAddToBalanceMethod) == null) {
          TariffServiceGrpc.getGrpcAddToBalanceMethod = getGrpcAddToBalanceMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcAddToBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcAddToBalance"))
                  .build();
          }
        }
     }
     return getGrpcAddToBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCollectMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcCollectMoney",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Id.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCollectMoneyMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCollectMoneyMethod;
    if ((getGrpcCollectMoneyMethod = TariffServiceGrpc.getGrpcCollectMoneyMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcCollectMoneyMethod = TariffServiceGrpc.getGrpcCollectMoneyMethod) == null) {
          TariffServiceGrpc.getGrpcCollectMoneyMethod = getGrpcCollectMoneyMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Id, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcCollectMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcCollectMoney"))
                  .build();
          }
        }
     }
     return getGrpcCollectMoneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcPayMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcPayMoney",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcPayMoneyMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcPayMoneyMethod;
    if ((getGrpcPayMoneyMethod = TariffServiceGrpc.getGrpcPayMoneyMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcPayMoneyMethod = TariffServiceGrpc.getGrpcPayMoneyMethod) == null) {
          TariffServiceGrpc.getGrpcPayMoneyMethod = getGrpcPayMoneyMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.Empty, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcPayMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcPayMoney"))
                  .build();
          }
        }
     }
     return getGrpcPayMoneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateCoOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcCreateCoOwner",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateCoOwnerMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateCoOwnerMethod;
    if ((getGrpcCreateCoOwnerMethod = TariffServiceGrpc.getGrpcCreateCoOwnerMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcCreateCoOwnerMethod = TariffServiceGrpc.getGrpcCreateCoOwnerMethod) == null) {
          TariffServiceGrpc.getGrpcCreateCoOwnerMethod = getGrpcCreateCoOwnerMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcCreateCoOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcCreateCoOwner"))
                  .build();
          }
        }
     }
     return getGrpcCreateCoOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateTariffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcCreateTariff",
      requestType = com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff.class,
      responseType = com.tariffservice.grpc.TariffServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff,
      com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateTariffMethod() {
    io.grpc.MethodDescriptor<com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff, com.tariffservice.grpc.TariffServiceOuterClass.Empty> getGrpcCreateTariffMethod;
    if ((getGrpcCreateTariffMethod = TariffServiceGrpc.getGrpcCreateTariffMethod) == null) {
      synchronized (TariffServiceGrpc.class) {
        if ((getGrpcCreateTariffMethod = TariffServiceGrpc.getGrpcCreateTariffMethod) == null) {
          TariffServiceGrpc.getGrpcCreateTariffMethod = getGrpcCreateTariffMethod = 
              io.grpc.MethodDescriptor.<com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff, com.tariffservice.grpc.TariffServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TariffService", "GrpcCreateTariff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tariffservice.grpc.TariffServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TariffServiceMethodDescriptorSupplier("GrpcCreateTariff"))
                  .build();
          }
        }
     }
     return getGrpcCreateTariffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TariffServiceStub newStub(io.grpc.Channel channel) {
    return new TariffServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TariffServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TariffServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TariffServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TariffServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TariffServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void grpcGetTariff(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariff> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetTariffMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllTariffs(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllTariffsMethod(), responseObserver);
    }

    /**
     */
    public void grpcUpdateTariff(com.tariffservice.grpc.TariffServiceOuterClass.Tariff request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcUpdateTariffMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetCoOwnerMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllCoOwners(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllCoOwnersMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddToBalance(com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddToBalanceMethod(), responseObserver);
    }

    /**
     */
    public void grpcCollectMoney(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcCollectMoneyMethod(), responseObserver);
    }

    /**
     */
    public void grpcPayMoney(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcPayMoneyMethod(), responseObserver);
    }

    /**
     */
    public void grpcCreateCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcCreateCoOwnerMethod(), responseObserver);
    }

    /**
     */
    public void grpcCreateTariff(com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcCreateTariffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrpcGetTariffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Id,
                com.tariffservice.grpc.TariffServiceOuterClass.Tariff>(
                  this, METHODID_GRPC_GET_TARIFF)))
          .addMethod(
            getGrpcGetAllTariffsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Empty,
                com.tariffservice.grpc.TariffServiceOuterClass.Tariffs>(
                  this, METHODID_GRPC_GET_ALL_TARIFFS)))
          .addMethod(
            getGrpcUpdateTariffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Tariff,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_UPDATE_TARIFF)))
          .addMethod(
            getGrpcGetCoOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Id,
                com.tariffservice.grpc.TariffServiceOuterClass.CoOwner>(
                  this, METHODID_GRPC_GET_CO_OWNER)))
          .addMethod(
            getGrpcGetAllCoOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Empty,
                com.tariffservice.grpc.TariffServiceOuterClass.CoOwners>(
                  this, METHODID_GRPC_GET_ALL_CO_OWNERS)))
          .addMethod(
            getGrpcAddToBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_TO_BALANCE)))
          .addMethod(
            getGrpcCollectMoneyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Id,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_COLLECT_MONEY)))
          .addMethod(
            getGrpcPayMoneyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.Empty,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_PAY_MONEY)))
          .addMethod(
            getGrpcCreateCoOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_CREATE_CO_OWNER)))
          .addMethod(
            getGrpcCreateTariffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff,
                com.tariffservice.grpc.TariffServiceOuterClass.Empty>(
                  this, METHODID_GRPC_CREATE_TARIFF)))
          .build();
    }
  }

  /**
   */
  public static final class TariffServiceStub extends io.grpc.stub.AbstractStub<TariffServiceStub> {
    private TariffServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TariffServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TariffServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TariffServiceStub(channel, callOptions);
    }

    /**
     */
    public void grpcGetTariff(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariff> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetTariffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllTariffs(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllTariffsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcUpdateTariff(com.tariffservice.grpc.TariffServiceOuterClass.Tariff request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcUpdateTariffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetCoOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllCoOwners(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllCoOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddToBalance(com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddToBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcCollectMoney(com.tariffservice.grpc.TariffServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcCollectMoneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcPayMoney(com.tariffservice.grpc.TariffServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcPayMoneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcCreateCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcCreateCoOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcCreateTariff(com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff request,
        io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcCreateTariffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TariffServiceBlockingStub extends io.grpc.stub.AbstractStub<TariffServiceBlockingStub> {
    private TariffServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TariffServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TariffServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TariffServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Tariff grpcGetTariff(com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetTariffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Tariffs grpcGetAllTariffs(com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllTariffsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcUpdateTariff(com.tariffservice.grpc.TariffServiceOuterClass.Tariff request) {
      return blockingUnaryCall(
          getChannel(), getGrpcUpdateTariffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.CoOwner grpcGetCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetCoOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.CoOwners grpcGetAllCoOwners(com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllCoOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcAddToBalance(com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddToBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcCollectMoney(com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return blockingUnaryCall(
          getChannel(), getGrpcCollectMoneyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcPayMoney(com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcPayMoneyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcCreateCoOwner(com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner request) {
      return blockingUnaryCall(
          getChannel(), getGrpcCreateCoOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tariffservice.grpc.TariffServiceOuterClass.Empty grpcCreateTariff(com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff request) {
      return blockingUnaryCall(
          getChannel(), getGrpcCreateTariffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TariffServiceFutureStub extends io.grpc.stub.AbstractStub<TariffServiceFutureStub> {
    private TariffServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TariffServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TariffServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TariffServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Tariff> grpcGetTariff(
        com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetTariffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Tariffs> grpcGetAllTariffs(
        com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllTariffsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcUpdateTariff(
        com.tariffservice.grpc.TariffServiceOuterClass.Tariff request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcUpdateTariffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.CoOwner> grpcGetCoOwner(
        com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetCoOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.CoOwners> grpcGetAllCoOwners(
        com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllCoOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcAddToBalance(
        com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddToBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcCollectMoney(
        com.tariffservice.grpc.TariffServiceOuterClass.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcCollectMoneyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcPayMoney(
        com.tariffservice.grpc.TariffServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcPayMoneyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcCreateCoOwner(
        com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcCreateCoOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tariffservice.grpc.TariffServiceOuterClass.Empty> grpcCreateTariff(
        com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcCreateTariffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_GET_TARIFF = 0;
  private static final int METHODID_GRPC_GET_ALL_TARIFFS = 1;
  private static final int METHODID_GRPC_UPDATE_TARIFF = 2;
  private static final int METHODID_GRPC_GET_CO_OWNER = 3;
  private static final int METHODID_GRPC_GET_ALL_CO_OWNERS = 4;
  private static final int METHODID_GRPC_ADD_TO_BALANCE = 5;
  private static final int METHODID_GRPC_COLLECT_MONEY = 6;
  private static final int METHODID_GRPC_PAY_MONEY = 7;
  private static final int METHODID_GRPC_CREATE_CO_OWNER = 8;
  private static final int METHODID_GRPC_CREATE_TARIFF = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TariffServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TariffServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_GET_TARIFF:
          serviceImpl.grpcGetTariff((com.tariffservice.grpc.TariffServiceOuterClass.Id) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariff>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_TARIFFS:
          serviceImpl.grpcGetAllTariffs((com.tariffservice.grpc.TariffServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Tariffs>) responseObserver);
          break;
        case METHODID_GRPC_UPDATE_TARIFF:
          serviceImpl.grpcUpdateTariff((com.tariffservice.grpc.TariffServiceOuterClass.Tariff) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_GET_CO_OWNER:
          serviceImpl.grpcGetCoOwner((com.tariffservice.grpc.TariffServiceOuterClass.Id) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwner>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_CO_OWNERS:
          serviceImpl.grpcGetAllCoOwners((com.tariffservice.grpc.TariffServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.CoOwners>) responseObserver);
          break;
        case METHODID_GRPC_ADD_TO_BALANCE:
          serviceImpl.grpcAddToBalance((com.tariffservice.grpc.TariffServiceOuterClass.ChangeBalance) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_COLLECT_MONEY:
          serviceImpl.grpcCollectMoney((com.tariffservice.grpc.TariffServiceOuterClass.Id) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_PAY_MONEY:
          serviceImpl.grpcPayMoney((com.tariffservice.grpc.TariffServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_CREATE_CO_OWNER:
          serviceImpl.grpcCreateCoOwner((com.tariffservice.grpc.TariffServiceOuterClass.CreateCoOwner) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_CREATE_TARIFF:
          serviceImpl.grpcCreateTariff((com.tariffservice.grpc.TariffServiceOuterClass.CreateTariff) request,
              (io.grpc.stub.StreamObserver<com.tariffservice.grpc.TariffServiceOuterClass.Empty>) responseObserver);
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

  private static abstract class TariffServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TariffServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tariffservice.grpc.TariffServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TariffService");
    }
  }

  private static final class TariffServiceFileDescriptorSupplier
      extends TariffServiceBaseDescriptorSupplier {
    TariffServiceFileDescriptorSupplier() {}
  }

  private static final class TariffServiceMethodDescriptorSupplier
      extends TariffServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TariffServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TariffServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TariffServiceFileDescriptorSupplier())
              .addMethod(getGrpcGetTariffMethod())
              .addMethod(getGrpcGetAllTariffsMethod())
              .addMethod(getGrpcUpdateTariffMethod())
              .addMethod(getGrpcGetCoOwnerMethod())
              .addMethod(getGrpcGetAllCoOwnersMethod())
              .addMethod(getGrpcAddToBalanceMethod())
              .addMethod(getGrpcCollectMoneyMethod())
              .addMethod(getGrpcPayMoneyMethod())
              .addMethod(getGrpcCreateCoOwnerMethod())
              .addMethod(getGrpcCreateTariffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
