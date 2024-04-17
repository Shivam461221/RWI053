
package com.mycompany.collection.set;

import com.mycompany.collection.comparator.StringComparator;
import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringComparator());
        
        set.add("abcd");
        set.add("xyz");
        set.add("mnopqr");
        set.add("st");
        
        for (String string : set) {
            System.out.println(string);
        }
    }
}
