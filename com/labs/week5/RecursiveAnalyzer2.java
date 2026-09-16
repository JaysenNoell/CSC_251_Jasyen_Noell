/*
@author: Jaysen Noell
@Date: 9/14/2026
*/
//javac -d bin com/labs/week5/*.java
//java -cp bin com/labs/week5/Main

package com.labs.week5;
import java.util.ArrayList;
public class RecursiveAnalyzer2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        System.out.println("Numbers: " + numbers);
        printArrayList(numbers, 0);
    }
    public static void printArrayList(ArrayList<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return;
        }
        System.out.println(numbers.get(index));
        printArrayList(numbers, index + 1);
    }
}