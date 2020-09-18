package com.techdenovo.apps.cafe.service;

import com.techdenovo.apps.cafe.entity.Customer;
import com.techdenovo.apps.cafe.repository.CustomerRepository;
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

    public Customer getCustomer(long id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer){
        Customer existingCustomer = customerRepository.findById(customer.getCustomerId()).orElse(null);
        if(existingCustomer.getCustomerId()==customer.getCustomerId()){
            existingCustomer.setCustomerName(customer.getCustomerName());
            existingCustomer.setCustomerAddress(customer.getCustomerAddress());
            existingCustomer.setCustomerContact(customer.getCustomerContact());
        }
        customerRepository.save(existingCustomer);
        return existingCustomer;
    }

    public void deleteCustomer(long id){
        customerRepository.deleteById(id);
    }
}
