package com.example.demoproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private Integer course;
    private Integer age;
    private Float average;
    private String numberGroup;

    @OneToMany(mappedBy = "student")
    private List<Subject> subjects;

}

