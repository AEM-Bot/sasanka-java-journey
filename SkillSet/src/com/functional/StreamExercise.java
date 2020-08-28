package com.functional;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExercise {
    public static void main(String[] args) {
       // List<Integer> numbers = new ArrayList<Integer>();
        IntStream.range(1,11).map(e->e*e).forEach(e-> System.out.println(e));

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Ant");
        list.add("Bat");

        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.println(e));

        System.out.println("===================");

        list.stream().map(e->e.toUpperCase()).forEach(e-> System.out.println(e));

        System.out.println("============");

        list.stream().forEach(e-> System.out.println(e + " " + e.length()));

        list.stream().map(e->e.length()).forEach(e-> System.out.println(e));
    }
}
