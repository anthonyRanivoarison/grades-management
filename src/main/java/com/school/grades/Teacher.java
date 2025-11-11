package com.school.grades;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class Teacher extends User {
    private final Speciality speciality;

    public Teacher(int id, String lastName, String firstName, LocalDate birthDate, String email, String phoneNumber, Speciality speciality) {
        super(id, lastName, firstName, birthDate, email, phoneNumber);
        this.speciality = speciality;
    }
}
