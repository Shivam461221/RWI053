
package com.mycompany.arrayutil;

import com.mycompany.collection.*;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        return o2.compareTo(o1);
    }
    
}
