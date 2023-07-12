package com.example.springboot.dto;

import com.example.springboot.entity.Patient;

import java.util.List;

public class JsonFormat {

    private String name;

    private List<String> names;

    private Integer number;

    private List<Integer> numbers;

    private Boolean isValid; // true/false

    private Patient patientDetails;
/*{
    "name": "test2",
    "names": [
        "name1",
        "name2",
        "name3"
    ],
    "number": 12345,
    "numbers": [
        12345,
        13244,
        12345
    ],
    "isValid": true,
    "patientDetails": {
        "patientNumber": "test1234",
        "firstName": "fn",
        "lastName": "ln"
    }
}*/

    public Patient getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(Patient patientDetails) {
        this.patientDetails = patientDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }
}
