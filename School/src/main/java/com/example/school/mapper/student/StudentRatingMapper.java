package com.example.school.mapper.student;

import com.example.school.dto.student.StudentRating;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRatingMapper implements RowMapper<StudentRating> {
    @Override
    public StudentRating mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        StudentRating studentRating = new StudentRating();
        studentRating.setId(resultSet.getLong("id"));
        studentRating.setSubjectName(resultSet.getString("subject_name"));
        studentRating.setRating(resultSet.getInt("rating"));
        return studentRating;
    }
}
