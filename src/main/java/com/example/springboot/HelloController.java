package com.example.springboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.*;
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

	@GetMapping("/api/multiply/{number1}")

	public Integer multiply(@PathVariable("number1") Integer number1) {

		Integer multiply = number1 * 3;

		return multiply;
	}
	// localhost:8082/api/multiply/2?number=120  =expectedResult = 240 - use only reuest Param


	@PostMapping("/api/collection")
	public void postData(@RequestBody List<Integer> inputData) {
		//this is test committed file

		//List<Integer> testList = new ArrayList<>();
		/*testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(3);
		testList.add(4);*/
		for (Integer test : inputData) {
			System.out.println(test);
		}

		/*Set<Integer> testSet = new HashSet<>();
		testSet.add(1);
		testSet.add(1);
		testSet.add(3);
		testSet.add(54);
		testSet.add(2);
		testSet.add(3);
		testSet.add(2);

		for (Integer testSEtt: testSet) {
			System.out.println(testSEtt);
		}*/

//		1. // Input ["Name -", "Class -", "Subject- "] - output - ["Name - xxcxcfdg", "Class - fdfg", "Subject- fsdg"]
		//2. Input [2, 4, 6, 8, 16] - output - [4, 8, 12, 16,32]
		// 3. Input [1,2,3,45,5,5,5,7,7,88] - output - 	Input [1,2,3,45,5,7,88]

	}

	@PostMapping("/api/Task")
	public List<String> Task(@RequestBody List<String> inputData) {
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

	@PostMapping("/api/setExample")
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
			System.out.println(result);
			returnList.add(result);
		}
		return returnList;
	}

	// input - ["check", "account", "data", "deposit"]  output - ["check01", "account02","data03", "deposit04"]
	//check if list is empty(any list)- output- Boolean(true/false)
	//take input of integers, divide each element by 2 and add 2 -output- list with answers
	@PostMapping("/api/Empty")
	public void Empty(@RequestBody List<String> inputData) {
		for (String i : inputData) {
			System.out.println(i.isEmpty());
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
				String data = test + "-deposit03";
				listToReturn.add(data);
			}

		}
		return listToReturn;
	}

	//pass list of numbers as input and store each number to a map and print mapped values
	//[1,3,4,5,76,44] - find the highest number from this list
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
		System.out.println(studentMap.get("A"));


	}

	@GetMapping("/api/map1")
	public void map1() {
		Map<String, List<Integer>> studentMap = new HashMap<>();
		List<Integer> classAList = new ArrayList<>();
		classAList.add(23);
		classAList.add(45);
		classAList.add(435);
		classAList.add(339);
		studentMap.put("A", classAList);
		studentMap.put("B", classAList);
		System.out.println(studentMap.get("A"));
		System.out.println(studentMap.get("B"));
	}

	@PostMapping("/api/high")
	public Integer highest(@RequestBody List<Integer> inputData) {

		Integer b = 0;
		for (Integer a : inputData) {
			if (a > b)
				b = a;
		}
		System.out.println("The Max value is " + b);

		return b;
	}
}






