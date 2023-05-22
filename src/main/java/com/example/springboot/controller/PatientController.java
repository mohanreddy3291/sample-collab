package com.example.springboot.controller;


import com.example.springboot.entity.Patient;
import com.example.springboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {


    @Autowired
    private PatientService patientService;

    // save patient details which has address only..
    // validate if first name and last name is given in the request
    // check if every patient has age greater than 25
    // Return ResponseEntity with body -- google it....

    @PostMapping("/api/savePatientDetails")
    public List<Patient> savePatientDetails(@RequestBody List<Patient> patientList) {
       return patientService.savePatient(patientList);
    }




}
