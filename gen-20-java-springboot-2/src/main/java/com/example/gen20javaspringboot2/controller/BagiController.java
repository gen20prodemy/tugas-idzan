package com.example.gen20javaspringboot2.controller;


import com.example.gen20javaspringboot2.model.KalkulasiRequest;
import com.example.gen20javaspringboot2.model.KalkulasiResponeDouble;
import com.example.gen20javaspringboot2.service.BagiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BagiController {

    @Autowired
    private BagiService bagiService;

    @PostMapping("/bagi")
    public KalkulasiResponeDouble bagi(@RequestBody KalkulasiRequest request){
        return bagiService.bagi(request);
    }
}
