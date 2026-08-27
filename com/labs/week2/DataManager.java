/*
@author: Jaysen Noell
@Date: 8/24/2026
*/
//javac -d bin com/labs/week2/*.java
//java -cp bin com.labs.week2.Main
package com.labs.week2;

import java.util.ArrayList;
import java.util.List;

public class DataManager<T> {

    // T is a generic type parameter.
    // This allows the DataManager to work with different types of data
    // without needing to create a separate class for each type.
    // For example, T can become String, Integer, or Student.
    private List<T> items = new ArrayList<>();

    // The add method takes an item of type T and adds it to the list.
    // Since the item is type T, it has to match the type of the DataManager.
    // For example, a DataManager<String> can only add Strings.
    public void add(T item) {
        items.add(item);
    }

    // The remove method also takes an item of type T.
    // It searches the list for that item and removes it.
    // The type safety from generics is still maintained here.
    public void remove(T item) {
        items.remove(item);
    }

    // The get method takes an integer representing the index of the item
    // we want to retrieve from the list.
    // The return type is T, so Java knows what type of object is being returned.
    // For example, if this is a DataManager<String>, get will return a String.
    public T get(int index) {
        return items.get(index);
    }

    // The getSize method returns the number of items currently stored
    // in the list.
    public int getSize() {
        return items.size();
    }

    // The printAll method uses an enhanced for loop to go through
    // every item in the list and print it.
    // T represents whatever type of data the DataManager is currently using.
    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}