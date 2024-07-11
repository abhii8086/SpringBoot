package com.abhi.secondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondAppApplication {

	public static void main(String[] args) {

	 ApplicationContext context = SpringApplication.run(SecondAppApplication.class, args);
	 Developer d1 = context.getBean(Developer.class);
	 d1.build();

	}

}
