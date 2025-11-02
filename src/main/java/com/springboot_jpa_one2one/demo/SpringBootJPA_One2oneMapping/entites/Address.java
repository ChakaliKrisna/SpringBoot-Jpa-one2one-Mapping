package com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.entites;


import jakarta.persistence.*;

@Entity
@Table(name="Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Address_id;
    private String House_details;
    private String City;

    public Address(String house_details, String city, String street) {
        House_details = house_details;
        City = city;
        Street = street;
    }

    public Address() {
    }

    public int getAddress_id() {
        return Address_id;
    }

    public void setAddress_id(int address_id) {
        Address_id = address_id;
    }

    public String getHouse_details() {
        return House_details;
    }

    public void setHouse_details(String house_details) {
        House_details = house_details;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    private String Street;
}
