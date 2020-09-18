package com.example.demodbapplication.service;

import com.example.demodbapplication.model.Product;
import com.example.demodbapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProductById(long id){
        productRepository.deleteById(id);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product modifyProduct(Product product){
        Product existingProduct= productRepository.findById(product.getProductID()).orElse(null);
        if(existingProduct != null){
            existingProduct.setProductName(product.getProductName());
            existingProduct.setPrice(product.getPrice());
            productRepository.save(existingProduct);
        }
        return existingProduct;
    }
}
