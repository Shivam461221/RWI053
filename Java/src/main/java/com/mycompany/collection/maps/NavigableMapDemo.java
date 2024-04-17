package com.mycompany.collection.maps;

import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {
        TreeMap<Character, String> map = new TreeMap<>();

        map.put('A', "Apple");
        map.put('B', "Boy");
        map.put('C', "Cat");
        map.put('D', "Dog");
        
        System.out.println(map);
        System.out.println(map.floorKey('C'));
        System.out.println(map.lowerKey('B'));
        System.out.println(map.ceilingKey('D'));
        System.out.println(map.higherKey('A'));
        
        System.out.println(map.pollFirstEntry());
        
        System.out.println(map.descendingMap());
    }

}
