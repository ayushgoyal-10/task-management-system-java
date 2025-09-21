# Task Management System

A console-based task management application built with Java that allows users to create, read, update, and delete tasks with file-based persistence.

## Features

- ✅ **CRUD Operations**: Create, Read, Update, Delete tasks
- 💾 **File Persistence**: Tasks are saved to and loaded from a text file
- 🎯 **Status Tracking**: Track task status (PENDING, IN_PROGRESS, COMPLETED)
- ⚡ **Efficient I/O**: Uses BufferedReader/Writer for optimal performance
- 🛡️ **Error Handling**: Comprehensive exception handling throughout

## Technologies Used

- Java 8+
- File I/O (BufferedReader, BufferedWriter)
- Collections Framework (ArrayList)
- Object-Oriented Programming Principles

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/task-management-system-java.git
   ```

2. **Navigate to project directory**:
    ```bash
    cd task-management-system-java 
    ```
3. **Compile the Java files**:
    ```bash
    javac *.java
    ```
4. **Run the application**:
    ```bash
    java Main
    ```

task-management-system-java/
├── Task.java          # Task model class with getters/setters
├── TaskManager.java   # Business logic and file operations
├── Main.java          # User interface and menu system
├── tasks.txt          # Data storage file (auto-generated)
├── README.md          # Project documentation
└── .gitignore         # Git ignore rules