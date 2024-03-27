package com.example.gen20javaservlet.data;

import com.example.gen20javaservlet.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataProduct {

    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        // Tambahkan data contoh ke dalam koleksi
        productList.add(new Product(1, "Laptop", 3000000,"Elektronik"));
        productList.add(new Product(2, "Smartphone", 1800000,"Elektronik"));
        productList.add(new Product(3, "Komputer", 5000000,"Elektronik"));
    }

    public static List<Product> getAllProducts() {
        return productList;
    }
}
