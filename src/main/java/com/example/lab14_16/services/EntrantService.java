package com.example.lab14_16.services;

import com.example.lab14_16.persistanse.dto.EntrantDto;
import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Person;

import java.util.List;

public interface EntrantService {
    List<Entrant> findAll();
    List<EntrantDto> getDto();
    List<EntrantDto> getDtoOnFaculty(int facultyId);
    void  save(Entrant entrant);
}
