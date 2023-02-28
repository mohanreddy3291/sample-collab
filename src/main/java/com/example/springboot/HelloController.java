package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/saveData")
	public String saveData() {


		return "";
	}
//input -
	@PostMapping("/api/Bool")
	public void bool(@RequestBody List<String> inputData) {
		for( String a : inputData) {
			if (a.isEmpty()) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

	}
}
