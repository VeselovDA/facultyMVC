package com.example.lab14_16.persistanse.repository;

import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrantRepository extends JpaRepository<Entrant,Integer> {
}
