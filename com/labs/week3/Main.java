/*
@author: Jaysen Noell
@Date: 8/31/2026
*/
//javac -d bin com/labs/week3/*.java
//java -cp bin com.labs.week3.Main

package com.labs.week3;
public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>(5);
        stringStorage.add("Java");
        stringStorage.add("Python");
        stringStorage.add("C++");
        for (int i = 0; i < stringStorage.size(); i++) {
            System.out.println(stringStorage.get(i));
        }
        Storage<Integer> intStorage = new Storage<>(5);
        intStorage.add(264);
        intStorage.add(485);
        intStorage.add(340);
        intStorage.add(6);
        intStorage.add(896);
        for (int i = 0; i < intStorage.size(); i++) {
            System.out.println(intStorage.get(i));
        }
    }
}