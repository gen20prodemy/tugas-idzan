package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CostDTO;
import com.example.gen20javaspringbootpos.util.MappingUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CostService {

    private  final WebClient webClient;

    public  CostService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.rajaongkir.com/starter")
                .defaultHeader("key","97481175d7a7bf2de415ed41468be29a" )
                .defaultHeader(HttpHeaders.CONTENT_TYPE , "application/x-www-form-urlencoded")
                .build();
    }

    public CostDTO getDataDariAPI(String request) {

        //String request = "origin=501&destination=114&weight=1700&courier=jne";

        String jsonResponse = webClient.post()
                .uri("/cost")
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        try {
            ObjectMapper objectMapper = MappingUtil.getObjectMapper();
            CostDTO costDTO =objectMapper.readValue(jsonResponse, CostDTO.class);

            return costDTO;
        } catch (JsonProcessingException e){
            e.printStackTrace();
            return  null;

        }

    }


}
