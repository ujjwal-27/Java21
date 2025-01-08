package com.example.SpringJDBCEx.Repository;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student (rollNo, name, marks) values (?, ?, ?)"; // '?' is replaced by the coming from student object as shown below.
        int rows = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks()); // the data from getter methods replaces the '?' in the query above
        System.out.println(rows + " affected."); // since, update() method returns no. of rows affected by above query
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
