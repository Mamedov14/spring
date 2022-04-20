package com.example.university.mapper;

import com.example.university.dto.TeacherDto;
import com.example.university.entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {
    public TeacherDto toDto(Teacher teacher) {
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teacher.getId());
        teacherDto.setFIO(teacher.getFIO());
        teacherDto.setSubject(teacher.getSubject());

        return teacherDto;
    }
}
