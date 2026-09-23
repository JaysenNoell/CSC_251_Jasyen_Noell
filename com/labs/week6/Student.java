/*
@author: Jaysen Noell
@Date: 9/23/2026
*/
//javac -d bin com/labs/week6/*.java
//java -cp bin com/labs/week6/Main

package com.labs.week6;

public class Student {
    // Stores the student's ID number
    int id;
    // Stores the student's name
    String name;
    // Stores the student's major
    String major;
    // Stores the student's GPA
    double gpa;
    // Constructor used to create a Student object
    public Student(int id, String name, String major, double gpa) {
        // Assigns the provided ID to the student's ID
        this.id = id;
        // Assigns the provided name to the student's name
        this.name = name;
        // Assigns the provided major to the student's major
        this.major = major;
        // Assigns the provided GPA to the student's GPA
        this.gpa = gpa;
    }
    // Overrides toString() to display student information
    @Override
    public String toString() {
        // Returns the student's information as a formatted String
        return "ID: " + id + ", Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }
}