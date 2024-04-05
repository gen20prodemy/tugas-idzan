package com.example.gen20javaspringbootpos.dto;

import lombok.Getter;

@Getter
public class CategoryDTO {

    private Long categoryId;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public CategoryDTO(String name) {
        this.name = name;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
