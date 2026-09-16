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

        File directory = new File(".");

        printDirectory(directory, 0);
    }
    public static void printDirectory(File directory, int level) {

        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }
        printFiles(files, 0, level);
    }
    public static void printFiles(File[] files, int index, int level) {
        if (index == files.length) {
            return;
        }
        printIndentation(level, 0);
        System.out.println(files[index].getName());
        if (files[index].isDirectory()) {
            printDirectory(files[index], level + 1);
        }
        printFiles(files, index + 1, level);
    }
    public static void printIndentation(int level, int count) {
        if (count == level) {
            return;
        }
        System.out.print("    ");
        printIndentation(level, count + 1);
    }
}