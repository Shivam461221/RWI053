
package com.mycompany.collection.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();//hashmap does not remembers the order of element
        map.put("Shivam", 50);
        map.put("Kuldeep",60);
        map.put("Prince",40);
        
        Set<String> keySet = map.keySet();
        
        System.out.println("Keys : "+keySet);
        
        Collection<Integer> values = map.values();
        System.out.println("Values "+values);
        System.out.println("-------------------------------");
        for (String key : keySet) {
            System.out.println("Key: "+key+" value: "+map.get(key));
        }
        System.out.println("-------------------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key : "+key+", value : "+value);
        }
    }
}
