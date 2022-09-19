package com.gl.springbootmstechtask.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gl.springbootmstechtask.entity.Employee;
import com.gl.springbootmstechtask.exception.CustomExceptionHandler;
import com.gl.springbootmstechtask.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/")
    public String sayHi(){
        return "Hi- This is EmployeeController";
    }

    /*
    @PostMapping("/")
    public Employee addEmployee(@Valid @RequestBody String employeeAsJson) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(employeeAsJson, Employee.class);
        System.out.println(employee);

        return employeeService.save(employee);
    }
    */


    @Operation(summary = "This is to add  the Employee in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " Employee details saved in database",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })

    @PostMapping("/")
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee) {


            logger.info("create");
            logger.debug("Debug-create");
            return new ResponseEntity<Employee>(employeeService.save(employee), HttpStatus.CREATED);



    }


}
