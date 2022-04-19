package com.example.university.repository;

import com.example.university.entity.Student;
import com.example.university.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value = "SELECT * FROM teacher WHERE id = ?1", nativeQuery = true)
    Optional<Teacher> findById(Long id);


}
