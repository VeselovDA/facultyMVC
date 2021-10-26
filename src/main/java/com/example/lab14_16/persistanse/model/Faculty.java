package com.example.lab14_16.persistanse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "faculty")
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Faculty {
    @Id
    @Column(name = "faculty_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facultyId;

    @Column(name ="count_place")
    private int countPlace;

    @Column(name ="minimum_points")
    private int minimumPoints;

    @Column(name ="name")
    private String name;
}