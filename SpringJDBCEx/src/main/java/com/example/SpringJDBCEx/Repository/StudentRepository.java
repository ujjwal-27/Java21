package com.example.SpringJDBCEx.Repository;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public List<Student> findAll() {
        String sql = "Select * from student";

        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();

                student.setRollNo(rs.getInt("roll_no"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));

                return student;
            }
        };

        return jdbc.query(sql, rowMapper);
    }
}
