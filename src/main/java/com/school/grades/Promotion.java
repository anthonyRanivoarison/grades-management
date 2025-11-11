package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class Promotion {
    private final List<String> groups;
}
