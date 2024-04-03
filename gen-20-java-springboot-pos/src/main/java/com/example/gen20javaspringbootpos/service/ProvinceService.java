package com.example.gen20javaspringbootpos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ProvinceService {

    private final RestClient restClient;

    public  ProvinceService(){
        restClient = RestClient.builder()
                .baseUrl("https://api.rajaongkir.com/starter/province")
                .defaultHeader("key","97481175d7a7bf2de415ed41468be29a" )
                .build();
    }

    public String getAllDataDariApi(){
        return  restClient.get()
                .retrieve()
                .body(String.class);
    }

    public String getDataDariApibyId(int id){
        String url = "https://api.rajaongkir.com/starter/province?id=" + id;
        return  restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);
    }
}
