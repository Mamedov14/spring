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
    private boolean coolGuide; // классный руководитель?

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @OneToOne(mappedBy = "teacher")
    private Class _class;

    @ManyToMany(mappedBy = "teachers")
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "teachers")
    private List<Class> classes;

    @ManyToMany(mappedBy = "teachersHomeworks")
    private List<Subject> homeworks;
}
