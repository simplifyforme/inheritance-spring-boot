package com.simplifyforme.inheritancespringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Customer extends User {

    private String firstName;
    private String lastName;

    public Customer() {
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String email, String password, String firstName, String lastName) {
        super(email, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(int id, String email, String password, String firstName, String lastName) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
