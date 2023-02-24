package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	@GetMapping("/api/sum/{number1}/{number2}")
	public Integer sum(@PathVariable("number1") Integer number1, @PathVariable("number2") Integer number2) {

		Integer sum = number1 + number2;
		return sum;
	}

	@GetMapping("/api/multiplication/{num1}/{num2}")
	public Integer multiplication(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		Integer multiplication = num1 * num2;
		return multiplication;
	}

	@GetMapping("/api/multiply")
	public Integer multiply(@RequestParam("first") Integer first,
							@RequestParam("second") Integer second) {
		Integer multiply = first * second;
		return multiply;
	}

	@PostMapping("/api/collection")
	public void postData(@RequestBody List<Integer> inputData) {
		for (Integer test : inputData) {
			System.out.println(test * 2);
		}
	}

	@PostMapping("/api/postBody/{first}")
	public String postBody(@RequestBody String input, @PathVariable("first") Integer first, @RequestParam("number1") Integer number1) {
		System.out.println(input);
		return first + "   " + number1;
	}

	@PostMapping("/api/postBody")
	public Boolean postBody(@RequestBody List<Integer> inputData, @RequestParam("first") Boolean first) {
		for (Integer test : inputData) {
			System.out.println(test);
		}
		return first;

	}

	@PostMapping("/api/collect")
	public void collect(@RequestBody List<Integer> data) {
		List<Integer> test1 = new ArrayList<>();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(1);
		for(Integer test2:test1){
			System.out.println(test2);
		}

		Set<Integer> test3 = new HashSet<>();
		test3.add(1);
		test3.add(2);
		test3.add(1);
		test3.add(1);
		for(Integer test4: test3)
		{
			System.out.println(test4);
		}

	}

}


