package com.mycompany.collection.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        //Map<User, String> map = new HashMap<>();//in hashmap the garbage collection didnot happen becase
        //the map itself using object

        Map<User, String> map = new WeakHashMap<>();//It will garbage collected if there are no other 
        //objects pointing to the memory location other than map

        User u = new User();
        map.put(u, "Tom");

        System.out.println(map);

        u = null;

        System.gc();
        Thread.sleep(5000);

        System.out.println(map);
    }
}
