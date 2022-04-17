package com.example.springmvsjdbs.mapper;

import com.example.springmvsjdbs.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getLong("id"));
        student.setName(resultSet.getString("name"));
        student.setAge(resultSet.getInt("age"));
        student.setRating(resultSet.getInt("rating"));
        return student;
    }
}