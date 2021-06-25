package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/healthCheck")
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck() {
        return "healthy";
    }
    @GetMapping("/healthCheck1")
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck1() {
        return "healthy123132";
    }

    @GetMapping("/healthCheck2")
    @ResponseStatus(HttpStatus.OK)
    public String healthCheck2() {
        return "healthyaadsasdasdads";
    }
}
