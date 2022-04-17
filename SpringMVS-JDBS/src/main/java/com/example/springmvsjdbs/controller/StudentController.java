package com.example.springmvsjdbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @GetMapping("/")
    public String getHello() {
        return "hello";
    }
}
