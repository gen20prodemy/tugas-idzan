package com.example.gen20javaspringboot2.service;

import com.example.gen20javaspringboot2.model.KalkulasiRequest;
import com.example.gen20javaspringboot2.model.KalkulasiRespone;
import com.example.gen20javaspringboot2.model.KalkulasiResponeDouble;
import org.springframework.stereotype.Service;

@Service
public class BagiService {

    public KalkulasiResponeDouble bagi(KalkulasiRequest request){
        if (request.getAngka2() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double hasil = (double) request.getAngka1() / request.getAngka2();
        return new KalkulasiResponeDouble(hasil);
    }

}
