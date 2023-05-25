package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.lang.String;
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
		for (Integer test2 : test1) {
			System.out.println(test2);
		}

		Set<Integer> test3 = new HashSet<>();
		test3.add(1);
		test3.add(2);
		test3.add(1);
		test3.add(1);
		for (Integer test4 : test3) {
			System.out.println(test4);
		}

	}

	@PostMapping("/api/information")
	public String information(@RequestBody List<String> input) {

		System.out.println(input);
		return input.toString();
	}

	@PostMapping("/api/task")
	public void task(@RequestBody List<Integer> data) {

		List<Integer> test1 = new ArrayList<>();
		test1.add(2);
		test1.add(4);
		test1.add(6);
		test1.add(8);
		test1.add(16);
		for (Integer test2 : test1) {
			System.out.println(test2 * 2);
		}

		Set<Integer> test3 = new HashSet<>();
		test3.add(1);
		test3.add(2);
		test3.add(3);
		test3.add(45);
		test3.add(5);
		test3.add(5);
		test3.add(5);
		test3.add(7);
		test3.add(7);
		test3.add(88);
		for (Integer test4 : test3) {
			System.out.println(test4);
		}

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

	@PostMapping("/api/Example")
	public List<Integer> Example(@RequestBody List<Integer> inputData) {
		List<Integer> List = new ArrayList<>();
		for (Integer input : inputData) {
			List.add((input / 2) + 2);
			System.out.println(List);
		}
		return List;

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


	@PostMapping("/api/map")
	public Map<String, Integer> map(@RequestBody List<Integer> numbers) {
		Map<String, Integer> map = new HashMap<>();

		for (Integer list : numbers) {
			map.put("A", list);
			System.out.println(map.get("A"));
		}
		return map;
	}
	@GetMapping("/api/mappe")
	public void mappe(){
		Map<String, List<Integer> > testMap = new HashMap<>();
		List<Integer> classA = new ArrayList<>();
		classA.add(1);
		classA.add(2);
		classA.add(3);
		testMap.put("A", classA);
		System.out.println(testMap.get("A"));

	}

	@PostMapping("/api/max")
	public int max(@RequestBody List<Integer> inputData) {
		int max_num= Integer.MIN_VALUE;

		for (Integer input : inputData) {
			if (max_num < input)
			{
				max_num = input;
			}
		}

		return max_num;
	}

}

// pass list of numbers as input and store each number to a map. and print mapped values
// [1,2,3,5,8,3,72,83] - find the highest number from this list.


