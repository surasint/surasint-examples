package com.surasint.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class TestController {

	@GetMapping("/testjsp")
	public String list(Map<String, Object> model) {
		return "testjsp-view";
	}


}
