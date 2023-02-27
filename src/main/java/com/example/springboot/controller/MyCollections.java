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
}


