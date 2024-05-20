package com.simplifyforme.inheritancespringboot.services;

import com.simplifyforme.inheritancespringboot.dto.CreateCustomerRequest;
import com.simplifyforme.inheritancespringboot.entities.Customer;
import com.simplifyforme.inheritancespringboot.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer save(CreateCustomerRequest createCustomerRequest){

        Customer customer = new Customer(createCustomerRequest.getEmail(), createCustomerRequest.getPassword(), createCustomerRequest.getFirstName(), createCustomerRequest.getLastName());
        return customerRepository.save(customer);
    }
}
