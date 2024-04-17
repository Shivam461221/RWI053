
package com.mycompany.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        
        Iterator it = list.iterator();  //iterator is a iterable interface method It returns the iterator over the elements of type T.
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
