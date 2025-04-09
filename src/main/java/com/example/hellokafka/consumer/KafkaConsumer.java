package com.example.hellokafka.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class KafkaConsumer {

    @Bean
    public Consumer<String> input() {
        return message -> {
            System.out.println("收到訊息: " + message);
        };
    }
}
