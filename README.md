# 📚 **Student Course Management System**

![Java](https://img.shields.io/badge/Java-25-orange?style=flat-square&logo=openjdk)
![CLI](https://img.shields.io/badge/Interface-Command%20Line-blue?style=flat-square)
![Storage](https://img.shields.io/badge/Storage-CSV-green?style=flat-square)
![Git](https://img.shields.io/badge/Version%20Control-Git-black?style=flat-square)

A command-line based Java application designed to manage students, courses, enrollments, grades, and academic records.

The system provides a simple menu-driven interface that allows an administrator or academic staff member to manage student information, courses, enrollments, grades, reports, and stored data.

---

## 🚀 **Features**

### 👨‍🎓 **Student Management**

- Add new student records
- View all registered students
- Update student information
- Delete student records
- Prevent duplicate student IDs

### 📘 **Course Management**

- Add new courses
- View available courses
- Update course information
- Delete course records
- Prevent duplicate course codes

### 📝 **Enrollment Management**

- Enroll students in courses
- View all enrollments
- Remove enrollments
- Prevent duplicate student-course enrollment
- Validate student and course existence

### 📊 **Grade Management**

- Enter marks for enrolled students
- Validate marks between 0 and 100
- Automatically calculate letter grades
- Determine pass/fail status
- Update grades associated with enrollments

### 📄 **Academic Reports**

- Generate student-specific academic reports
- Display student details
- Display enrolled courses
- Display semester information
- Display assigned grades

### 💾 **Data Management**

- Store student records in CSV files
- Store course records in CSV files
- Store enrollment records in CSV files
- Load saved data when the application starts
- Create backup copies of application data

---

## 🛠️ **Technologies Used**

| Technology | Purpose |
|------------|---------|
| Java 25 | Application development |
| Java Collections | In-memory data management |
| Java File I/O | Data storage and backup |
| CSV | Persistent data storage |
| Command Line | User interface |
| Git | Version control |
| GitHub | Repository hosting |

---

## 🧠 **Java Concepts Demonstrated**

The project demonstrates the following Java concepts:

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Access Modifiers
- Packages
- ArrayList
- Exception Handling
- Input Validation
- File Handling
- Modular Programming
- Object-Oriented Programming

---

## 📁 **Project Structure**

```text
student-course-management-system/
│
├── README.md
├── statement.md
├── TESTING.md
├── .gitignore
│
├── src/
│   └── com/
│       └── scms/
│           ├── Main.java
│           │
│           ├── Student.java
│           ├── Course.java
│           ├── Enrollment.java
│           └── Grade.java
│           │
│           ├── StudentManager.java
│           ├── CourseManager.java
│           ├── EnrollmentManager.java
│           └── FileManager.java
│           │
│           ├── StudentManagerTest.java
│           ├── CourseManagerTest.java
│           └── EnrollmentManagerTest.java
│
├── data/
│   ├── students.csv
│   ├── courses.csv
│   └── enrollments.csv
│
├── diagrams/
│   ├── system-architecture.png
│   ├── workflow-diagram.png
│   ├── use-case-diagram.png
│   ├── class-diagram.png
│   ├── sequence-diagram.png
│   └── storage-er-diagram.png
│
└── screenshots/
    ├── Screenshot 2026-09-10 225051.png
    ├── Screenshot 2026-09-10 225348.png
    └── Screenshot 2026-09-10 225353.png