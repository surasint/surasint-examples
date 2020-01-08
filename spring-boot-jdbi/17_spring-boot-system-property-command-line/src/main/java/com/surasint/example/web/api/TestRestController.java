package com.surasint.example.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    private static int i;

    @GetMapping("/api/test")
    public String test() {
        return System.getProperty("my_system_properties");
    }
}
