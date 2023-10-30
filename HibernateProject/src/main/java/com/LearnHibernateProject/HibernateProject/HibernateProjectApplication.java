package com.LearnHibernateProject.HibernateProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HibernateProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(HibernateProjectApplication.class, args);
		System.out.println("Abhiu Garg");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	}

}
