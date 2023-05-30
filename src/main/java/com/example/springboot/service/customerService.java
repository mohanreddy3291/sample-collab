package com.example.springboot.service;

import com.example.springboot.entity.customer;
import com.example.springboot.repo.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class customerService {
    @Autowired
    private customerRepository customerRepository;

    public List<customer> saveCustomer(List<customer> customerList) {
        List<customer> returnCustomer = new ArrayList<>();
        for (customer customer1 : customerList) {
           // if(customer1.getAddress() != null && customer1.getFirstName() != null && customer1.getLastName() != null && customer1.getAge() > 25){
            customer savedCustomer = customerRepository.save(customer1);
            returnCustomer.add(savedCustomer);
            //}
            /*else if (customer1.getFirstName() != null) {
                customer savedCustomer = customerRepository.save(customer1);
                returnCustomer.add(savedCustomer);
            }
            else if (customer1.getLastName() != null) {
                customer savedCustomer = customerRepository.save(customer1);
                returnCustomer.add(savedCustomer);
            }
            else if (customer1.getAge() > 25) {
                customer savedCustomer = customerRepository.save(customer1);
                returnCustomer.add(savedCustomer);
            }*/
            //else {
            //    return null;
            //}
        }
        return returnCustomer;
    }
}
