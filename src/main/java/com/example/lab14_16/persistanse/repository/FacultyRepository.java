package com.example.lab14_16.persistanse.repository;

import com.example.lab14_16.persistanse.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,Integer> {
}
