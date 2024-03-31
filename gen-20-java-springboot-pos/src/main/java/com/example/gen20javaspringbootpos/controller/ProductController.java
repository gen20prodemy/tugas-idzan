package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.ProductDTO;
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
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<ProductDTO> getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/name/{name}")
    public List<ProductDTO> getProductsByName(@PathVariable("name") String name) {
        return productService.getProductsByName(name);
    }


    @PostMapping
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }


}

