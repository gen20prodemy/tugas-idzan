package com.example.gen20javaservlet.service;

import com.example.gen20javaservlet.dto.ProductDTO;
import com.example.gen20javaservlet.entity.Product;
import com.example.gen20javaservlet.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<ProductDTO> getAllproducts(){
        List<Product> products = productRepo.findAll();
        List<ProductDTO> productDTOs = new ArrayList<>();

        for (Product product : products){
            ProductDTO productDTO = convertProductToDTO(product);
            productDTOs.add(productDTO);
        }
        return  productDTOs;
    }

    public  ProductDTO convertProductToDTO (Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(product.getProductId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategoryName(product.getCategory().getName());
        return  productDTO;
    }
}
