package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private boolean coolGuide; // классный руководитель?

    @OneToOne(mappedBy = "teacher")
    private Class _class;

    @ManyToMany(mappedBy = "teachers")
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "teachers")
    private List<Class> classes;
}
