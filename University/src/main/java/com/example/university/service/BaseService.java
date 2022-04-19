package com.example.university.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();

    T findById(Long id);

    T save(T t);

    void delete(Long id);
}
