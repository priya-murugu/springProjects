package com.priya.session7.kafkaintegration.Consumer;

import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class Consumer {

    CountDownLatch countDownLatch = new CountDownLatch(1);

    @KafkaListener(topics = "t.spring.training")
    public void receiveMessage(String message)
    {
        System.out.println("message received" + message);
        countDownLatch.countDown();
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }
}
