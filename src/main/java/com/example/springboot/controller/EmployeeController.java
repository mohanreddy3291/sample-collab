package com.example.springboot.controller;

import com.example.springboot.modal.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee emp) {
        Employee serEmp = empService.createEmployee(emp);
        return serEmp;

        //  {
        //    "empId": 34567,
        //  "empName":"john",
        //"email":"john@gmail.com",
        //"mobileNumber":"9999999999"
        //}

    }

    @GetMapping
    public Collection<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }
    @GetMapping("/{empID}")
    public Employee getEmployeeByEmpId(@PathVariable("empID") Integer empId) {
        return empService.getEmployeeByEmpId(empId);
    }
    @PutMapping ("/{empID}/{newEmail}")
    public Employee updateEmployeeByEmpId(@PathVariable("newEmail") Integer empId,String newEmail) {
        return empService.updateEmployeeByEmpId(empId,newEmail);
    }
    @DeleteMapping("/{empID}")
    public void deleteEmployeeByEmpId(@PathVariable("empID") Integer empId) {
        empService.deleteEmployeeByEmpId(empId);

    }

}
