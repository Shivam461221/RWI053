package com.mycompany.collection.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        //Map<Integer,String> map =new HashMap<>();  //hashmap uses equals method to check the values of keys are not same if same it will show only one 
         Map<Integer, String> map = new IdentityHashMap<>();//Identity hashmap uses == operator if two keys pointing to the same object
         
        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);

        map.put(id1, "Bharath");
        map.put(id2, "Sarath");

        System.out.println(map);
    }
}
