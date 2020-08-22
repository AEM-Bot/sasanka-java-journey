package com.company;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(65);
        numbers.add(54);
        numbers.add(34);
        numbers.add(12);
        numbers.add(99);

        System.out.println(numbers);

        //less than
        System.out.println(numbers.floor(40));

        System.out.println(numbers.lower(34));

        System.out.println(numbers.higher(34));

        System.out.println(numbers.ceiling(34));

        //left inclusive right exclusive
        System.out.println(numbers.subSet(20, 80));



    }
}
