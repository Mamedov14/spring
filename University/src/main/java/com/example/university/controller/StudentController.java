package com.example.university.controller;

import com.example.university.entity.Student;
import com.example.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Student> findAllStudent() {
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Student findByIdStudent(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/student/save")
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PutMapping("/student/update")
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }
}