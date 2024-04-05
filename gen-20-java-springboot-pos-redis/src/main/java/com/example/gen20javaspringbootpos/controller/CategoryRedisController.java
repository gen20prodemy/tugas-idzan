package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryRedisController {

@Autowired
private RedisService redisService;


    @GetMapping("/redis")
    public List<CategoryDTO> getAllCategoriesFromRedis() {
        return redisService.getCategoryRedis();
    }

    @PostMapping("/redis")
    public CategoryDTO addCategoryToRedis(@RequestBody CategoryDTO categoryDTO) {
        return redisService.createCategoryRedis(categoryDTO);
    }
}
