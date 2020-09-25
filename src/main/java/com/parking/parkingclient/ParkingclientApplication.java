package com.parking.parkingclient;

import models.Client;
import models.Contract;
import models.ParkingPlace;
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
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an client name: ");
        String name = input.nextLine();
        System.out.println("Client created");

        // closing the scanner object
        input.close();
        Client client= new Client(name);
        ParkingPlace result = restTemplate.postForObject(CREATE_CLIENT,client,ParkingPlace.class);
        System.out.println(result);
    }

    private void DeleteClient()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an client id: ");
        String clientId = input.nextLine();
        System.out.println("Client deleted");

        // closing the scanner object
        input.close();
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
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Contracts id: ");
        String ContractId = input.nextLine();
        // closing the scanner object
        input.close();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",ContractId);
        ResponseEntity<String> result = restTemplate.exchange(GET_CONTRACT,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }

    private void CreateContracts()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an clientid name: ");
        String clientId = input.nextLine();
        System.out.print("Enter an carname name: ");
        String carname =input.nextLine();
        System.out.println("Contract created");

        // closing the scanner object
        input.close();
        Contract contract= new Contract(clientId,carname);
        ParkingPlace result = restTemplate.postForObject(CREATE_CONTRACTS,contract,ParkingPlace.class);
        System.out.println(result);
    }
    private void DeleteContract()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an contract id: ");
        String contractId = input.nextLine();
        System.out.println("contract deleted");

        // closing the scanner object
        input.close();
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        restTemplate.delete(DELETE_CONTRACTS,params);
    }
    private void AddCarToContract()
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to add: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        // closing the scanner object
        input.close();
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.put(ADD_CAR_TO_CONTRACT,Contract.class,params);

    }

    private void RemoveCarFromContract()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an carname to remove: ");
        String carname =input.nextLine();
        System.out.println("Contract updated");
        input.close();
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("carname",carname);
        restTemplate.put(REMOVE_CAR_FROM_CONTRACT,Contract.class,params);
    }

    private void AddParkPlaceToContract()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to add: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        input.close();
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",contractId);
        params.put("parkingplaceid",parkingPlaceId);
        restTemplate.put(ADD_PARK_PLACE_TO_CONTRACT,Contract.class,params);
    }

    private void RemoveParkingPlaceFromContract()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an contractid name: ");
        String contractId = input.nextLine();
        System.out.print("Enter an parkplace to remove: ");
        String parkingPlaceId =input.nextLine();
        System.out.println("Contract updated");
        input.close();
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Tariff id: ");
        String tariffId = input.nextLine();
        // closing the scanner object
        input.close();
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Tariff id: ");
        String malfunctionId = input.nextLine();
        // closing the scanner object
        input.close();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity= new HttpEntity<String>("parameters",headers);
        Map<String,String> params = new HashMap<String, String>();
        params.put("id",malfunctionId);
        ResponseEntity<String> result = restTemplate.exchange(GET_MALFUNCTION_BY_ID,HttpMethod.GET,entity,String.class,params);
        System.out.println(result);
    }



}
