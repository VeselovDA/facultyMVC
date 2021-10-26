package com.example.lab14_16.services.impl;

import com.example.lab14_16.persistanse.model.Person;
import com.example.lab14_16.persistanse.repository.PersonRepository;
import com.example.lab14_16.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
