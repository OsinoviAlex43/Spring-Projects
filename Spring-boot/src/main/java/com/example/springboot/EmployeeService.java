package com.example.springboot;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Бизнесс-логика
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {

        if (employee.getId() != null) {
            throw new IllegalArgumentException("Employee id must be empty");
        }

        //salary>5000
        if (employee.getSalary() <= 500) {
            throw new IllegalArgumentException("Salary should be greater than 5000");
        }

        //unique email
        if (employeeRepository.findEmployeeByEmail(employee.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already taken ");
        }
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        if (employeeRepository.findById(id).isEmpty()) {
            throw new IllegalArgumentException("Employee not found");
        }
        employeeRepository.deleteById(id);
    }

    @Transactional
    public void updateEmployee(Long id, String email, Integer salary) {

        var employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found"));

        if (email != null && !email.isEmpty() && !email.equals(employee.getEmail())) {
            if (employeeRepository.findEmployeeByEmail(email).isPresent()) {
                throw new IllegalArgumentException("Email already taken ");
            }
            employee.setEmail(email);
        }
        if (salary != null && !salary.equals(employee.getSalary())) {
            if (salary <= 500) {
                throw new IllegalArgumentException("Salary should be greater than 500");
            }
            employee.setSalary(salary);
        }
    }
}
