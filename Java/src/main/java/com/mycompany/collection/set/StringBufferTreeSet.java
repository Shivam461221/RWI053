
package com.mycompany.collection.set;

import com.mycompany.collection.comparator.SBComparator;
import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
    public static void main(String[] args) {
        Set<StringBuffer> set = new TreeSet<>(new SBComparator());
        
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("xyz"));
        set.add(new StringBuffer("mno"));
        set.add(new StringBuffer("pqr"));
        
        for (StringBuffer string : set) {
            System.out.println(string);
        }
    }
}
