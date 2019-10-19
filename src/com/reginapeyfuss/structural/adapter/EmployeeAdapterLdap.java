package com.reginapeyfuss.structural.adapter;

public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCn();
    }

    @Override
    public String getFirstName() {
        return this.instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return this.instance.getSurename();
    }

    @Override
    public String getEmail() {
        return this.instance.getMail();
    }
    @Override
    public String toString() {
        return "id: " + getId() +
                "\nfirstname: " + getFirstName() +
                "\nlastname: " + getLastName() +
                "\nemail: " + getEmail();
    }
}

