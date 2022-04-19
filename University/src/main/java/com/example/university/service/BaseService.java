package com.example.university.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    List<T> findAll();

    T findById(Long id);
}
