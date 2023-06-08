package com.example.springboot.modal;

import jakarta.persistence.Id;

public class Employee {
    private Integer empId;
    private String empName;
    private String email;
    private String mobileNumber;
    @Override
    public String toString() {
        return"Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", mobileNumber" +mobileNumber +"]";

    }
    public Employee(Integer empId, String empName, String email, String mobileNumber) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    public Employee() {
        super();
    }
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return  empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
