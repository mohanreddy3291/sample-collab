package com.example.springboot;


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


