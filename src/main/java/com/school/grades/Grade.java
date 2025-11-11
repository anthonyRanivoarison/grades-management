package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter

public class Grade {
    private final int id;
    private final Exam exam;
    private final List<ChangeReason> changeReason;
    private final LocalDate createdAt;
}
