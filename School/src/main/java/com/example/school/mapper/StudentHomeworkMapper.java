package com.example.school.mapper;

import com.example.school.dto.StudentHomework;
import com.example.school.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface StudentHomeworkMapper {

    StudentHomeworkMapper INSTANCE = Mappers.getMapper(StudentHomeworkMapper.class);

    Student parseToStudentHomework(StudentHomework studentHomework);

    StudentHomework parseToStudent(Student student);
}
