package com.gl.springbootmstechtask.service;

import com.gl.springbootmstechtask.entity.Employee;
import com.gl.springbootmstechtask.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public Employee save(Employee employee) {

        System.out.println("In Service layer - Save to db");
        return employeeRepository.save(employee);
    }


}
