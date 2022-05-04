package com.example.school.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeworkByDate {
    private String subjectName;
    private String title;
    private String content;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
}
