package com.scms;

public class Grade {

    private double marks;

    public Grade(double marks) {
        setMarks(marks);
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    public String getLetterGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getPerformanceStatus() {
        if (marks >= 50) {
            return "Pass";
        }
        return "Fail";
    }

    @Override
    public String toString() {
        return "Marks: " + marks +
                ", Grade: " + getLetterGrade() +
                ", Status: " + getPerformanceStatus();
    }
}