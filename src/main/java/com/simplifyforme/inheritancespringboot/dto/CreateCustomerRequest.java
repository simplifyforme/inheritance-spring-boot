package com.simplifyforme.inheritancespringboot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public CreateCustomerRequest() {
    }

    public CreateCustomerRequest(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
