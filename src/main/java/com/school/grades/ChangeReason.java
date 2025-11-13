package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter

public class ChangeReason {
    private final double value;
    private final Instant date;
    private final String reason;
}
