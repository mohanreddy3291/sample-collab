package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @PostMapping("/laptop")
    public void a(@RequestBody List<String> input) {
        for (String b : input) {
            System.out.println(b);

        }
        if (input.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
    }

    @PostMapping("/Bag")
    public List<Integer> c(@RequestBody List<Integer> input1) {
        List<Integer> e = new ArrayList<>();
        for (Integer d : input1) {
            e.add((d/2) + 2);
        }
        return e;
    }

    @PostMapping("/testTask")
    public List<String> testTask(@RequestBody List<String> inputData) {
        List<String> listToReturn = new ArrayList<>();
        for (String test : inputData) {
            if (test.equalsIgnoreCase("Name -")) {
                String data =  "-Name01";
                listToReturn.add(data);
            }
            if (test.equalsIgnoreCase("Class -")) {
                String data =  "-Class02";
                listToReturn.add(data);
            }
            if (test.equalsIgnoreCase("Subject -")) {
                String data =  "-Subject03";
                listToReturn.add(data);
            }

        }


        return listToReturn;
    }
}

