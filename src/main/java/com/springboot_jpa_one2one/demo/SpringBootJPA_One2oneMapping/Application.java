package com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping;

import com.springboot_jpa_one2one.demo.SpringBootJPA_One2oneMapping.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	AppService service;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.fetchStudentdata();
	}
}
