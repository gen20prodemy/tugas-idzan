package com.example.gen20javaspringbootpos.service;


import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


}
