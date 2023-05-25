package com.example.springboot.service;

import com.example.springboot.entity.student;
import com.example.springboot.repository.studentRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    private studentRepository studentRepository;
    public student saveStudent(student data) {
        student saveStudent = studentRepository.save(data);
        return saveStudent;
    }
}