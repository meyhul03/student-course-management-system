package com.scms;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (findStudent(student.getStudentId()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(String studentId, String name,
                                 String email, String department) {

        Student student = findStudent(studentId);

        if (student == null) {
            return false;
        }

        student.setName(name);
        student.setEmail(email);
        student.setDepartment(department);

        return true;
    }

    public boolean deleteStudent(String studentId) {
        Student student = findStudent(studentId);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n----- Student List -----");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}