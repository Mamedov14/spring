package com.example.springmvsjdbs.dao;

import com.example.springmvsjdbs.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();

    Student findById(Integer id);

    void update(Student student);

    void save(Student student);

    void delete(Integer id);

}
