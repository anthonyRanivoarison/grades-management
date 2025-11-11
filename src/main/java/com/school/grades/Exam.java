package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter

public class Exam {
    private final int id;
    private final String title;
    private final Course course;
    private final LocalDateTime examDateTime;
    private final int coefficient;
}
