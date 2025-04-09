package com.example.hellokafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/api")
    public String getTest(){
        return "test";
    }
}
