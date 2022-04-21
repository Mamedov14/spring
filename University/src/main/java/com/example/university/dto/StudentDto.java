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


}
