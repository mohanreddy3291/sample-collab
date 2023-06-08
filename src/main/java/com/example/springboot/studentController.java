package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @Autowired
    private studentService studentService;


    @PostMapping("/api/saveStudentDetails")
    public student savePatientDetails(@RequestBody student data)
    {
        return studentService.saveStudent(data);
    }
}

