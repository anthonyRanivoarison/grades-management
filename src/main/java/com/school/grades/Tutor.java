package com.school.grades;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class Tutor extends User {
    private final String description;

    public Tutor(int id, String lastName, String firstName, LocalDate birthDate, String email, String phoneNumber, String description) {
        super(id, lastName, firstName, birthDate, email, phoneNumber);
        this.description = description;
    }
}
