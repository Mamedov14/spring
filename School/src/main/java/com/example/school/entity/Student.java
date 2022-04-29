package com.example.school.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nameClass;
    private String address;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private Class _class;

    @ManyToMany(mappedBy = "students")
    private List<Subject> subjects;

}
