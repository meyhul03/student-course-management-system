# \# Student Course Management System

# 

# \## 1. Project Overview

# 

# The Student Course Management System is a command-line Java application developed to manage student records, courses, enrollments, grades, and academic reports.

# 

# The system provides a simple and organized way to perform common academic management operations through a terminal-based interface.

# 

# \## 2. Objectives

# 

# The main objectives of the project are:

# 

# \- Manage student information

# \- Manage course information

# \- Enroll students in courses

# \- Assign and calculate grades

# \- Generate student academic reports

# \- Store data using CSV files

# \- Create backups of application data

# \- Demonstrate core Java programming concepts

# 

# \## 3. Main Features

# 

# \### Student Management

# 

# &#x20;   - Add a student

# &#x20;   - View all students

# &#x20;   - Search for a student

# &#x20;   - Update student details

# &#x20;   - Delete a student

# 

# \### Course Management

# 

# &#x20;   - Add a course

# &#x20;   - View all courses

# &#x20;   - Search for a course

# &#x20;   - Update course details

# &#x20;   - Delete a course

# 

# \### Enrollment Management

# 

# &#x20;   - Enroll a student in a course

# &#x20;   - View all enrollments

# &#x20;   - Remove an enrollment

# &#x20;   - Prevent duplicate student-course enrollment

# 

# \### Grade Management

# 

# &#x20;   - Enter marks for an enrollment

# &#x20;   - Automatically calculate letter grades

# &#x20;   - Determine pass/fail status

# 

# \### Report Management

# 

# &#x20;   - Generate student academic reports

# &#x20;   - Display enrolled courses

# &#x20;   - Display assigned grades

# 

# \### Data Management

# 

# &#x20;   - Save data in CSV files

# &#x20;   - Load saved data when the application starts

# &#x20;   - Create backup copies of stored data

# 

# \## 4. Technologies Used

# 

# &#x20;   Language       : Java

# &#x20;   Version        : Java 25

# &#x20;   Interface      : Command Line Interface (CLI)

# &#x20;   Storage        : CSV Files

# &#x20;   Collections    : ArrayList

# &#x20;   Build Tool     : javac

# &#x20;   Version Control: Git and GitHub

# 

# \## 5. Java Concepts Demonstrated

# 

# The project demonstrates the following Java concepts:

# 

# &#x20;   - Classes and Objects

# &#x20;   - Encapsulation

# &#x20;   - Constructors

# &#x20;   - Methods

# &#x20;   - Inheritance and Object-Oriented Design

# &#x20;   - Collections Framework

# &#x20;   - ArrayList

# &#x20;   - Exception Handling

# &#x20;   - File Handling

# &#x20;   - Input Validation

# &#x20;   - Packages

# &#x20;   - Modular Programming

# 

# \## 6. Project Structure

# 

# ```text

# student-course-management-system/

# │

# ├── README.md

# ├── statement.md

# ├── .gitignore

# │

# ├── src/

# │   └── com/

# │       └── scms/

# │           ├── Main.java

# │           ├── Student.java

# │           ├── Course.java

# │           ├── Enrollment.java

# │           ├── Grade.java

# │           │

# │           ├── StudentManager.java

# │           ├── CourseManager.java

# │           ├── EnrollmentManager.java

# │           │

# │           ├── FileManager.java

# │           │

# │           ├── StudentManagerTest.java

# │           ├── CourseManagerTest.java

# │           └── EnrollmentManagerTest.java

# │

# ├── data/

# │   ├── students.csv

# │   ├── courses.csv

# │   └── enrollments.csv

# │

# ├── diagrams/

# │

# └── bin/ords.

