//javac -d bin com/labs/week2/*.java
//java -cp bin com.labs.week2.Main
package com.labs.week2;

public class Box<T> {

    private T item;

    public void add(T item) {
        this.item = item;
    }

    public void delete() {
        item = null;
    }

    public T get() {
        return item;
    }
}