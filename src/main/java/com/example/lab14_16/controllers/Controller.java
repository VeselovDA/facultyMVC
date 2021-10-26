package com.example.lab14_16.controllers;

import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Faculty;
import com.example.lab14_16.persistanse.model.Person;
import com.example.lab14_16.services.EntrantService;
import com.example.lab14_16.services.FacultyService;
import com.example.lab14_16.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {
    private final PersonService personService;
    private final FacultyService facultyService;
    private final EntrantService entrantService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("facultyList",facultyService.findAll());
        model.addAttribute("entrantList",entrantService.getDto());
        return "index";
    }

    @GetMapping("/addPerson")
    public String addPerson(@ModelAttribute("person") Person person){
        return "addPerson";
    }
    @GetMapping("/addFaculty")
    public String addFaculty(@ModelAttribute("faculty") Faculty faculty){
        return "addFaculty";
    }
    @GetMapping("/addEntrant")
    public String addEntrant(@ModelAttribute("entrant") Entrant entrant,Model model){
        model.addAttribute("personList",personService.findAll());
        model.addAttribute("facultyList",facultyService.findAll());
        return "addEntrant";
    }
    @GetMapping("/showListOnFaculty")
    public String ratingListFaculty(@ModelAttribute("faculty") Faculty faculty,Model model){
        if (faculty.getFacultyId() == 0) {
            faculty.setFacultyId(1);
        } else {
            faculty.setFacultyId(faculty.getFacultyId());
        }
        model.addAttribute("entrantList",entrantService.getDtoOnFaculty(faculty.getFacultyId()));
        model.addAttribute("facultyList",facultyService.findAll());
        faculty.setName(facultyService.findByID(faculty.getFacultyId()).getName());
        return "facultyList";
    }
}
