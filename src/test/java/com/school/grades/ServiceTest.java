package com.school.grades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    private Tutor tutor;
    private Teacher teacher;
    private Student student;
    private Course course;
    private Exam exam1;
    private Exam exam2;
    private Grade g1;
    private Grade g2;
    private Service service;
    private Instant now;


    @BeforeEach
    public void setUp()  {
        tutor = new Tutor(1, "Ravao", "Maria", LocalDate.of(1980,1,1), "ravaomaria@mail.com","0349002890","Parent");
        student = new Student(1, "Rakotoarivony", "Manitra", LocalDate.of(2005,5,5), "manitrarakotoarivony@mail.com", "0328090877", "N1", tutor);
        teacher = new Teacher(1, "Andriamatoa", "Manda", LocalDate.of(1975, 3, 3), "manda@mail.com", "0381234578", Speciality.BACKEND);
        course = new Course(1, "PROG1", 5, teacher);
        exam1 = new Exam(1, "PROG1 - First exam", course, LocalDateTime.now(), 4);
        exam2 = new Exam(2, "WEB1 - First exam", course, LocalDateTime.now(), 2);
        now = Instant.now();

        g1 = new Grade(student, exam1, 10, new ArrayList<>());
        g2 = new Grade(student, exam2, 15, new ArrayList<>());
        service = new Service(List.of(g1, g2));

    }

    @Test
    public void getExamGrade() {
        assertEquals(10.0, service.getExamGrade(exam1, student, now), 0.0001);
    }

    @Test
    public void getCourseGrade() {
        double expectedValue = (12*2 + 15*3) / 5.0;
        assertEquals(expectedValue, service.getCourseGrade(course, student, now));
    }
}