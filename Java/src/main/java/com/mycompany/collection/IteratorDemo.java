
package com.mycompany.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("akku");
        list.add("vyas");
        list.add("gaurav");
        
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
