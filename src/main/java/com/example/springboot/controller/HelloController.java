package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HelloController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/saveData")
	public String saveData() {


		return "";
	}

	@GetMapping("api/sum/{first}/{second}")
	public Integer sum(@PathVariable("first") Integer first, @PathVariable("second") Integer second) {
		return customerService.sum(first, second);
	}


	@GetMapping("/api/sum")
	public Integer sumWithRequest(@RequestParam("number1") Integer number1, @RequestParam("number2") Integer number2) {

		return customerService.sum(number1, number2);
	}

	// localhost:8082/api/multiply/2?number=120  =expectedResult = 240 - use only reuest Param


	@PostMapping("/api/collection")
	public void postData(@RequestBody List<Integer> inputData) {
		for (Integer test : inputData) {
			System.out.println(test);

		}
	}

	@PostMapping("/test/task")
	public void postData(@RequestBody Vector<String> inputData) {
		for (String t : inputData) {
			System.out.println(t);
		}
		if (inputData.isEmpty())
			System.out.println("True");
		else
			System.out.println("false");
	}

	@PostMapping("/operation")
	public void numbers(@RequestBody List<Integer> inputData) {
		for (Integer n : inputData) {
			Integer result = n / 2 + 2;
			System.out.println(result);
		}


	}




	@PostMapping("/map")
	public void map(@RequestBody List<Integer> numbers) {
		Map<Integer, Integer> Map = new HashMap<>();
		for (int number : numbers) {
			Map.put(number, number * 2);
		}
		System.out.println(Map);
	}





	@GetMapping("/max")
	public Integer max() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 8, 3, 72, 83);
		return Collections.max(numbers);
	}
}









