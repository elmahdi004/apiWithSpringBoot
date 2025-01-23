package com.example.createApiDemo;

import com.example.createApiDemo.entities.Student;
import com.example.createApiDemo.entities.Teacher;
import com.example.createApiDemo.repositories.TeacherRepository;
import com.example.createApiDemo.services.TeacherService;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CreateApiDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CreateApiDemoApplication.class, args);
	}


}
