package com.example.springboot;

import com.example.springboot.entity.Patient;

import java.util.List;

public class Validator {

    public static boolean validatePatientAddress(List<Patient> patientList) {
        boolean hasValidAddress = true;
        for (Patient patient: patientList) {
            if (patient.getAddress() == null) {
                hasValidAddress = false;
                break;
            }
        }
        return hasValidAddress;

    }

    public static boolean validFirstAndLastNames(List<Patient> patientList) {
        boolean hasValidNames = true;
        for (Patient patient: patientList) {
            if (patient.getFirstName() == null || patient.getLastName() == null) {
                hasValidNames = false;
                break;
            }
        }
        return hasValidNames;

    }
}
