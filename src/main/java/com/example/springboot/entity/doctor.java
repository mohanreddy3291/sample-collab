package com.example.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class doctor {
    @Id
    private Integer doctorNumber;

    @Column(name = "first_name")
    private static String firstName;

    @Column(name = "last_name")
    private static String lastName;
    private String email;

    private int age;

    private String address;

    public void setDoctorNumber(Integer doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public Integer getDoctorNumber() {
        return doctorNumber;
    }


    public static String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
