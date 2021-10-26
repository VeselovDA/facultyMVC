package com.example.lab14_16.services;

import com.example.lab14_16.persistanse.model.Faculty;

import java.util.List;

public interface FacultyService  {
    void save(Faculty faculty);
    List<Faculty> findAll();
    Faculty findByID(int id);

}
