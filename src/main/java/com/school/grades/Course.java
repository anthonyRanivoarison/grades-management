package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Course {
    private final int id;
    private final String label;
    private final int credit;
    private final Teacher teacher;
}
