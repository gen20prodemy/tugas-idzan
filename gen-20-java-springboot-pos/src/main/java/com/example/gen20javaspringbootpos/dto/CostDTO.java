package com.example.gen20javaspringbootpos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CostDTO {

    private  RajaOngkir rajaongkir;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class RajaOngkir{

    @JsonProperty("origin_details")
    private  OriginDetails originDetails;

    @JsonProperty("destination_details")
    private  DestinationDetails destinationDetails;

    private  List<Result> results;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class OriginDetails {
    @JsonProperty("city_name")
    private String cityName;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class  DestinationDetails {
    @JsonProperty("city_name")
    private  String cityName;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class Result {
    private String name;
    private List<ServiceInfo> costs;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ServiceInfo {
    private String service;
    private String description;
    private List<Cost> cost;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class Cost {
    private int value;
    private String etd;

}