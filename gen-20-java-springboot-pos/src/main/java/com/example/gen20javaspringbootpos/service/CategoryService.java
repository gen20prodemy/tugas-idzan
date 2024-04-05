package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.entity.Category;
import com.example.gen20javaspringbootpos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private RedisTemplate<String, CategoryDTO> redisTemplate;

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(category -> new CategoryDTO(category.getCategoryId(), category.getName()))
                .collect(Collectors.toList());
    }

    public Optional<CategoryDTO> getCategoryById(Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        return categoryOptional.map(category -> new CategoryDTO(category.getCategoryId(), category.getName()));
    }

    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = new Category(categoryDTO.getName());
        category = categoryRepository.save(category);
        CategoryDTO categoryCreated = new CategoryDTO(category.getCategoryId(), category.getName());
        return categoryCreated;
    }

//    public CategoryDTO createCategoryAsync(CategoryDTO categoryDTO) throws InterruptedException {
//        Category category = new Category(categoryDTO.getName());
//        category = categoryRepository.save(category);
//        CategoryDTO categoryCreated = new CategoryDTO(category.getCategoryId(), category.getName());
//        Thread.sleep(15000);
//        System.out.println(categoryCreated);
//        return categoryCreated;
//    }



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
