package com.example.gen20javaspringbootpos.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

public class MappingUtil {
    @Getter
    private  static  final ObjectMapper objectMapper = new ObjectMapper();
}
