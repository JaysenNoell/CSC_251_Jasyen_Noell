/*
@author: Jaysen Noell
@Date: 8/31/2026
*/
//javac -d bin com/labs/week3/*.java
//java -cp bin com/labs/week3/Main

package com.labs.week3;

import java.util.ArrayList;

public class Storage<T> {
    private ArrayList<T> items;
    private int count = 0;

    //this is the constructor
    public Storage(int size) {
        // TODO: initialize array
        items = new ArrayList<>(size);
    }

    public void add(T item) {
        //TODO: add item to array
        items.add(item);
        count++;
    }

    public T get(int index) {
        // TODO: return item
        return items.get(index);
    }

    public int size() {
        return count;
    }
}