package com.example.springboot.service;

import com.example.springboot.modal.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.Collection;

@Service
public class EmployeeService {
    @Autowired

    private EmployeeRepository empRepository;
    public Employee createEmployee(Employee emp) {
        Employee dbEmp= empRepository.createEmployee(emp);
        return dbEmp;

    }
    public Collection<Employee> getAllEmployees() {
        return empRepository.getAllEmployees();
    }

    public Employee getEmployeeByEmpId(Integer empId) {
        return empRepository.getEmployeeByEmpId(empId);
    }

    public void deleteEmployeeByEmpId(Integer empId) {
        empRepository.deleteEmployeeByEmpId(empId);
    }

    public Employee updateEmployeeByEmpId(Integer empId, String newEmail) {
        return empRepository.updateEmployeeByEmpId(empId,newEmail);
    }
}
