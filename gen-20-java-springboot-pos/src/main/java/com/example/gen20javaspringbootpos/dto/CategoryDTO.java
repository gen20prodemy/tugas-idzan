package com.example.gen20javaspringbootpos.dto;

public class CategoryDTO {

    private Long categoryId;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
