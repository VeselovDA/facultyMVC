package com.example.lab14_16.services.impl;

import com.example.lab14_16.persistanse.dto.EntrantDto;
import com.example.lab14_16.persistanse.dto.mapper.EntrantMapper;
import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Faculty;
import com.example.lab14_16.persistanse.repository.EntrantRepository;
import com.example.lab14_16.services.EntrantService;
import com.example.lab14_16.services.FacultyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class EntrantServiceImpl implements EntrantService {

    private final EntrantRepository entrantRepository;
    private final EntrantMapper entrantMapper;
    private final FacultyService facultyService;

    @Override
    public List<Entrant> findAll() {
        return entrantRepository.findAll();
    }

    @Override
    public List<EntrantDto> getDto() {
        return findAll().stream().map(entrantMapper::toEntrantDto).collect(Collectors.toList());
    }

    @Override
    public List<EntrantDto> getDtoOnFaculty(int facultyId) {
        log.info("факультет {}", facultyId);
        Faculty faculty=facultyService.findByID(facultyId);

        return findAll()
                .stream()
                .filter(entrant -> entrant.getFaculty().getFacultyId() == facultyId)
                .filter(entrant -> entrant.getPoints()>faculty.getMinimumPoints())
                .sorted(Comparator.comparing(Entrant::getPoints))
                .map(entrantMapper::toEntrantDto)
                .limit(faculty.getCountPlace())
                .collect(Collectors.toList());
    }

    @Override
    public void save(Entrant entrant) {
        entrantRepository.save(entrant);

    }
}
