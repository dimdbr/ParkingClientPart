package com.contractservice.grpc;

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
    comments = "Source: ContractService.proto")
public final class ContractServiceGrpc {

  private ContractServiceGrpc() {}

  public static final String SERVICE_NAME = "ContractService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcGetClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetClient",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.UUID.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcGetClientMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcGetClientMethod;
    if ((getGrpcGetClientMethod = ContractServiceGrpc.getGrpcGetClientMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetClientMethod = ContractServiceGrpc.getGrpcGetClientMethod) == null) {
          ContractServiceGrpc.getGrpcGetClientMethod = getGrpcGetClientMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Client.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetClient"))
                  .build();
          }
        }
     }
     return getGrpcGetClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.Clients> getGrpcGetAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllClients",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Clients.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.Clients> getGrpcGetAllClientsMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.Clients> getGrpcGetAllClientsMethod;
    if ((getGrpcGetAllClientsMethod = ContractServiceGrpc.getGrpcGetAllClientsMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetAllClientsMethod = ContractServiceGrpc.getGrpcGetAllClientsMethod) == null) {
          ContractServiceGrpc.getGrpcGetAllClientsMethod = getGrpcGetAllClientsMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.Clients>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetAllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Clients.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetAllClients"))
                  .build();
          }
        }
     }
     return getGrpcGetAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.CreateClient,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddClient",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.CreateClient.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.CreateClient,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.CreateClient, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientMethod;
    if ((getGrpcAddClientMethod = ContractServiceGrpc.getGrpcAddClientMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcAddClientMethod = ContractServiceGrpc.getGrpcAddClientMethod) == null) {
          ContractServiceGrpc.getGrpcAddClientMethod = getGrpcAddClientMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.CreateClient, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcAddClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.CreateClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcAddClient"))
                  .build();
          }
        }
     }
     return getGrpcAddClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcDeleteClient",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.UUID.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteClientMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteClientMethod;
    if ((getGrpcDeleteClientMethod = ContractServiceGrpc.getGrpcDeleteClientMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcDeleteClientMethod = ContractServiceGrpc.getGrpcDeleteClientMethod) == null) {
          ContractServiceGrpc.getGrpcDeleteClientMethod = getGrpcDeleteClientMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcDeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcDeleteClient"))
                  .build();
          }
        }
     }
     return getGrpcDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UpdateClient,
      com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcUpdateClient",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.UpdateClient.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UpdateClient,
      com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UpdateClient, com.contractservice.grpc.ContractServiceOuterClass.Client> getGrpcUpdateClientMethod;
    if ((getGrpcUpdateClientMethod = ContractServiceGrpc.getGrpcUpdateClientMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcUpdateClientMethod = ContractServiceGrpc.getGrpcUpdateClientMethod) == null) {
          ContractServiceGrpc.getGrpcUpdateClientMethod = getGrpcUpdateClientMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.UpdateClient, com.contractservice.grpc.ContractServiceOuterClass.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcUpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.UpdateClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Client.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcUpdateClient"))
                  .build();
          }
        }
     }
     return getGrpcUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Contract> getGrpcGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetContract",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.UUID.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Contract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Contract> getGrpcGetContractMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Contract> getGrpcGetContractMethod;
    if ((getGrpcGetContractMethod = ContractServiceGrpc.getGrpcGetContractMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetContractMethod = ContractServiceGrpc.getGrpcGetContractMethod) == null) {
          ContractServiceGrpc.getGrpcGetContractMethod = getGrpcGetContractMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Contract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Contract.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetContract"))
                  .build();
          }
        }
     }
     return getGrpcGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.Contracts> getGrpcGetAllContractsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllContracts",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Contracts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.Contracts> getGrpcGetAllContractsMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.Contracts> getGrpcGetAllContractsMethod;
    if ((getGrpcGetAllContractsMethod = ContractServiceGrpc.getGrpcGetAllContractsMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetAllContractsMethod = ContractServiceGrpc.getGrpcGetAllContractsMethod) == null) {
          ContractServiceGrpc.getGrpcGetAllContractsMethod = getGrpcGetAllContractsMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.Contracts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetAllContracts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Contracts.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetAllContracts"))
                  .build();
          }
        }
     }
     return getGrpcGetAllContractsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.createContract,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddContract",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.createContract.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.createContract,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddContractMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.createContract, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddContractMethod;
    if ((getGrpcAddContractMethod = ContractServiceGrpc.getGrpcAddContractMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcAddContractMethod = ContractServiceGrpc.getGrpcAddContractMethod) == null) {
          ContractServiceGrpc.getGrpcAddContractMethod = getGrpcAddContractMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.createContract, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcAddContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.createContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcAddContract"))
                  .build();
          }
        }
     }
     return getGrpcAddContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddParkingPlaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddParkingPlace",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddParkingPlaceMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddParkingPlaceMethod;
    if ((getGrpcAddParkingPlaceMethod = ContractServiceGrpc.getGrpcAddParkingPlaceMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcAddParkingPlaceMethod = ContractServiceGrpc.getGrpcAddParkingPlaceMethod) == null) {
          ContractServiceGrpc.getGrpcAddParkingPlaceMethod = getGrpcAddParkingPlaceMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcAddParkingPlace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcAddParkingPlace"))
                  .build();
          }
        }
     }
     return getGrpcAddParkingPlaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveParkingPlaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcRemoveParkingPlace",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveParkingPlaceMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveParkingPlaceMethod;
    if ((getGrpcRemoveParkingPlaceMethod = ContractServiceGrpc.getGrpcRemoveParkingPlaceMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcRemoveParkingPlaceMethod = ContractServiceGrpc.getGrpcRemoveParkingPlaceMethod) == null) {
          ContractServiceGrpc.getGrpcRemoveParkingPlaceMethod = getGrpcRemoveParkingPlaceMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcRemoveParkingPlace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcRemoveParkingPlace"))
                  .build();
          }
        }
     }
     return getGrpcRemoveParkingPlaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcAddClientCar",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.changeClientCar.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientCarMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcAddClientCarMethod;
    if ((getGrpcAddClientCarMethod = ContractServiceGrpc.getGrpcAddClientCarMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcAddClientCarMethod = ContractServiceGrpc.getGrpcAddClientCarMethod) == null) {
          ContractServiceGrpc.getGrpcAddClientCarMethod = getGrpcAddClientCarMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcAddClientCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.changeClientCar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcAddClientCar"))
                  .build();
          }
        }
     }
     return getGrpcAddClientCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveClientCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcRemoveClientCar",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.changeClientCar.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveClientCarMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcRemoveClientCarMethod;
    if ((getGrpcRemoveClientCarMethod = ContractServiceGrpc.getGrpcRemoveClientCarMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcRemoveClientCarMethod = ContractServiceGrpc.getGrpcRemoveClientCarMethod) == null) {
          ContractServiceGrpc.getGrpcRemoveClientCarMethod = getGrpcRemoveClientCarMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.changeClientCar, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcRemoveClientCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.changeClientCar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcRemoveClientCar"))
                  .build();
          }
        }
     }
     return getGrpcRemoveClientCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcDeleteContract",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.UUID.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID,
      com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteContractMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Empty> getGrpcDeleteContractMethod;
    if ((getGrpcDeleteContractMethod = ContractServiceGrpc.getGrpcDeleteContractMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcDeleteContractMethod = ContractServiceGrpc.getGrpcDeleteContractMethod) == null) {
          ContractServiceGrpc.getGrpcDeleteContractMethod = getGrpcDeleteContractMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.UUID, com.contractservice.grpc.ContractServiceOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcDeleteContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.UUID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcDeleteContract"))
                  .build();
          }
        }
     }
     return getGrpcDeleteContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Id,
      com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> getGrpcGetParkingPlaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetParkingPlace",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.Id.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Id,
      com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> getGrpcGetParkingPlaceMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Id, com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> getGrpcGetParkingPlaceMethod;
    if ((getGrpcGetParkingPlaceMethod = ContractServiceGrpc.getGrpcGetParkingPlaceMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetParkingPlaceMethod = ContractServiceGrpc.getGrpcGetParkingPlaceMethod) == null) {
          ContractServiceGrpc.getGrpcGetParkingPlaceMethod = getGrpcGetParkingPlaceMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.Id, com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetParkingPlace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetParkingPlace"))
                  .build();
          }
        }
     }
     return getGrpcGetParkingPlaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> getGrpcGetAllParkingPlacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrpcGetAllParkingPlaces",
      requestType = com.contractservice.grpc.ContractServiceOuterClass.Empty.class,
      responseType = com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty,
      com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> getGrpcGetAllParkingPlacesMethod() {
    io.grpc.MethodDescriptor<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> getGrpcGetAllParkingPlacesMethod;
    if ((getGrpcGetAllParkingPlacesMethod = ContractServiceGrpc.getGrpcGetAllParkingPlacesMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGrpcGetAllParkingPlacesMethod = ContractServiceGrpc.getGrpcGetAllParkingPlacesMethod) == null) {
          ContractServiceGrpc.getGrpcGetAllParkingPlacesMethod = getGrpcGetAllParkingPlacesMethod = 
              io.grpc.MethodDescriptor.<com.contractservice.grpc.ContractServiceOuterClass.Empty, com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContractService", "GrpcGetAllParkingPlaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces.getDefaultInstance()))
                  .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GrpcGetAllParkingPlaces"))
                  .build();
          }
        }
     }
     return getGrpcGetAllParkingPlacesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContractServiceStub newStub(io.grpc.Channel channel) {
    return new ContractServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContractServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContractServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContractServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContractServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContractServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void grpcGetClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetClientMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllClients(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Clients> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddClient(com.contractservice.grpc.ContractServiceOuterClass.CreateClient request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddClientMethod(), responseObserver);
    }

    /**
     */
    public void grpcDeleteClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcDeleteClientMethod(), responseObserver);
    }

    /**
     */
    public void grpcUpdateClient(com.contractservice.grpc.ContractServiceOuterClass.UpdateClient request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcUpdateClientMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contract> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetContractMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllContracts(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contracts> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllContractsMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddContract(com.contractservice.grpc.ContractServiceOuterClass.createContract request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddContractMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddParkingPlaceMethod(), responseObserver);
    }

    /**
     */
    public void grpcRemoveParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcRemoveParkingPlaceMethod(), responseObserver);
    }

    /**
     */
    public void grpcAddClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcAddClientCarMethod(), responseObserver);
    }

    /**
     */
    public void grpcRemoveClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcRemoveClientCarMethod(), responseObserver);
    }

    /**
     */
    public void grpcDeleteContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcDeleteContractMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetParkingPlaceMethod(), responseObserver);
    }

    /**
     */
    public void grpcGetAllParkingPlaces(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> responseObserver) {
      asyncUnimplementedUnaryCall(getGrpcGetAllParkingPlacesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGrpcGetClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.UUID,
                com.contractservice.grpc.ContractServiceOuterClass.Client>(
                  this, METHODID_GRPC_GET_CLIENT)))
          .addMethod(
            getGrpcGetAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.Empty,
                com.contractservice.grpc.ContractServiceOuterClass.Clients>(
                  this, METHODID_GRPC_GET_ALL_CLIENTS)))
          .addMethod(
            getGrpcAddClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.CreateClient,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_CLIENT)))
          .addMethod(
            getGrpcDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.UUID,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_DELETE_CLIENT)))
          .addMethod(
            getGrpcUpdateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.UpdateClient,
                com.contractservice.grpc.ContractServiceOuterClass.Client>(
                  this, METHODID_GRPC_UPDATE_CLIENT)))
          .addMethod(
            getGrpcGetContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.UUID,
                com.contractservice.grpc.ContractServiceOuterClass.Contract>(
                  this, METHODID_GRPC_GET_CONTRACT)))
          .addMethod(
            getGrpcGetAllContractsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.Empty,
                com.contractservice.grpc.ContractServiceOuterClass.Contracts>(
                  this, METHODID_GRPC_GET_ALL_CONTRACTS)))
          .addMethod(
            getGrpcAddContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.createContract,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_CONTRACT)))
          .addMethod(
            getGrpcAddParkingPlaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_PARKING_PLACE)))
          .addMethod(
            getGrpcRemoveParkingPlaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_REMOVE_PARKING_PLACE)))
          .addMethod(
            getGrpcAddClientCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_ADD_CLIENT_CAR)))
          .addMethod(
            getGrpcRemoveClientCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.changeClientCar,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_REMOVE_CLIENT_CAR)))
          .addMethod(
            getGrpcDeleteContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.UUID,
                com.contractservice.grpc.ContractServiceOuterClass.Empty>(
                  this, METHODID_GRPC_DELETE_CONTRACT)))
          .addMethod(
            getGrpcGetParkingPlaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.Id,
                com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace>(
                  this, METHODID_GRPC_GET_PARKING_PLACE)))
          .addMethod(
            getGrpcGetAllParkingPlacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.contractservice.grpc.ContractServiceOuterClass.Empty,
                com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces>(
                  this, METHODID_GRPC_GET_ALL_PARKING_PLACES)))
          .build();
    }
  }

  /**
   */
  public static final class ContractServiceStub extends io.grpc.stub.AbstractStub<ContractServiceStub> {
    private ContractServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContractServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContractServiceStub(channel, callOptions);
    }

    /**
     */
    public void grpcGetClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllClients(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Clients> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddClient(com.contractservice.grpc.ContractServiceOuterClass.CreateClient request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcDeleteClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcUpdateClient(com.contractservice.grpc.ContractServiceOuterClass.UpdateClient request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contract> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllContracts(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contracts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllContractsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddContract(com.contractservice.grpc.ContractServiceOuterClass.createContract request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddParkingPlaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcRemoveParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcRemoveParkingPlaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcAddClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcAddClientCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcRemoveClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcRemoveClientCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcDeleteContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcDeleteContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.Id request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetParkingPlaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grpcGetAllParkingPlaces(com.contractservice.grpc.ContractServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGrpcGetAllParkingPlacesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContractServiceBlockingStub extends io.grpc.stub.AbstractStub<ContractServiceBlockingStub> {
    private ContractServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContractServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContractServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Client grpcGetClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Clients grpcGetAllClients(com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcAddClient(com.contractservice.grpc.ContractServiceOuterClass.CreateClient request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcDeleteClient(com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Client grpcUpdateClient(com.contractservice.grpc.ContractServiceOuterClass.UpdateClient request) {
      return blockingUnaryCall(
          getChannel(), getGrpcUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Contract grpcGetContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Contracts grpcGetAllContracts(com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllContractsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcAddContract(com.contractservice.grpc.ContractServiceOuterClass.createContract request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcAddParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddParkingPlaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcRemoveParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request) {
      return blockingUnaryCall(
          getChannel(), getGrpcRemoveParkingPlaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcAddClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request) {
      return blockingUnaryCall(
          getChannel(), getGrpcAddClientCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcRemoveClientCar(com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request) {
      return blockingUnaryCall(
          getChannel(), getGrpcRemoveClientCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.Empty grpcDeleteContract(com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return blockingUnaryCall(
          getChannel(), getGrpcDeleteContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace grpcGetParkingPlace(com.contractservice.grpc.ContractServiceOuterClass.Id request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetParkingPlaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces grpcGetAllParkingPlaces(com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGrpcGetAllParkingPlacesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContractServiceFutureStub extends io.grpc.stub.AbstractStub<ContractServiceFutureStub> {
    private ContractServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContractServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContractServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Client> grpcGetClient(
        com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Clients> grpcGetAllClients(
        com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcAddClient(
        com.contractservice.grpc.ContractServiceOuterClass.CreateClient request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcDeleteClient(
        com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Client> grpcUpdateClient(
        com.contractservice.grpc.ContractServiceOuterClass.UpdateClient request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Contract> grpcGetContract(
        com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Contracts> grpcGetAllContracts(
        com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllContractsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcAddContract(
        com.contractservice.grpc.ContractServiceOuterClass.createContract request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcAddParkingPlace(
        com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddParkingPlaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcRemoveParkingPlace(
        com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcRemoveParkingPlaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcAddClientCar(
        com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcAddClientCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcRemoveClientCar(
        com.contractservice.grpc.ContractServiceOuterClass.changeClientCar request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcRemoveClientCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.Empty> grpcDeleteContract(
        com.contractservice.grpc.ContractServiceOuterClass.UUID request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcDeleteContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace> grpcGetParkingPlace(
        com.contractservice.grpc.ContractServiceOuterClass.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetParkingPlaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces> grpcGetAllParkingPlaces(
        com.contractservice.grpc.ContractServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGrpcGetAllParkingPlacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_GET_CLIENT = 0;
  private static final int METHODID_GRPC_GET_ALL_CLIENTS = 1;
  private static final int METHODID_GRPC_ADD_CLIENT = 2;
  private static final int METHODID_GRPC_DELETE_CLIENT = 3;
  private static final int METHODID_GRPC_UPDATE_CLIENT = 4;
  private static final int METHODID_GRPC_GET_CONTRACT = 5;
  private static final int METHODID_GRPC_GET_ALL_CONTRACTS = 6;
  private static final int METHODID_GRPC_ADD_CONTRACT = 7;
  private static final int METHODID_GRPC_ADD_PARKING_PLACE = 8;
  private static final int METHODID_GRPC_REMOVE_PARKING_PLACE = 9;
  private static final int METHODID_GRPC_ADD_CLIENT_CAR = 10;
  private static final int METHODID_GRPC_REMOVE_CLIENT_CAR = 11;
  private static final int METHODID_GRPC_DELETE_CONTRACT = 12;
  private static final int METHODID_GRPC_GET_PARKING_PLACE = 13;
  private static final int METHODID_GRPC_GET_ALL_PARKING_PLACES = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContractServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContractServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_GET_CLIENT:
          serviceImpl.grpcGetClient((com.contractservice.grpc.ContractServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_CLIENTS:
          serviceImpl.grpcGetAllClients((com.contractservice.grpc.ContractServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Clients>) responseObserver);
          break;
        case METHODID_GRPC_ADD_CLIENT:
          serviceImpl.grpcAddClient((com.contractservice.grpc.ContractServiceOuterClass.CreateClient) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_DELETE_CLIENT:
          serviceImpl.grpcDeleteClient((com.contractservice.grpc.ContractServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_UPDATE_CLIENT:
          serviceImpl.grpcUpdateClient((com.contractservice.grpc.ContractServiceOuterClass.UpdateClient) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Client>) responseObserver);
          break;
        case METHODID_GRPC_GET_CONTRACT:
          serviceImpl.grpcGetContract((com.contractservice.grpc.ContractServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contract>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_CONTRACTS:
          serviceImpl.grpcGetAllContracts((com.contractservice.grpc.ContractServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Contracts>) responseObserver);
          break;
        case METHODID_GRPC_ADD_CONTRACT:
          serviceImpl.grpcAddContract((com.contractservice.grpc.ContractServiceOuterClass.createContract) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_ADD_PARKING_PLACE:
          serviceImpl.grpcAddParkingPlace((com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_REMOVE_PARKING_PLACE:
          serviceImpl.grpcRemoveParkingPlace((com.contractservice.grpc.ContractServiceOuterClass.changeClientPlace) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_ADD_CLIENT_CAR:
          serviceImpl.grpcAddClientCar((com.contractservice.grpc.ContractServiceOuterClass.changeClientCar) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_REMOVE_CLIENT_CAR:
          serviceImpl.grpcRemoveClientCar((com.contractservice.grpc.ContractServiceOuterClass.changeClientCar) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_DELETE_CONTRACT:
          serviceImpl.grpcDeleteContract((com.contractservice.grpc.ContractServiceOuterClass.UUID) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GRPC_GET_PARKING_PLACE:
          serviceImpl.grpcGetParkingPlace((com.contractservice.grpc.ContractServiceOuterClass.Id) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlace>) responseObserver);
          break;
        case METHODID_GRPC_GET_ALL_PARKING_PLACES:
          serviceImpl.grpcGetAllParkingPlaces((com.contractservice.grpc.ContractServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.contractservice.grpc.ContractServiceOuterClass.ParkingPlaces>) responseObserver);
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

  private static abstract class ContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContractServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.contractservice.grpc.ContractServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContractService");
    }
  }

  private static final class ContractServiceFileDescriptorSupplier
      extends ContractServiceBaseDescriptorSupplier {
    ContractServiceFileDescriptorSupplier() {}
  }

  private static final class ContractServiceMethodDescriptorSupplier
      extends ContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContractServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContractServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContractServiceFileDescriptorSupplier())
              .addMethod(getGrpcGetClientMethod())
              .addMethod(getGrpcGetAllClientsMethod())
              .addMethod(getGrpcAddClientMethod())
              .addMethod(getGrpcDeleteClientMethod())
              .addMethod(getGrpcUpdateClientMethod())
              .addMethod(getGrpcGetContractMethod())
              .addMethod(getGrpcGetAllContractsMethod())
              .addMethod(getGrpcAddContractMethod())
              .addMethod(getGrpcAddParkingPlaceMethod())
              .addMethod(getGrpcRemoveParkingPlaceMethod())
              .addMethod(getGrpcAddClientCarMethod())
              .addMethod(getGrpcRemoveClientCarMethod())
              .addMethod(getGrpcDeleteContractMethod())
              .addMethod(getGrpcGetParkingPlaceMethod())
              .addMethod(getGrpcGetAllParkingPlacesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
