package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("A",3);
        map.put("B",5);
        map.put("C",10);

        System.out.println(map);

//        System.out.println(map.get("C"));
//
//        System.out.println(map.size());
//        System.out.println(map.containsKey("A"));
//
//        System.out.println(map.keySet());

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("F",25);
        linkedHashMap.put("A",15);
        linkedHashMap.put("Z",100);

        System.out.println(linkedHashMap);

        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("F",25);
        treeMap.put("A",15);
        treeMap.put("Z",100);

        System.out.println(treeMap);

    }
}
