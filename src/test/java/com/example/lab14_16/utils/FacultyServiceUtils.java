package com.example.lab14_16.utils;

import com.example.lab14_16.persistanse.model.Faculty;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FacultyServiceUtils {

    public Faculty createFaculty(int minPoint){
        Faculty faculty=new Faculty();
        faculty.setFacultyId(1);
        faculty.setMinimumPoints(minPoint);
        faculty.setCountPlace(20);
        return faculty;
    }
}
