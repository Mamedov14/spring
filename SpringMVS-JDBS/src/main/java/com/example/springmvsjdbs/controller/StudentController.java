package com.example.springmvsjdbs.controller;

import com.example.springmvsjdbs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/students")
    public String findAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentsList";
    }

    @GetMapping("student/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "showStudent";
    }
}
