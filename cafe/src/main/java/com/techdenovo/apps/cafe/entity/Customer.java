package com.techdenovo.apps.cafe.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name="CUSTOMER_ID")
    private long customerId;

    @Column(name="CUSTOMER_NAME")
    private String customerName;

    @Column(name="CUSTOMER_ADDRESS")
    private String customerAddress;

    @Column(name="CUSTOMER_CONTACT")
    private long customerContact;

    public Customer() {
    }

    public Customer(long customerId, String customerName, String customerAddress, long customerContact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }
}
