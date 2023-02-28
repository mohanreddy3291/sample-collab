package com.example.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppendExample {
    @PostMapping("/api/testAppendExample")

    public List<String> postData(@RequestBody List<String> inputData) {
        List<String> listToReturn = new ArrayList<>();
        for (String test: inputData) {
            if (test.equalsIgnoreCase("check")) {
                String data = test + "01";
                listToReturn.add(data);
            }
            if (test.equalsIgnoreCase("account")) {
                String data = test + "02";
                listToReturn.add(data);
            }
            if (test.equalsIgnoreCase("data")) {
                String data = test + "03";
                listToReturn.add(data);
            }
            if (test.equalsIgnoreCase("deposit")) {
                String data = test + "04";
                listToReturn.add(data);
            }
        }
        return listToReturn;
    }
    }

