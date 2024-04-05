package com.example.gen20javaspringbootposconsumerkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CategoryConsumer {

    @KafkaListener(topics = "kategori-topic", groupId = "group-1")
    public void listen(String message) {
        System.out.println("Pesan diterima consumer1 : " + message);

    }
}
