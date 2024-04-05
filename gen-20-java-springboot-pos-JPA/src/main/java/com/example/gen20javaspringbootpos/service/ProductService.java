package com.example.gen20javaspringbootpos.service;
import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.dto.ProductDTO;
import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.entity.Product;
import com.example.gen20javaspringbootpos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> convertToProductDTO(product))
                .collect(Collectors.toList());
    }

    public Optional<ProductDTO> getProductById(Long productId) {
        Optional<Product> productOptional = productRepository.findById(productId);
        return productOptional.map(product -> convertToProductDTO(product));
    }

    public List<ProductDTO> getProductsByName(String name) {
        List<Product> products = productRepository.findByName(name);
        return products.stream()
                .map(product -> convertToProductDTO(product))
                .collect(Collectors.toList());
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = convertToProductEntity(productDTO);
        product = productRepository.save(product);
        return convertToProductDTO(product);
    }

    private ProductDTO convertToProductDTO(Product product) {
        return new ProductDTO(product.getProductId(), product.getName(), product.getPrice(),
                product.getCategory().getCategoryId(), product.getCategory().getName());
    }

    private Product convertToProductEntity(ProductDTO productDTO) {
        CategoryDTO categoryDTO = categoryService.getCategoryById(productDTO.getCategoryId()).orElse(null);
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setCategoryId(categoryDTO.getCategoryId());
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);
        return product;
    }
}
