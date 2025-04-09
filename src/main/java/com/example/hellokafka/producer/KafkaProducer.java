package com.example.hellokafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.function.StreamBridge;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private StreamBridge streamBridge;


    public void sendMessage(String message) {
        Message<String> msg = MessageBuilder.withPayload(message).build();
        streamBridge.send("output-out-0", msg);
    }
}
