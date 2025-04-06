package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//Взаимодействие с базой данных
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 Optional<Employee> findEmployeeByEmail(String email);
}
