
 /*
 @author: Jaysen Noell
 @Date: 9/23/2026
 */
 //javac -d bin com/labs/week6/*.java
 //java -cp bin com/labs/week6/Main

package com.labs.week6;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creates a HashMap to store student IDs and names
        HashMap<Integer, String> studentDirectory = new HashMap<>();
        // Adds 5 students to the directory
        studentDirectory.put(1001, "RuGaard");
        studentDirectory.put(1002, "Azure");
        studentDirectory.put(1003, "AuRon");
        studentDirectory.put(1004, "Wistala");
        studentDirectory.put(1005, "Scabia");
        // Displays the Part 1 heading
        System.out.println("===== Part 1: Student Directory =====");
        // Loops through each student ID in the HashMap
        for (Integer id : studentDirectory.keySet()) {
            // Prints the student ID and associated name
            System.out.println(id + " : " + studentDirectory.get(id));
        }
        // Displays the Part 2 heading
        System.out.println("\n===== Part 2: Fast Lookup =====");
        // Searches for an existing student ID
        findStudent(studentDirectory, 1003);
        // Searches for a student ID that does not exist
        findStudent(studentDirectory, 9999);
        // Displays the Part 3 heading
        System.out.println("\n===== Part 3: Prevent Duplicate IDs =====");
        // Adds a new student to the directory
        addStudent(studentDirectory, 1006, "Eliam");
        // Attempts to add a student using an existing ID
        addStudent(studentDirectory, 1003, "AuSurath");
        // Displays the Part 4 heading
        System.out.println("\n===== Part 4: Remove Student =====");
        // Removes an existing student from the directory
        removeStudent(studentDirectory, 1002);
        // Attempts to remove a student who does not exist
        removeStudent(studentDirectory, 9999);
        // Displays the Part 5 heading
        System.out.println("\n===== Part 5: Student Objects =====");
        // Creates a HashMap to store student IDs and Student objects
        HashMap<Integer, Student> studentObjects = new HashMap<>();
        // Adds a Student object to the HashMap
        studentObjects.put(2001,
                new Student(2001, "Vaskir", "Computer Science", 3.8));
        // Adds another Student object
        studentObjects.put(2002,
                new Student(2002, "Pyraxis", "Mathematics", 3.5));
        // Adds another Student object
        studentObjects.put(2003,
                new Student(2003, "Zarvok", "Engineering", 3.9));
        // Adds another Student object
        studentObjects.put(2004,
                new Student(2004, "Ravok", "Biology", 3.7));
        // Loops through each student ID in the Student HashMap
        for (Integer id : studentObjects.keySet()) {
            // Prints the full information of each Student object
            System.out.println(studentObjects.get(id));
        }
        // Searches for a student using an existing ID
        System.out.println("\nLooking up Student 2003:");
        // Checks whether student ID 2003 exists
        if (studentObjects.containsKey(2003)) {
            // Prints the Student object associated with ID 2003
            System.out.println(studentObjects.get(2003));
        } else {
            // Displays a message if the student is not found
            System.out.println("Student not found");
        }
        // Searches for a student using a non-existing ID
        System.out.println("\nLooking up Student 9999:");
        // Checks whether student ID 9999 exists
        if (studentObjects.containsKey(9999)) {
            // Prints the Student object if the ID exists
            System.out.println(studentObjects.get(9999));
        } else {
            // Displays a message if the student is not found
            System.out.println("Student not found");
        }
    }
    // Method used to find a student by their ID
    public static void findStudent(HashMap<Integer, String> map, int id) {
        // Checks whether the provided ID exists in the HashMap
        if (map.containsKey(id)) {
            // Prints the name of the student associated with the ID
            System.out.println("Student: " + map.get(id));
        } else {
            // Displays a message if the ID does not exist
            System.out.println("Student not found");
        }
    }
    // Method used to add a student while preventing duplicate IDs
    public static void addStudent(HashMap<Integer, String> map,
                                  int id, String name) {
        // Checks whether the student ID already exists
        if (map.containsKey(id)) {
            // Displays a warning if the ID is already in use
            System.out.println("Warning: Student ID already exists.");
        } else {
            // Adds the student if the ID does not already exist
            map.put(id, name);
            // Confirms that the student was added
            System.out.println("Student added successfully.");
        }
    }
    // Method used to remove a student by their ID
    public static void removeStudent(HashMap<Integer, String> map, int id) {
        // Checks whether the student ID exists
        if (map.containsKey(id)) {
            // Removes the student and stores their name
            String removedStudent = map.remove(id);
            // Confirms which student was removed
            System.out.println("Removed student: " + removedStudent);
        } else {
            // Displays a message if the ID does not exist
            System.out.println("Student ID not found. Nothing removed.");
        }
    }

    /*
    1. put(), get(), and containsKey() are O(1) on average.

    2. HashMap searches by key, while ArrayList
       usually searches through elements one by one.

    3. ArrayList is preferable when we need
       ordered data or access by index.

    4. Keys must be unique so each key maps
       to one value. Duplicate keys replace
       the previous value.
    */
}