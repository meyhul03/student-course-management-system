\# 📚 Student Course Management System



!\[Java](https://img.shields.io/badge/Java-25-orange?style=flat-square\&logo=openjdk)

!\[CLI](https://img.shields.io/badge/Interface-Command%20Line-blue?style=flat-square)

!\[Storage](https://img.shields.io/badge/Storage-CSV-green?style=flat-square)

!\[Git](https://img.shields.io/badge/Version%20Control-Git-black?style=flat-square)



A command-line based Java application designed to manage students, courses, enrollments, grades, and academic records.



The system provides a menu-driven interface that allows an administrator or academic staff member to maintain academic information, assign grades, generate student reports, store records in CSV files, and create data backups.



\---



\## 🚀 Features



\### 👨‍🎓 Student Management



\- Add new student records

\- View all registered students

\- Update student information

\- Delete student records

\- Prevent duplicate student IDs



\### 📘 Course Management



\- Add new courses

\- View available courses

\- Update course information

\- Delete course records

\- Prevent duplicate course codes



\### 📝 Enrollment Management



\- Enroll students in courses

\- View all enrollments

\- Remove enrollments

\- Prevent duplicate student-course enrollment

\- Validate student and course existence before enrollment



\### 📊 Grade Management



\- Enter marks for enrolled students

\- Validate marks between 0 and 100

\- Automatically calculate letter grades

\- Determine pass/fail status

\- Update the grade associated with an enrollment



\### 📄 Academic Reports



\- Generate student-specific academic reports

\- Display student details

\- Display enrolled courses

\- Display semester information

\- Display assigned grades



\### 💾 Data Management



\- Store student records in CSV files

\- Store course records in CSV files

\- Store enrollment records in CSV files

\- Automatically load saved data when the application starts

\- Create backup copies of stored data



\---



\## 🛠️ Technologies Used



| Technology | Purpose |

|------------|---------|

| Java 25 | Application development |

| Java Collections | In-memory record management |

| Java File I/O | Data storage and backup |

| CSV | Persistent data storage |

| Command Line | User interface |

| Git | Version control |

| GitHub | Repository hosting |



\---



\## 🧠 Java Concepts Demonstrated



\- Classes and Objects

\- Encapsulation

\- Constructors

\- Methods

\- Access Modifiers

\- Packages

\- ArrayList

\- Exception Handling

\- Input Validation

\- File Handling

\- Modular Programming

\- Object-Oriented Programming



\---



\## 📁 Project Structure



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

│           ├── Student.java

│           ├── Course.java

│           ├── Enrollment.java

│           ├── Grade.java

│           ├── StudentManager.java

│           ├── CourseManager.java

│           ├── EnrollmentManager.java

│           ├── FileManager.java

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

&#x20;   ├── Screenshot 2026-09-10 225051.png

&#x20;   ├── Screenshot 2026-09-10 225348.png

&#x20;   └── Screenshot 2026-09-10 225353.png



\## ⚙️ Requirements


Before running the project, make sure the following are installed:



Java JDK 17 or later

Git



Check the Java installation:



java -version

javac -version



The project was developed and tested using Java 25.



\## 📥 Installation


1\. Clone the Repository

git clone https://github.com/meyhul03/student-course-management-system.git

2\. Open the Project Directory

cd student-course-management-system

3\. Compile the Project

javac -d bin src\\com\\scms\\\*.java



If compilation is successful, no error message will be displayed.



\## ▶️ Running the Application


Start the application using:



java -cp bin com.scms.Main



The main menu will be displayed:



========================================

&#x20;  STUDENT COURSE MANAGEMENT SYSTEM

========================================



\------------- MAIN MENU -------------

1\.  Add Student

2\.  View Students

3\.  Update Student

4\.  Delete Student

5\.  Add Course

6\.  View Courses

7\.  Update Course

8\.  Delete Course

9\.  Enroll Student

10\. View Enrollments

11\. Remove Enrollment

12\. Add Grade

13\. Generate Student Report

14\. Create Backup

15\. Exit

\-------------------------------------

Enter your choice:


🔄 Typical Workflow


Add Student

&#x20;     │

&#x20;     ▼

Add Course

&#x20;     │

&#x20;     ▼

Enroll Student

&#x20;     │

&#x20;     ▼

Assign Grade

&#x20;     │

&#x20;     ▼

Generate Report

&#x20;     │

&#x20;     ▼

Save Data

&#x20;     │

&#x20;     ▼

Create Backup

🧪 Testing



The project contains separate test programs for the major management modules.



Student Management Test

javac -d bin src\\com\\scms\\\*.java

java -cp bin com.scms.StudentManagerTest

Course Management Test

java -cp bin com.scms.CourseManagerTest

Enrollment Management Test

java -cp bin com.scms.EnrollmentManagerTest



Additional testing information is available in:



TESTING.md



💾 Data Storage



The application uses CSV files for local data persistence.



Student Data

data/students.csv

Course Data

data/courses.csv

Enrollment Data

data/enrollments.csv

Backup



Backup files are stored in:



data/backup/



Data is loaded when the application starts and saved when changes are made or when the application exits.



⚠️ Validation and Error Handling



The application handles common errors such as:



Invalid numeric input

Invalid marks

Duplicate student IDs

Duplicate course codes

Duplicate enrollments

Non-existent students

Non-existent courses

Non-existent enrollments

File input/output errors



Marks are accepted only within the range:



0 - 100



📊 Project Documentation



The repository includes:



System Architecture Diagram

Workflow Diagram

Use Case Diagram

Class Diagram

Sequence Diagram

Storage / ER Diagram



These diagrams describe the structure, workflow, object relationships, and data storage model of the system.



🎯 Project Objectives



The project aims to:



Provide a simple academic record management system.

Reduce manual handling of student and course information.

Maintain enrollment and grade information in an organized manner.

Demonstrate practical application of Java programming concepts.

Provide local data persistence using CSV files.


🔮 Future Enhancements



Possible future improvements include:



Graphical User Interface

Database integration using JDBC

User authentication

Role-based access control

Advanced search and filtering

PDF report generation

Academic performance analytics



👤 Author

Meyhul03

Programming in Java

