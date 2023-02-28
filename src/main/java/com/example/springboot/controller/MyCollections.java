package com.example.springboot.controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyCollections {


    @PostMapping("/api/testTask1")
    public boolean testTask(@RequestBody List<Integer> inputData) {

        if (inputData.isEmpty()) {

            return false;

        }
        else {
            return true;
        }

    }

    @PostMapping("/api/new")
    public List<String> myTask(@RequestBody List<String> inputData) {
        List<String> op = new ArrayList<>();
        for (String test: inputData) {
            if (test.equalsIgnoreCase("Check")) {
                String data = test + "01";
                op.add(data);
            }
            if (test.equalsIgnoreCase("Amount")) {
                String data = test + "02";
                op.add(data);
            }
            if (test.equalsIgnoreCase("Data")) {
                String data = test + "03";
                op.add(data);
            }
            if (test.equalsIgnoreCase("Deposit")) {
                String data = test + "04";
                op.add(data);
            }

        }
        return op;
    }


    @PostMapping("/api/new2")
    public List<Integer> myTask1(@RequestBody List<Integer> inputData) {
        List<Integer> op = new ArrayList<>();
        for (Integer test: inputData) {
            Integer s = test/2 +2;
            op.add(s);

        }
        return op;
    }
}

