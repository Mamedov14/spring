package com.example.school.mapper.student;

import com.example.school.dto.student.SubjectHomework;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectHomeworkMapper implements RowMapper<SubjectHomework> {
    @Override
    public SubjectHomework mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        SubjectHomework subjectHomework = new SubjectHomework();
        subjectHomework.setSubjectName(resultSet.getString("subject_name"));
        subjectHomework.setContent(resultSet.getString("content"));
        subjectHomework.setDate_start(resultSet.getString("date_start"));
        subjectHomework.setDate_end(resultSet.getString("date_end"));
        subjectHomework.setTitle(resultSet.getString("title"));
        return subjectHomework;
    }
}
