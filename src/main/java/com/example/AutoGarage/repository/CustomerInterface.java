package com.example.AutoGarage.repository;

import com.example.AutoGarage.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerInterface extends JpaRepository<Customer, Long> {

}