package com.example.school.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeworkByDate {
    private String subjectName;
    private String title;
    private String content;
    private LocalDate dateStart;
    private LocalDate dateEnd;
}
