package models;

import java.util.UUID;

public class Malfunction {
    private UUID malfunctionId;
    private double fixPrice;
    private String malfunctionDesc;
    private boolean isPayed;
    private String workerId;
    public Malfunction(UUID malfunctionId, double fixPrice, String malfunctionDesc, boolean isPayed, String workerId) {
        this.malfunctionId = malfunctionId;
        this.fixPrice = fixPrice;
        this.malfunctionDesc = malfunctionDesc;
        this.isPayed = isPayed;
        this.workerId = workerId;
    }
    public Malfunction( double fixPrice, String malfunctionDesc) {
        this.malfunctionId = UUID.randomUUID();
        this.fixPrice = fixPrice;
        this.malfunctionDesc = malfunctionDesc;
        this.isPayed = false;
    }
    public Malfunction() {

    }

    public UUID getMalfunctionId() {
        return malfunctionId;
    }

    public void setMalfunctionId(UUID malfunctionId) {
        this.malfunctionId = malfunctionId;
    }

    public double getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(double fixPrice) {
        this.fixPrice = fixPrice;
    }

    public String getMalfunctionDesc() {
        return malfunctionDesc;
    }

    public void setMalfunctionDesc(String malfunctionDesc) {
        this.malfunctionDesc = malfunctionDesc;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }
}
