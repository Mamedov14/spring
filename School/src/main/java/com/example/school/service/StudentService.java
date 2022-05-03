package com.example.school.service;

import com.example.school.dto.StudentHomework;
import com.example.school.entity.Student;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
//  private final StudentHomeworkMapper studentHomeworkMapper;

    public Student getHomework(Long id) {
        return studentRepository.getHomework(id);
    }
}
