package com.reginapeyfuss.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List <Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "johnwick@example.com");
        employees.add(employeeFromDB);
        EmployeeLdap employeeFromLdap = new EmployeeLdap("234", "Susie", "Jane", "susiejane@example.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlockhomes@example.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));
        return employees;
    }
}
