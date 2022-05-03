package com.example.school.controller;

import com.example.school.dto.StudentHomework;
import com.example.school.entity.Student;
import com.example.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/homework/{id}")
    public Student getHomework(@PathVariable Long id) {
        return studentService.getHomework(id);
    }
}
