# Smart Study Planner (Java)

## Overview

Smart Study Planner is a Java-based application designed to help students efficiently organize their study schedules. It automatically generates a structured study plan based on subjects, priorities, deadlines, and required study hours.


## Problem Statement

Managing multiple subjects and deadlines can be overwhelming when done manually. This project solves that problem by generating an optimized and balanced study schedule, ensuring all tasks are completed on time without confusion or overload.

## Features

* Automatic study schedule generation
* Priority-based task handling
* Deadline-aware planning
* Even distribution of study hours
* Simple console-based application

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList (Java Collections Framework)
* Java Time API (`LocalDate`)
* Sorting using `Comparator`


## Project Structure

```
SmartStudyPlanner/
│── src/
│   ├── main/
│   │   └── Main.java
│   ├── model/
│   │   ├── Task.java
│   │   └── StudySession.java
│   └── service/
│       └── Scheduler.java
```


## Setup Instructions

### 1. Requirements

* Java JDK 8 or above
* Any IDE (VS Code / IntelliJ) or Terminal

### 2. Clone the Repository

```
git clone <your-repo-link>
cd Smart-Study-Planner
```

### 3. Compile the Program

```
javac -d out src/**/*.java
```

### 4. Run the Program

```
java -cp out main.Main
```

## How to Use

1. Open `Main.java`
2. Add or modify study tasks with the following details:

   * Subject name
   * Priority
   * Study duration (in hours)
   * Deadline
3. Run the program
4. View the generated study schedule in the console


## How It Works

* Tasks are stored using `ArrayList`
* The scheduler sorts tasks based on priority and deadlines
* Study sessions are distributed across available days
* The final study plan is generated dynamically at runtime

## Data Handling

* Uses in-memory storage (no database or file system)
* Data resets every time the program restarts


## Learning Outcomes

* Applied Object-Oriented Programming principles
* Built a custom scheduling algorithm
* Used Java Collections and sorting techniques
* Worked with date handling using `LocalDate`
* Improved problem-solving and logical thinking skills


## Future Improvements

* Add file or database storage
* Create a graphical user interface (GUI)
* Allow user input via console
* Add progress tracking and analytics



## Author

Pia Anoop B
24BAI10292
