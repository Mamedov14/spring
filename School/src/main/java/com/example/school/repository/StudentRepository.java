package com.example.school.repository;

import com.example.school.dto.StudentDTO;
import com.example.school.entity.Student;
import com.example.school.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentDTO findByIdStudent(Long id) {
        String sql = "SELECT id, address FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new StudentMapper(), id);
    }
}