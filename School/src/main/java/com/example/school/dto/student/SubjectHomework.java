package com.example.school.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectHomework {
    private String subjectName;
    private String content;
    private String date_start;
    private String date_end;
    private String title;
}
