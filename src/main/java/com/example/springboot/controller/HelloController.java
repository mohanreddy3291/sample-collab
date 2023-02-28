package com.example.springboot.controller;
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

	@GetMapping("/api/sum/{first}/{second}")
	public Integer sum(@PathVariable("first") Integer first, @PathVariable("second") Integer second) {
		return first + second;
	}


	@GetMapping("/api/sum")
	public Integer sumWithRequest(@RequestParam("number1") Integer number1, @RequestParam("number2") Integer number2) {
		return number1 + number2;
	}

	// localhost:8082/api/multiply/2?number=120  =expectedResult = 240 - use only reuest Param


	@PostMapping("/api/collection")
	public void postData(@RequestBody List<Integer> inputData) {
		//this is test committed file

		List<Integer> testList = new ArrayList<>();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(3);
		testList.add(4);
		for (Integer test : testList) {
			System.out.println(test);
		}

		Set<Integer> testSet = new HashSet<>();
		testSet.add(1);
		testSet.add(1);
		testSet.add(3);
		testSet.add(54);
		testSet.add(2);
		testSet.add(3);
		testSet.add(2);

		for (Integer testSEtt : testSet) {
			System.out.println(testSEtt);
		}
	}

	@PostMapping("/api/postBody")
	public String postBody(@RequestBody String input, @RequestParam("number1") String number1) {
		System.out.println(input);
		return number1;
	}

	//1. Input ["Name -", "Class -", "Subject- "] - output - ["Name - xxcxcfdg", "Class - fdfg", "Subject- fsdg"]
	@PostMapping("/api/testTask")
	public List<String> testTask(@RequestBody List<String> inputData) {
		List<String> listToReturn = new ArrayList<>();
		for (String test: inputData) {
			if (test.equalsIgnoreCase("Name -")) {
				String data = test + "-Kundana";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("Class -")) {
				String data = test + "-Java";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("Subject -")) {
				String data = test + "-Spring";
				listToReturn.add(data);
			}

		}
		return listToReturn;
	}

	//2. Input [2, 4, 6, 8, 16] - output - [4, 8, 12, 16,32]
	@PostMapping("/api/postTask2")
	public List<Integer> postTask2(@RequestBody List<Integer> inputData)
	{
		List<Integer> returnList = new ArrayList<>();
		for (Integer test : inputData) {
			returnList.add(test*2);
		}
		return returnList;
	}

// 3. Input [1,2,3,45,5,5,5,7,7,88] - output - 	Input [1,2,3,45,5,7,88]

	@PostMapping("/api/postTask3")
	public List<Integer> postTask3(@RequestBody List<Integer> inputData){
		List<Integer> returnList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(Integer input : inputData){
			set.add(input);
		}
		returnList.addAll(set);
		return returnList;
	}

// input - ["check", "account", "data", "deposit"]  output - ["check01", "account02","data03", "deposit04"]

	@PostMapping("/api/testTask1")
	public List<String> testTask1(@RequestBody List<String> inputData) {
		List<String> listToReturn = new ArrayList<>();
		for (String test: inputData) {
			if (test.equalsIgnoreCase("check")) {
				String data = test + "-check01";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("account")) {
				String data = test + "-account02";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("data")) {
				String data = test + "-data03";
				listToReturn.add(data);
			}
			if(test.equalsIgnoreCase("deposit")){
				String data = test + "-deposit04";
				listToReturn.add(data);
			}

		}
		return listToReturn;
	}

	//  check if list is empty(any list) - output - boolean (true/false)

	@PostMapping("/api/testTask2")
	public boolean testTask2(@RequestBody List<Integer> inputData){
		List<Boolean> test = new ArrayList<>();
		List test1 = inputData;
		if (test1.isEmpty()){
			return false;
		}
		else {
			return true;
		}
	}

// take input of integers, divide each elements by 2 and add 2 - output - List with answers
@PostMapping("/api/testTask3")
	public List<Integer> testTask3(@RequestBody List<Integer> inputData){
		List<Integer> test2 = new ArrayList<>();
		for(Integer test3: inputData){
			test2.add((test3/2)+2);
		}


		return test2;
}
}








