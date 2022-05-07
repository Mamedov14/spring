package com.example.school.controller;

import com.example.school.dto.director.ProgressByClass;
import com.example.school.service.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DirectorController {
    private final DirectorService directorService;

    @GetMapping("/getProgressByClass/{className}")
    public List<ProgressByClass> getProgressByClass(@PathVariable String className) {
        return directorService.getProgressByClass(className);
    }
}
