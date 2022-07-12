package org.example.hr.domain;

public class Employee {
    private String no;
    private String name;
    private String socialSecurityNumber;

    public Employee(String no, String name, String socialSecurityNumber) {
        this.no = no;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
