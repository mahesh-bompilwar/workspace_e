package com.techdenovo.apps.cafe.repository;

import com.techdenovo.apps.cafe.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
