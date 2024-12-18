package com.ujjwal.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		// accessing IoC container
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		// getting bean (object) from the container
		Programmer programmer = context.getBean(Programmer.class);

		programmer.code();
	}

}
