/*
@author: Jaysen Noell
@Date: 8/24/2026
*/
package com.labs.week2;

public class GenericMethods {

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}