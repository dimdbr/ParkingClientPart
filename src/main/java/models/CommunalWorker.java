package models;

import java.util.UUID;

public class CommunalWorker {
    private UUID cwId;
    private String name;
    private double salary;
    private CW_Type cwType;
    private boolean isWinter;

    public CommunalWorker(UUID cwId, String name, double salary, CW_Type cwType, boolean isWinter, String malfunctionId) {
        this.cwId = cwId;
        this.name = name;
        this.salary = salary;
        this.cwType = cwType;
        this.isWinter = isWinter;

    }

    public CommunalWorker(String name, double salary, CW_Type cwType, boolean isWinter) {
        this.cwId = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.cwType = cwType;
        this.isWinter = isWinter;

    }

    public CommunalWorker() {

    }

    public UUID getCwId() {
        return cwId;
    }

    public void setCwId(UUID cwId) {
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

    @Override
    public String toString() {
        return "CommunalWorker{" +
                "cwId=" + cwId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", cwType=" + cwType +
                ", isWinter=" + isWinter +
                '}';
    }
}
