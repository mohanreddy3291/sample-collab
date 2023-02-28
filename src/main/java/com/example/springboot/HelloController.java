package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

	@PostMapping("/api/collections")
	public void postdata(@RequestBody List<Integer> inputData)
	{
		for(Integer test: inputData)
		{
			System.out.println(test);
		}
	}

	@PostMapping("/api/Bool")
	public boolean Bool(@RequestBody List<String> inputData) {
		List<String> list = new ArrayList<>();
		List list1 = inputData;
		if (list1.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@PostMapping("/api/Example")
	public List<Integer> Example(@RequestBody List<Integer> inputData) {
		List<Integer> List = new ArrayList<>();
		for (Integer input : inputData) {
			List.add((input / 2) + 2);
			System.out.println(List);
		}
		return List;

	}

	@PostMapping("/api/testTask")
	public List<String> testTask(@RequestBody List<String> inputData) {
		List<String> listToReturn = new ArrayList<>();
		for (String test : inputData) {
			if (test.equalsIgnoreCase("Check -")) {
				String data = "-Check01";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("account -")) {
				String data = "-account02";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("data -")) {
				String data = "-data03";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("deposit -")) {
				String data = "-deposit04";
				listToReturn.add(data);
			}

		}
		return listToReturn;
	}
}


