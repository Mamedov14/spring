package com.example.university.controller;

import com.example.university.entity.Student;
import com.example.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/university")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/student/save")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
}