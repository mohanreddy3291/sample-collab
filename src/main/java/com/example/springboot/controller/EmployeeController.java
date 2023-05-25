package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/EmployeeDetails")
    public List<Employee> saveEmployeeDetails(@RequestBody List<Employee> employeeList)
    {
               boolean hasaddress= EmployeeService.hasaddress(employeeList);
               if(hasaddress && EmployeeService.hasvalidNames(employeeList) && EmployeeService.age(employeeList));
            return employeeService.saveemployee(employeeList);
    }


}
