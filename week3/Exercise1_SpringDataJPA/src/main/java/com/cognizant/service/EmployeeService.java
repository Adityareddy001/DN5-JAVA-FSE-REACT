package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Employee;
import com.cognizant.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee() {

        Employee employee = new Employee(1, "Aditya");

        repository.save(employee);

        System.out.println("Employee Saved Successfully");

    }

}