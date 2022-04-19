package com.example.university.service;

import com.example.university.entity.Student;
import com.example.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    public void saveStudent(Student student) {
        studentRepository.saveStudent(student.getName(),
                student.getLastName(), student.getEmail(),
                student.getCourse(), student.getAge());
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentRepository.update(student.getId(), student.getName(),
                student.getLastName(), student.getEmail(), student.getCourse(),
                student.getAge());
    }
}
