package com.example.springboot.service;


import org.springframework.stereotype.Component;

@Component // CustomerSErvice customer = new CustomerSErvice();
public class CustomerService {
        public Integer sum(Integer num1, Integer num2){

            return num1 + num2;
        }


}
