package com.simplifyforme.inheritancespringboot.repositories;

import com.simplifyforme.inheritancespringboot.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
