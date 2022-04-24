package com.example.demoproject.controller;

import com.example.demoproject.entity.Student;
import com.example.demoproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/")
    public String get() {
        return "hello";
    }

    @GetMapping("/student/{id}")
    public String findById(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "student";
    }


    @GetMapping("/students")
    public String findAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @GetMapping("/save")
    public String getSave() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

}
