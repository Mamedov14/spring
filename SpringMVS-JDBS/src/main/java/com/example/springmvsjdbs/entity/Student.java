package com.example.springmvsjdbs.entity;


import org.springframework.data.relational.core.sql.In;

public class Student {

    private Long id;
    private String name;
    private Integer age;
    private String rating;

    public Student() {
    }

    public Student(Long id, String name, Integer age, String rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
