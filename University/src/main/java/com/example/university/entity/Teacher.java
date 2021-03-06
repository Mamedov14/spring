package com.example.university.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
@Table(name = "teacher")
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
