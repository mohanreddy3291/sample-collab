package com.example.springboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "StudentInformation")
public class Student{
    @Id
    private int id;
    private String First_Name;
    private String Last_Name;
    private int marks;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getLast_Name() {
        return Last_Name;
    }
    public void setLast_Name(String last_Name) {
        this.Last_Name = last_Name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }
    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }


}
