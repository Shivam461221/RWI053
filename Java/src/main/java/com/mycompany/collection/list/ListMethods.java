package com.mycompany.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 10; i <= 100; i = i + 10) {
            list.add(i);
        }
        System.out.println("List " + list);
        list.add(2, 25);
        System.out.println("List after insertion " + list);
        list.set(3, 35);
        System.out.println("List after replacement " + list);

        List<Integer> list2 = new ArrayList<>();

        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(444);

        System.out.println("Second list : " + list2);

        list.addAll(4, list2);

        System.out.println("First List after addAll " + list);

        if (list.contains(122)) {
            System.out.println("List has the value");
        } else {
            System.out.println("List doesn't have the value");
        }

        System.out.println("Element in the list are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.remove(3);
        System.out.println("List after deletion "+list);

    }
}
