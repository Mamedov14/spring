package com.example.university.dto;

import com.example.university.entity.Student;
import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Integer age;
    private Integer course;

    public static Student StudentToDto(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        student.setAge(studentDto.getAge());
        student.setCourse(studentDto.getCourse());

        return student;
    }
}
