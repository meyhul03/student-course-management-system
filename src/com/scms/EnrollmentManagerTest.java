package com.scms;

public class EnrollmentManagerTest {

    public static void main(String[] args) {

        EnrollmentManager manager = new EnrollmentManager();

        Enrollment enrollment1 = new Enrollment(
                "E001",
                "S001",
                "CS101",
                "2026-27 Semester 1",
                "A"
        );

        System.out.println("Adding first enrollment: "
                + manager.addEnrollment(enrollment1));

        System.out.println("\nChecking enrollment:");
        System.out.println(manager.findEnrollment("E001"));

        Enrollment duplicateEnrollment = new Enrollment(
                "E002",
                "S001",
                "CS101",
                "2026-27 Semester 1",
                "B"
        );

        System.out.println("\nAdding duplicate student-course enrollment: "
                + manager.addEnrollment(duplicateEnrollment));

        Enrollment secondEnrollment = new Enrollment(
                "E003",
                "S001",
                "CS102",
                "2026-27 Semester 1",
                "A"
        );

        System.out.println("\nAdding enrollment for another course: "
                + manager.addEnrollment(secondEnrollment));

        System.out.println("\nAll enrollments:");
        manager.displayAllEnrollments();

        System.out.println("\nRemoving E001: "
                + manager.removeEnrollment("E001"));

        System.out.println("\nEnrollments after removal:");
        manager.displayAllEnrollments();
    }
}