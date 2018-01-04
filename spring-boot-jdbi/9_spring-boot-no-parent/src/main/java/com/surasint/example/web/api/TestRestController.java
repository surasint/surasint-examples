package com.surasint.example.web.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Value("${database.url}")
    private String sqlurl;

    @GetMapping("/api/show")
    public String show() {
        return sqlurl;
    }
}
