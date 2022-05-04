package com.example.school.controller;

import com.example.school.dto.student.HomeworkByDate;
import com.example.school.dto.student.StudentDTO;
import com.example.school.dto.student.StudentHomework;
import com.example.school.dto.student.SubjectHomework;
import com.example.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

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

    @GetMapping("/getHomeworkByDate/{dateEnd}")
    public List<HomeworkByDate> getHomeworkByDate(@PathVariable LocalDateTime dateEnd) {
        return studentService.getHomeworkByDate(dateEnd);
    }
}
