package com.example.university.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String FIO;

    @Column
    private String subject;

//    @OneToMany(mappedBy = "teacher")
//    private List<Student> students;

}
