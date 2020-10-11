package com.parking.parkingclient;

import models.*;
import org.hibernate.jdbc.Work;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@SpringBootApplication
public class ParkingclientApplication {

    private static RestTemplate restTemplate = new RestTemplate();
    static final String GET_PARKING_PLACES="http://192.168.99.100:8080/parkingplaces";
    static final String GET_PARKING_PLACE="http://192.168.99.100:8080/parkingplaces/{id}";
    static final String CREATE_PARKING_PLACES="http://192.168.99.100:8080/parkingplaces";
    static final String DELETE_PARKING_PLACE="http://192.168.99.100:8080/parkingplaces/{id}";

    static final String GET_CLIENTS="http://192.168.99.100:8080/clients";
    static final String GET_CLIENT="http://192.168.99.100:8080/clients/{id}";
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
        // HttpHeaders
        ParkingclientApplication parkingclientApplication = new ParkingclientApplication();
        System.out.println("Parking places");
        parkingclientApplication.getParkingPlaces();
        System.out.println("create client:");
        parkingclientApplication.CreateClient();
        //System.out.println("Parking places with id 8");
        //parkingclientApplication.GetParkingPlaceById("8");
        //System.out.println("creating client");
        //parkingclientApplication.CreateClient();
        System.out.println("all clients");
        parkingclientApplication.GetClients();
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
        System.out.println("get accountant by id");
        parkingclientApplication.GetAccountant();
        //System.out.println("update salary for accountant");
        //parkingclientApplication.UpdateSalary();
        System.out.println("get accountant by id");
        parkingclientApplication.GetAccountant();
        //System.out.println("calculating clients pay price");
        //parkingclientApplication.SetClientPayPrice();
        System.out.println("get all clients");
        parkingclientApplication.GetClients();


    }




    private void getParkingPlaces()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        //ResponseEntity<List<ParkingPlace>> parkingplacesresp=restTemplate.exchange(GET_PARKING_PLACES, HttpMethod.GET, null, new ParameterizedTypeReference<List<ParkingPlace>>(){});
        //List<ParkingPlace> parkingPlaces = parkingplacesresp.getBody();
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
        ParkingPlace parkingPlace= new ParkingPlace();
        ParkingPlace result = restTemplate.postForObject(CREATE_PARKING_PLACES,parkingPlace,ParkingPlace.class);
        System.out.println(result);
    }

    private void GetClients(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-TenantID","TenantOne");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<Client>> parkingplacesresp=restTemplate.exchange(GET_CLIENTS, HttpMethod.GET, null, new ParameterizedTypeReference<List<Client>>(){});
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

        System.out.print("Enter an client id: ");
        String clientId = input.nextLine();
        System.out.println("Client deleted");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",clientId);
        restTemplate.delete(DELETE_CLIENT,params);
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

        System.out.print("Enter an clientid name: ");
        String  fakeclientId = input.nextLine();
        UUID clientId = UUID.fromString(fakeclientId);
        System.out.print("Enter an carname name: ");
        String carname =input.nextLine();
        System.out.println("Contract created");
        // closing the scanner object
        Contract contract= new Contract(clientId,carname);
        ParkingPlace result = restTemplate.postForObject(CREATE_CONTRACTS,contract,ParkingPlace.class);
        System.out.println(result);
    }
    private void DeleteContract()
    {


        System.out.print("Enter an contract id: ");
        String contractId = input.nextLine();
        System.out.println("contract deleted");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        restTemplate.delete(DELETE_CONTRACTS,params);
    }
    private void AddCarToContract()
    {


        System.out.print("Enter an contractid: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to add: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        // closing the scanner object
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.put(ADD_CAR_TO_CONTRACT,Contract.class,params);

    }

    private void RemoveCarFromContract()
    {

        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to remove: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.put(REMOVE_CAR_FROM_CONTRACT,Contract.class,params);
    }

    private void AddParkPlaceToContract()
    {


        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to add: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("parkingplaceid",parkingPlaceId);
        restTemplate.put(ADD_PARK_PLACE_TO_CONTRACT,Contract.class,params);
    }

    private void RemoveParkingPlaceFromContract()
    {

        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to remove: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("parkingplaceid",parkingPlaceId);
        restTemplate.put(REMOVE_PARK_PLACE_FROM_CONTRACT,Contract.class,params);
    }

    private void CreateTariff()
    {

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
        Tariff result = restTemplate.postForObject(CREATE_TARIFF,tariff,Tariff.class);
        System.out.println(result);
    }

    private void GetTariffs()
    {
        HttpHeaders headers = new HttpHeaders();
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",tariffId);
        ResponseEntity<String> result = restTemplate.exchange(GET_TARIFF,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void GetMalfunctions()
    {
        HttpHeaders headers = new HttpHeaders();
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",malfunctionId);
        ResponseEntity<String> result = restTemplate.exchange(GET_MALFUNCTION_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void GetWorkers()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<CommunalWorker>> communalworkersresp=restTemplate.exchange(GET_WORKERS, HttpMethod.GET, null, new ParameterizedTypeReference<List<CommunalWorker>>(){});
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",workerId);
        ResponseEntity<CommunalWorker> parkingplacesresp=restTemplate.exchange(GET_WORKERS_BY_ID, HttpMethod.GET,null , new ParameterizedTypeReference<CommunalWorker>(){},params);
        CommunalWorker communalWorker = parkingplacesresp.getBody();
        System.out.println(communalWorker);
        ResponseEntity<String> result = restTemplate.exchange(GET_WORKERS_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateWorker()
    {

        System.out.print("Enter an worker name: ");
        String workername = input.nextLine();
        System.out.print("Enter an worker salary: ");
        double salary =input.nextDouble();
        System.out.print("Enter an worker type:(GAS,WATER,ELECTRICITY) ");
        String type = input.next();
        CW_Type cw_type =CW_Type.valueOf(type.toUpperCase());
        // closing the scanner object
        CommunalWorker communalWorker= new CommunalWorker(workername,salary,cw_type,false);
        CommunalWorker result = restTemplate.postForObject(CREATE_WORKER,communalWorker,CommunalWorker.class);
        System.out.println(result);
    }

    private void UpdateWorker()
    {

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
        restTemplate.put(UPDATE_WORKER_BY_ID, updatedCW, params);
    }

    private void AddMalfunctionToWorker()
    {
        System.out.print("Enter an workerid: ");
        String workerId = input.nextLine();

        System.out.print("Enter an fixprice: ");
        double fixprice = input.nextDouble();

        System.out.print("Enter an malfunctiondesc: ");
        String desc =input.next();

        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", workerId);

        Malfunction malfunction=new Malfunction(fixprice,desc);
        restTemplate.put(ADD_MALFUNCTION_FOR_WORKER,malfunction,params);
    }

    private void DeleteWorker()
    {

        System.out.print("Enter an workerid to delete:");
        String workerId = input.nextLine();
        input.close();
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", workerId);
        restTemplate.delete(DELETE_WORKER_BY_ID, params);

    }

    private void CreateOwner()
    {
        System.out.print("Enter an Owner name: ");
        String name = input.nextLine();
        System.out.print("Enter an account balance: ");
        double balance =input.nextDouble();
        CoOwner coOwner= new CoOwner(name,balance);
        CoOwner result = restTemplate.postForObject(CREATE_OWNER,coOwner,CoOwner.class);
        System.out.println(result);

    }
    private void GetOwners()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<CoOwner>> CoOwnersresp=restTemplate.exchange(GET_OWNERS, HttpMethod.GET, null, new ParameterizedTypeReference<List<CoOwner>>(){});
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",ownerID);
        ResponseEntity<CoOwner> CoOwnerresp=restTemplate.exchange(GET_OWNER_BY_ID, HttpMethod.GET, null, new ParameterizedTypeReference<CoOwner>(){},params);
        CoOwner coOwner = CoOwnerresp.getBody();
        System.out.println(coOwner);
        ResponseEntity<String> result = restTemplate.exchange(GET_OWNER_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);

    }

    private void UpdateTariff()
    {
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
        restTemplate.put(CHANGE_TARIFF,tariff,params);
    }

    private void CollectMoney()
    {
        System.out.print("Enter owner id: ");
        int ownerId = input.nextInt();
        Map < String, Integer > params = new HashMap < String, Integer>() ;
        params.put("id", ownerId);
        restTemplate.put(COLLECT_MONEY,CoOwner.class,params);
    }

    private void PayMoney()
    {
        restTemplate.put(PAY_MONEY,CoOwner.class);
    }

    private void CreateAccountant()
    {
        System.out.print("Enter an Accountant name: ");
        String accountantname = input.nextLine();
        System.out.print("Enter an accountant salary: ");
        double salary =input.nextDouble();
        Accountant accountant= new Accountant(accountantname,salary);
        Accountant result = restTemplate.postForObject(CREATE_ACCOUNTANT,accountant,Accountant.class);
        System.out.println(result);

    }

    private void GetAccountants()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<List<Accountant>> accountantesp=restTemplate.exchange(GET_ACCOUNTANTS, HttpMethod.GET, null, new ParameterizedTypeReference<List<Accountant>>(){});
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",accountantId);
        ResponseEntity<String> result = restTemplate.exchange(GET_ACCOUNTANT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void UpdateSalary()
    {
        System.out.print("Enter an accountant id: ");
        int accountantId = input.nextInt();
        System.out.println("Enter new Salary");
        double newSalary = input.nextDouble();
        Map<String,Integer> params = new HashMap<String, Integer>();
        params.put("id",accountantId);
        restTemplate.put(UPDATE_ACCOUNTANT_SALARY,newSalary,params);

    }

    private void SetClientPayPrice()
    {
        restTemplate.put(SET_CLIENTS_PAY_PRICE,Accountant.class);
    }

}
