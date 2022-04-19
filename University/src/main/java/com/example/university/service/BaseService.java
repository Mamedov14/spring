package com.example.university.service;

import java.util.List;

/**
 * S - Single Responsibility (Принцип единственной ответственности)
 * O - Open-Closed Principle (Классы должны быть закрыты для модификации и открыты для расширения)
 * L - Liskov Substitution (Принцип подстановки Барбары Лисков)
 * I - Interface Segregation (Писать маленькие интерфейсы)
 * D - Dependency Inversion (Инверсия зависимости)
 */

public interface BaseService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void delete(Long id);

    void update(T t);
}
