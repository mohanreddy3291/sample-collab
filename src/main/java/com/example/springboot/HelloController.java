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

	@GetMapping("/api/sum/{number1}/{number2}")
	public Integer sum(@PathVariable("number1")Integer  number1,@PathVariable("number2") Integer number2)
	{
		Integer sum = number1+ number2;
		return sum;
	}
	@GetMapping("/api/multiplication/{num1}/{num2}")
	public Integer multiplication(@PathVariable("num1") Integer num1 , @PathVariable("num2") Integer num2)
	{
		Integer multiplication = num1 * num2;
		return multiplication;

	}

	@GetMapping("/api/multiply")
	public Integer multiply(@RequestParam("frst") Integer frst, @RequestParam("scnd") Integer scnd)
	{
		Integer multiply = frst * scnd;
		return multiply;
	}
}
