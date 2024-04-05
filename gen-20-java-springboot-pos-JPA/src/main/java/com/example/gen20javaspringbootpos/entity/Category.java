package com.example.gen20javaspringbootpos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long categoryId;


    private String name;


    public Category() {
    }

    public Category(Long categoryId) {
        this.categoryId = categoryId;
    }


    public Category(String name) {
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
