
package com.mycompany.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("M");
        list.add("Q");
        list.add("B");
        list.add("V");
        
        System.out.println("Before sorting : "+list);
        
        Collections.sort(list); //it will sort in natural order
        //Collections.sort(list, new MyComparator()); //it will sort in reverse order
        
        System.out.println("After Sorting : "+list);
        
        int result = Collections.binarySearch(list, "M");
        
        System.out.println("index is: "+result); //it will return the index of element
        
//        Collections.reverse(list);
//        System.out.println("Reverse : "+list);
    }
}
