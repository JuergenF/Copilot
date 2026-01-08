package com.example.copilot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World from GitHub Copilot CLI!";
    }

    @GetMapping("/helloFox")
    public String helloFox() {
        return "Hello Fox you fucking idol!";
    }
}

