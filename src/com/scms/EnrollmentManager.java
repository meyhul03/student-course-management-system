package com.scms;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentManager {

    private final List<Enrollment> enrollments;

    public EnrollmentManager() {
        enrollments = new ArrayList<>();
    }

    public boolean addEnrollment(Enrollment enrollment) {

        if (findEnrollment(enrollment.getEnrollmentId()) != null) {
            return false;
        }

        // Prevent the same student from enrolling in the same course
        if (isStudentEnrolled(enrollment.getStudentId(),
                               enrollment.getCourseCode())) {
            return false;
        }

        enrollments.add(enrollment);
        return true;
    }

    public Enrollment findEnrollment(String enrollmentId) {

        for (Enrollment enrollment : enrollments) {
            if (enrollment.getEnrollmentId()
                    .equalsIgnoreCase(enrollmentId)) {
                return enrollment;
            }
        }

        return null;
    }

    public boolean isStudentEnrolled(String studentId, String courseCode) {

        for (Enrollment enrollment : enrollments) {

            if (enrollment.getStudentId()
                    .equalsIgnoreCase(studentId)
                    && enrollment.getCourseCode()
                    .equalsIgnoreCase(courseCode)) {

                return true;
            }
        }

        return false;
    }

    public boolean removeEnrollment(String enrollmentId) {

        Enrollment enrollment = findEnrollment(enrollmentId);

        if (enrollment == null) {
            return false;
        }

        enrollments.remove(enrollment);
        return true;
    }

    public List<Enrollment> getAllEnrollments() {
        return new ArrayList<>(enrollments);
    }

    public void displayAllEnrollments() {

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments available.");
            return;
        }

        System.out.println("\n----- Enrollment List -----");

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}