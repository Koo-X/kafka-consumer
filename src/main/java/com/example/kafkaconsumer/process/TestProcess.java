package com.example.kafkaconsumer.process;

import com.example.kafkaconsumer.config.KafkaBindings;
import kafka.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Created by ZJ on 2018/5/30.
 */
@Component
public class TestProcess {

    @Qualifier(KafkaBindings.TEST)
    @Autowired
    MessageChannel testOut;

    @StreamListener(target = KafkaBindings.TEST ,condition ="TestEvent")
    public void end(@Payload People people){
        System.out.println("接受到的信息：：：：：：：：：：：：：：：：：：："+people.getName());
    }
}
