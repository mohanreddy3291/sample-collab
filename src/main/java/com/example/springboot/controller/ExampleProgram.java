package com.example.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExampleProgram {
    @PostMapping("/api/testExampleProgram")

    public boolean postData(@RequestBody List<Integer> inputData) {
        //List<String> myList = new ArrayList<>();
        if(inputData.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
