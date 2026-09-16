/*
@author: Jaysen Noell
@Date: 9/14/2026
*/
//javac -d bin com/labs/week5/*.java
//java -cp bin com/labs/week5/Main

package com.labs.week5;
import java.io.File;
public class DirectoryAnalyzer {
    public static void main(String[] args) {
        // Start with the current directory
        File directory = new File(".");
        // Print the directory contents starting at level 0
        printDirectory(directory, 0);
    }
    public static void printDirectory(File directory, int level) {
        // Check if the directory exists
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }
        // Get all files and folders inside the directory
        File[] files = directory.listFiles();
        // Stop if the directory cannot be read
        if (files == null) {
            return;
        }
        // Begin printing the files
        printFiles(files, 0, level);
    }
    public static void printFiles(File[] files, int index, int level) {
        // Stop when all files have been printed
        if (index == files.length) {
            return;
        }
        // Print indentation based on the folder level
        printIndentation(level, 0);
        // Print the current file or folder name
        System.out.println(files[index].getName());
        // If it is a directory, recursively print its contents
        if (files[index].isDirectory()) {
            printDirectory(files[index], level + 1);
        }
        // Move to the next file
        printFiles(files, index + 1, level);
    }
    public static void printIndentation(int level, int count) {
        // Stop when the required indentation has been printed
        if (count == level) {
            return;
        }
        // Print four spaces for each level
        System.out.print("    ");
        // Recursively print the remaining indentation
        printIndentation(level, count + 1);
    }
}