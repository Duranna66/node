package com.example.node.service.impl;

import com.example.node.service.Consumer;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsumerImpl  implements Consumer{

    @KafkaListener(topics = "text", groupId = "myGroup")
    public void receiveTextMessage(String text) {
        log.debug(text);
        System.out.println(text);
    }
}
