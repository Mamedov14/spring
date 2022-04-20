package com.example.university.mapper;

import com.example.university.dto.StudentDto;
import com.example.university.entity.Student;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto toDto(Student student);

    Student toModel(StudentDto studentDto);

/*
    public StudentDto toDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        studentDto.setCourse(student.getCourse());
        studentDto.setAge(student.getAge());

        return studentDto;
    }
*/

/*
    public static Student DtoToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        student.setCourse(studentDto.getCourse());
        student.setAge(studentDto.getAge());

        return student;
    }
*/
}
