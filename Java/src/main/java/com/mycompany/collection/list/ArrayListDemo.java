
package com.mycompany.collection.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(20));
        list.add(10);   //Autoboxing
        //list.add(30.4);
        //list.add("hello");
        
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
