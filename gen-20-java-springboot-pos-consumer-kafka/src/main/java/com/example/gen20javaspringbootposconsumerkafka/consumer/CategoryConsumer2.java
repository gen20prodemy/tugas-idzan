package com.example.gen20javaspringbootposconsumerkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CategoryConsumer2 {

    @KafkaListener(topics = "kategori-topic", groupId = "group-2")
    public void listen(String message) {
        System.out.println("Pesan diterima consumer2 : " + message);

    }
}