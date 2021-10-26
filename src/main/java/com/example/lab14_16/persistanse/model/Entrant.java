package com.example.lab14_16.persistanse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "entrant")
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Entrant {
    @Id
    @Column(name = "entrant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entrantId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @Column(name ="points")
    private int points;
}
