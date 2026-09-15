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




---

## ⚙️ **Requirements**

Before running the project, make sure the following are installed:

- **Java JDK 17 or later**
- **Git**

### Check Java Installation

```bash
java -version
javac -version
```

If both commands print a version number, you're ready to proceed.

---

## ▶️ **Setup & Run**

### 1. Clone the repository

```bash
git clone https://github.com/meyhul03/student-course-management-system.git
cd student-course-management-system
```

### 2. Compile the source files

**On Windows (cmd/PowerShell):**
```bash
javac -d bin src\com\scms\*.java
```

**On macOS/Linux:**
```bash
javac -d bin src/com/scms/*.java
```

### 3. Run the application

```bash
java -cp bin com.scms.Main
```

This launches the menu-driven command-line interface with options such as Add Student, View Students, Add Course, Enroll Student, Add Grade, Generate Student Report, and Create Backup.

### 4. Using the application

- Enter the number for the menu option you want, then press Enter.
- Follow the on-screen prompts.
- Data is automatically saved to CSV files in `data/` after each operation.
- Select Create Backup at any time to back up your data.
- Select Exit to close the application.

### 5. Configuration

No additional configuration is required. The `data/` directory is created automatically on first run if it doesn't already exist.

---

## 🧪 **Testing**

```bash
javac -d bin src\com\scms\*.java
java -cp bin com.scms.StudentManagerTest
java -cp bin com.scms.CourseManagerTest
java -cp bin com.scms.EnrollmentManagerTest
```

(Use forward slashes on macOS/Linux.) See **TESTING.md** for full test details.

---

## 📊 **Project Documentation**

The repository contains the following documentation resources:

- System Architecture Diagram
- Workflow Diagram
- Use Case Diagram
- Class Diagram
- Sequence Diagram
- Storage / ER Diagram
- Testing Documentation (`TESTING.md`)
- Application Screenshots

---

## 🎯 **Project Objectives**

- Provide a simple academic record management system.
- Reduce manual handling of student and course information.
- Manage enrollments and grades in an organized manner.
- Demonstrate practical Java programming concepts.
- Provide persistent local storage using CSV files.
- Provide a simple command-line interface for academic management.

---

## 📌 **Functional Modules**

**1. Student Management** — Add, view, update, delete student records.

**2. Course Management** — Add, view, update, delete course records.

**3. Enrollment Management** — Manage student enrollment and prevent duplicates.

**4. Grade Management** — Accept marks, calculate letter grade and pass/fail status.

**5. Report and Data Management** — Generate reports, manage CSV storage and backups.

---

## 🔐 **Non-Functional Requirements**

**Performance** — Should respond quickly for normal student, course, and enrollment operations.

**Reliability** — Stored records remain available after restarting the application.

**Usability** — Menu-driven interface with clear options, prompts, and result messages.

**Maintainability** — Separated into model, manager, storage, and test classes.

**Error Handling** — Invalid inputs and errors handled without unexpected termination.

---

## 🔮 **Future Enhancements**

- Graphical User Interface
- Database integration using JDBC
- User authentication
- Role-based access control
- Advanced search and filtering
- PDF report generation
- Academic performance analytics

---

## 👤 **Author**

**Meyhul V Jaiswal**

Programming in Java
