package com.example.springboot.controller;


import com.example.springboot.entity.Patient;
import com.example.springboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {


    @Autowired
    private PatientService patientService;


    @PostMapping("/api/savePatientDetails")
    public Patient savePatientDetails(@RequestBody Patient patient) {
       return patientService.savePatient(patient);
    }




}
