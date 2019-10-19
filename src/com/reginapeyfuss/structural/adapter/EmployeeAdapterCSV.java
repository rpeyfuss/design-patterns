package com.reginapeyfuss.structural.adapter;

public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(this.instance.getId());
    }

    @Override
    public String getFirstName() {
        return this.instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return this.instance.getLastname();
    }

    @Override
    public String getEmail() {
        return this.instance.getEmailAddress();
    }
    @Override
    public String toString() {
        return "id: " + getId() +
                "\nfirstname: " + getFirstName() +
                "\nlastname: " + getLastName() +
                "\nemail: " + getEmail();
    }
}
