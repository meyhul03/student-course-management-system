package com.scms;

public class Enrollment {

    private String enrollmentId;
    private String studentId;
    private String courseCode;
    private String semester;
    private String grade;

    public Enrollment(String enrollmentId, String studentId, String courseCode,
                      String semester, String grade) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.semester = semester;
        this.grade = grade;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId='" + enrollmentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", semester='" + semester + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}