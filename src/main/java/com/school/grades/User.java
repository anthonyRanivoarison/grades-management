package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter

public class User {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
}
