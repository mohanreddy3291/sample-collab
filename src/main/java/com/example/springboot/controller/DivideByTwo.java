package com.example.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DivideByTwo {
    @PostMapping("/api/testDivideByTwo")

    public List<Integer> postData(@RequestBody List<Integer> inputData) {
        //List<Integer> myList = new ArrayList<>();
        List<Integer> returnList = new ArrayList<>();
        for(Integer test: inputData)
        {
            Integer data= (test/2) + 2;
            returnList.add(data);

        }
        return returnList;


    }
}
