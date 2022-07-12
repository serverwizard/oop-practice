package org.example.hr.service.dto;

import org.example.hr.domain.Employee;

public class EmployeeCreatedResponse {
    private String no;
    private String name;
    private String socialSecurityNumber;

    public static EmployeeCreatedResponse of(Employee employee) {
        return new EmployeeCreatedResponse(employee.getNo(), employee.getName(), employee.getSocialSecurityNumber());
    }

    private EmployeeCreatedResponse(String no, String name, String socialSecurityNumber) {
        this.no = no;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return  "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'';
    }
}
