package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/Alldata")
    public  String getDataAPI(){
        return provinceService.getAllDataDariApi();
    }

    @GetMapping("/{id}")
    public  String getDataAPIbyId(@PathVariable int id){
        return provinceService.getDataDariApibyId(id);
    }

}
