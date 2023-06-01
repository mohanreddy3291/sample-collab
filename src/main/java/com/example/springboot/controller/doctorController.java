package com.example.springboot.controller;

import com.example.springboot.entity.doctor;
import com.example.springboot.service.doctorService;
import com.example.springboot.validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class doctorController {
    @Autowired
    private doctorService doctorService;
    @PostMapping("/api/saveDoctorDetails")
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
