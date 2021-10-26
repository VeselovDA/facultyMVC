package com.example.lab14_16.controllers;

import com.example.lab14_16.persistanse.model.Person;
import com.example.lab14_16.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PersonController {
    private final PersonService personService;

    @PostMapping("/addPerson")
    public String addPerson(@ModelAttribute("person")Person person){
        personService.save(person);
        log.info("Добавлен {}",person.getFio());
        return "addPerson";
    }
}
