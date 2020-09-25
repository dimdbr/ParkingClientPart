package models;

public class Tariff {
    private int tariffId;
    private double placePrice;
    private  double waterTariff;
    private  double electricityTariff;
    private  double gasTariff;
    private String tariffDesc;

    public Tariff(double placePrice,double waterTariff, double electricityTariff, double gasTariff, String tariffDesc) {
        this.waterTariff = waterTariff;
        this.electricityTariff = electricityTariff;
        this.gasTariff = gasTariff;
        this.tariffDesc = tariffDesc;
        this.placePrice=placePrice;
    }

    public int getTariffId() {
        return tariffId;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public double getWaterTariff() {
        return waterTariff;
    }

    public void setWaterTariff(double waterTariff) {
        this.waterTariff = waterTariff;
    }

    public double getElectricityTariff() {
        return electricityTariff;
    }

    public void setElectricityTariff(double electricityTariff) {
        this.electricityTariff = electricityTariff;
    }

    public double getGasTariff() {
        return gasTariff;
    }

    public void setGasTariff(double gasTariff) {
        this.gasTariff = gasTariff;
    }

    public String getTariffDesc() {
        return tariffDesc;
    }

    public void setTariffDesc(String tariffDesc) {
        this.tariffDesc = tariffDesc;
    }

    public double getPlacePrice() {
        return placePrice;
    }

    public void setPlacePrice(double placePrice) {
        this.placePrice = placePrice;
    }
}
