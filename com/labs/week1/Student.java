//Author:  Jaysen Noell
//Date:    8/19/2026
package com.labs.week1;

import java.util.ArrayList;

public class Student {
    // Stores the unique ID of the student.
    private int id;

    // Stores the student's name.
    private String name;

    // Stores the student's major.
    private String major;

    // Stores the courses that the student is enrolled in.
    private ArrayList<String> courses;

    // Constructor creates a Student object and initializes its properties.
    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;

        // Creates an empty ArrayList for the student's courses.
        this.courses = new ArrayList<>();
    }

    // Returns the student's ID so other classes can access it.
    public int getId() {
        return id;
    }

    // Adds a course to the student's list of courses.
    public void addCourse(String course) {
        courses.add(course);
    }

    // Returns all of the student's information as one formatted String.
    public String getInfo() {
        return "ID: " + id + "\nName: " + name + "\nMajor: " + major + "\nCourses: " + courses;
    }
}