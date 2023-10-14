package com.project.ProjectAlt96;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class ProjectAlt96Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAlt96Application.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner->{
			System.out.println("Welcome");
		};
	}
}
