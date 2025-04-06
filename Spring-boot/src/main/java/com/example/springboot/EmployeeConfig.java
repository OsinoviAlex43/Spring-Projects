package com.example.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            var employeeList = List.of(
                    new Employee(
                    null,
                    "Alex",
                    "osinovy@gmail.com",
                    18,
                   1000
                    ),
                    new Employee(
                            null,
                            "Vladimir",
                            "Vladimir333@gmail.com",
                            38,
                            3000
                    )
            );
            employeeRepository.saveAll(employeeList);
        };

    }
}
