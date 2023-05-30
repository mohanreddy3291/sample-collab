package com.example.springboot;

import com.example.springboot.entity.customer;

import java.util.List;

public class validator {
    public static Boolean validateCustomerAddress(List<customer> customerList){
        Boolean hasValidAddress = true;
        for(customer customer1:customerList){
            if(customer1.getAddress() == null){
                hasValidAddress = false;
                break;
            }
        }
        return hasValidAddress;
    }
    public static Boolean validateFirstAndLastNames(List<customer> customerList){
        Boolean hasValidFirstAndLastNames = true;
        for(customer customer1:customerList){
            if(customer1.getFirstName() == null || customer1.getLastName() == null){
                hasValidFirstAndLastNames = false;
                break;
            }
        }
        return hasValidFirstAndLastNames;
    }
    public static Boolean validateAge(List<customer> customerList){
        Boolean hasValidAge = true;
        for(customer customer1:customerList){
            if(customer1.getAge() > 25){
                hasValidAge = false;
                break;
            }
        }
        return hasValidAge;
    }
}
