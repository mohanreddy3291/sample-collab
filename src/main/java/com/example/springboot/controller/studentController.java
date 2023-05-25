package com.example.springboot.controller;

import com.example.springboot.entity.student;
import com.example.springboot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @Autowired
    private studentService studentService;
    @PostMapping("/api/saveStudentDetails")
    public student saveStudentDetails(@RequestBody student inputData){

        return studentService.saveStudent(inputData);
    }
}
