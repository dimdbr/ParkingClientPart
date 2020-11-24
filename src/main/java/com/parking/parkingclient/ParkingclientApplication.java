package com.parking.parkingclient;

import com.contractservice.grpc.ContractServiceGrpc;
import com.contractservice.grpc.ContractServiceOuterClass;
import com.incomeExpensesService.grpc.IncomeExpensesServiceGrpc;
import com.incomeExpensesService.grpc.IncomeExpensesServiceOuterClass;
import com.tariffservice.grpc.TariffServiceGrpc;
import com.tariffservice.grpc.TariffServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import models.*;
import org.hibernate.jdbc.Work;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.*;

@SpringBootApplication
public class ParkingclientApplication {

    private static RestTemplate restTemplate = new RestTemplate();
    static final String GET_PARKING_PLACES="http://192.168.99.100:8080/parkingplaces";
    static final String GET_PARKING_PLACE="http://192.168.99.100:8080/parkingplaces/{id}";
    static final String CREATE_PARKING_PLACES="http://192.168.99.100:8080/parkingplaces";
    static final String DELETE_PARKING_PLACE="http://192.168.99.100:8080/parkingplaces/{id}";

    static final String GET_CLIENTS="http://192.168.99.101:30460/clients";
    static final String GET_CLIENT="http://192.168.99.101:30460/clients/{id}";
    static final String CREATE_CLIENT="http://192.168.99.100:8080/clients";
    static final String DELETE_CLIENT="http://192.168.99.100:8080/clients/{id}";

    static final String GET_CONTRACTS="http://192.168.99.100:8080/contracts";
    static final String GET_CONTRACT="http://192.168.99.100:8080/contracts/{id}";
    static final String CREATE_CONTRACTS="http://192.168.99.100:8080/contracts";
    static final String DELETE_CONTRACTS="http://192.168.99.100:8080/contracts/{id}";
    static final String ADD_CAR_TO_CONTRACT="http://192.168.99.100:8080/contracts/{id}/addcar/{carname}";
    static final String REMOVE_CAR_FROM_CONTRACT="http://192.168.99.100:8080/contracts/{id}/delcar/{carname}";
    static final String ADD_PARK_PLACE_TO_CONTRACT="http://192.168.99.100:8080/contracts/{id}/addparkplace/{parkingplaceid}";
    static final String REMOVE_PARK_PLACE_FROM_CONTRACT="http://192.168.99.100:8080/contracts/{id}/removeparkplace/{parkingplaceid}";

    static final String CREATE_TARIFF="http://192.168.99.100:8082/tariffs";
    static final String GET_TARIFFS="http://192.168.99.100:8082/tariffs";
    static final String GET_TARIFF="http://192.168.99.100:8082/tariffs/{id}";

    static final String GET_MALFUNCTIONS="http://192.168.99.100:8081/malfunctions";
    //static final String GET_UNPAYED_MALFUNCTIONS="http://192.168.99.100:8081/malfunctions/unpayed";
    static final String GET_MALFUNCTION_BY_ID="http://192.168.99.100:8081/malfunctions/{id}";
    static final String CREATE_MALFUNCTION="http://192.168.99.100:8081/malfunctions";

    static final String GET_WORKERS="http://192.168.99.100:8081/workers";
    static final String GET_WORKERS_BY_ID="http://192.168.99.100:8081/workers/{id}";
    static final String CREATE_WORKER="http://192.168.99.100:8081/workers";
    static final String UPDATE_WORKER_BY_ID="http://192.168.99.100:8081/workers/{id}";
    static final String ADD_MALFUNCTION_FOR_WORKER="http://192.168.99.100:8081/workers/{id}/malfunctions";
    static final String DELETE_WORKER_BY_ID="http://192.168.99.100:8081/workers/{id}";

