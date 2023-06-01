package com.example.springboot.service;

import com.example.springboot.entity.doctor;
import com.example.springboot.repository.doctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class doctorService {
    @Autowired
    private static doctorRepo doctorRepo;
    public static List<doctor> saveDoctor(List<doctor> doctorList) {
        List<doctor> returnDoctor = new ArrayList<>();
        for (doctor doctor1: doctorList) {
            doctor saveDoctor = doctorRepo.save(doctor1);
            returnDoctor.add(saveDoctor);
        }


        return returnDoctor;
    }
}
