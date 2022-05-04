package com.example.school.service;

import com.example.school.dto.student.HomeworkByDate;
import com.example.school.dto.student.StudentDTO;
import com.example.school.dto.student.StudentHomework;
import com.example.school.dto.student.SubjectHomework;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public List<HomeworkByDate> getHomeworkByDate(LocalDateTime dateEnd) {
        return studentRepository.getHomeworkByDate(dateEnd);
    }
}
