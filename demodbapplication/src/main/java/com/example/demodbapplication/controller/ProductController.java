package com.example.demodbapplication.controller;

import com.example.demodbapplication.model.Customer;
import com.example.demodbapplication.model.Product;
import com.example.demodbapplication.repository.ProductRepository;
import com.example.demodbapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
       return productService.addProduct(product);
    }

    @PostMapping("/modifyProduct")
    public Product modifyProduct(@RequestBody Product product){
        return productService.modifyProduct(product);
    }
}
