package com.example.spring_data_jpa_example;

import com.example.spring_data_jpa_example.model.Student;
import com.example.spring_data_jpa_example.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);;

		s1.setRollNo(101);
		s1.setName("Ujjwal");
		s1.setMarks(99);

		s2.setRollNo(102);
		s2.setName("Jason");
		s2.setMarks(87);

		s3.setRollNo(103);
		s3.setName("Jane");
		s3.setMarks(75);

		studentRepository.save(s1);
	}

}
