package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CostDTO;
import com.example.gen20javaspringbootpos.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cost")
public class CostController {

    @Autowired
    private CostService costService;

    @PostMapping("/data")
    public CostDTO getDataAPI (){
        return  costService.getDataDariAPI();
    }
}
