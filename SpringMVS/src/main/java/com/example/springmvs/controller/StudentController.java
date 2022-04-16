package com.example.springmvs.controller;

import com.example.springmvs.model.Student;
import com.example.springmvs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public Student updateStudent(Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/id")
    public ResponseEntity deleteById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(studentService.deleteById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Don't delete student with id = " + id);
        }
    }
}
