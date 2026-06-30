package com.cognizant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    private final EmployeeService service;

    public SpringDataJpaApplication(EmployeeService service) {
        this.service = service;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringDataJpaApplication.class, args);

    }

    @Override
    public void run(String... args) {

        service.saveEmployee();

    }

}