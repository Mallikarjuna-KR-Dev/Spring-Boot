package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

    @GetMapping("/hello")
    public String helloPath() {
        return "Hello from /hello endpoint!";
    }
}

