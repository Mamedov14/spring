package com.example.university.repository;

import com.example.university.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value = "SELECT * FROM teacher WHERE id = ?1", nativeQuery = true)
    Teacher findByIdTeacher(Long id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO teacher(fio, subject) " +
            "VALUES(?1, ?2)", nativeQuery = true)
    void saveTeacher(String name, String subject);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM teacher WHERE id = ?1", nativeQuery = true)
    void deleteByIdTeacher(Long id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE teacher SET fio=?2, subject=?3 " +
            "WHERE id=?1", nativeQuery = true)
    void updateTeacher(Long id, String name, String subject);
}
