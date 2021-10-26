package com.example.lab14_16.utils;

import com.example.lab14_16.persistanse.model.Person;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PersonServiceUtils {
    private final String TEST_STRING="test";
    Person createPerson(int suffix){
        Person person=new Person();
        person.setEmail(TEST_STRING+suffix);
        person.setFio(TEST_STRING+suffix);
        return person;
    }
}
