package com.parking.parkingclient;

import models.*;
import org.hibernate.jdbc.Work;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class ParkingclientApplication {

    private static RestTemplate restTemplate = new RestTemplate();
    static final String GET_PARKING_PLACES="http://localhost:8080/parkingplaces";
    static final String GET_PARKING_PLACE="http://localhost:8080/parkingplaces/{id}";
    static final String CREATE_PARKING_PLACES="http://localhost:8080/parkingplaces";
    static final String DELETE_PARKING_PLACE="http://localhost:8080/parkingplaces/{id}";

    static final String GET_CLIENTS="http://localhost:8080/clients";
    static final String GET_CLIENT="http://localhost:8080/clients/{id}";
    static final String CREATE_CLIENT="http://localhost:8080/clients";
    static final String DELETE_CLIENT="http://localhost:8080/clients/{id}";

    static final String GET_CONTRACTS="http://localhost:8080/contracts";
    static final String GET_CONTRACT="http://localhost:8080/contracts/{id}";
    static final String CREATE_CONTRACTS="http://localhost:8080/contracts";
    static final String DELETE_CONTRACTS="http://localhost:8080/contracts/{id}";
    static final String ADD_CAR_TO_CONTRACT="http://localhost:8080/contracts/{id}/addcar/{carname}";
    static final String REMOVE_CAR_FROM_CONTRACT="http://localhost:8080/contracts/{id}/delcar/{carname}";
    static final String ADD_PARK_PLACE_TO_CONTRACT="http://localhost:8080/contracts/{id}/addparkplace/{parkingplaceid}";
    static final String REMOVE_PARK_PLACE_FROM_CONTRACT="http://localhost:8080/contracts/{id}/removeparkplace/{parkingplaceid}";

    static final String GET_TARIFFS="http://localhost:8080/tariffs";
    static final String GET_TARIFF="http://localhost:8080/tariffs/{id}";

    static final String GET_PAYED_MALFUNCTIONS="http://localhost:8080/malf/p";
    static final String GET_UNPAYED_MALFUNCTIONS="http://localhost:8080/malf/up";
    static final String GET_MALFUNCTION_BY_ID="http://localhost:8080/malf/{id}";
    static final String CREATE_MALFUNCTION="http://localhost:8080/malf";

    static final String GET_WORKERS="http://localhost:8080/workers";
    static final String GET_WORKERS_BY_ID="http://localhost:8080/workers/{id}";
    static final String CREATE_WORKER="http://localhost:8080/workers";
    static final String UPDATE_WORKER_BY_ID="http://localhost:8080/workers/{id}";
    static final String ADD_MALFUNCTION_FOR_WORKER="http://localhost:8080/workers/{id}/malf";
    static final String DELETE_WORKER_BY_ID="http://localhost:8080/workers/{id}";
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // HttpHeaders

        ParkingclientApplication parkingclientApplication = new ParkingclientApplication();
        parkingclientApplication.getParkingPlaces();
        parkingclientApplication.GetParkingPlaceById("8");
        parkingclientApplication.GetClients();
        //parkingclientApplication.CreateClient();
        //parkingclientApplication.DeleteClient();
        //SpringApplication.run(ParkingclientApplication.class, args);
        System.out.println("contracts:");
        parkingclientApplication.GetContracts();
        //parkingclientApplication.AddCarToContract();
        //parkingclientApplication.CreateContracts();
        //parkingclientApplication.AddParkPlaceToContract();
        //parkingclientApplication.RemoveParkingPlaceFromContract();
        //parkingclientApplication.GetContracts();
        //parkingclientApplication.getParkingPlaces();
        parkingclientApplication.GetTariffs();
        //parkingclientApplication.GetTariff();
        parkingclientApplication.GetPayedMalfunction();
        parkingclientApplication.GetUnPayedMalfunction();
        parkingclientApplication.GetMalfunctionById();
        parkingclientApplication.GetWorkers();
        parkingclientApplication.GetWorkerById();
        //parkingclientApplication.AddMalfunctionToWorker();
        //parkingclientApplication.UpdateWorker();

    }
    private void getParkingPlaces()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_PARKING_PLACES,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }
    private void GetParkingPlaceById(String parkingPlaceId)
    {   HttpHeaders headers = new HttpHeaders();
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
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_CLIENTS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetClient(String clientId)
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",clientId);
        ResponseEntity<String> result = restTemplate.exchange(GET_CLIENT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateClient()
    {


        System.out.print("Enter an client name: ");
        String name = input.nextLine();
        System.out.println("Client created");
        Client client= new Client(name);
        ParkingPlace result = restTemplate.postForObject(CREATE_CLIENT,client,ParkingPlace.class);
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
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",ContractId);
        ResponseEntity<String> result = restTemplate.exchange(GET_CONTRACT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateContracts()
    {

        System.out.print("Enter an clientid name: ");
        String clientId = input.nextLine();
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


        System.out.print("Enter an contractid name: ");
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

    private void GetPayedMalfunction()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_PAYED_MALFUNCTIONS,HttpMethod.GET,entity,String.class);
        System.out.println(result);
    }

    private void GetUnPayedMalfunction()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        ResponseEntity<String> result = restTemplate.exchange(GET_UNPAYED_MALFUNCTIONS,HttpMethod.GET,entity,String.class);
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


}
