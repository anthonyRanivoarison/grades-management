package com.school.grades;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Service {
    private final List<Grade> grades;

    public double getGradeAt(Grade grade, Instant t) {
        double result = grade.getInitialValue();

        for (ChangeReason change : grade.getHistory()) {
            if (!change.getDate().isAfter(t)) {
                result = change.getValue();
            }
        }
        return result;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return grades.stream()
                .filter(grade -> grade.getExam().equals(exam)
                        && grade.getStudent().equals(student))
                .findFirst()
                .map(grade -> getGradeAt(grade, t))
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double sum = 0.0;
        int totalCoef = 0;

        for (Grade grade : grades) {
            if (grade.getExam().getCourse().equals(course)
                    && grade.getStudent().equals(student)) {

                int coef = grade.getExam().getCoefficient();
                double valueAtT = getGradeAt(grade, t);

                sum += valueAtT * coef;
                totalCoef += coef;
            }
        }

        return totalCoef != 0 ? sum / totalCoef : 0.0;
    }
}