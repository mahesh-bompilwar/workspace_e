package com.example.demodbapplication.controller;

import com.example.demodbapplication.model.Customer;
import com.example.demodbapplication.repository.CustomerRepository;
import com.example.demodbapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomersById(id);
    }

    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @PostMapping("/modifycustomer")
    public Customer modifyCustomer(@RequestBody Customer customer){
        return customerService.modifyCustomer(customer);
    }

}
