package com.example.project1.project1;

import com.example.project1.project1.entities.Student;
import com.example.project1.project1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Pedro", "Sanchez", "pedro@gmail.com");
		Student student2 = new Student("Pepe", "AsdJr", "pepe@gmail.com");
		//repository.save(student1);
		//repository.save(student2);
	}
}
