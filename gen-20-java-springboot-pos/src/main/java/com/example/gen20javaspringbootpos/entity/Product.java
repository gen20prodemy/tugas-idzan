package com.example.gen20javaspringbootpos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Column(name = "product_id")
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String name;
    private  int price;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    public Product() {

    }

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
