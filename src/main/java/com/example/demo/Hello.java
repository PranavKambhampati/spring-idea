package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //https://dzone.com/articles/the-springbootapplication-annotation-example-in-ja#
@RestController
public class Hello {

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

    @GetMapping("/hello")   // annotation for web url
    public String sayHello(@RequestParam(value = "greeting", defaultValue = "World") String greeting) {
        return String.format("Hello %s!", greeting);
    }
}
