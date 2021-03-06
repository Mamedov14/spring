package com.example.university.controller;

import com.example.university.dto.StudentDto;
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
    public List<StudentDto> findAllStudent() {
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public StudentDto findByIdStudent(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/student/save")
    public void saveStudent(@RequestBody StudentDto studentDto) {
        studentService.save(studentDto);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PutMapping("/student/update")
    public void updateStudent(@RequestBody StudentDto studentDto) {
        studentService.update(studentDto);
    }
}