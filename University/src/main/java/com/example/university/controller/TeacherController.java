package com.example.university.controller;

import com.example.university.dto.TeacherDto;
import com.example.university.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<TeacherDto> findAllStudent() {
        return teacherService.findAll();
    }

    @GetMapping("/teacher/{id}")
    public TeacherDto findByIdStudent(@PathVariable Long id) {
        return teacherService.findById(id);
    }

    @PostMapping("/teacher/save")
    public void saveStudent(@RequestBody TeacherDto teacherDto) {
        teacherService.save(teacherDto);
    }

    @DeleteMapping("/teacher/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        teacherService.delete(id);
    }

    @PutMapping("/teacher/update")
    public void updateStudent(@RequestBody TeacherDto teacherDto) {
        teacherService.update(teacherDto);
    }


}
