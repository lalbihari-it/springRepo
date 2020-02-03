package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =  SpringApplication.run(FirstAppApplication.class, args);
		//System.out.println("Welcome to spring boot...");
	
		Student ob = context.getBean(Student.class);
		ob.show();
		Student ob1 = context.getBean(Student.class);
		ob1.show();
	}

}
