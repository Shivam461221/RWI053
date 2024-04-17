
package com.mycompany.collection.set;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        list.add("abc");
        list.add("def");
        list.add("mno");
        list.add("xyz");
        
        ListIterator<String> itr= list.listIterator();
        
        System.out.println("Tranversing the list in forward direction ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("Transversing the list in previous direction ");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
