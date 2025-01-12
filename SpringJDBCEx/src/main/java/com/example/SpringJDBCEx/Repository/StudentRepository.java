package com.example.SpringJDBCEx.Repository;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student (roll_no, name, marks) values (?, ?, ?)"; // '?' is replaced by the coming from student object as shown below.
        int rows = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks()); // the data from getter methods replaces the '?' in the query above
        System.out.println(rows + " affected."); // since, update() method returns no. of rows affected by above query
    }

    /**
     * Spring will be responsible to instantiate the object. Everything will be handled by spring behind the scene.
     * @param jdbc JDBC Template
     */
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    /**
     * The method 'jdbc.query()' takes two arguments: SQL query and RowMapper.
     * The second parameter with the RowMapper is using simplified lambda expression:
     * - The RowMapper is a functional interface whose method: 'mapRow' is being overridden.
     * - The 'mapRow' method has two parameters: 'ResultSet' and 'rowNum'.
     * - The 'ResultSet' gives each row of data from student table.
     * - These data are being added to Student object, and returned.
     * The method 'jdbc.query()' returns List of any object. Here, the object is Student.
     * @return List of students
     */
    public List<Student> findAll() {
        String sql = "Select * from student";

        return jdbc.query(sql, (rs, rowNum) -> {
            Student student = new Student();

            student.setRollNo(rs.getInt("roll_no"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));

            return student;
        });
    }
}
