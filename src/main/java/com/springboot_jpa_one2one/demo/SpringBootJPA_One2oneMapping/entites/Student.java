package com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.entites;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    public Student(String student_name, String mobile,Address address) {
        this.student_name = student_name;
        this.mobile = mobile;
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //******************Mapping********************//
    @OneToOne
    @JoinColumn(name = "Address_id")
    private Address address;
    //******************Mapping********************//

    private String student_name;
    private String mobile;

    public Student() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", address=" + address +
                ", student_name='" + student_name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
