package com.example.university.service;

import com.example.university.dto.StudentDto;
import com.example.university.entity.Student;
import com.example.university.mapper.StudentMapper;
import com.example.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudentService implements BaseService<StudentDto> {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }


    @Override
    public List<StudentDto> findAll() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(studentMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto findById(Long id) {
        Student student = studentRepository.findByIdStudent(id);
        return studentMapper.toDto(student);
    }

    public void save(StudentDto studentDto) {
        studentRepository.saveStudent(studentDto.getName(),
                studentDto.getLastName(), studentDto.getEmail(),
                studentDto.getCourse(), studentDto.getAge());
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteByIdStudent(id);
    }

    @Override
    public void update(StudentDto studentDto) {
        studentRepository.updateStudent(studentDto.getId(), studentDto.getName(),
                studentDto.getLastName(), studentDto.getEmail(), studentDto.getCourse(),
                studentDto.getAge());
    }
}
