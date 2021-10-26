package com.example.lab14_16.persistanse.dto.mapper;

import com.example.lab14_16.persistanse.dto.EntrantDto;
import com.example.lab14_16.persistanse.model.Entrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EntrantMapper {
    @Mapping(target = "fio", expression = "java(entrant.getPerson().getFio())")
    @Mapping(target = "faculty", expression = "java(entrant.getFaculty().getName())")
    @Mapping(target = "points", expression = "java(entrant.getPoints())")
    EntrantDto toEntrantDto(Entrant entrant);


}
