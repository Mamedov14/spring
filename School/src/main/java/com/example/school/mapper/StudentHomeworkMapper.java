package com.example.school.mapper;

import com.example.school.dto.student.StudentHomework;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentHomeworkMapper implements RowMapper<StudentHomework> {
    @Override
    public StudentHomework mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setId(resultSet.getLong("id"));
        studentHomework.setLastName(resultSet.getString("last_name"));
        studentHomework.setFirstName(resultSet.getString("first_name"));
        studentHomework.setSubjectName(resultSet.getString("subject_name"));
        studentHomework.setClazz(resultSet.getString("title"));
        studentHomework.setHomework(resultSet.getString("content"));
        return studentHomework;
    }
}