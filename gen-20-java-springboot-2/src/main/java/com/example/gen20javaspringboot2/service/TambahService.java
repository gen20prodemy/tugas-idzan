package com.example.gen20javaspringboot2.service;

import com.example.gen20javaspringboot2.model.KalkulasiRequest;
import com.example.gen20javaspringboot2.model.KalkulasiRespone;
import org.springframework.stereotype.Service;

@Service
public class TambahService {

    public KalkulasiRespone tambah(KalkulasiRequest request){
        int hasil =request.getAngka1() + request.getAngka2();
        return new KalkulasiRespone(hasil);
    }

}
