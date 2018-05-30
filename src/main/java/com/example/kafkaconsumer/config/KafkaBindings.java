package com.example.kafkaconsumer.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by jalen on 17-6-20.
 */
public interface KafkaBindings {
    String TEST = "test";

    @Input(KafkaBindings.TEST)
    SubscribableChannel tsetIn();
}
