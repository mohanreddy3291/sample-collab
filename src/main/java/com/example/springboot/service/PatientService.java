package com.example.springboot.service;


import com.example.springboot.entity.Patient;
import com.example.springboot.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> savePatient(List<Patient> patientList) {
        List<Patient> returnPatient = new ArrayList<>();
        for (Patient patient1: patientList) {
            Patient savePatient = patientRepository.save(patient1);
            returnPatient.add(savePatient);
        }


        return returnPatient;
    }


}
