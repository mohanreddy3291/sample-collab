package com.example.springboot.service;


import com.example.springboot.entity.Patient;
import com.example.springboot.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepository;
    public Patient savePatient(Patient patient) {
        Patient savePatient = patientRepository.save(patient);
        return savePatient;
    }


}
