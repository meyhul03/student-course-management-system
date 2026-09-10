package com.scms;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private final List<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public boolean addCourse(Course course) {
        if (findCourse(course.getCourseCode()) != null) {
            return false;
        }

        courses.add(course);
        return true;
    }

    public Course findCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public boolean updateCourse(String courseCode, String courseName,
                                int credits, String instructor) {

        Course course = findCourse(courseCode);

        if (course == null) {
            return false;
        }

        course.setCourseName(courseName);
        course.setCredits(credits);
        course.setInstructor(instructor);

        return true;
    }

    public boolean deleteCourse(String courseCode) {
        Course course = findCourse(courseCode);

        if (course == null) {
            return false;
        }

        courses.remove(course);
        return true;
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("\n----- Course List -----");

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}