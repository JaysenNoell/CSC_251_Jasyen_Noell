/*
@author: Jaysen Noell
@Date: 8/31/2026
*/
//javac -d bin com/labs/week3/*.java
//java -cp bin com.labs.week3.Main

package com.labs.week3;
public class ArrayPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
/*
Important Question: Why must <T> appear before void? 
<T> must appear before void because it declares the generic type parameter for a method.
It tells Java that T is a type that can be determined when the method is called.
*/