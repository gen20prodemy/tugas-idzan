package com.example.gen20javaservlet.controller;


import com.example.gen20javaservlet.data.DataProduct;
import com.example.gen20javaservlet.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {


    @GetMapping("/hello")
    public String welcome(){
        return  "index";
    }

    @GetMapping("/product")
    public String product(Model model){
        List<Product> productList = DataProduct.getAllProducts();
        model.addAttribute("productList", productList);
        return "product";
    }
}
