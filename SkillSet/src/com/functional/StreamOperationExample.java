package com.functional;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(8);
        integers.add(213);
        integers.add(45);
        integers.add(4);
        integers.add(7);

        System.out.println(integers);

        integers.stream().sorted().forEach(action -> System.out.println(action));

        integers.stream().distinct().map(e -> e*e).forEach(e-> System.out.println(e));
    }
}
