package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setMarks(77);
		student.setName("Ujjwal");
		student.setRollNo(104);

		// Invoke StudentService bean, and addStudent method from the service.
		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(student);

		// Display list of all students from DB table
		List<Student> students = studentService.getStudents();
		System.out.println(students);
	}

}
