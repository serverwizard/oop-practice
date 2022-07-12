package org.example.grade.domain;

public class GradeResult {
    final private double averageGrade;
    final private int totalCompletedCredit;

    public GradeResult(double averageGrade, int totalCompletedCredit) {
        this.averageGrade = averageGrade;
        this.totalCompletedCredit = totalCompletedCredit;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getTotalCompletedCredit() {
        return totalCompletedCredit;
    }
}
