package com.example.springmvsjdbs.controller;

import com.example.springmvsjdbs.entity.Student;
import com.example.springmvsjdbs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "helloStudent";
    }

    @GetMapping("/students")
    public String findAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "listStudents";
    }

    @GetMapping("student/{id}")
    public String findById(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "showStudent";
    }

    @GetMapping("addStudent")
    public String createStudent() {
        return "createStudent";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/update{id}")
    public String updateStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "updateStudent";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentService.update(student);
        return "redirect:/student/" + student.getId();
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
        return "redirect:/students";
    }
}
