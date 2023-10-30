package com.ApiChecking.ApiCheck;

import com.ApiChecking.ApiCheck.entities.MyPojo;
import com.ApiChecking.ApiCheck.entities.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;

@SpringBootApplication
// (
//		scanBasePackages = {
//				"com.luv2code.springcoredemo",
//				"com.luv2code.util",
//				"edu.cmu.srs"})
public class ApiCheckApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ApiCheckApplication.class, args);
		//System.out.println("Password Encoding");

//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		System.out.println(encoder.encode("xyz123"));
//		System.out.println(encoder.matches("abc123","$2a$10$MLzTNQhHfmK3dZ5Box8YgeMucHkvPGULPsExYwLBuUvE1FKhiPxLu"));

		ObjectMapper objectMapper = new ObjectMapper();

		// Serialize a Java object to JSON
		MyPojo pojo = new MyPojo("John", 30);
		String jsonString = objectMapper.writeValueAsString(pojo);
		System.out.println("Serialized JSON: " + jsonString);

		// Deserialize JSON to a Java object
		MyPojo deserializedPojo = objectMapper.readValue(jsonString, MyPojo.class);
		System.out.println("Deserialized Object: " + deserializedPojo);

		
		

	}
}
