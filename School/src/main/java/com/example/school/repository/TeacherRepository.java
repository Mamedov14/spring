package com.example.school.repository;

import com.example.school.entity.Homework;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
@RequiredArgsConstructor
public class TeacherRepository {

    private final JdbcTemplate jdbcTemplate;

    public void giveHomework(Homework homework) {
        String sql = """
                INSERT INTO homeworks("content", date_end, date_start, teacher_id, subject_id)
                VALUES (?, ?, ?, ?, ?)
                """;
        jdbcTemplate.update(sql, homework.getContent(),
                LocalDate.now(), LocalDate.now(),
                homework.getTeacher_id(), homework.getSubject_id());
    }
}