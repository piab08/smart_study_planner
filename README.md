Smart Study Planner (Java)
What This Project Does

This project is a Smart Study Planner developed using Java. It helps students organize their study schedule by automatically generating a plan based on subjects, priorities, deadlines, and required study hours. The system intelligently distributes study sessions across days to ensure tasks are completed on time.

Problem It Solves

Planning studies manually can be confusing and inefficient, especially when multiple subjects and deadlines are involved. This system simplifies the process by automatically creating a structured and manageable study plan.

How to Set Up
1. Requirements
Java (JDK 8 or above)
Any IDE (VS Code / IntelliJ) OR Terminal
2. Download / Clone the Repository
git clone <your-repo-link>
cd Smart-Study-Planner
3. Compile the Program
javac -d out src/**/*.java
4. Run the Program
java -cp out main.Main
How to Use

After running the program, it will automatically generate a study plan based on predefined tasks in the Main class.

Steps:
Add or modify tasks in Main.java
Each task includes:
Subject name
Priority
Study duration (hours)
Deadline
Run the program to generate a study schedule
The schedule will be printed in the console
Data Handling
Uses in-memory data (ArrayList)
No file storage (data resets when program restarts)
Study plan is generated dynamically at runtime
Technologies Used
Java
OOP (Classes and Objects)
ArrayList
Java Time API (LocalDate)
Sorting with Comparator
Project Files
SmartStudyPlanner/
│── src/
│   ├── main/
│   │   └── Main.java
│   ├── model/
│   │   ├── Task.java
│   │   └── StudySession.java
│   └── service/
│       └── Scheduler.java
What I Learned
Implemented Object-Oriented Programming concepts
Built a scheduling algorithm
Used Java Collections and Comparator for sorting
Applied date handling using LocalDate
Improved problem-solving and logic-building skills
Author

Akankshya Dibyadarsinee Rout
24BAI10724
B.Tech (AIML) | VIT Bhopal University