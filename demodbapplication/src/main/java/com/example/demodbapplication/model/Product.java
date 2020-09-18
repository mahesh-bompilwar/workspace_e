package com.example.demodbapplication.model;

import javax.persistence.*;

@Entity
@Table(name="TB_PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUCT_ID")
    private long productID;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="PRICE")
    private double price;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
