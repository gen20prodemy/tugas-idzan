package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, CategoryDTO> redisTemplate;

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDTO createCategoryRedis(CategoryDTO categoryDTO) {
        String redisKey = "category:" + categoryDTO.getCategoryId();
        redisTemplate.opsForValue().set(redisKey, categoryDTO);

        return categoryDTO;
    }

    public List<CategoryDTO> getCategoryRedis() {
        List<CategoryDTO> categories = new ArrayList<>();

        // Ambil semua kunci Redis untuk kategori
        Set<String> keys = redisTemplate.keys("category:*");

        // Iterasi setiap kunci dan ambil nilainya dari Redis
        for (String key : keys) {
            CategoryDTO category = redisTemplate.opsForValue().get(key);
            categories.add(category);
        }

        System.out.println("Data kategori berhasil diambil dari Redis ");

        return categories;
    }
}
