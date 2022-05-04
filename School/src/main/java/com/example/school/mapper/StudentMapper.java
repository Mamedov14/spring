package com.example.school.mapper;

import com.example.school.dto.student.StudentDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<StudentDTO> {

    @Override
    public StudentDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(resultSet.getLong("id"));
        studentDTO.setLastName(resultSet.getString("last_name"));
        studentDTO.setFirstName(resultSet.getString("first_name"));
        studentDTO.setPatronymic(resultSet.getString("patronymic"));
        studentDTO.setAddress(resultSet.getString("address"));
        studentDTO.setClassName(resultSet.getString("title"));
        studentDTO.setPhoneNumber(resultSet.getString("phone_number"));
        return studentDTO;
    }
}
