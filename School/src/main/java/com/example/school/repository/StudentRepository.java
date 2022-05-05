package com.example.school.repository;

import com.example.school.dto.student.*;
import com.example.school.mapper.*;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<StudentDTO> findAllStudents() {
        String sql = """
                SELECT students.id, last_name, first_name, patronymic, address, class.title, persons.phone_number
                FROM students
                         JOIN persons ON students.person_id = persons.id
                         JOIN class ON students.class_id = class.id;
                """;
        return jdbcTemplate.query(sql, new StudentMapper());
    }

    public List<StudentHomework> getHomework(Long id) {
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


    public List<SubjectHomework> getSubjectHomework(String subjectName) {
        String sql = """
                SELECT subject_name, content, date_start, date_end, title
                        FROM homeworks
                        JOIN subjects ON homeworks.subject_id = subjects.id
                        JOIN teachers ON teachers.id = homeworks.teacher_id
                        JOIN class ON homeworks.teacher_id = class.teacher_id
                WHERE subject_name = ?
                """;
        return jdbcTemplate.query(sql, new SubjectHomeworkMapper(), subjectName);
    }

    public List<HomeworkByDate> getHomeworkByDate(LocalDate dateEnd) {
        String sql = """
                SELECT subject_name, title, content, date_start, date_end
                        FROM homeworks
                        JOIN subjects on subjects.id = homeworks.subject_id
                        JOIN class on homeworks.teacher_id = class.teacher_id
                WHERE date_end = ?;
                """;
        return jdbcTemplate.query(sql, new HomeworkByDateMapper(), dateEnd);
    }

    public List<StudentRating> getRatingStudent(Long id) {
        String sql = """
                SELECT students.id, subject_name, rating
                FROM ratings
                         JOIN students ON ratings.student_id = students.id
                         JOIN subjects ON ratings.subject_id = subjects.id
                WHERE students.id = ?;
                """;
        return jdbcTemplate.query(sql, new StudentRatingMapper(), id);
    }
}