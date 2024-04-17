package com.mycompany.arrayutil;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] a = {10, 15, 12, 8, 16};

        System.out.println("Before Sort ");

        for (int i : a) {
            System.out.println(i);
        }

        Arrays.sort(a);     //default constructor will sort in natural order

        System.out.println("After Sorting");
        for (int i : a) {
            System.out.println(i);
        }

        String[] s = {"A", "E", "B", "C", "Z"};
        Arrays.sort(s, new MyComparator());  //it will sort according to out custom comparator sorting order

        for (String string : s) {
            System.out.println(string);
        }
    }
}
