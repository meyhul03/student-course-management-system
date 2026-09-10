package com.scms;

public class CourseManagerTest {

    public static void main(String[] args) {

        CourseManager manager = new CourseManager();

        Course course = new Course(
                "CS101",
                "Programming in Java",
                4,
                "Dr. Sharma"
        );

        System.out.println("Adding course: " +
                manager.addCourse(course));

        System.out.println("\nSearching course:");

        Course found = manager.findCourse("CS101");

        if (found != null) {
            System.out.println(found);
        }

        System.out.println("\nUpdating course...");

        manager.updateCourse(
                "CS101",
                "Advanced Java Programming",
                4,
                "Dr. Sharma"
        );

        System.out.println(manager.findCourse("CS101"));

        System.out.println("\nDeleting course: " +
                manager.deleteCourse("CS101"));

        System.out.println("\nSearching after deletion: " +
                manager.findCourse("CS101"));
    }
}