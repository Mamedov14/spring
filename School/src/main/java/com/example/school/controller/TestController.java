package com.example.school.controller;

import com.example.school.entity.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping("/api")
    public List<Student> getStudents() {
        return List.of(new Student(1L, "street Belana"),
                new Student(2L, "street Merkulova"),
                new Student(3L, "street Katukova"));
    }
}