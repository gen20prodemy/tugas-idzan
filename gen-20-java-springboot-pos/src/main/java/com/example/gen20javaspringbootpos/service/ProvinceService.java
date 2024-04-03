package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CostDTO;
import com.example.gen20javaspringbootpos.dto.ProvinceDTO;
import com.example.gen20javaspringbootpos.util.MappingUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    public ProvinceDTO getAllDataDariApi(){
       String jsonResponse = restClient.get()
                .retrieve()
                .body(String.class);

       try {
           ObjectMapper objectMapper =MappingUtil.getObjectMapper();
           ProvinceDTO provinceDTO = objectMapper.readValue(jsonResponse , ProvinceDTO.class);
           return  provinceDTO;
       } catch (JsonProcessingException e) {
           e.printStackTrace();
           return  null;
       }
    }

    public ProvinceDTO getDataDariApibyId(int id){
        String url = "https://api.rajaongkir.com/starter/province?id=" + id;
        String jsonResponse =   restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);


        try {
            ObjectMapper objectMapper = MappingUtil.getObjectMapper();
            ProvinceDTO provinceDTO =objectMapper.readValue(jsonResponse, ProvinceDTO.class);

            return provinceDTO;
        } catch (JsonProcessingException e){
            e.printStackTrace();
            return  null;

        }
    }
}
