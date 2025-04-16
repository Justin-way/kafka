package com.example.hellokafka.controller;

import com.example.hellokafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer producer;

    @GetMapping("/send")
    public String send(@RequestParam String message) {
        producer.sendMessage(message);
        return "已發送: " + message;
    }

}
