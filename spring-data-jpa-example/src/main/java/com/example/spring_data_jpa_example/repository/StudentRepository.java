package com.example.spring_data_jpa_example.repository;

import com.example.spring_data_jpa_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Use of 'Spring Boot Started Data JPA' library
 * Here, StudentRepository is an interface, not a class.
 * It extends JpaRepository interface provided by the library, which has all the methods for DB operation.
 * JpaRepository interface requires class name (entity) and type of its primary to be defined within its angular bracket. The class which the StudentRepository is representing i.e. Student.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
}
