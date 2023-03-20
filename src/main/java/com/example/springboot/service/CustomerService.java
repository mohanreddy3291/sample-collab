package com.example.springboot.service;


import org.springframework.stereotype.Component;

@Component // CustomerSErvice customer = new CustomerSErvice();
public class CustomerService {
        public Integer sum(Integer num1, Integer num2){

            return num1 + num2;
        }
public void Exception(Integer input)
{
    try {
        Integer i = input / 0;
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    System.out.println("Program Execution Continues.......");
    System.out.println("Arithmetic Exception");
}

}
