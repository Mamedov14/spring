package com.example.school.repository;

import com.example.school.dto.teacher.SubjectRating;
import com.example.school.entity.Homework;
import com.example.school.mapper.teacher.SubjectRatingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

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

    public List<SubjectRating> getSubjectRating(Long id) {
        String sql = """
                SELECT teachers.id               AS teacher_id,
                       teacher_person.last_name  AS teacher_last_name,
                       subjects.subject_name     AS subjects_name,
                       ratings.rating            AS ratings_value,
                       student_person.first_name AS student_first_name,
                       student_person.last_name  AS student_last_name
                FROM persons teacher_person
                         INNER JOIN teachers ON teacher_person.id = teachers.person_id
                         INNER JOIN leads ON leads.teacher_id = teachers.id
                         INNER JOIN subjects ON subjects.id = leads.subject_id
                         INNER JOIN ratings ON ratings.subject_id = subjects.id
                         INNER JOIN students ON students.id = ratings.student_id
                         INNER JOIN persons student_person ON students.person_id = student_person.id
                WHERE teachers.id = ?               
                """;
        return jdbcTemplate.query(sql, new SubjectRatingMapper(), id);
    }
}