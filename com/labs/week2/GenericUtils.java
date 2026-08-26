package com.labs.week2;

import java.util.List;

public class GenericUtils {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> T getLast(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Object[] setList(List<T> list) {
        return list.toArray();
    }
}