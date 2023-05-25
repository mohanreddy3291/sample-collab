package com.example.springboot.repo;

import com.example.springboot.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends JpaRepository<customer, Integer> {
}
