package com.scms;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final StudentManager studentManager = new StudentManager();
    private static final CourseManager courseManager = new CourseManager();
    private static final EnrollmentManager enrollmentManager = new EnrollmentManager();
    private static final FileManager fileManager = new FileManager();

    public static void main(String[] args) {

        loadData();

        System.out.println("========================================");
        System.out.println("   STUDENT COURSE MANAGEMENT SYSTEM");
        System.out.println("========================================");

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    addCourse();
                    break;

                case 6:
                    viewCourses();
                    break;

                case 7:
                    updateCourse();
                    break;

                case 8:
                    deleteCourse();
                    break;

                case 9:
                    enrollStudent();
                    break;

                case 10:
                    viewEnrollments();
                    break;

                case 11:
                    removeEnrollment();
                    break;

                case 12:
                    addGrade();
                    break;

                case 13:
                    generateStudentReport();
                    break;

                case 14:
                    createBackup();
                    break;

                case 15:
                    saveData();
                    System.out.println("Exiting application...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println("\n------------- MAIN MENU -------------");
        System.out.println("1.  Add Student");
        System.out.println("2.  View Students");
        System.out.println("3.  Update Student");
        System.out.println("4.  Delete Student");
        System.out.println("5.  Add Course");
        System.out.println("6.  View Courses");
        System.out.println("7.  Update Course");
        System.out.println("8.  Delete Course");
        System.out.println("9.  Enroll Student");
        System.out.println("10. View Enrollments");
        System.out.println("11. Remove Enrollment");
        System.out.println("12. Add Grade");
        System.out.println("13. Generate Student Report");
        System.out.println("14. Create Backup");
        System.out.println("15. Exit");
        System.out.println("-------------------------------------");
    }

    // ---------------- STUDENT ----------------

    private static void addStudent() {

        System.out.println("\n----- Add Student -----");

        String id = readText("Enter student ID: ");
        String name = readText("Enter student name: ");
        String email = readText("Enter email: ");
        String department = readText("Enter department: ");

        Student student = new Student(id, name, email, department);

        if (studentManager.addStudent(student)) {
            System.out.println("Student added successfully.");
            saveData();
        } else {
            System.out.println("Student ID already exists.");
        }
    }

    private static void viewStudents() {

        System.out.println("\n----- Students -----");

        List<Student> students = studentManager.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void updateStudent() {

        String id = readText("Enter student ID to update: ");

        if (studentManager.findStudent(id) == null) {
            System.out.println("Student not found.");
            return;
        }

        String name = readText("Enter new name: ");
        String email = readText("Enter new email: ");
        String department = readText("Enter new department: ");

        if (studentManager.updateStudent(id, name, email, department)) {
            System.out.println("Student updated successfully.");
            saveData();
        }
    }

    private static void deleteStudent() {

        String id = readText("Enter student ID to delete: ");

        if (studentManager.deleteStudent(id)) {
            System.out.println("Student deleted successfully.");
            saveData();
        } else {
            System.out.println("Student not found.");
        }
    }

    // ---------------- COURSE ----------------

    private static void addCourse() {

        System.out.println("\n----- Add Course -----");

        String code = readText("Enter course code: ");
        String name = readText("Enter course name: ");
        int credits = readInt("Enter credits: ");
        String instructor = readText("Enter instructor name: ");

        if (credits <= 0) {
            System.out.println("Credits must be greater than zero.");
            return;
        }

        Course course = new Course(
                code,
                name,
                credits,
                instructor
        );

        if (courseManager.addCourse(course)) {
            System.out.println("Course added successfully.");
            saveData();
        } else {
            System.out.println("Course code already exists.");
        }
    }

    private static void viewCourses() {

        System.out.println("\n----- Courses -----");

        List<Course> courses = courseManager.getAllCourses();

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private static void updateCourse() {

        String code = readText("Enter course code to update: ");

        if (courseManager.findCourse(code) == null) {
            System.out.println("Course not found.");
            return;
        }

        String name = readText("Enter new course name: ");
        int credits = readInt("Enter new credits: ");
        String instructor = readText("Enter new instructor: ");

        if (credits <= 0) {
            System.out.println("Credits must be greater than zero.");
            return;
        }

        courseManager.updateCourse(
                code,
                name,
                credits,
                instructor
        );

        System.out.println("Course updated successfully.");
        saveData();
    }

    private static void deleteCourse() {

        String code = readText("Enter course code to delete: ");

        if (courseManager.deleteCourse(code)) {
            System.out.println("Course deleted successfully.");
            saveData();
        } else {
            System.out.println("Course not found.");
        }
    }

    // ---------------- ENROLLMENT ----------------

    private static void enrollStudent() {

        System.out.println("\n----- Student Enrollment -----");

        String studentId = readText("Enter student ID: ");

        if (studentManager.findStudent(studentId) == null) {
            System.out.println("Student not found.");
            return;
        }

        String courseCode = readText("Enter course code: ");

        if (courseManager.findCourse(courseCode) == null) {
            System.out.println("Course not found.");
            return;
        }

        String enrollmentId = readText("Enter enrollment ID: ");
        String semester = readText("Enter semester: ");

        Enrollment enrollment = new Enrollment(
                enrollmentId,
                studentId,
                courseCode,
                semester,
                "Not Assigned"
        );

        if (enrollmentManager.addEnrollment(enrollment)) {
            System.out.println("Student enrolled successfully.");
            saveData();
        } else {
            System.out.println(
                    "Enrollment failed. Check enrollment ID "
                    + "or duplicate student-course enrollment."
            );
        }
    }

    private static void viewEnrollments() {

        System.out.println("\n----- Enrollments -----");

        List<Enrollment> enrollments =
                enrollmentManager.getAllEnrollments();

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }

    private static void removeEnrollment() {

        String id = readText("Enter enrollment ID to remove: ");

        if (enrollmentManager.removeEnrollment(id)) {
            System.out.println("Enrollment removed successfully.");
            saveData();
        } else {
            System.out.println("Enrollment not found.");
        }
    }

    // ---------------- GRADE ----------------

    private static void addGrade() {

        System.out.println("\n----- Grade Management -----");

        String enrollmentId =
                readText("Enter enrollment ID: ");

        Enrollment enrollment =
                enrollmentManager.findEnrollment(enrollmentId);

        if (enrollment == null) {
            System.out.println("Enrollment not found.");
            return;
        }

        double marks = readDouble("Enter marks (0-100): ");

        try {

            Grade grade = new Grade(marks);

            enrollment.setGrade(grade.getLetterGrade());

            System.out.println("Grade assigned successfully.");
            System.out.println(grade);

            saveData();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid marks: " + e.getMessage());
        }
    }

    // ---------------- REPORT ----------------

    private static void generateStudentReport() {

        System.out.println("\n----- Student Report -----");

        String studentId =
                readText("Enter student ID: ");

        Student student =
                studentManager.findStudent(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("\nStudent Details");
        System.out.println("-------------------------");
        System.out.println("ID         : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Email      : " + student.getEmail());
        System.out.println("Department : " + student.getDepartment());

        System.out.println("\nEnrollments");
        System.out.println("-------------------------");

        boolean found = false;

        for (Enrollment enrollment :
                enrollmentManager.getAllEnrollments()) {

            if (enrollment.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                found = true;

                System.out.println(
                        "Course    : "
                                + enrollment.getCourseCode());

                System.out.println(
                        "Semester  : "
                                + enrollment.getSemester());

                System.out.println(
                        "Grade     : "
                                + enrollment.getGrade());

                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No enrollments found.");
        }
    }

    // ---------------- BACKUP ----------------

    private static void createBackup() {
        saveData();
        fileManager.createBackup();
    }

    // ---------------- STORAGE ----------------

    private static void saveData() {

        fileManager.saveStudents(
                studentManager.getAllStudents());

        fileManager.saveCourses(
                courseManager.getAllCourses());

        fileManager.saveEnrollments(
                enrollmentManager.getAllEnrollments());
    }

    private static void loadData() {

        for (Student student : fileManager.loadStudents()) {
            studentManager.addStudent(student);
        }

        for (Course course : fileManager.loadCourses()) {
            courseManager.addCourse(course);
        }

        for (Enrollment enrollment :
                fileManager.loadEnrollments()) {

            enrollmentManager.addEnrollment(enrollment);
        }
    }

    // ---------------- INPUT ----------------

    private static String readText(String message) {

        System.out.print(message);

        return scanner.nextLine().trim();
    }

    private static int readInt(String message) {

        while (true) {

            try {
                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine().trim());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number.");
            }
        }
    }

    private static double readDouble(String message) {

        while (true) {

            try {
                System.out.print(message);

                return Double.parseDouble(
                        scanner.nextLine().trim());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number.");
            }
        }
    }
}