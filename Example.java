//javac -d bin com/labs/week2/Example.java
//java -cp bin com.labs.week2.Example
/*
@author: Jaysen Noell
@Date: 8/24/2026
@purpose: This is a test on arrays in Java and type casting.
*/
package com.labs.week2;

import java.util.List;
import java.util.ArrayList;

//defining the Box class with a generic type parameter T
public class Example {
    public void testArray(){
        List list = new ArrayList();
        list.add("hello");
        list.add(42);
        String s = (String) list.get(1);
    }
}