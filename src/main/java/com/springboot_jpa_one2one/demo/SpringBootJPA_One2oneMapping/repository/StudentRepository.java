package com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.repository;

import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
