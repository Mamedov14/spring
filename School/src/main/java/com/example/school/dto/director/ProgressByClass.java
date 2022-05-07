package com.example.school.dto.director;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgressByClass {
    private String lastName;
    private String firstName;
    private String className;
    private String subjectName;
    private int rating;
}
