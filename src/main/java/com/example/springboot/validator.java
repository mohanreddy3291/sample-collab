package com.example.springboot;

import com.example.springboot.entity.doctor;

import java.util.List;

public class validator {
    public static boolean validatePatientAddress(List<doctor> doctorList) {
        boolean hasValidAddress = true;
        for (doctor doctor: doctorList) {
            if (doctor.getAddress() == null) {
                hasValidAddress = false;
                break;
            }
        }
        return hasValidAddress;

    }

    public static boolean validFirstAndLastNames(List<doctor> doctorList) {
        boolean hasValidNames = true;
        for (doctor doctor: doctorList) {
            if (doctor.getFirstName() == null || doctor.getLastName() == null) {
                hasValidNames = false;
                break;
            }
        }
        return hasValidNames;

    }
}
