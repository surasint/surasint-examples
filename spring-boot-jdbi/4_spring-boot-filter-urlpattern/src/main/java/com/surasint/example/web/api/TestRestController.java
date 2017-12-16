package com.surasint.example.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    private static int i;

    @GetMapping("/api/count")
    public Integer count() {
        return i++;
    }

    @GetMapping("/api/count2")
    public Integer count2() {
        return i++;
    }
}
