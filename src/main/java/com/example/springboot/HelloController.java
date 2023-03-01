package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/saveData")
	public  String saveData() {


		return "Greetings from the spring boot ....!!!";
	}

	@GetMapping("/")
	public String classOne() {

		return " Greetings from Kartheek";

	}

//	@GetMapping("/saveData")
//	public  String saveData() {
//		return "";
//	}


	@GetMapping("/api/sum/{number1}, {number2}")
	public String sum(@PathVariable ("number1")  Integer number1, @PathVariable("number2") Integer number2){
	return "number1 and number2";

	}



//	@GetMapping("api/multiply/{num}")
//
//
//	public Integer multiply(@PathVariable ("num") Integer num, @RequestParam("number") Integer number){
//
//		Integer mul = num * number;
//		return mul;
//	}

//	public Integer sum(@PathVariable("number1") Integer number1, @PathVariable("")){
//
//
//	}

	//localhost : 8082/api/multiply/2? number = 120

	@PostMapping("/api/setExample")

	public List<Integer> setExample(@RequestBody List<Integer> inputData)

	List<Integer> returnList = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	for (Integer input :inputData)
	{
		set.add(input);
	}

	returnList.addAll(set){
		return returnList;

	}
//	public List<Integer> getReturnList() {
//		return returnList;
//	}

	Map<String, String > map = new HashMap<>();
	map.put("A", "TEst");

	map.put("A", "TEst");2


}


