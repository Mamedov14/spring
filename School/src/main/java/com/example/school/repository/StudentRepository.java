package com.example.school.repository;

import com.example.school.dto.student.StudentDTO;
import com.example.school.dto.student.StudentHomework;
import com.example.school.mapper.StudentHomeworkMapper;
import com.example.school.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentDTO findByIdStudent(Long id) {
        String sql = "SELECT id, address FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new StudentMapper(), id);
    }

    public List<StudentHomework> getHomework(Long id) {
        //language=sql
        String sql = """
                SELECT students.id, persons.last_name, persons.first_name, subjects.subject_name, class.title, homeworks.content
                FROM students
                         JOIN persons ON students.person_id = persons.id
                         JOIN class ON class.id = students.class_id
                         JOIN teachers ON class.teacher_id = teachers.id
                         JOIN homeworks ON teachers.id = homeworks.teacher_id
                         JOIN subjects ON homeworks.subject_id = subjects.id
                WHERE students.id = ?
                """;
        return jdbcTemplate.query(sql, new StudentHomeworkMapper(), id);
    }
}