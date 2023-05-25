package com.example.springboot.service;

import com.example.springboot.entity.student;
import com.example.springboot.repo.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
    @Autowired
    private studentRepository studentRepository;
    public student saveStudent(student data){
        student savedStudent = studentRepository.save(data);
        return savedStudent;
    }
}
