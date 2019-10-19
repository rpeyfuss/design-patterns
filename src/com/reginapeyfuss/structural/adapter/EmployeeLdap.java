package com.reginapeyfuss.structural.adapter;

public class EmployeeLdap {
    private String cn;
    private String surename;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String givenName, String surename, String mail) {
        this.cn = cn;
        this.surename = surename;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurename() {
        return surename;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
