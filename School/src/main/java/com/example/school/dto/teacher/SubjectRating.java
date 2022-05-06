package com.example.school.dto.teacher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectRating {
    private Long id;
    private String teacherName;
    private String subjectName;
    private int rating;
    private String studentLastName;
    private String studentFirstName;
}
