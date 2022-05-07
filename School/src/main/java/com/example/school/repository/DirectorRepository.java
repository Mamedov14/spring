package com.example.school.repository;

import com.example.school.dto.director.ProgressByClass;
import com.example.school.mapper.director.ProgressByClassMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DirectorRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<ProgressByClass> getProgressByClass(String className) {
        String sql = """
                SELECT student.last_name, student.first_name, class.title, subjects.subject_name, ratings.rating
                FROM ratings
                         JOIN students ON ratings.student_id = students.id
                         JOIN persons student ON students.person_id = student.id
                         JOIN class ON students.class_id = class.id
                         JOIN leads on class.id = leads.class_id
                         JOIN subjects on leads.subject_id = subjects.id
                WHERE class.title = ?                
                """;
        return jdbcTemplate.query(sql, new ProgressByClassMapper(), className);
    }
}
