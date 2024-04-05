package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.service.CategoryService;
import com.example.gen20javaspringbootpos.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryKafkaController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/kafka")
    public CategoryDTO addCategoryKafka(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO createdCategory = categoryService.createCategory(categoryDTO);

        // Mengirimkan pesan ke topik Kafka
        kafkaService.sendMessage("kategori-topic", createdCategory);

        return createdCategory;
    }
}
