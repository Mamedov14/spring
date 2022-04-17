package com.example.springmvsjdbs.dao;

import com.example.springmvsjdbs.entity.Student;
import com.example.springmvsjdbs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Student> findAll() {
        // language=sql
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
