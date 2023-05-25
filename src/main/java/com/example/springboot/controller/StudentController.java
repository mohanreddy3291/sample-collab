package com.example.springboot.controller;



import com.example.springboot.Validator;
import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/api/saveStuDetails")
    public ResponseEntity<List<Student>> saveStuDetails(@RequestBody List<Student> studentList) {
        List<Student> response = null;
        boolean hasValidAddress = Validator.validateStudentAddress(studentList);
        if (hasValidAddress && Validator.validFirstAndLastNames(studentList)) {
            response = studentService.saveStudent(studentList);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }}