package com.example.springmvs.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
