package com.example.springmvsjdbs.service;

import com.example.springmvsjdbs.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);

    void update(Student student);

    void save(Student student);

    void delete(Long id);
}
