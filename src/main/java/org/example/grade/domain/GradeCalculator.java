package org.example.grade.domain;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public GradeResult calculateGrade() {
        double sum = 0;
        for (Course course : courses) {
            sum += course.getCredit() * course.getGradeToNumber(); // TODO Refactoring : 학점수×교과목 평점
        }

        double averageGrade = sum / getTotalCompletedCredit(courses);

        return new GradeResult(averageGrade, getTotalCompletedCredit(courses));
    }

    // 총 이수한 학점
    private int getTotalCompletedCredit(List<Course> courses) {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
