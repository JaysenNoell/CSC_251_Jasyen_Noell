/*
@author: Jaysen Noell
@Date: 9/09/2026
*/
//javac -d bin com/labs/week4/*.java
//java -cp bin com/labs/week4/Main

package com.labs.week4;

import java.util.ArrayList;

public class EnrollmentTracker {
    // Create the ArrayList to store student names
    ArrayList<String> students = new ArrayList<>();
    
    //Check if a student exists
    public static boolean studentExists(ArrayList<String> list, String name) {
        // Check each student in the list
        for (String student : list) {
            // Return true if the name matches
            if (student.equals(name)) {
                return true;
            }
        }
        // Return false if the name was not found
        return false;
    }
    //Remove a student from the list
    public static void removeStudent(ArrayList<String> list, String name) {
        // Use the index to find the student
        for (int i = 0; i < list.size(); i++) {
            // Check if the current student matches the name
            if (list.get(i).equals(name)) {
                // Remove the student at the current index
                list.remove(i);
                // Confirm that the student was removed
                System.out.println(name + " was removed successfully.");
                // Stop the method after removing the student
                return;
            }
        }
        // Tell the user if the student was not found
        System.out.println(name + " does not exist");
    }
    // Add a student without allowing duplicates
    public static void addStudent(ArrayList<String> list, String name) {
        // Check if the student already exists 
        if (studentExists(list, name)) { 
            // Tell the user that the student already exists 
            System.out.println(name + " already exists."); 
            } else { 
                // Add the student if they do not already exist 
                list.add(name); 
                // Confirm that the student was added 
                System.out.println(name + " was added successfully.");
        }
    }
    // Count how many times a student appears
    public static int countOccurrences(ArrayList<String> list, String name) {
        // Start the count at zero
        int count = 0;
        // Check every student in the list
        for (String student : list) {
            // Increase the count when the name matches
            if (student.equals(name)) {
                count++;
            }
        }
        // Return the total number of occurrences
        return count;
    }
}