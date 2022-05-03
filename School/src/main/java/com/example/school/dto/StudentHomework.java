package com.example.school.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class StudentHomework {
    private String title;
    private String content;
    private String subjectName;
    @Column(nullable = true)
    private int rating;
}
