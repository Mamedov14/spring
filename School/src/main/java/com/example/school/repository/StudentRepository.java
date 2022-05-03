package com.example.school.repository;

import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Transactional
    @Query(value = """
            SELECT *
                FROM students
                        JOIN persons ON students.person_id = persons.id
                        JOIN "class" ON "class".id = students.class_id
                        JOIN teachers ON "class".teacher_id = teachers.id
                        JOIN homeworks ON teachers.id = homeworks.teacher_id
                        JOIN subjects ON homeworks.subject_id = subjects.id
                    WHERE students.id = ?1""", nativeQuery = true)
    Student getHomework(Long id);
}