    static final String CREATE_OWNER="http://192.168.99.100:8082/owners";
    static final String GET_OWNERS="http://192.168.99.100:8082/owners";
    static final String GET_OWNER_BY_ID="http://192.168.99.100:8082/owners/{id}";
    static final String CHANGE_TARIFF="http://192.168.99.100:8082/owners/changetariff/{id}";
    static final String COLLECT_MONEY="http://192.168.99.100:8082/owners/{id}/collectmoney";
    static final String PAY_MONEY="http://192.168.99.100:8082/owners/paymoney";

    static final String CREATE_ACCOUNTANT="http://192.168.99.100:8081/accountants";
    static final String GET_ACCOUNTANTS="http://192.168.99.100:8081/accountants";
    static final String GET_ACCOUNTANT="http://192.168.99.100:8081/accountants/{id}";
    static final String UPDATE_ACCOUNTANT_SALARY="http://192.168.99.100:8081/accountants/{id}";
    static final String SET_CLIENTS_PAY_PRICE="http://192.168.99.100:8081/accountants/setprice";

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

         ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
         ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost",9091).usePlaintext().build();
        ManagedChannel channel3 =ManagedChannelBuilder.forAddress("localhost",9092).usePlaintext().build();

       ContractServiceGrpc.ContractServiceBlockingStub clientStub1 =
               com.contractservice.grpc.ContractServiceGrpc.newBlockingStub(channel1);
       TariffServiceGrpc.TariffServiceBlockingStub tariffServiceBlockingStub =
               TariffServiceGrpc.newBlockingStub(channel2);
       IncomeExpensesServiceGrpc.IncomeExpensesServiceBlockingStub incomeExpensesServiceBlockingStub =
               IncomeExpensesServiceGrpc.newBlockingStub(channel3);

        ContractServiceOuterClass.Empty.Builder emptyForCS  = ContractServiceOuterClass.Empty.newBuilder();
        IncomeExpensesServiceOuterClass.Empty.Builder emptyForIES = IncomeExpensesServiceOuterClass.Empty.newBuilder();
        TariffServiceOuterClass.Empty.Builder emptyForTS = TariffServiceOuterClass.Empty.newBuilder();

