package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class AsyncController {
    @Autowired
    private AsyncService service;

    @PostMapping("async")
    public ResponseEntity<CategoryDTO> processSave(@RequestBody CategoryDTO category) throws InterruptedException{
        service.processSave(category);
        //async
        service.notifyUser(category);
        service.assignVendor(category);
        service.packaging(category);
        service.assignDeliveryPartner(category);
        service.assignTrailerAndDispatch(category);
        return ResponseEntity.ok(category);
    }
}
