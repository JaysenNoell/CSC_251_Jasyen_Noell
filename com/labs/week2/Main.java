//javac -d bin com/labs/week2/*.java
//java -cp bin com.labs.week2.Main
package com.labs.week2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> gpas = new ArrayList<>();

        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("David");
        studentNames.add("Eve");

        gpas.add(3.8);
        gpas.add(3.5);
        gpas.add(4.0);
        gpas.add(3.2);
        gpas.add(3.9);

        System.out.println("Student Names:");

        for (String name : studentNames) {
            System.out.println(name);
        }

        System.out.println("\nGPAs:");

        for (Double gpa : gpas) {
            System.out.println(gpa);
        }

        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        System.out.println("\nString Box: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.add(100);
        System.out.println("Integer Box: " + integerBox.get());

        Student student = new Student();

        Box<Student> studentBox = new Box<>();
        studentBox.add(student);
        System.out.println("Student Box: " + studentBox.get());

        stringBox.delete();
        System.out.println("String Box after delete: " + stringBox.get());

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nStrings:");
        GenericUtils.printList(names);
        System.out.println("Last String: " + GenericUtils.getLast(names));

        System.out.println("\nIntegers:");
        GenericUtils.printList(numbers);
        System.out.println("Last Integer: " + GenericUtils.getLast(numbers));

        Object[] nameArray = GenericUtils.setList(names);
        Object[] numberArray = GenericUtils.setList(numbers);

        DataManager<String> stringManager = new DataManager<>();
        stringManager.add("Apple");
        stringManager.add("Banana");
        stringManager.add("Orange");

        System.out.println("\nString DataManager:");
        stringManager.printAll();
        System.out.println("Item at index 1: " + stringManager.get(1));
        System.out.println("Size: " + stringManager.getSize());

        DataManager<Integer> integerManager = new DataManager<>();
        integerManager.add(10);
        integerManager.add(20);
        integerManager.add(30);

        System.out.println("\nInteger DataManager:");
        integerManager.printAll();
        System.out.println("Item at index 1: " + integerManager.get(1));
        System.out.println("Size: " + integerManager.getSize());

        DataManager<Student> studentManager = new DataManager<>();
        Student student1 = new Student();
        Student student2 = new Student();

        studentManager.add(student1);
        studentManager.add(student2);

        System.out.println("\nStudent DataManager:");
        studentManager.printAll();
        System.out.println("Item at index 0: " + studentManager.get(0));
        System.out.println("Size: " + studentManager.getSize());
    }
}