package com.techdenovo.apps.cafe.controller;

import com.techdenovo.apps.cafe.entity.Customer;
import com.techdenovo.apps.cafe.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable long id){
        return customerService.getCustomer(id);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PostMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @PostMapping("/deleteCustomer/{id}")
    public String  deleteCustomer(long id){
        customerService.deleteCustomer(id);
        return "Customer Deleted Successfully....";
    }
}
