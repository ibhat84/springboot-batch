package com.gl.springbootmstechtask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "firstName may not be blank")
    @NotEmpty(message = "firstName may not be empty")
    @NotNull(message = "firstName may not be null")
    @Size(min = 2, message = "firstName should have at least 2 characters")
    private String firstName;


    @NotBlank(message = "lastName may not be blank")
    @NotEmpty(message = "lastName may not be empty")
    @NotNull(message = "lastName may not be null")
    @Size(min = 2, message = "lastName should have at least 2 characters")
    private String lastName;

    @NotEmpty(message = "Email may not be empty")
    @Email
    private String email;

    @NotEmpty(message = "phone may not be empty")
    @Size(min = 9, message = "phone should have at least 9 characters")
    private String phone;

    @NotBlank (message = "salary may not be blank")
    @Size(min = 4, message = "salary should have at least 4 characters")
    private String salary;

    @NotBlank (message = "addr1 may not be blank")
    private String addr1;

    @NotBlank (message = "addr2 may not be blank")
    private String addr2;

    @NotBlank (message = "addr2 may not be blank")
    private String city;

    @NotBlank (message = "state may not be blank")
    private String state;

    @NotBlank (message = "zipcode may not be blank")
    @Size(min = 5, message = "zipcode should have at least 5 characters")
    private String zipcode;


}
