package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.mapping.Value;

import javax.persistence.Id;

public class ParkingPlace {

    private int Id;
    private boolean isOccupied;
    private String contractId;

    public ParkingPlace( int Id,
                         boolean isOccupied) {
        this.Id = Id;
        this.isOccupied = isOccupied;
        this.contractId=null;
    }
    public ParkingPlace()
    {
        this.isOccupied = false;
    }

    public int getParkingPlaceId() {
        return Id;
    }

    public void setParkingPlaceId(int parkingPlaceId) {
        this.Id = parkingPlaceId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "parkingPlaceId=" +  Id +
                ", isOccupied=" + isOccupied +
                ", contractId='" + contractId + '\'' +
                '}';
    }
}
