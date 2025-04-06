package com.example.springboot;


import org.aspectj.apache.bcel.classfile.InnerClass;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Взаимодействие через http
@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long id,
                               @RequestParam(value = "email", required = false) String email,
                               @RequestParam(value = "salary", required = false) Integer salary) {
        employeeService.updateEmployee(id, email, salary);
    }

}
