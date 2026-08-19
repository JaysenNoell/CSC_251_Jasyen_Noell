//Author:  Jaysen Noell
//Date:    8/19/2026
package com.labs.week1;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    // Stores all students managed by the program.
    private List<Student> students;

    // Constructor creates an empty list of students.
    public CourseManager() {
        students = new ArrayList<>();
    }

    // Adds a Student object to the student list.
    public void addStudent(Student s) {
        students.add(s);
    }

    // Searches the student list for a student with the requested ID.
    public Student findStudentById(int id) {
        // Enhanced for loop checks each student in the list.
        for (Student student : students) {

            // Compares the student's ID with the requested ID.
            if (student.getId() == id) {
                return student;
            }
        }

        // Returns null when no student with the requested ID exists.
        return null;
    }

    // Displays the information for every student in the list.
    public void displayAllStudents() {
        // Loops through every student and prints their information.
        for (Student student : students) {
            System.out.println(student.getInfo());
            System.out.println();
        }
    }

    // Removes a student from the list using their ID.
    public boolean removeStudentFromCourse(int id) {
        // Find the student before attempting to remove them.
        Student student = findStudentById(id);

        // Only remove the student if they were found.
        if (student != null) {
            students.remove(student);
            return true;
        }

        // Return false if the student could not be found.
        return false;
    }

    // Returns the current number of students in the course.
    public int numberOfStudentsInCourse() {
        return students.size();
    }
}