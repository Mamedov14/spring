package com.example.school.mapper.student;

import com.example.school.dto.student.HomeworkByDate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeworkByDateMapper implements RowMapper<HomeworkByDate> {
    @Override
    public HomeworkByDate mapRow(ResultSet resultSets, int rowNum) throws SQLException {
        HomeworkByDate homework = new HomeworkByDate();
        homework.setSubjectName(resultSets.getString("subject_name"));
        homework.setTitle(resultSets.getString("title"));
        homework.setContent(resultSets.getString("content"));
        homework.setDateStart(resultSets.getDate("date_start").toLocalDate());
        homework.setDateEnd(resultSets.getDate("date_end").toLocalDate());
        return homework;
    }
}
