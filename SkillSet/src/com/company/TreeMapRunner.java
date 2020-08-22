package com.company;

import java.util.TreeMap;

public class TreeMapRunner {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("F",25);
        treeMap.put("Z",5);
        treeMap.put("A",10);

        System.out.println(treeMap);

        System.out.println(treeMap.higherKey("A"));

        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.lastEntry());

    }
}
