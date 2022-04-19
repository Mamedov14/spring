package com.example.university.repository;

import com.example.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT * FROM student WHERE id = ?1", nativeQuery = true)
    Optional<Student> findById(Long id);

    //    @Modifying
    //    @Transactional
    @Modifying
    @Query(value = "INSERT INTO student(age, course, email, last_name, name) " +
            "VALUES(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void save(Integer age, Integer course, String email, String lastName, String name);
}
