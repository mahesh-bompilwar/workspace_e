package com.example.demodbapplication.service;

import com.example.demodbapplication.model.Customer;
import com.example.demodbapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
    public Customer getCustomersById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public void deleteCustomerById(long id){
        customerRepository.deleteById(id);
    }

    public Customer modifyCustomer(Customer customer){
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
        if(existingCustomer != null){
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastName(customer.getLastName());
            customerRepository.save(existingCustomer);
        }
        return existingCustomer;
    }
}
