package com.example.school.controller;

import com.example.school.entity.Homework;
import com.example.school.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping("/giveHomework/")
    public void giveHomework(@RequestBody Homework homework) {
        teacherService.giveHomework(homework);
    }
}
