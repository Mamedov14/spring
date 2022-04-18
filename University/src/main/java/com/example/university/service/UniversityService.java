package com.example.university.service;

import java.util.List;

public interface UniversityService<T> {
    List<T> findAll();

    T findById(Long id);
}
