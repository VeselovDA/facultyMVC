package com.example.lab14_16.controllers;

import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Faculty;
import com.example.lab14_16.services.EntrantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class EntrantController {
    private final EntrantService entrantService;

    @PostMapping("/addEntrant")
    public String addEntrant(@ModelAttribute("entrant") Entrant entrant){
        entrantService.save(entrant);
        log.info("добавлен абитуриент {} на факультет {}",entrant.getPerson().getFio(),entrant.getFaculty().getName());
        return "addEntrant";
    }

}
