package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/saveData")
	public  String saveData() {


		return "";
	}

	@GetMapping("api/multiply/{num}")
	public Integer multiply(@PathVariable("num") Integer num, @RequestParam("number") Integer number){
		Integer mul=num*number;
		return mul;
	}
	/*@GetMapping("/api/multiply/{num1}/{num2}")
	public Integer mul(@PathVariable ("num1") Integer num1, @PathVariable ("num2") Integer num2){
		Integer mul=num1*num2;
		return mul;
	}*/

}
//public Integer sum(@PathVariable("number1") Integer number1, @PathVariable("number2") Integer number2) {
//localhost:8082/api/multiply/2?number=120