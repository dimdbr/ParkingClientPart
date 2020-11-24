package com.incomeExpensesService.grpc;

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
    comments = "Source: IncomeExpensesService.proto")
public final class IncomeExpensesServiceGrpc {

  private IncomeExpensesServiceGrpc() {}

  public static final String SERVICE_NAME = "IncomeExpensesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> getGrpcGetMalfunctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetMalfunction",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> getGrpcGetMalfunctionMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> getGrpcGetMalfunctionMethod;
    if ((getGrpcGetMalfunctionMethod = IncomeExpensesServiceGrpc.getGrpcGetMalfunctionMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetMalfunctionMethod = IncomeExpensesServiceGrpc.getGrpcGetMalfunctionMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetMalfunctionMethod = getGrpcGetMalfunctionMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetMalfunction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetMalfunction"))
                  .build();
          }
        }
     }
     return getGrpcGetMalfunctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> getGrpcGetAllMalfunctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllMalfunctions",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> getGrpcGetAllMalfunctionsMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> getGrpcGetAllMalfunctionsMethod;
    if ((getGrpcGetAllMalfunctionsMethod = IncomeExpensesServiceGrpc.getGrpcGetAllMalfunctionsMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetAllMalfunctionsMethod = IncomeExpensesServiceGrpc.getGrpcGetAllMalfunctionsMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetAllMalfunctionsMethod = getGrpcGetAllMalfunctionsMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetAllMalfunctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetAllMalfunctions"))
                  .build();
          }
        }
     }
     return getGrpcGetAllMalfunctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcAddMalfunctionToWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddMalfunctionToWorker",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcAddMalfunctionToWorkerMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcAddMalfunctionToWorkerMethod;
    if ((getGrpcAddMalfunctionToWorkerMethod = IncomeExpensesServiceGrpc.getGrpcAddMalfunctionToWorkerMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcAddMalfunctionToWorkerMethod = IncomeExpensesServiceGrpc.getGrpcAddMalfunctionToWorkerMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcAddMalfunctionToWorkerMethod = getGrpcAddMalfunctionToWorkerMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcAddMalfunctionToWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcAddMalfunctionToWorker"))
                  .build();
          }
        }
     }
     return getGrpcAddMalfunctionToWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> getGrpcGetWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetWorker",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> getGrpcGetWorkerMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> getGrpcGetWorkerMethod;
    if ((getGrpcGetWorkerMethod = IncomeExpensesServiceGrpc.getGrpcGetWorkerMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetWorkerMethod = IncomeExpensesServiceGrpc.getGrpcGetWorkerMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetWorkerMethod = getGrpcGetWorkerMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetWorker"))
                  .build();
          }
        }
     }
     return getGrpcGetWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> getGrpcGetAllWorkersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllWorkers",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> getGrpcGetAllWorkersMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> getGrpcGetAllWorkersMethod;
    if ((getGrpcGetAllWorkersMethod = IncomeExpensesServiceGrpc.getGrpcGetAllWorkersMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetAllWorkersMethod = IncomeExpensesServiceGrpc.getGrpcGetAllWorkersMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetAllWorkersMethod = getGrpcGetAllWorkersMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetAllWorkers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetAllWorkers"))
                  .build();
          }
        }
     }
     return getGrpcGetAllWorkersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcUpdateWorker",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateWorkerMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateWorkerMethod;
    if ((getGrpcUpdateWorkerMethod = IncomeExpensesServiceGrpc.getGrpcUpdateWorkerMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcUpdateWorkerMethod = IncomeExpensesServiceGrpc.getGrpcUpdateWorkerMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcUpdateWorkerMethod = getGrpcUpdateWorkerMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcUpdateWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcUpdateWorker"))
                  .build();
          }
        }
     }
     return getGrpcUpdateWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcCreateWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcCreateWorker",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcCreateWorkerMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcCreateWorkerMethod;
    if ((getGrpcCreateWorkerMethod = IncomeExpensesServiceGrpc.getGrpcCreateWorkerMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcCreateWorkerMethod = IncomeExpensesServiceGrpc.getGrpcCreateWorkerMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcCreateWorkerMethod = getGrpcCreateWorkerMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcCreateWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcCreateWorker"))
                  .build();
          }
        }
     }
     return getGrpcCreateWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcDeleteWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcDeleteWorker",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcDeleteWorkerMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcDeleteWorkerMethod;
    if ((getGrpcDeleteWorkerMethod = IncomeExpensesServiceGrpc.getGrpcDeleteWorkerMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcDeleteWorkerMethod = IncomeExpensesServiceGrpc.getGrpcDeleteWorkerMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcDeleteWorkerMethod = getGrpcDeleteWorkerMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcDeleteWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcDeleteWorker"))
                  .build();
          }
        }
     }
     return getGrpcDeleteWorkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> getGrpcGetAccountantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAccountant",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> getGrpcGetAccountantMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> getGrpcGetAccountantMethod;
    if ((getGrpcGetAccountantMethod = IncomeExpensesServiceGrpc.getGrpcGetAccountantMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetAccountantMethod = IncomeExpensesServiceGrpc.getGrpcGetAccountantMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetAccountantMethod = getGrpcGetAccountantMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetAccountant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetAccountant"))
                  .build();
          }
        }
     }
     return getGrpcGetAccountantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> getGrpcGetAllAccountantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllAccountants",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> getGrpcGetAllAccountantsMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> getGrpcGetAllAccountantsMethod;
    if ((getGrpcGetAllAccountantsMethod = IncomeExpensesServiceGrpc.getGrpcGetAllAccountantsMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcGetAllAccountantsMethod = IncomeExpensesServiceGrpc.getGrpcGetAllAccountantsMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcGetAllAccountantsMethod = getGrpcGetAllAccountantsMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcGetAllAccountants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcGetAllAccountants"))
                  .build();
          }
        }
     }
     return getGrpcGetAllAccountantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateAccountantSalaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcUpdateAccountantSalary",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateAccountantSalaryMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcUpdateAccountantSalaryMethod;
    if ((getGrpcUpdateAccountantSalaryMethod = IncomeExpensesServiceGrpc.getGrpcUpdateAccountantSalaryMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcUpdateAccountantSalaryMethod = IncomeExpensesServiceGrpc.getGrpcUpdateAccountantSalaryMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcUpdateAccountantSalaryMethod = getGrpcUpdateAccountantSalaryMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcUpdateAccountantSalary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcUpdateAccountantSalary"))
                  .build();
          }
        }
     }
     return getGrpcUpdateAccountantSalaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcSetPayPriceForClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcSetPayPriceForClients",
      requestType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      responseType = com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
      com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcSetPayPriceForClientsMethod() {
    io.grpc.MethodDescriptor<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> getGrpcSetPayPriceForClientsMethod;
    if ((getGrpcSetPayPriceForClientsMethod = IncomeExpensesServiceGrpc.getGrpcSetPayPriceForClientsMethod) == null) {
      synchronized (IncomeExpensesServiceGrpc.class) {
        if ((getGrpcSetPayPriceForClientsMethod = IncomeExpensesServiceGrpc.getGrpcSetPayPriceForClientsMethod) == null) {
          IncomeExpensesServiceGrpc.getGrpcSetPayPriceForClientsMethod = getGrpcSetPayPriceForClientsMethod = 
              io.grpc.MethodDescriptor.<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty, com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IncomeExpensesService", "GrpcSetPayPriceForClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IncomeExpensesServiceMethodDescriptorSupplier("GrpcSetPayPriceForClients"))
                  .build();
          }
        }
     }
     return getGrpcSetPayPriceForClientsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncomeExpensesServiceStub newStub(io.grpc.Channel channel) {
    return new IncomeExpensesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncomeExpensesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IncomeExpensesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IncomeExpensesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IncomeExpensesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IncomeExpensesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void grpcGetMalfunction(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetMalfunctionMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllMalfunctions(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllMalfunctionsMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddMalfunctionToWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddMalfunctionToWorkerMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetWorkerMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllWorkers(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllWorkersMethod(), responseObserver);
    }

    /**
     */
    public void grpcUpdateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcUpdateWorkerMethod(), responseObserver);
    }

    /**
     */
    public void grpcCreateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcCreateWorkerMethod(), responseObserver);
    }

    /**
     */
    public void grpcDeleteWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcDeleteWorkerMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAccountant(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAccountantMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllAccountants(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllAccountantsMethod(), responseObserver);
    }

    /**
     */
    public void grpcUpdateAccountantSalary(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcUpdateAccountantSalaryMethod(), responseObserver);
    }

    /**
     */
    public void grpcSetPayPriceForClients(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcSetPayPriceForClientsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrpcGetMalfunctionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction>(
                  this, METHODID_GRPC_GET_MALFUNCTION)))
          .addMethod(
            getGrpcGetAllMalfunctionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions>(
                  this, METHODID_GRPC_GET_ALL_MALFUNCTIONS)))
          .addMethod(
            getGrpcAddMalfunctionToWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_MALFUNCTION_TO_WORKER)))
          .addMethod(
            getGrpcGetWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker>(
                  this, METHODID_GRPC_GET_WORKER)))
          .addMethod(
            getGrpcGetAllWorkersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers>(
                  this, METHODID_GRPC_GET_ALL_WORKERS)))
          .addMethod(
            getGrpcUpdateWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_UPDATE_WORKER)))
          .addMethod(
            getGrpcCreateWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_CREATE_WORKER)))
          .addMethod(
            getGrpcDeleteWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_DELETE_WORKER)))
          .addMethod(
            getGrpcGetAccountantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant>(
                  this, METHODID_GRPC_GET_ACCOUNTANT)))
          .addMethod(
            getGrpcGetAllAccountantsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants>(
                  this, METHODID_GRPC_GET_ALL_ACCOUNTANTS)))
          .addMethod(
            getGrpcUpdateAccountantSalaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_UPDATE_ACCOUNTANT_SALARY)))
          .addMethod(
            getGrpcSetPayPriceForClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty,
                com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>(
                  this, METHODID_GRPC_SET_PAY_PRICE_FOR_CLIENTS)))
          .build();
    }
  }

  /**
   */
  public static final class IncomeExpensesServiceStub extends io.grpc.stub.AbstractStub<IncomeExpensesServiceStub> {
    private IncomeExpensesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeExpensesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeExpensesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeExpensesServiceStub(channel, callOptions);
    }

    /**
     */
    public void grpcGetMalfunction(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetMalfunctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllMalfunctions(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllMalfunctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddMalfunctionToWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddMalfunctionToWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllWorkers(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllWorkersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcUpdateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcUpdateWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcCreateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcCreateWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcDeleteWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcDeleteWorkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAccountant(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAccountantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllAccountants(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllAccountantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcUpdateAccountantSalary(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcUpdateAccountantSalaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcSetPayPriceForClients(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcSetPayPriceForClientsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IncomeExpensesServiceBlockingStub extends io.grpc.stub.AbstractStub<IncomeExpensesServiceBlockingStub> {
    private IncomeExpensesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeExpensesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeExpensesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeExpensesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction grpcGetMalfunction(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetMalfunctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions grpcGetAllMalfunctions(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllMalfunctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcAddMalfunctionToWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddMalfunctionToWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker grpcGetWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers grpcGetAllWorkers(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllWorkersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcUpdateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker request) {
      return blockingUnaryCall(
          getChannel(), getGrpcUpdateWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcCreateWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW request) {
      return blockingUnaryCall(
          getChannel(), getGrpcCreateWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcDeleteWorker(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcDeleteWorkerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant grpcGetAccountant(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAccountantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants grpcGetAllAccountants(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllAccountantsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcUpdateAccountantSalary(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary request) {
      return blockingUnaryCall(
          getChannel(), getGrpcUpdateAccountantSalaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty grpcSetPayPriceForClients(com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcSetPayPriceForClientsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IncomeExpensesServiceFutureStub extends io.grpc.stub.AbstractStub<IncomeExpensesServiceFutureStub> {
    private IncomeExpensesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncomeExpensesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncomeExpensesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncomeExpensesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction> grpcGetMalfunction(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetMalfunctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions> grpcGetAllMalfunctions(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllMalfunctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcAddMalfunctionToWorker(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddMalfunctionToWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker> grpcGetWorker(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers> grpcGetAllWorkers(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllWorkersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcUpdateWorker(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcUpdateWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcCreateWorker(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcCreateWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcDeleteWorker(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcDeleteWorkerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant> grpcGetAccountant(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAccountantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants> grpcGetAllAccountants(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllAccountantsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcUpdateAccountantSalary(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcUpdateAccountantSalaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty> grpcSetPayPriceForClients(
        com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcSetPayPriceForClientsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_GET_MALFUNCTION = 0;
  private static final int METHODID_GRPC_GET_ALL_MALFUNCTIONS = 1;
  private static final int METHODID_GRPC_ADD_MALFUNCTION_TO_WORKER = 2;
  private static final int METHODID_GRPC_GET_WORKER = 3;
  private static final int METHODID_GRPC_GET_ALL_WORKERS = 4;
  private static final int METHODID_GRPC_UPDATE_WORKER = 5;
  private static final int METHODID_GRPC_CREATE_WORKER = 6;
  private static final int METHODID_GRPC_DELETE_WORKER = 7;
  private static final int METHODID_GRPC_GET_ACCOUNTANT = 8;
  private static final int METHODID_GRPC_GET_ALL_ACCOUNTANTS = 9;
  private static final int METHODID_GRPC_UPDATE_ACCOUNTANT_SALARY = 10;
  private static final int METHODID_GRPC_SET_PAY_PRICE_FOR_CLIENTS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncomeExpensesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncomeExpensesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_GET_MALFUNCTION:
          serviceImpl.grpcGetMalfunction((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunction>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_MALFUNCTIONS:
          serviceImpl.grpcGetAllMalfunctions((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Malfunctions>) responseObserver);
          break;
        case METHODID_GRPC_ADD_MALFUNCTION_TO_WORKER:
          serviceImpl.grpcAddMalfunctionToWorker((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.addMalfunctionToWorker) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_GET_WORKER:
          serviceImpl.grpcGetWorker((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_WORKERS:
          serviceImpl.grpcGetAllWorkers((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorkers>) responseObserver);
          break;
        case METHODID_GRPC_UPDATE_WORKER:
          serviceImpl.grpcUpdateWorker((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CommunalWorker) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_CREATE_WORKER:
          serviceImpl.grpcCreateWorker((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.CreateCW) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_DELETE_WORKER:
          serviceImpl.grpcDeleteWorker((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_GET_ACCOUNTANT:
          serviceImpl.grpcGetAccountant((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Id) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountant>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_ACCOUNTANTS:
          serviceImpl.grpcGetAllAccountants((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Accountants>) responseObserver);
          break;
        case METHODID_GRPC_UPDATE_ACCOUNTANT_SALARY:
          serviceImpl.grpcUpdateAccountantSalary((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.updateAccountantSalary) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_SET_PAY_PRICE_FOR_CLIENTS:
          serviceImpl.grpcSetPayPriceForClients((com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.Empty>) responseObserver);
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

  private static abstract class IncomeExpensesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IncomeExpensesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IncomeExpensesService");
    }
  }

  private static final class IncomeExpensesServiceFileDescriptorSupplier
      extends IncomeExpensesServiceBaseDescriptorSupplier {
    IncomeExpensesServiceFileDescriptorSupplier() {}
  }

  private static final class IncomeExpensesServiceMethodDescriptorSupplier
      extends IncomeExpensesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IncomeExpensesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IncomeExpensesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncomeExpensesServiceFileDescriptorSupplier())
              .addMethod(getGrpcGetMalfunctionMethod())
              .addMethod(getGrpcGetAllMalfunctionsMethod())
              .addMethod(getGrpcAddMalfunctionToWorkerMethod())
              .addMethod(getGrpcGetWorkerMethod())
              .addMethod(getGrpcGetAllWorkersMethod())
              .addMethod(getGrpcUpdateWorkerMethod())
              .addMethod(getGrpcCreateWorkerMethod())
              .addMethod(getGrpcDeleteWorkerMethod())
              .addMethod(getGrpcGetAccountantMethod())
              .addMethod(getGrpcGetAllAccountantsMethod())
              .addMethod(getGrpcUpdateAccountantSalaryMethod())
              .addMethod(getGrpcSetPayPriceForClientsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
