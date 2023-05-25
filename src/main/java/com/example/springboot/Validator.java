package com.example.springboot;

import com.example.springboot.entity.Student;

import java.util.List;

public class Validator
{
    public static boolean validateStudentAddress(List<Student> studentList) {
        boolean hasValidAddress = true;
        for (Student student: studentList) {
            if (student.getAddress() == null && student.getFirst_Name() == null || student.getLast_Name() == null) {
                hasValidAddress = false;
                break;
            }
        }
        return hasValidAddress;

    }

    public static boolean validFirstAndLastNames(List<Student> studentList) {
        boolean hasValidNames = true;
        for (Student student: studentList) {
            if (student.getFirst_Name() == null || student.getLast_Name() == null) {
                hasValidNames = false;
                break;
            }
        }
        return hasValidNames;

    }

}
