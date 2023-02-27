package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
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
	/*public void postData(@RequestBody List<Integer> inputData) {

		List<Integer> demo = new ArrayList<>();
		demo.add(2);
		demo.add(4);
		demo.add(6);
		demo.add(8);
		for (Integer demo1 : demo) {
			System.out.println(demo1 * 2);

		}

	}*/

	/*public void postData(@RequestBody Set<Integer> inputData) {
		Set<Integer> demo2 = new HashSet<>();
		demo2.add(1);
		demo2.add(2);
		demo2.add(3);
		demo2.add(45);
		demo2.add(5);
		demo2.add(5);
		demo2.add(5);
		demo2.add(7);
		demo2.add(7);
		demo2.add(88);
		for (Integer demo11 : demo2) {
			System.out.println(demo11);

		}

	}*/
	public void postData(@RequestBody List<Integer> inputData) {

		List<String> demo = new ArrayList<>();
		demo.add("Name - ");
		demo.add("Class - ");
		demo.add("Subject - ");
		String str1[] = new String[demo.size()];

			str1[0] = demo.get(0) + " " + "Neethi";
			str1[1] = demo.get(1) + " " + "abc";
			str1[2] = demo.get(2) + " " + "ggy";

			for(String st:str1){
				System.out.println(st);
			}


	}
}
