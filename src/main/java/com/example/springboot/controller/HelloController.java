package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class HelloController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/saveData")
	public  String saveData() {


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
		for (Integer test: testList) {
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

		for (Integer testSEtt: testSet) {
			System.out.println(testSEtt);
		}

//		1. // Input ["Name -", "Class -", "Subject- "] - output - ["Name - xxcxcfdg", "Class - fdfg", "Subject- fsdg"]
		//2. Input [2, 4, 6, 8, 16] - output - [4, 8, 12, 16,32]
		// 3. Input [1,2,3,45,5,5,5,7,7,88] - output - 	Input [1,2,3,45,5,7,88]






	}




}
