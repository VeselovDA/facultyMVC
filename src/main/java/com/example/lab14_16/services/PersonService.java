package com.example.lab14_16.services;

import com.example.lab14_16.persistanse.model.Person;

import java.util.List;

public interface PersonService {
    void  save(Person person);
    List<Person> findAll();
}
