package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.dto.ProductDTO;
import com.example.gen20javaspringbootpos.service.CategoryService;
import com.example.gen20javaspringbootpos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CronExecute {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/category")
    @Scheduled(cron = "*/10 * * * * *") //mengeksekusi method ini setiap 10 detik
    @GetMapping()
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> getAllCategories = categoryService.getAllCategories();
        System.out.println("Data kategori berhasil di ambil dalam 10 detik");
        return  getAllCategories;
    }

    @RequestMapping("/product")
    @Scheduled(cron = "0 * * * * *") //mengeksekusi method ini setiap 1 menit
    @GetMapping()
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> getAllProducts = productService.getAllProducts();
        System.out.println("Data produk berhasil di ambil dalam 1 menit");
        return getAllProducts;
    }
}
