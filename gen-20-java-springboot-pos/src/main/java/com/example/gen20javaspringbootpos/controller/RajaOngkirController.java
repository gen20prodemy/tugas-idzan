package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CostDTO;
import com.example.gen20javaspringbootpos.dto.ProvinceDTO;
import com.example.gen20javaspringbootpos.service.CostService;
import com.example.gen20javaspringbootpos.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RajaOngkir")
public class RajaOngkirController {

    @Autowired
    private CostService costService;

    @Autowired
    private ProvinceService provinceService;

    @Scheduled(cron = "*/10 * * * * *")
    @GetMapping("/province/Alldata")
    public  ProvinceDTO getDataAPI(){
        return provinceService.getAllDataDariApi();
    }

    @GetMapping("/province/{id}")
    public ProvinceDTO getDataAPIbyId(@PathVariable int id){
        return provinceService.getDataDariApibyId(id);
    }
    @PostMapping(value = "/cost" , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public CostDTO getDataAPI (@RequestBody String requestBody){
        return  costService.getDataDariAPI(requestBody);
    }


}
