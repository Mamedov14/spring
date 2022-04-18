package com.example.university.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String FIO;

    @Column
    private String subject;
}
