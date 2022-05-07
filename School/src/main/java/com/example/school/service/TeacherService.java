package com.example.school.service;

import com.example.school.dto.director.ProgressByClass;
import com.example.school.dto.teacher.SubjectRating;
import com.example.school.entity.Homework;
import com.example.school.entity.Rating;
import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public void giveHomework(Homework homework) {
        if (homework.getContent() != null &&
                homework.getSubject_id() != null &&
                homework.getTeacher_id() != null) {
            log.info("Give Homework!");
            teacherRepository.giveHomework(homework);
        } else {
            log.error("giveHomework request ERROR!");
        }
    }

    public List<SubjectRating> getSubjectRating(Long id) {
        return teacherRepository.getSubjectRating(id);
    }

    public void rateStudent(Rating rating) {
        teacherRepository.rateStudent(rating);
    }

    public List<ProgressByClass> getProgressByClass(String className) {
        return teacherRepository.getProgressByClass(className);
    }
}
