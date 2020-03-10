package com.cts.training;

import org.springframework.web.bind.annotation.GetMapping;

public class ServiceController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
