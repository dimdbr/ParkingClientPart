package models;

import java.util.UUID;

public class Client {
    private  String clientID;
    private  String name;
    private  double monthPay;

    public Client(String clientID, String name, double monthPay) {
        this.clientID = clientID;
        this.name = name;
        this.monthPay = monthPay;
    }

    public Client(String name) {
        this.clientID= UUID.randomUUID().toString();
        this.name = name;
        this.monthPay=0;
    }
    public Client() {

    }
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(double monthPay) {
        this.monthPay = monthPay;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", monthPay=" + monthPay +
                '}';
    }
}
