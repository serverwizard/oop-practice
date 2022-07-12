package org.example.grade.domain;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public GradeResult calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber(); // TODO Refactoring : 학점수×교과목 평점
        }
        int totalCompletedCredit = getTotalCompletedCredit();
        double averageGrade = multipliedCreditAndCourseGrade / totalCompletedCredit;

        return new GradeResult(averageGrade, totalCompletedCredit);
    }

    // 총 이수한 학점
    private int getTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
