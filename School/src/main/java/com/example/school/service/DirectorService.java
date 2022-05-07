package com.example.school.service;

import com.example.school.dto.director.ProgressByClass;
import com.example.school.repository.DirectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectorService {
    private final DirectorRepository directorRepository;

    public List<ProgressByClass> getProgressByClass(String className) {
        return directorRepository.getProgressByClass(className);
    }
}
