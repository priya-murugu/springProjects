package com.priya.session7.kafkaintegration;

import com.priya.session7.kafkaintegration.Consumer.Consumer;
import com.priya.session7.kafkaintegration.producer.Producer;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.concurrent.TimeUnit;

@SpringBootTest
@DirtiesContext
public class KafkaTest {
    @Autowired
    Producer producer;

    @Autowired
    Consumer consumer;
@Test
    public void shouldSendReceiveMessage() throws InterruptedException {
        producer.setMessage("I am testing");
        consumer.getCountDownLatch().await(10, TimeUnit.SECONDS);
        Assertions.assertThat(consumer.getCountDownLatch().getCount()).isEqualTo(0);
    }
}
