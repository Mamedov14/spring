package com.example.school.service;

import com.example.school.dto.StudentDTO;
import com.example.school.entity.Student;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentDTO findByIdStudent(Long id) {
        return studentRepository.findByIdStudent(id);
    }
}
