package com.example.node.service;

import org.springframework.kafka.annotation.KafkaListener;

public interface Consumer {
    void receiveTextMessage(String text);
}