        ContractServiceOuterClass.Clients clientsResponse = clientStub1.grpcGetAllClients(emptyForCS.build());
        IncomeExpensesServiceOuterClass.Accountants accountants = incomeExpensesServiceBlockingStub.grpcGetAllAccountants(emptyForIES.build());
        IncomeExpensesServiceOuterClass.CommunalWorkers communalWorkers = incomeExpensesServiceBlockingStub.grpcGetAllWorkers(emptyForIES.build());
        System.out.println("Clients \n");
        System.out.println(clientsResponse.getClientsList());
        System.out.println("Accountants \n");
        System.out.println(accountants);
        System.out.println("Workers \n");
        System.out.println(communalWorkers);
        ContractServiceOuterClass.UUID id = ContractServiceOuterClass.
                UUID.
                newBuilder().
                setValue("af5259c7-ec5f-4751-b9d7-5139b2b450ea")
                .build();





/*

        // HttpHeaders
        ParkingclientApplication parkingclientApplication = new ParkingclientApplication();
        ///System.out.println("Parking places");
        //parkingclientApplication.getParkingPlaces();
        //System.out.println("create client:");
        //parkingclientApplication.CreateClient();
        //System.out.println("Parking places with id 8");
        //parkingclientApplication.GetParkingPlaceById("8");
        //System.out.println("creating client");
        //parkingclientApplication.CreateClient();
        System.out.println("all clients");
        parkingclientApplication.GetClients();
        //parkingclientApplication.DeleteClient();
        //parkingclientApplication.DeleteClient();
        //SpringApplication.run(ParkingclientApplication.class, args);
        System.out.println("all contracts:");
        parkingclientApplication.GetContracts();
        //System.out.println("Adding car to contract");
        //System.out.println("Creating contract");
        //parkingclientApplication.CreateContracts();
        //System.out.println("add car to contract");
        //parkingclientApplication.AddCarToContract();
        //System.out.println("add parkingplace to contract");
        //parkingclientApplication.AddParkPlaceToContract();
        //parkingclientApplication.RemoveParkingPlaceFromContract();
        System.out.println("all contracts:");
        parkingclientApplication.GetContracts();
        //System.out.println("parkingplaces");
        //parkingclientApplication.getParkingPlaces();
        System.out.println("all tariffs");
        parkingclientApplication.GetTariffs();
        //parkingclientApplication.GetTariff();


        System.out.println("all workers");
        parkingclientApplication.GetWorkers();
        System.out.println("get worker by id");
        parkingclientApplication.GetWorkerById();

        //System.out.println("add malfunction to worker");
        //parkingclientApplication.AddMalfunctionToWorker();

        System.out.println("select malfunctions (true, false)");
        parkingclientApplication.GetMalfunctions();
        System.out.println("get malfunction by id");
        parkingclientApplication.GetMalfunctionById();

        //parkingclientApplication.UpdateWorker();
        System.out.println("all coowners");
        parkingclientApplication.GetOwners();
        System.out.println("get owner by id");
        parkingclientApplication.GetOwnerById();
        //System.out.println("collect monet for owner id");
        //parkingclientApplication.CollectMoney();
        //System.out.println("paying money for workers");
        //parkingclientApplication.PayMoney();
        //System.out.println("get owner by id to check");
        //parkingclientApplication.GetOwnerById();
        System.out.println("all accountants");
        parkingclientApplication.GetAccountants();
        //System.out.println("get accountant by id");
        //parkingclientApplication.GetAccountant();
        //System.out.println("update salary for accountant");
        //parkingclientApplication.UpdateSalary();
        System.out.println("get accountant by id");
        parkingclientApplication.GetAccountant();
        //System.out.println("calculating clients pay price");
        //parkingclientApplication.SetClientPayPrice();
        System.out.println("get all clients");
        parkingclientApplication.GetClients();
*/
    }




    private void getParkingPlaces()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_PARKING_PLACES,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }
    private void GetParkingPlaceById(String parkingPlaceId)
    {   HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",parkingPlaceId);
        ResponseEntity<String> result = restTemplate.exchange(GET_PARKING_PLACE,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }
    private void CreateParkingPlace()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        ParkingPlace parkingPlace= new ParkingPlace();
        HttpEntity<ParkingPlace> entity= new HttpEntity<>(parkingPlace,headers);
        ParkingPlace result = restTemplate.postForObject(CREATE_PARKING_PLACES,entity,ParkingPlace.class);
        System.out.println(result);
    }

    private void GetClients(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<Client>> parkingplacesresp=restTemplate.exchange(GET_CLIENTS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Client>>(){});
        List<Client> clients = parkingplacesresp.getBody();

        for (Client client:clients)
        {
            System.out.println(client);
        }
        ResponseEntity<String> result = restTemplate.exchange(GET_CLIENTS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetClient(String clientId)
    {

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",clientId);
        ResponseEntity<String> result = restTemplate.exchange(GET_CLIENT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateClient()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");


        System.out.print("Enter an client name: ");
        String name = input.nextLine();
        System.out.println("Client created");
        Client client= new Client(name);
        HttpEntity<Client> entity= new HttpEntity<>(client,headers);

        //ParkingPlace result = restTemplate.postForObject(CREATE_CLIENT,client,ParkingPlace.class);
        Client result = restTemplate.postForObject(CREATE_CLIENT,entity,Client.class);
        System.out.println(result);
    }

    private void DeleteClient()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        System.out.print("Enter an client id: ");
        String clientId = input.nextLine();
        System.out.println("Client deleted");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",clientId);
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        restTemplate.exchange(DELETE_CLIENT,HttpMethod.DELETE,entity,String.class,params);
    }

    private void GetContracts()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_CONTRACTS,HttpMethod.GET,entity,String.class);
        System.out.println(result);

    }

    private void GetContract()
    {

        System.out.print("Enter an Contracts id: ");

        String ContractId = input.nextLine();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",ContractId);

        ResponseEntity<Contract> contractResponseEntity = restTemplate.exchange(GET_CONTRACT,HttpMethod.GET,null,Contract.class);
        System.out.println(contractResponseEntity.getBody());
        ResponseEntity<String> result = restTemplate.exchange(GET_CONTRACT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateContracts()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        System.out.print("Enter an clientid name: ");
        String  fakeclientId = input.nextLine();
        UUID clientId = UUID.fromString(fakeclientId);
        System.out.print("Enter an carname name: ");
        String carname =input.nextLine();
        System.out.println("Contract created");
        // closing the scanner object
        Contract contract= new Contract(clientId,carname);
        HttpEntity<Contract> entity= new HttpEntity<>(contract,headers);
        Contract result = restTemplate.postForObject(CREATE_CONTRACTS,entity,Contract.class);
        System.out.println(result);
    }
    private void DeleteContract()
    {

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        System.out.print("Enter an contract id: ");
        String contractId = input.nextLine();
        System.out.println("contract deleted");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        restTemplate.exchange(DELETE_CONTRACTS,HttpMethod.DELETE,entity,String.class,params);
    }
    private void AddCarToContract()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an contractid: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to add: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        // closing the scanner object
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.exchange(ADD_CAR_TO_CONTRACT,HttpMethod.PUT,entity,String.class,params);

    }

    private void RemoveCarFromContract()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to remove: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.exchange(REMOVE_CAR_FROM_CONTRACT,HttpMethod.PUT,entity,String.class,params);
    }

    private void AddParkPlaceToContract()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to add: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("parkingplaceid",parkingPlaceId);
        restTemplate.exchange(ADD_PARK_PLACE_TO_CONTRACT,HttpMethod.PUT,entity,String.class,params);
    }

    private void RemoveParkingPlaceFromContract()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to remove: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("parkingplaceid",parkingPlaceId);
        restTemplate.exchange(REMOVE_PARK_PLACE_FROM_CONTRACT,HttpMethod.PUT,entity,String.class,params);
    }

    private void CreateTariff()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        System.out.print("Enter an parkingprice: ");
        double parkingprice = input.nextDouble();
        System.out.print("Enter an watertariff: ");
        double watertariff = input.nextDouble();
        System.out.print("Enter an electricitytariff: ");
        double electricitytariff = input.nextDouble();
        System.out.print("Enter an gastariff: ");
        double gastariff = input.nextDouble();
        System.out.print("Enter an tariffdesc: ");
        String desc =input.next();
        Tariff tariff=new Tariff(parkingprice,watertariff,electricitytariff,gastariff,desc);
        HttpEntity<Tariff> entity= new HttpEntity<>(tariff,headers);
        Tariff result = restTemplate.postForObject(CREATE_TARIFF,entity,Tariff.class);
        System.out.println(result);
    }

    private void GetTariffs()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_TARIFFS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetTariff()
    {

        System.out.print("Enter an Tariff id: ");
        String tariffId = input.nextLine();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",tariffId);
        ResponseEntity<String> result = restTemplate.exchange(GET_TARIFF,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void GetMalfunctions()
    {

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        String ispayed=input.nextLine();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("ispayed",ispayed);
        ResponseEntity<String> result = restTemplate.exchange(GET_MALFUNCTIONS,HttpMethod.GET,entity,String.class,ispayed);
        System.out.println(result);

    }


    private void GetMalfunctionById()
    {

        System.out.print("Enter an malfunction id: ");

        String malfunctionId = input.nextLine();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",malfunctionId);
        ResponseEntity<String> result = restTemplate.exchange(GET_MALFUNCTION_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void GetWorkers()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<CommunalWorker>> communalworkersresp=restTemplate.exchange(GET_WORKERS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<CommunalWorker>>(){});
        List<CommunalWorker> communalWorkers = communalworkersresp.getBody();

        for (CommunalWorker communalWorker:communalWorkers)
        {
            System.out.println(communalWorker);
        }
        ResponseEntity<String> result = restTemplate.exchange(GET_WORKERS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetWorkerById()
    {

        System.out.print("Enter an Workers id: ");
        String workerId = input.nextLine();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",workerId);
        ResponseEntity<CommunalWorker> parkingplacesresp=restTemplate.exchange(GET_WORKERS_BY_ID, HttpMethod.GET,entity , new ParameterizedTypeReference<CommunalWorker>(){},params);
        CommunalWorker communalWorker = parkingplacesresp.getBody();
        System.out.println(communalWorker);
        ResponseEntity<String> result = restTemplate.exchange(GET_WORKERS_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateWorker()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        System.out.print("Enter an worker name: ");
        String workername = input.nextLine();
        System.out.print("Enter an worker salary: ");
        double salary =input.nextDouble();
        System.out.print("Enter an worker type:(GAS,WATER,ELECTRICITY) ");
        String type = input.next();
        CW_Type cw_type =CW_Type.valueOf(type.toUpperCase());
        CommunalWorker communalWorker= new CommunalWorker(workername,salary,cw_type,false);
        HttpEntity<CommunalWorker> entity= new HttpEntity<>(communalWorker,headers);
        CommunalWorker result = restTemplate.postForObject(CREATE_WORKER,entity,CommunalWorker.class);
        System.out.println(result);
    }

    private void UpdateWorker()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        System.out.print("Enter an workerid: ");
        String workerId = input.nextLine();
        System.out.print("Enter an worker name: ");
        String workername = input.nextLine();
        System.out.print("Enter an worker salary: ");
        double salary =input.nextDouble();
        System.out.print("Enter an worker type:(GAS,WATER,ELECTRICITY) ");
        String type = input.next();
        System.out.print("IS WINTER ?");
        boolean isWinter=input.nextBoolean();
        CW_Type cw_type =CW_Type.valueOf(type.toUpperCase());
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", workerId);
        CommunalWorker updatedCW = new CommunalWorker(workername,salary,cw_type,isWinter);
        HttpEntity<CommunalWorker> entity= new HttpEntity<>(updatedCW,headers);
        restTemplate.exchange(UPDATE_WORKER_BY_ID,HttpMethod.PUT,entity,String.class, params);
    }

    private void AddMalfunctionToWorker()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        System.out.print("Enter an workerid: ");
        String workerId = input.nextLine();

        System.out.print("Enter an fixprice: ");
        double fixprice = input.nextDouble();

        System.out.print("Enter an malfunctiondesc: ");
        String desc =input.next();

        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", workerId);

        Malfunction malfunction=new Malfunction(fixprice,desc);
        HttpEntity<Malfunction> entity= new HttpEntity<>(malfunction,headers);
        restTemplate.exchange(ADD_MALFUNCTION_FOR_WORKER,HttpMethod.PUT,entity,String.class,params);
    }

    private void DeleteWorker()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an workerid to delete:");
        String workerId = input.nextLine();
        input.close();
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", workerId);
        restTemplate.exchange(DELETE_WORKER_BY_ID,HttpMethod.DELETE,entity,String.class,params);

    }

    private void CreateOwner()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");

        System.out.print("Enter an Owner name: ");
        String name = input.nextLine();
        System.out.print("Enter an account balance: ");
        double balance =input.nextDouble();
        CoOwner coOwner= new CoOwner(name,balance);
        HttpEntity<CoOwner> entity= new HttpEntity<>(coOwner,headers);
        CoOwner result = restTemplate.postForObject(CREATE_OWNER,entity,CoOwner.class);
        System.out.println(result);

    }
    private void GetOwners()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<CoOwner>> CoOwnersresp=restTemplate.exchange(GET_OWNERS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<CoOwner>>(){});
        List<CoOwner> coOwners = CoOwnersresp.getBody();

        for (CoOwner coOwner:coOwners)
        {
            System.out.println(coOwner);
        }
        ResponseEntity<String> result = restTemplate.exchange(GET_OWNERS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetOwnerById()
    {
        System.out.print("Enter an Owner id: ");
        int ownerID = input.nextInt();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",ownerID);
        ResponseEntity<CoOwner> CoOwnerresp=restTemplate.exchange(GET_OWNER_BY_ID, HttpMethod.GET, entity, new ParameterizedTypeReference<CoOwner>(){},params);
        CoOwner coOwner = CoOwnerresp.getBody();
        System.out.println(coOwner);
        ResponseEntity<String> result = restTemplate.exchange(GET_OWNER_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);

    }

    private void UpdateTariff()
    {   HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        System.out.print("Enter tariff id: ");
        int tariffId = input.nextInt();
        System.out.print("Enter an parkingprice: ");
        double parkingprice = input.nextDouble();
        System.out.print("Enter an watertariff: ");
        double watertariff = input.nextDouble();
        System.out.print("Enter an electricitytariff: ");
        double electricitytariff = input.nextDouble();
        System.out.print("Enter an gastariff: ");
        double gastariff = input.nextDouble();
        System.out.print("Enter an tariffdesc: ");
        String desc =input.next();
        Map < String, Integer > params = new HashMap < String, Integer>();
        params.put("id", tariffId);
        Tariff tariff=new Tariff(parkingprice,watertariff,electricitytariff,gastariff,desc);
        HttpEntity<Tariff> entity= new HttpEntity<>(tariff,headers);
        restTemplate.exchange(CHANGE_TARIFF,HttpMethod.PUT,entity,String.class,params);
    }

    private void CollectMoney()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter owner id: ");
        int ownerId = input.nextInt();
        Map < String, Integer > params = new HashMap < String, Integer>() ;
        params.put("id", ownerId);
        restTemplate.exchange(COLLECT_MONEY,HttpMethod.PUT,entity,String.class,params);
    }

    private void PayMoney()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantThree");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        restTemplate.exchange(PAY_MONEY,HttpMethod.PUT,entity,CoOwner.class);
    }

    private void CreateAccountant()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        System.out.print("Enter an Accountant name: ");
        String accountantname = input.nextLine();
        System.out.print("Enter an accountant salary: ");
        double salary =input.nextDouble();
        Accountant accountant= new Accountant(accountantname,salary);
        HttpEntity<Accountant> entity= new HttpEntity<>(accountant,headers);
        Accountant result = restTemplate.postForObject(CREATE_ACCOUNTANT,entity,Accountant.class);
        System.out.println(result);

    }

    private void GetAccountants()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<Accountant>> accountantesp=restTemplate.exchange(GET_ACCOUNTANTS, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Accountant>>(){});
        List<Accountant> accountants = accountantesp.getBody();

        for (Accountant accountant:accountants)
        {
            System.out.println(accountant);
        }
        ResponseEntity<String> result = restTemplate.exchange(GET_ACCOUNTANTS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }
    private void GetAccountant()
    {
        System.out.print("Enter an accountant id: ");
        int accountantId = input.nextInt();
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",accountantId);
        ResponseEntity<String> result = restTemplate.exchange(GET_ACCOUNTANT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void UpdateSalary()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        System.out.print("Enter an accountant id: ");
        int accountantId = input.nextInt();
        System.out.println("Enter new Salary");
        double newSalary = input.nextDouble();
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",accountantId);
        restTemplate.exchange(UPDATE_ACCOUNTANT_SALARY,HttpMethod.PUT,entity,String.class,params);

    }

    private void SetClientPayPrice()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantTwo");
        HttpEntity<String> entity= new HttpEntity<>("parameters",headers);
        restTemplate.exchange(SET_CLIENTS_PAY_PRICE,HttpMethod.PUT,entity,Accountant.class);
    }

}
