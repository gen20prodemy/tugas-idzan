package com.example.gen20javaservlet.controller;
import com.example.gen20javaservlet.dto.ProductDTO;
import com.example.gen20javaservlet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    private ProductService productService;

    @GetMapping("/hello")
    public String welcome(){
        return  "index";
    }

    @GetMapping("/product")
    public String showAllProducts(Model model){
        List<ProductDTO> productDTOS = productService.getAllproducts();
        model.addAttribute("products", productDTOS);
        return "product";
    }
}
