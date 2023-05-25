package com.example.springboot.service;

import com.example.springboot.entity.Student;
import com.example.springboot.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{
    @Autowired
    private StudentRepository studentRepository;

        public List<Student> saveStudent(List<Student> studentList) {
            List<Student> returnStudent = new ArrayList<>();
            for (Student student1 : studentList) {
                Student saveStudent = studentRepository.save(student1);
                returnStudent.add(saveStudent);
            }


            return returnStudent;
        }


}

