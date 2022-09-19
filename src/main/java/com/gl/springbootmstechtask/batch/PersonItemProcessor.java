package com.gl.springbootmstechtask.batch;

import com.gl.springbootmstechtask.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Employee, Employee> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Employee process(final Employee person) throws Exception {


        //final Employee transformedPerson = new Employee(firstName,lastName,person.getEmail(),person.getPhone(),person.getSalary(),person.getAddr1(),person.getAddr2(),person.getCity(),person.getState(),person.getZipcode());

        Employee transformedPerson = new Employee();
        transformedPerson = person;


        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}
