package com.simplifyforme.inheritancespringboot.controllers;

import com.simplifyforme.inheritancespringboot.dto.CreateCustomerRequest;
import com.simplifyforme.inheritancespringboot.entities.Customer;
import com.simplifyforme.inheritancespringboot.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {

    private final CustomerService customerService;

    @PostMapping("/customer/save")
    public Customer save(@RequestBody CreateCustomerRequest createCustomerRequest){
        return customerService.save(createCustomerRequest);
    }

}
