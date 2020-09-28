package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Contract {
    private UUID ContractId;
    private UUID ClientId;
    private List<String> registeredCars;

    public Contract(UUID contractId, UUID clientId, List<String> registeredCars) {
        ContractId = contractId;
        ClientId = clientId;
        this.registeredCars = registeredCars;
    }
    public Contract(UUID clientId, String carName)
    {   this.ContractId= UUID.randomUUID();
        this.ClientId= clientId;
        List<String> carnames=new ArrayList<>();
        carnames.add(carName);
        this.registeredCars=carnames;
    }
    public Contract(UUID clientId, List<String> carNames)
    {
        this.ContractId=UUID.randomUUID();
        this.ClientId= clientId;

        this.registeredCars=carNames;
    }
    public UUID getContractId() {
        return ContractId;
    }

    public void setContractId(UUID contractId) {
        ContractId = contractId;
    }

    public UUID getClientId() {
        return ClientId;
    }

    public void setClientId(UUID clientId) {
        ClientId = clientId;
    }

    public List<String> getRegisteredCars() {
        return registeredCars;
    }

    public void setRegisteredCars(List<String> registeredCars) {
        this.registeredCars = registeredCars;
    }

}
