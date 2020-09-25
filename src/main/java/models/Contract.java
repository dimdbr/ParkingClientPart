package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Contract {
    private String ContractId;
    private String ClientId;
    private List<String> registeredCars;

    public Contract(String contractId, String clientId, List<String> registeredCars) {
        ContractId = contractId;
        ClientId = clientId;
        this.registeredCars = registeredCars;
    }
    public Contract(String clientId, String carName)
    {   this.ContractId= UUID.randomUUID().toString();
        this.ClientId= clientId;
        List<String> carnames=new ArrayList<>();
        carnames.add(carName);
        this.registeredCars=carnames;
    }
    public Contract(String clientId, List<String> carNames)
    {
        this.ContractId=UUID.randomUUID().toString();
        this.ClientId= clientId;

        this.registeredCars=carNames;
    }
    public String getContractId() {
        return ContractId;
    }

    public void setContractId(String contractId) {
        ContractId = contractId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public List<String> getRegisteredCars() {
        return registeredCars;
    }

    public void setRegisteredCars(List<String> registeredCars) {
        this.registeredCars = registeredCars;
    }

}
