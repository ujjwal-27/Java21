package com.example.SpringBootDemo;

import com.example.SpringBootDemo.model.Alien;
import com.example.SpringBootDemo.model.Laptop;
import com.example.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addlaptop(laptop);



//		Alien alien = context.getBean(Alien.class);
//		System.out.println(alien.getAge());
//		alien.code();
	}
}
