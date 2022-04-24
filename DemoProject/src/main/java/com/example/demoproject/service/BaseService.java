package com.example.demoproject.service;

import com.example.demoproject.entity.Student;

import java.util.List;

public interface BaseService<T> {

    T findById(Long id);

    List<T> findAll();

    void save(T t);

    void update(T t);

    void deleteById(Long id);

    void deleteAll();
}
