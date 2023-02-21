package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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
							@RequestParam("number2") Integer number2) {
	Integer multiply = number1 * number2;
	return multiply;
}
@PostMapping("/api/collections")
	public void postData(@RequestBody List<Integer> inputData)
{
	for(Integer test:inputData)
	{
		System.out.println(test*2);
	}
}

}
