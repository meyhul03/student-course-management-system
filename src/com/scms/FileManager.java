package com.scms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String DATA_DIR = "data";

    private static final String STUDENT_FILE =
            DATA_DIR + "\\students.csv";

    private static final String COURSE_FILE =
            DATA_DIR + "\\courses.csv";

    private static final String ENROLLMENT_FILE =
            DATA_DIR + "\\enrollments.csv";

    public FileManager() {
        createDataDirectory();
    }

    private void createDataDirectory() {
        File directory = new File(DATA_DIR);

        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    // ---------------- STUDENTS ----------------

    public void saveStudents(List<Student> students) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(STUDENT_FILE))) {

            writer.println("studentId,name,email,department");

            for (Student student : students) {

                writer.println(
                        student.getStudentId() + "," +
                        student.getName() + "," +
                        student.getEmail() + "," +
                        student.getDepartment()
                );
            }

            System.out.println("Students saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving students: "
                    + e.getMessage());
        }
    }

    public List<Student> loadStudents() {

        List<Student> students = new ArrayList<>();

        File file = new File(STUDENT_FILE);

        if (!file.exists()) {
            return students;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {

                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length == 4) {

                    students.add(new Student(
                            data[0],
                            data[1],
                            data[2],
                            data[3]
                    ));
                }
            }

        } catch (IOException e) {
            System.out.println("Error loading students: "
                    + e.getMessage());
        }

        return students;
    }

    // ---------------- COURSES ----------------

    public void saveCourses(List<Course> courses) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(COURSE_FILE))) {

            writer.println("courseCode,courseName,credits,instructor");

            for (Course course : courses) {

                writer.println(
                        course.getCourseCode() + "," +
                        course.getCourseName() + "," +
                        course.getCredits() + "," +
                        course.getInstructor()
                );
            }

            System.out.println("Courses saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving courses: "
                    + e.getMessage());
        }
    }

    public List<Course> loadCourses() {

        List<Course> courses = new ArrayList<>();

        File file = new File(COURSE_FILE);

        if (!file.exists()) {
            return courses;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {

                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length == 4) {

                    courses.add(new Course(
                            data[0],
                            data[1],
                            Integer.parseInt(data[2]),
                            data[3]
                    ));
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading courses: "
                    + e.getMessage());
        }

        return courses;
    }

    // ---------------- ENROLLMENTS ----------------

    public void saveEnrollments(List<Enrollment> enrollments) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(ENROLLMENT_FILE))) {

            writer.println(
                    "enrollmentId,studentId,courseCode,semester,grade"
            );

            for (Enrollment enrollment : enrollments) {

                writer.println(
                        enrollment.getEnrollmentId() + "," +
                        enrollment.getStudentId() + "," +
                        enrollment.getCourseCode() + "," +
                        enrollment.getSemester() + "," +
                        enrollment.getGrade()
                );
            }

            System.out.println("Enrollments saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving enrollments: "
                    + e.getMessage());
        }
    }

    public List<Enrollment> loadEnrollments() {

        List<Enrollment> enrollments = new ArrayList<>();

        File file = new File(ENROLLMENT_FILE);

        if (!file.exists()) {
            return enrollments;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {

                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length == 5) {

                    enrollments.add(new Enrollment(
                            data[0],
                            data[1],
                            data[2],
                            data[3],
                            data[4]
                    ));
                }
            }

        } catch (IOException e) {
            System.out.println("Error loading enrollments: "
                    + e.getMessage());
        }

        return enrollments;
    }

    // ---------------- BACKUP ----------------

    public void createBackup() {

        File backupDir =
                new File(DATA_DIR + "\\backup");

        if (!backupDir.exists()) {
            backupDir.mkdirs();
        }

        copyFile(STUDENT_FILE,
                DATA_DIR + "\\backup\\students_backup.csv");

        copyFile(COURSE_FILE,
                DATA_DIR + "\\backup\\courses_backup.csv");

        copyFile(ENROLLMENT_FILE,
                DATA_DIR + "\\backup\\enrollments_backup.csv");

        System.out.println("Backup created successfully.");
    }

    private void copyFile(String source, String destination) {

        File sourceFile = new File(source);

        if (!sourceFile.exists()) {
            return;
        }

        try (
                BufferedReader reader =
                        new BufferedReader(new FileReader(sourceFile));

                PrintWriter writer =
                        new PrintWriter(new FileWriter(destination))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }

        } catch (IOException e) {
            System.out.println(
                    "Backup error: " + e.getMessage()
            );
        }
    }
}