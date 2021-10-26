package com.example.lab14_16.utils;

import com.example.lab14_16.persistanse.model.Entrant;
import com.example.lab14_16.persistanse.model.Faculty;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@UtilityClass
public class EntrantServiceUtils {
    public List<Entrant> createExpectedEntrantList(int count,boolean minValuePoint){
        int point=200;
        if(minValuePoint)
            point=0;
        int finalPoint = point;
        return IntStream.range(0, count)
                .mapToObj((i)->EntrantServiceUtils.createEntrant(i, finalPoint))
                .collect(Collectors.toList());
    }
    public Entrant createEntrant(int suffix,int point){
        Entrant entrant=new Entrant();
        entrant.setEntrantId(suffix);
        entrant.setFaculty(FacultyServiceUtils.createFaculty(100));
        entrant.setPoints(point);
        entrant.setPerson(PersonServiceUtils.createPerson(suffix));
        return entrant;
    }

}
