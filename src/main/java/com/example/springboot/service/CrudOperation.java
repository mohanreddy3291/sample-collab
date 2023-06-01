package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class  CrudOperation
{
    @Autowired
    EmployeeRepository EmployeeRepository;
public Employee Update(Employee employee,int emp_id)
{
    Employee oldemp=EmployeeRepository.findById(emp_id).orElse(null);
    oldemp.setFirstName(employee.getFirstName());
    oldemp.setLastName(employee.getLastName());
    oldemp.setAddress(employee.getAddress());
    oldemp.setGender(employee.getGender());
    oldemp.setSalary(employee.getSalary());
    oldemp.setPhoneNumber(employee.getPhoneNumber());
    EmployeeRepository.save(oldemp);
    return oldemp;
}
    public Employee getempbyId(int emp_id)
    {
        return EmployeeRepository.findById(emp_id).orElse(null);
    }

    public List<Employee> getemp(List<Employee> employeeList)
    {
        return EmployeeRepository.findAll();
    }
}
