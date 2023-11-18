package com.example.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Four");

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Entry<Integer, String>> entries = map.entrySet();
        for (Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}