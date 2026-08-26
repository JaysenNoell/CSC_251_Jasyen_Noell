//javac -d bin com/labs/week2/*.java
//java -cp bin com.labs.week2.Main
package com.labs.week2;

import java.util.ArrayList;
import java.util.List;

public class DataManager<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public int getSize() {
        return items.size();
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}