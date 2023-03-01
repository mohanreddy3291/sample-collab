package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
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

	@GetMapping("/api/sum/{first}/{second}")
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

	//// Input ["Name -", "Class -", "Subject- "] - output - ["Name - xxcxcfdg", "Class - fdfg", "Subject- fsdg"]
	//2. Input [2, 4, 6, 8, 16] - output - [4, 8, 12, 16,32]
	// 3. Input [1,2,3,45,5,5,5,7,7,88] - output - 	Input [1,2,3,45,5,7,88]
	@PostMapping("/api/testTask")
	public List<String> testTask(@RequestBody List<String> inputData) {
		List<String> listToReturn = new ArrayList<>();
		for (String test : inputData) {
			if (test.equalsIgnoreCase("Name -")) {
				String data = test + "-testName";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("Class -")) {
				String data = test + "-testClass";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("Subject -")) {
				String data = test + "-testSubject";
				listToReturn.add(data);
			}

		}
		return listToReturn;
	}


	@PostMapping("/api/setExam")
	public List<Integer> setExample(@RequestBody List<Integer> inputData) {
		List<Integer> returnList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (Integer input : inputData) {
			set.add(input);
		}
		returnList.addAll(set);
		return returnList;
	}

	@PostMapping("/api/Example")
	public List<Integer> Example(@RequestBody List<Integer> inputData) {
		List<Integer> returnList = new ArrayList<>();
		for (Integer result : inputData) {
			result = result * 2;
			returnList.add(result);
		}
		return returnList;
	}

	//input - ["check", "account", "data", "deposit"] output - ["check01", "account02","data03", "deposit04"]
	//check if list is empty(any list)- output- Boolean(true/false)
	//take input of integers, divide each element by 2 and add 2 -output- list with answers
	@PostMapping("/api/Empty")
	public void Empty(@RequestBody List<String> inputData) {
		for (String i : inputData) {
			System.out.println(i.isEmpty());
		}
	}
	@PostMapping("/api/Bool")
	public void bool(@RequestBody List<String> inputData) {
		for (String a : inputData) {
			System.out.println(a);
		}
		if (inputData.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	@PostMapping("/api/Div&add")
	public List<Integer> Arth(@RequestBody List<Integer> inputData) {
		List<Integer> returnList = new ArrayList<>();
		for (Integer result : inputData) {
			result = (result / 2) + 2;
			returnList.add(result);
		}
		return returnList;
	}

	@PostMapping("/api/replicate")
	public List<String> rep(@RequestBody List<String> inputData) {
		List<String> returnList = new ArrayList<>();
		for (String i : inputData) {
			System.out.println(i);
			returnList.add(i);
		}
		return returnList;
	}

	@PostMapping("/api/rep")
	public List<String> rep1(@RequestBody List<String> inputData) {
		List<String> listToReturn = new ArrayList<>();
		for (String test : inputData) {
			if (test.equalsIgnoreCase("check -")) {
				String data = test + "-check01";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("account -")) {
				String data = test + "-account02";
				listToReturn.add(data);
			}
			if (test.equalsIgnoreCase("deposit -")) {
				String data = test + "-deposit";
			}
		}
		return listToReturn;
	}

	// pass list of numbers as input and store each number to a map. and print mapped values
// [1,2,3,5,8,3,72,83] - find the highest number from this list.
	@GetMapping("/api/mapE")
	public void mapE() {
		Map<String, String> testMap = new HashMap<>();
		testMap.put("A", "testA");
		testMap.put("B", "testB");
		testMap.put("C", "testC");
		testMap.put("D", "testD");
		testMap.put("E", "testE");
		testMap.put("F", "testF");

		System.out.println(testMap.get("A"));
		System.out.println(testMap.get("B"));
		System.out.println(testMap.get("C"));
		System.out.println(testMap.get("D"));
		System.out.println(testMap.get("E"));
		System.out.println(testMap.get("F"));

		Map<String, List<String>> studentMap = new HashMap<>();
		List<String> classAList = new ArrayList<>();
		classAList.add("Test1");
		classAList.add("Test2");
		classAList.add("Test3");
		classAList.add("Test4");
		studentMap.put("A", classAList);


	}
	@GetMapping("/api/aki")
	public void aki(){
		Map<Integer, List<String>> a = new HashMap<>();
		List<String> b = new ArrayList<>();
		b.add("12");
		b.add("13");
		b.add("14");
		a.put(1, b);
		System.out.println(a.get(1));


	}
	
}






