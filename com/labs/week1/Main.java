//Author:  Jaysen Noell
//Date:    8/19/2026
package com.labs.week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner allows the program to receive input from the user.
        Scanner scanner = new Scanner(System.in);

        // Creates a CourseManager object to manage the students.
        CourseManager manager = new CourseManager();

        // Creates an array containing the initial students for the program.
        Student[] initialStudents = {
            new Student(1, "John Smith", "Computer Science"),
            new Student(2, "Sarah Johnson", "Mathematics"),
            new Student(3, "Michael Brown", "Information Technology"),
            new Student(4, "Emily Davis", "Biology"),
            new Student(5, "David Wilson", "Engineering"),
            new Student(6, "Jessica Miller", "Business"),
            new Student(7, "Daniel Moore", "History"),
            new Student(8, "Ashley Taylor", "Psychology"),
            new Student(9, "Christopher Anderson", "Physics"),
            new Student(10, "Amanda Thomas", "English")
        };

        // Loops through the initial student array and adds each student to the manager.
        for (Student student : initialStudents) {
            manager.addStudent(student);
        }

        // Creates an array containing example courses.
        String[] courses = {
            "CSC-251",
            "MAT-151",
            "ENG-111"
        };

        // Adds courses from the array to some of the initial students.
        initialStudents[0].addCourse(courses[0]);
        initialStudents[1].addCourse(courses[1]);
        initialStudents[2].addCourse(courses[2]);

        // Stores the menu choices in an array so they can be displayed with a loop.
        String[] menuOptions = {
            "1. Add student",
            "2. View all students",
            "3. Search by ID",
            "4. Exit"
        };

        // Controls whether the program should continue displaying the menu.
        boolean running = true;

        // The while loop keeps the program running until the user chooses Exit.
        while (running) {

            // Displays the title of the program.
            System.out.println();
            System.out.println("===== Student Course Manager =====");

            // Displays each menu option.
            for (String option : menuOptions) {
                System.out.println(option);
            }

            // Asks the user to select a menu option.
            System.out.print("Enter your choice: ");

            // Checks whether the user entered an integer.
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                // Option 1 allows the user to add a new student.
                if (choice == 1) {
                    System.out.print("Enter student ID: ");

                    // Validates that the student ID is an integer.
                    if (scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        // Gets the student's name.
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();

                        // Gets the student's major.
                        System.out.print("Enter student major: ");
                        String major = scanner.nextLine();

                        // Creates a new Student object using the entered information.
                        Student student = new Student(id, name, major);

                        // Adds the new student to the CourseManager.
                        manager.addStudent(student);

                        // Confirms that the student was successfully added.
                        System.out.println("Student added successfully.");
                    } else {
                        // Handles invalid student ID input.
                        System.out.println("Invalid ID. Please enter a number.");
                        scanner.nextLine();
                    }

                // Option 2 displays every student.
                } else if (choice == 2) {
                    manager.displayAllStudents();

                // Option 3 searches for a student using their ID.
                } else if (choice == 3) {
                    System.out.print("Enter student ID: ");

                    // Validates that the search ID is an integer.
                    if (scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        // Searches the CourseManager for the requested student.
                        Student student = manager.findStudentById(id);

                        // Checks whether the student was found.
                        if (student != null) {
                            System.out.println("Student found:");
                            System.out.println(student.getInfo());
                        } else {
                            System.out.println("The requested student cannot be found.");
                        }
                    } else {
                        // Handles invalid search input.
                        System.out.println("Invalid ID. Please enter a number.");
                        scanner.nextLine();
                    }

                // Option 4 ends the program.
                } else if (choice == 4) {
                    System.out.println("Exiting program...");

                    // Changes running to false so the while loop ends.
                    running = false;

                // Handles menu choices outside of 1 through 4.
                } else {
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                }

            // Handles non-integer menu input.
            } else {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                scanner.nextLine();
            }
        }

        // Closes the Scanner when the program is finished.
        scanner.close();
    }
}