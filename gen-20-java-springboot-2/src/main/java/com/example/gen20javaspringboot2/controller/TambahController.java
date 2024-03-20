package com.example.gen20javaspringboot2.controller;

import com.example.gen20javaspringboot2.model.KalkulasiRequest;
import com.example.gen20javaspringboot2.model.KalkulasiRespone;
import com.example.gen20javaspringboot2.service.TambahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TambahController {

    @Autowired
    private TambahService tambahService;

    @PostMapping("/tambah")
    public KalkulasiRespone tambah(@RequestBody KalkulasiRequest request) {
        return  tambahService.tambah(request);
    }

}

