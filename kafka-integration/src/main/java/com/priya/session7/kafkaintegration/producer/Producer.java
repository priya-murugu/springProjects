package com.priya.session7.kafkaintegration.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void setMessage(String message)
    {
        kafkaTemplate.send("t.spring.training",message);
    }
}
