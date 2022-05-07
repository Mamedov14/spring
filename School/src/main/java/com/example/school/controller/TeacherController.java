package com.example.school.controller;

import com.example.school.dto.teacher.SubjectRating;
import com.example.school.entity.Homework;
import com.example.school.entity.Rating;
import com.example.school.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping("/giveHomework/")
    public void giveHomework(@RequestBody Homework homework) {
        teacherService.giveHomework(homework);
    }

    @GetMapping("/getSubjectRating/{id}")
    public List<SubjectRating> getSubjectRating(@PathVariable Long id) {
        return teacherService.getSubjectRating(id);
    }

    @PostMapping("/rateStudent/")
    public void rateStudent(@RequestBody Rating rating) {
        teacherService.rateStudent(rating);
    }
}
