package com.example.school.mapper.teacher;

import com.example.school.dto.teacher.SubjectRating;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectRatingMapper implements RowMapper<SubjectRating> {
    @Override
    public SubjectRating mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        SubjectRating subjectRating = new SubjectRating();
        subjectRating.setId(resultSet.getLong("teacher_id"));
        subjectRating.setTeacherName(resultSet.getString("teacher_last_name"));
        subjectRating.setSubjectName(resultSet.getString("subjects_name"));
        subjectRating.setRating(resultSet.getInt("ratings_value"));
        subjectRating.setStudentFirstName(resultSet.getString("student_first_name"));
        subjectRating.setStudentLastName(resultSet.getString("student_last_name"));
        return subjectRating;
    }
}
