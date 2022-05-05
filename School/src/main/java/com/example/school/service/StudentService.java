package com.example.school.service;

import com.example.school.dto.student.*;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<StudentDTO> findAllStudents() {
        return studentRepository.findAllStudents();
    }

    public List<StudentHomework> getHomework(Long id) {
        return studentRepository.getHomework(id);
    }

    public List<SubjectHomework> getSubjectHomework(String subjectName) {
        return studentRepository.getSubjectHomework(subjectName);
    }

    public List<HomeworkByDate> getHomeworkByDate(LocalDate dateEnd) {
        return studentRepository.getHomeworkByDate(dateEnd);
    }

    public List<StudentRating> getRatingStudent(Long id) {
        return studentRepository.getRatingStudent(id);
    }
}
