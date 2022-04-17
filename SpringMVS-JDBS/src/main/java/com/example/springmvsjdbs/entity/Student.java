package com.example.springmvsjdbs.entity;


public class Student {

    private Long id;
    private String name;
    private Integer age;
    private Integer rating;

    public Student() {
    }

    public Student(Long id, String name, Integer age, Integer rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public Student(String name, Integer age, Integer rating) {
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
