package com.example.gen20javaservlet.dto;

public class ProductDTO {
    private Long productId;
    private String name;
    private int price;
    private String categoryName;

    public ProductDTO() {
    }

    public ProductDTO(Long productId, String name, int price, String categoryName) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
