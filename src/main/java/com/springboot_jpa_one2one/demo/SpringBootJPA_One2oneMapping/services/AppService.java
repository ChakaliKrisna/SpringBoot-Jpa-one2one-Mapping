package com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.services;

import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.entites.Address;
import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.entites.Student;
import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.repository.AddressRepository;
import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

//@org.springframework.stereotype.Service
@org.springframework.stereotype.Service
public class AppService {


    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public  void saveData(){
        Student student1 =new Student("Krishna","9848656308");
        Address address1=new Address("8-85 singareni colony","saidabad","singarani colony");
        studentRepository.save(student1);
        addressRepository.save(address1);

    }
}
