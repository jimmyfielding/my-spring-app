package com.learning.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String greetingTemplate = "Hello, %s";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "message", defaultValue = "world") String message) {
        return new Greeting(String.format(greetingTemplate, message));
    }
}