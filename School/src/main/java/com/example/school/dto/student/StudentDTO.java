package com.example.school.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String className;
    private String phoneNumber;
}
