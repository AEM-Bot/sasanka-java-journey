package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {

    public static void main(String[] args) {

        //JDK 9 onwards below syntax
        //Set<String> set = Set.of("Apple", "Banana","Car");

        Set<String> hashSet = new HashSet<>();

        /*
            automatically removes Duplicate and the order will be different --Even
            apple ball car are added in the order
            so position is not important in set
         */

        hashSet.add("Apple");
        hashSet.add("Ball");
        hashSet.add("Car");
        hashSet.add("Car");

        System.out.println(hashSet);

        Set<Integer> numbers = new HashSet<>();

        numbers.add(123456);
        numbers.add(12345);
        numbers.add(1234);
        numbers.add(123);

        System.out.println(numbers);


        //Linked HashSet stores numbers in the insertion order
        Set<Integer> linkedNumbers = new LinkedHashSet<>();
        linkedNumbers.add(123456);
        linkedNumbers.add(12345);
        linkedNumbers.add(1234);
        linkedNumbers.add(123);

        System.out.println(linkedNumbers);


        //Treeset stores in sorted order
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(123456);
        treeSet.add(12345);
        treeSet.add(1234);
        treeSet.add(123);

        System.out.println(treeSet);




    }
}
