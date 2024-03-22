package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/name/{name}")
    public List<Product> getProductsByName(@PathVariable("name") String name) {
        return productService.getProductsByName(name);
    }


    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


}

