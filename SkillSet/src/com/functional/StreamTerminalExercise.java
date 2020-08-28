package com.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalExercise {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));

        List<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(12);
        numbers.add(34);
        numbers.add(53);

        //prints optional
        System.out.println(numbers.stream().max((n1, n2) -> Integer.compare(n1, n2)));

        System.out.println(numbers.stream().max((n1, n2) -> Integer.compare(n1, n2)).get());

        System.out.println(numbers.stream().min((n1, n2) -> Integer.compare(n1, n2)).get());

        //Functional Interfaces are responsible for doing most of the logic (operations)

        //For Each prints only each element - to have list returned use .collect function
        //Collect to List
        System.out.println(numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList()));

        System.out.println(numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList()));

        //When using Map --> IntPipeline for IntStream
        System.out.println(IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList()));
    }
}
