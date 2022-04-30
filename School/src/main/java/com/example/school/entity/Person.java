package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date dateOfBirth;
    private String phoneNumber;

    @OneToMany(mappedBy = "person")
    private List<Student> students;

    @OneToMany(mappedBy = "person")
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "person")
    private List<Director> directors;
}
