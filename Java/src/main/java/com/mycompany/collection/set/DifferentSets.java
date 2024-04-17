package com.mycompany.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {

    public static void main(String[] args) {
        Random obj = new Random();

        //HashSet<Integer> set = new HashSet<>();
        // LinkedHashSet<Integer> set = new LinkedHashSet<>(); //it maintains the order of inserted elements
        TreeSet<Integer> set = new TreeSet<>(); //it sorts the elemets in ascending order 

        for (int i = 1; i <= 5; i++) {
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println(number);
        }

        //System.out.println("HashSet Elements : "+set);
        //System.out.println("Linked HashSet : " + set);
        System.out.println("TreeSet : " + set);
    }
}
