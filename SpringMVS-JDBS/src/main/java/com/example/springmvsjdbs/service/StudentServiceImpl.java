package com.example.springmvsjdbs.service;

import com.example.springmvsjdbs.dao.StudentDao;
import com.example.springmvsjdbs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
