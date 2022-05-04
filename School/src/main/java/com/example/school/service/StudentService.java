package com.example.school.service;

import com.example.school.dto.student.StudentDTO;
import com.example.school.dto.student.StudentHomework;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
