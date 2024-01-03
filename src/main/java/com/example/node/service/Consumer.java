package com.example.node.service;

import org.springframework.kafka.annotation.KafkaListener;

public interface Consumer {
    @KafkaListener(id = "Id-1", topics = "topic1")
    void receiveTextMessage(String text);
}
