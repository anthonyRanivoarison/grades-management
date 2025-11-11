package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class Grade {
    private final Student student;
    private final Exam exam;
    private final double initialValue;
    private final List<ChangeReason> history;
}
