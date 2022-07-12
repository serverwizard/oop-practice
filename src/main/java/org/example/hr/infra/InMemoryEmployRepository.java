package org.example.hr.infra;

import org.example.hr.domain.Employee;
import org.example.hr.domain.EmployRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryEmployRepository implements EmployRepository {
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public void createEmployee(Employee employee) {
        employees.put(employee.getNo(), employee);
    }

    @Override
    public Employee findByNo(String no) {
        return employees.get(no);
    }
}
