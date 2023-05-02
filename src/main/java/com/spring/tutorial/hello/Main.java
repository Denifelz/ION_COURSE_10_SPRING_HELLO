package com.spring.tutorial.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("")
    private String sayHelloToEveryone() {
        return "Hello everybody";
    }

    @RequestMapping("/{name}")
    private String sayHelloTo(@PathVariable String name) {
        return "Hello " + name;
    }
}
