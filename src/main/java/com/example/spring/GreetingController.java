package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String HELLO_WORLD = "Hello World";

	@GetMapping("/")
	public String greeting() {
		return HELLO_WORLD;
	}
}
