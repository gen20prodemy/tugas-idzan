package com.example.gen20javaspringbootpos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class ProvinceDTO {
    private RajaOngkirProvince rajaongkir;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class RajaOngkirProvince {
    private Object  results;
}

