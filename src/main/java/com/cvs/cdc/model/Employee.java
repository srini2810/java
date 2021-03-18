package com.cvs.cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int status;

/*
    @Override
    public String getId() {
        return employeeId;
    }*/

   /* @Override
    public boolean isNew() {
        return true;
    }*/
}