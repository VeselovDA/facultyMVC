package com.example.lab14_16.service;

import com.example.lab14_16.BaseTest;
import com.example.lab14_16.persistanse.dto.EntrantDto;
import com.example.lab14_16.persistanse.repository.EntrantRepository;
import com.example.lab14_16.persistanse.repository.FacultyRepository;
import com.example.lab14_16.services.EntrantService;
import com.example.lab14_16.services.FacultyService;
import com.example.lab14_16.utils.EntrantServiceUtils;
import com.example.lab14_16.utils.FacultyServiceUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;

public class EntrantServiceTest extends BaseTest {
    @Autowired
    private EntrantService entrantService;
    @MockBean
    private EntrantRepository entrantRepository;
    @MockBean
    private FacultyService facultyService;

    @Test
    public void filterEntrant() {
        when(entrantRepository.findAll()).thenReturn(EntrantServiceUtils.createExpectedEntrantList(5,false));
        when(facultyService.findByID(1)).thenReturn(FacultyServiceUtils.createFaculty(100));

        List<EntrantDto> actual=entrantService.getDtoOnFaculty(1);
        Assertions.assertThat(actual).hasSize(5);
        when(entrantRepository.findAll()).thenReturn(EntrantServiceUtils.createExpectedEntrantList(5,true));
        actual=entrantService.getDtoOnFaculty(1);
        Assertions.assertThat(actual).hasSize(0);
    }
}
