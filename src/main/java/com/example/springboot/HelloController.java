package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/api/sum")
public Integer sum(@RequestParam("number1") Integer number1,
				   @RequestParam("number2") Integer number2)
{
	Integer sum = number1 + number2;
	return sum;
}
@GetMapping("/api/total/{first}/{second}")
public Integer total(@PathVariable("first") Integer first,
				   @PathVariable("second") Integer second)
{
	Integer total = first+second;
	return total;
}

@GetMapping("/api/multiply")
	public Integer multiply(@RequestParam("number1") Integer number1,
							@RequestParam("number2") Integer number2)
{
	Integer multiply = number1 * number2;
	return multiply;
}



}
