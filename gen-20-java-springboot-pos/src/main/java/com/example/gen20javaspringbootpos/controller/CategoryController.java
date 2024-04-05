package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.service.CategoryService;
import com.example.gen20javaspringbootpos.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private KafkaService kafkaService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<CategoryDTO> getCategoryById(@PathVariable("id") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public CategoryDTO addCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.createCategory(categoryDTO);
    }

    @GetMapping("/redis")
    public List<CategoryDTO> getAllCategoriesFromRedis() {
        return categoryService.getCategoryRedis();
    }

    @PostMapping("/redis")
    public CategoryDTO addCategoryToRedis(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.createCategoryRedis(categoryDTO);
    }

    @PostMapping("/kafka")
    public CategoryDTO addCategoryKafka(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO createdCategory = categoryService.createCategory(categoryDTO);

        // Mengirimkan pesan ke topik Kafka
        kafkaService.sendMessage("kategori-topic", createdCategory);

        return createdCategory;
    }
}
