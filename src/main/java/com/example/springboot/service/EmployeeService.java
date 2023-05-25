package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> saveemployee(List<Employee> employeeList) {
        List<Employee> returnList = new ArrayList<>();
        for (Employee emp : employeeList) {
            emp.setAge(26);
            Employee saveemployee = employeeRepository.save(emp);
            returnList.add(saveemployee);
        }

        return returnList;
    }

    public static boolean hasaddress(List<Employee> employeeList) {
        boolean hasvalidaddress = true;
        for (Employee emp : employeeList) {
            if (emp.getAddress() == null) {
                hasvalidaddress = false;
                break;
            }

        }

        return hasvalidaddress;
    }

    public static boolean hasvalidNames(List<Employee> employeeList)
    {
        boolean validnames;
        for(Employee emp1: employeeList)
        {
            if(emp1.getFirstName()==null || emp1.getLastName()==null)
            {
                validnames=false;
                break;
            }
        }
            return validnames=true;
    }
    public static boolean age(List<Employee> employeeList)
    {
        boolean hasage=true;
        for(Employee emp2: employeeList)
        {
            if(emp2.getAge()<=25)
            {
                hasage=false;
                break;
            }
        }
        return hasage;
    }

}
