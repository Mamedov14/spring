package com.example.university.repository;

import com.example.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT * FROM student WHERE id = ?1", nativeQuery = true)
    Student findByIdStudent(Long id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO student(name, last_name, email, course, age) " +
            "VALUES(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void saveStudent(String name, String lastName, String email, Integer course, Integer age);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM student WHERE id = ?1", nativeQuery = true)
    void deleteByIdStudent(Long id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE student SET name=?2, last_name=?3, email=?4, course=?5, age=?6 " +
            "WHERE id=?1", nativeQuery = true)
    void updateStudent(Long id, String name, String lastName, String email, Integer course, Integer age);
}
