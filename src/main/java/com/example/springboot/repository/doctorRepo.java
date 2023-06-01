package com.example.springboot.repository;

import com.example.springboot.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepo extends JpaRepository<doctor, Integer> {

}
