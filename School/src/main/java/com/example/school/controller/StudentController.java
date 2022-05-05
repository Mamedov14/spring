package com.example.school.controller;

import com.example.school.dto.student.*;
import com.example.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.format.annotation.DateTimeFormat.ISO.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students/")
    public List<StudentDTO> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/homework/{id}")
    public List<StudentHomework> getHomework(@PathVariable Long id) {
        return studentService.getHomework(id);
    }

    @GetMapping("/subjectHomework/{subjectName}")
    public List<SubjectHomework> getSubjectHomework(@PathVariable String subjectName) {
        return studentService.getSubjectHomework(subjectName);
    }

    @GetMapping("/getHomeworkByDate/")
    public List<HomeworkByDate> getHomeworkByDate(@RequestParam @DateTimeFormat(iso = DATE) LocalDate dateEnd) {
        return studentService.getHomeworkByDate(dateEnd);
    }

    @GetMapping("/getRatingStudent/{id}")
    public List<StudentRating> getRatingStudent(@PathVariable Long id) {
        return studentService.getRatingStudent(id);
    }
}