package com.example.springboot.controller;

import com.example.springboot.entity.customer;
import com.example.springboot.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class customerController {
    @Autowired
    private customerService customerService;
    @PostMapping("/api/saveCustomerDetails")
    public ResponseEntity<List<customer>> saveCustomer(@RequestBody List<customer> customerList){
        return new ResponseEntity<>(customerService.saveCustomer(customerList),HttpStatus.OK );
    }
    @GetMapping("/status")
    ResponseEntity<String> home() {
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

    @GetMapping("/notFound")
    ResponseEntity<String> notFound() {
       return ResponseEntity.notFound().build();
    }

    @GetMapping("/badRequest")
    ResponseEntity<String> badRequest() {
        return ResponseEntity.badRequest().body("Bad request");
    }
}
