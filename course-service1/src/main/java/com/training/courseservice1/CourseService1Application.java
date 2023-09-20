package com.training.courseservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CourseService1Application {
	public static void main(String[] args) {
		SpringApplication.run(CourseService1Application.class, args);
	}
}
