package com.example.school.mapper.director;

import com.example.school.dto.director.ProgressByClass;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgressByClassMapper implements RowMapper<ProgressByClass> {
    @Override
    public ProgressByClass mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        ProgressByClass progressByClass = new ProgressByClass();
        progressByClass.setLastName(resultSet.getString("last_name"));
        progressByClass.setFirstName(resultSet.getString("first_name"));
        progressByClass.setClassName(resultSet.getString("title"));
        progressByClass.setSubjectName(resultSet.getString("subject_name"));
        progressByClass.setRating(resultSet.getInt("rating"));
        return progressByClass;
    }
}
