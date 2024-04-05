package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private  KafkaTemplate<String, Object> kafkaTemplate;


    public void sendMessage(String topic, CategoryDTO message) {
        kafkaTemplate.send(topic, message);
    }
}
