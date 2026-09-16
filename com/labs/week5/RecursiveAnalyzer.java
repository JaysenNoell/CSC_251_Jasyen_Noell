/*
@author: Jaysen Noell
@Date: 9/14/2026
*/
//javac -d bin com/labs/week5/*.java
//java -cp bin com/labs/week5/Main

package com.labs.week5;
import java.util.ArrayList;
public class RecursiveAnalyzer {
    public static void main(String[] args) {
        // Create a list of names
        ArrayList<String> names = new ArrayList<>();
        // Add names to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emma");
        names.add("Frank");
        names.add("Grace");
        names.add("Henry");
        names.add("Ivy");
        names.add("Jack");
        // Print the entire list
        System.out.println("Names: " + names);
        // Start printing each name recursively
        printArrayList(names, 0);
    }
    public static void printArrayList(ArrayList<String> names, int index) {
        // Stop when all names have been printed
        if (index == names.size()) {
            return;
        }
        // Print the current name
        System.out.println(names.get(index));
        // Move to the next name
        printArrayList(names, index + 1);
    }
}