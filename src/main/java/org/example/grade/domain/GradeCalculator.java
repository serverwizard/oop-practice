package org.example.grade.domain;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public GradeResult calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        double averageGrade = totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

        return new GradeResult(averageGrade, totalCompletedCredit);
    }
}
