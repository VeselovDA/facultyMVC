package com.example.lab14_16.persistanse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Table(name = "person")
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int personId;

    @Column(name = "email")
    private String email;

    @Column(name = "fio")
    private String fio;
}
