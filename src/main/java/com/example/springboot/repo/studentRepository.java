package com.example.springboot.repo;

import com.example.springboot.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student, String> {

}
