package com.example.school.repository;

import com.example.school.entity.Homework;
import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
/*    @Query(value = "",
            nativeQuery = true)
    Homework getHomework(Long id);*/
}
