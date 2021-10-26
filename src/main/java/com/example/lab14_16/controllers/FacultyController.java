package com.example.lab14_16.controllers;

import com.example.lab14_16.persistanse.model.Faculty;
import com.example.lab14_16.services.FacultyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class FacultyController {
    private final FacultyService facultyService;

    @PostMapping("/addFaculty")
    public String addFaculty(@ModelAttribute("faculty")Faculty faculty){
        facultyService.save(faculty);
        log.info("добавлен {}",faculty.getName());
        return "addFaculty";
    }
}
