package com.example.university.service;

import com.example.university.dto.TeacherDto;
import com.example.university.entity.Teacher;
import com.example.university.mapper.TeacherMapper;
import com.example.university.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService implements BaseService<TeacherDto> {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository, TeacherMapper teacherMapper) {
        this.teacherRepository = teacherRepository;
        this.teacherMapper = teacherMapper;
    }

    @Override
    public List<TeacherDto> findAll() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teachers.stream().map(teacherMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public TeacherDto findById(Long id) {
        Teacher teacher = teacherRepository.findByIdTeacher(id);
        return teacherMapper.toDto(teacher);
    }

    @Override
    public void save(TeacherDto teacherDto) {
        teacherRepository.saveTeacher(teacherDto.getFIO(), teacherDto.getSubject());
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteByIdTeacher(id);
    }

    @Override
    public void update(TeacherDto teacherDto) {
        teacherRepository.updateTeacher(teacherDto.getId(), teacherDto.getFIO(), teacherDto.getSubject());
    }
}
