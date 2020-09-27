package models;

public class Accountant {
    private int accountantId;
    private String name;
    private double salary;

    public Accountant(int accountantId, String name, double salary) {
        this.accountantId = accountantId;
        this.name = name;
        this.salary = salary;
    }

    public Accountant(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public Accountant() {}

    public int getAccountantId() {
        return accountantId;
    }

    public void setAccountantId(int accountantId) {
        this.accountantId = accountantId;
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
}
