package com.example.school.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentHomework {
    private Long id;
    private String lastName;
    private String firstName;
    private String subjectName;
    private String clazz;
    private String homework;
}