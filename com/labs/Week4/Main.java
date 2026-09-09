/*
@author: Jaysen Noell
@Date: 9/09/2026
*/
//javac -d bin com/labs/week4/*.java
//java -cp bin com/labs/week4/Main

package com.labs.week4;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Create an EnrollmentTracker object
        EnrollmentTracker tracker = new EnrollmentTracker();

        //Add students to the ArrayList
        tracker.students.add("RuGaard");
        tracker.students.add("AuRon");
        tracker.students.add("Wistala");
        tracker.students.add("Azure");
        tracker.students.add("AuSurath");
        tracker.students.add("Verdent");
        tracker.students.add("Starlight");
        tracker.students.add("Shadowcatch");

        /* Print the list using a traditional for loop
        This loop gives access to the index */
        System.out.println("Traditional for Loop:");

        for (int i = 0; i < tracker.students.size(); i++) {
            System.out.println(tracker.students.get(i));
        }

        // Print the list using an enhanced for loop
        System.out.println("\nEnhanced for Loop:");

        for (String student : tracker.students) {
            System.out.println(student);
        }

        //Search for students
        System.out.println("\nSearching for students:");

        // Test a student that exists
        System.out.println("RuGaard exists: " + EnrollmentTracker.studentExists(tracker.students, "RuGaard"));
        
        // Test a student that does not exist
        System.out.println("Yuka exists: " + EnrollmentTracker.studentExists(tracker.students, "Yuka"));

        //Remove students
        // Remove a student from the middle of the list
        System.out.println("\nRemoving a student from the middle:");
        EnrollmentTracker.removeStudent(tracker.students, "Azure");

        // Remove the first student
        System.out.println("\nRemoving the first student:");
        EnrollmentTracker.removeStudent(tracker.students, "RuGaard");

        // Remove the last student
        System.out.println("\nRemoving the last student:");
        EnrollmentTracker.removeStudent(tracker.students, "Shadowcatch");

        // Print the list after removing students
        System.out.println("\nFinal student list:");

        for (String student : tracker.students) {
            System.out.println(student);
        }

        //Prevent duplicate students
        System.out.println("\nAdding students:");
        // Wistala already exists, so it should not be added
        EnrollmentTracker.addStudent(tracker.students, "Wistala");
        // Eliam does not exist, so it should be added
        EnrollmentTracker.addStudent(tracker.students, "Eliam");

        /*Count how many times a name appears
        Manually add duplicate names for testing*/
        tracker.students.add("Wistala");
        tracker.students.add("Wistala");
        tracker.students.add("Wistala");

        // Test a name that appears multiple times
        System.out.println("\nCounting occurrences:");
        System.out.println("Wistala occurs: " + EnrollmentTracker.countOccurrences(tracker.students, "Wistala"));
        // Test a name that appears once
        System.out.println("Verdent occurs: " + EnrollmentTracker.countOccurrences(tracker.students, "Verdent"));
        // Test a name that does not appear
        System.out.println("Orion occurs: " + EnrollmentTracker.countOccurrences(tracker.students, "Orion"));

        //Sort the list alphabetically
        Collections.sort(tracker.students);

        // Print the sorted list
        System.out.println("\nSorted student list:");

        for (String student : tracker.students) {
            System.out.println(student);
        }
    }
}