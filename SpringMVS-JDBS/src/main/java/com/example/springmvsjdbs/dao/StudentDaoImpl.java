package com.example.springmvsjdbs.dao;

import com.example.springmvsjdbs.entity.Student;
import com.example.springmvsjdbs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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

    @Override
    public Student findById(Integer id) {
        // language=sql
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void update(Student student) {
        // language=sql
        String sql = "UPDATE students SET name=?, age=?, rating=?";
        jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getRating());
    }

    @Override
    public void save(Student student) {
        // language=sql
        String sql = "INSERT INTO students(name, age, rating) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getRating());
    }

    @Override
    public void delete(Integer id) {
        // language=sql
        String sql = "DELETE FROM students WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
