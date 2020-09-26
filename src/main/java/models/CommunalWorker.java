package models;

import java.util.UUID;

public class CommunalWorker {
    private String cwId;
    private String name;
    private double salary;
    private CW_Type cwType;
    private boolean isWinter;

    public CommunalWorker(String cwId, String name, double salary, CW_Type cwType, boolean isWinter, String malfunctionId) {
        this.cwId = cwId;
        this.name = name;
        this.salary = salary;
        this.cwType = cwType;
        this.isWinter = isWinter;

    }

    public CommunalWorker(String name, double salary, CW_Type cwType, boolean isWinter) {
        this.cwId = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
        this.cwType = cwType;
        this.isWinter = isWinter;

    }

    public CommunalWorker() {

    }

    public String getCwId() {
        return cwId;
    }

    public void setCwId(String cwId) {
        this.cwId = cwId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CW_Type getCwType() {
        return cwType;
    }

    public void setCwType(CW_Type cwType) {
        this.cwType = cwType;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }
}
