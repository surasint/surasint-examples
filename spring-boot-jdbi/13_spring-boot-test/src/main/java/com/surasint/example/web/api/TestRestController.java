package com.surasint.example.web.api;

import com.surasint.example.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private CountService countService;

    @GetMapping("/api/count")
    public String showCount() {
        return "Count result:"+countService.count();
    }
}
