package com.example.school.controller;

import com.example.school.dto.StudentDTO;
import com.example.school.entity.Student;
import com.example.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/homework/{id}")
    public StudentDTO findByIdStudent(@PathVariable Long id) {
        return studentService.findByIdStudent(id);
    }
}
