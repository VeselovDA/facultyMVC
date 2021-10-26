package com.example.lab14_16.services.impl;

import com.example.lab14_16.persistanse.model.Faculty;
import com.example.lab14_16.persistanse.repository.FacultyRepository;
import com.example.lab14_16.services.FacultyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    @Override
    public void save(Faculty faculty) {
        facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty findByID(int id) {
        return facultyRepository.getById(id);
    }
}
