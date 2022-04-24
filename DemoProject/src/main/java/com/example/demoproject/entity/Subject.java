package com.example.demoproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String matan;
    private String algebra;
    private String geometry;
    private String funcan;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}
