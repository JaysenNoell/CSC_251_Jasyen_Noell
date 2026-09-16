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
        ArrayList<String> names = new ArrayList<>();
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
        System.out.println("Names: " + names);
        printArrayList(names, 0);
    }
    public static void printArrayList(ArrayList<String> names, int index) {
        if (index == names.size()) {
            return;
        }
        System.out.println(names.get(index));
        printArrayList(names, index + 1);
    }
}