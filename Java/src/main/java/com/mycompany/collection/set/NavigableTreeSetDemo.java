package com.mycompany.collection.set;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        
        System.out.println(s);
        
        System.out.println(s.ceiling(19)); //return the element which is greater than or equal to passing element
        
        System.out.println(s.floor(35)); //returns the element which is smaller than or equal to passing element
        
        System.out.println(s.higher(30));// returns the lowest element in the sets which is greater than passing element
        
        System.out.println(s.lower(40)); //returns the greater element in the set whichis lower than passing element
        
        System.out.println(s.pollFirst());//it returns and removes the first element in set
        
        System.out.println(s.pollLast());//it returns and removes the last element in set
        
        System.out.println(s.descendingSet());//returns a set in descending order
        
        System.out.println(s);
    }
}
