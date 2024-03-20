package com.example.gen20javaspringboot2.controller;

import com.example.gen20javaspringboot2.model.KalkulasiRequest;
import com.example.gen20javaspringboot2.model.KalkulasiRespone;
import com.example.gen20javaspringboot2.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KurangController {

    @Autowired
    private KurangService kurangService;

    @PostMapping("/kurang")
    public KalkulasiRespone kurang(@RequestBody KalkulasiRequest request){
        return  kurangService.kurang(request);
    }

}
