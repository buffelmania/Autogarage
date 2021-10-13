package com.example.AutoGarage.service.implementation;

import com.example.AutoGarage.entity.Customer;
import com.example.AutoGarage.repository.CustomerInterface;
import com.example.AutoGarage.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerInterface customerRepository;

    public CustomerServiceImpl(CustomerInterface customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers(){
        return null;
    }

}
