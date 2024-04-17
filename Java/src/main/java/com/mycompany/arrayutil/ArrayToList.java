package com.mycompany.arrayutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {
        int[] a = {10, 15, 12, 8, 16};
        String[] s = {"A", "E", "B", "C", "Z"};
        
        
        List<String> list = Arrays.asList(s);  //convert array tolist but we cannot perform operations that will increase the size of array
        s[1]="O";  //if we change in original array it will reflect in list
        System.out.println(list);
    }
}
