package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarsExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(CarsExample1Application.class, args);
		ApplicationContext context = 
				
				    new AnnotationConfigApplicationContext(AnnotationConfig.class);
				
				Car car = context.getBean(Car.class);
				
				car.start();
	}

}
