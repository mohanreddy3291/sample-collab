package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
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
		for (Integer test : inputData) {
			System.out.println(test);

		}
	}

	@PostMapping("api/task")
	public void postData(@RequestBody Stack<String> inputData) {

		for (String i : inputData) {
			System.out.println(i.toCharArray());
			//System.out.println(i.isEmpty());
			//ArrayList<String> ar=new ArrayList<>(inputData);
		}
		if (inputData.isEmpty())
			System.out.println("True");
		else
			System.out.println("False");
	}
		/*if (inputData.isEmpty())
			System.out.println("True");
		 else
			System.out.println("False");

		 */

	/*System.out.println("The List Before Remove operation:");
	System.out.println(inputData);
	System.out.println(inputData.remove(0));
	System.out.println("The list after remove operation:");
	System.out.println(inputData);*/
	@PostMapping("api/task2")
	public void postData(@RequestBody Vector<Integer> inputData) {

		String a, b;
		for (int i = 0; i < inputData.size(); i++) {
			int s = inputData.get(i);
			System.out.println("The list Before operation:" + s);
			Integer result = s / 2 + 2;
			System.out.println("The List After Operation:" + result.toString());
			System.out.println(result.toString());
		}

	}

	@GetMapping("api/Mapping")
	public void TestMap() {
		Map<Integer, List<String>> map1 = new HashMap<>();
		List<String> l = new Vector<>();
		l.add("suman");
		l.add("vineeth");
		l.add("sai");
		l.add("raj");
		l.add("nagesh");
		map1.put(1, l);
		System.out.println(map1.get(1));
	}

	@GetMapping("/task/Highest")
	public void high() {
		List<Integer> ll = new Vector<>();
		List<Integer> lll = new Vector<>();
		ll.add(7);
		ll.add(4);
		ll.add(1);
		ll.add(5);
		ll.add(9);

		lll.add(3);
		lll.add(5);
		lll.add(6);
		lll.add(1);
		lll.add(99);
		//System.out.println(m.get(1));
		ll.addAll(lll);
		Integer max = Collections.max(ll);
		System.out.println("Highest Element is:" + max);
		System.out.println();
	}

	//another way of finding the highest value using single list
	@GetMapping("task1/high")
	public void big() {
		List<Integer> list = Arrays.asList(1, 5, 8, 99, 100);
		System.out.println(list);
		Integer max = Collections.max(list);
		System.out.println("The Highest Value is:" + max);
	}

	@PostMapping("task3/operation")
	public void task(@RequestBody List<Integer> input) {
		Map<String, Integer> m = new HashMap<>();
		Integer max = Collections.max(input);
		System.out.println("The List is:" + input);
		m.put("a", max);
		System.out.println();
		System.out.println("The Highest Value is :" + m.get("a"));
	}

@PostMapping("task4/Exception")
	public void Exception(@RequestBody Integer input)
{
	customerService.Exception(input);

}

		}








