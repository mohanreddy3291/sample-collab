package com.example.springboot.controller;


import com.example.springboot.entity.doctor;
import com.example.springboot.validator;
import com.example.springboot.entity.Patient;
import com.example.springboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;
import com.example.springboot.service.doctorService;
@RestController
public class PatientController {


    @Autowired
    private PatientService patientService;

    // save patient details which has address only..
    // validate if first name and last name is given in the request
    // check if every patient has age greater than 25
    // Return ResponseEntity with body -- google it....

    @PostMapping("/api/savePatientDetails")
    public ResponseEntity<List<doctor>> savePatientDetails(@RequestBody List<doctor> doctorList) {
        List<doctor> response = null;
        boolean hasValidAddress = validator.validatePatientAddress(doctorList);
        if (hasValidAddress && validator.validFirstAndLastNames(doctorList)) {
            response = doctorService.saveDoctor(doctorList);
        } else {
            new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

       return new ResponseEntity<>(response, HttpStatus.OK);
    }




}
