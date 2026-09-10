package com.scms;

public class StudentManagerTest {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student student = new Student(
                "S001",
                "Rahul Sharma",
                "rahul@example.com",
                "Computer Science"
        );

        System.out.println("Adding student: " +
                manager.addStudent(student));

        System.out.println("Searching student:");

        Student found = manager.findStudent("S001");

        if (found != null) {
            System.out.println(found);
        }

        System.out.println("\nUpdating student...");

        manager.updateStudent(
                "S001",
                "Rahul Sharma",
                "rahul.sharma@example.com",
                "Information Technology"
        );

        System.out.println(manager.findStudent("S001"));

        System.out.println("\nDeleting student: " +
                manager.deleteStudent("S001"));

        System.out.println("\nSearching after deletion: " +
                manager.findStudent("S001"));
    }
}