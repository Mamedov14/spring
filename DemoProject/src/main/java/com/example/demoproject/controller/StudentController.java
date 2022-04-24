package com.example.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
@RequestMapping("/")
public class StudentController {

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }
}
