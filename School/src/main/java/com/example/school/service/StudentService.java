package com.example.school.service;

import com.example.school.dto.student.*;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<StudentDTO> findAllStudents() {
        log.info("Find All Student!");
        return studentRepository.findAllStudents();
    }

    public List<StudentHomework> getHomework(Long id) {
        log.info("Student homework with id: {}", id);
        return studentRepository.getHomework(id);
    }

    public List<SubjectHomework> getSubjectHomework(String subjectName) {
        log.info("Student homework with subject name: {}", subjectName);
        return studentRepository.getSubjectHomework(subjectName);
    }

    public List<HomeworkByDate> getHomeworkByDate(LocalDate dateEnd) {
        log.info("Homework for the date: {}", dateEnd);
        return studentRepository.getHomeworkByDate(dateEnd);
    }

    public List<StudentRating> getRatingStudent(Long id) {
        log.info("Student ratings with id: {}", id);
        return studentRepository.getRatingStudent(id);
    }
}
