package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.repo.EmployeeRepository;
import com.example.springboot.service.CrudOperation;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CrudOperation crudOperation;

    @PostMapping("/api/EmployeeDetails")
    public List<Employee> saveEmployeeDetails(@RequestBody List<Employee> employeeList)
    {
               boolean hasaddress= EmployeeService.hasaddress(employeeList);
               if(hasaddress && EmployeeService.hasvalidNames(employeeList) && EmployeeService.age(employeeList));
            return employeeService.saveemployee(employeeList);
    }
    @GetMapping("/api/fetchempdetails")
    public List<Employee> getemp(@RequestBody List<Employee> employeeList)
    {
        return employeeService.getemp(employeeList);
    }

    @PutMapping("/api/Updatedata/{emp_id}")
    public Employee updateemp(@RequestBody Employee employee,@PathVariable int emp_id)
    {
        return employeeService.Update(employee,emp_id);
    }
@GetMapping("/api/getdetailsbyid/{emp_id}")
    public Employee getdata(@PathVariable int emp_id)
{
    return employeeService.getempbyId(emp_id);
}
}
