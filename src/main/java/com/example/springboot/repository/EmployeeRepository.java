package com.example.springboot.repository;

import com.example.springboot.modal.Employee;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeRepository {
    public Map<Integer, Employee> employees=new HashMap<>();
    public Employee createEmployee(Employee emp) {
        Integer empID=employees.size()+1;
        emp.setEmpId(empID);
        employees.put(empID, emp);
        return emp;
    }
    public Collection<Employee>getAllEmployees() {
        return employees.values();
    }

    public Employee getEmployeeByEmpId(Integer empId) {
        Employee dbEmp=employees.get(empId);
        return dbEmp;
    }

    public void deleteEmployeeByEmpId(Integer empId) {
        employees.remove(empId);
    }

    public Employee updateEmployeeByEmpId(Integer empId, String newEmail) {
        Employee emp=employees.get(newEmail);
        emp.setEmail(newEmail);
        employees.put(empId, emp);
        return emp;
    }
}
