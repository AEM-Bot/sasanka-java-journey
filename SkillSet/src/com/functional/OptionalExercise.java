package com.functional;

import java.util.ArrayList;
import java.util.List;

/*
    Optional is helpful to remove null pointer exception
 */
public class OptionalExercise {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(45);
        numbers.add(67);

        //no null return --> instead gives empty
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2)));

        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2)));
    }


}
