package com.example.springmvsjdbs.entity;


public class Student {

    private Long id;
    private String name;
    private String age;
    private String rating;

    public Student() {
    }

    public Student(Long id, String name, String group, String rating) {
        this.id = id;
        this.name = name;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
