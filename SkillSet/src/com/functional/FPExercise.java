package com.functional;

import java.util.ArrayList;
import java.util.List;

public class FPExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printOddNumbers(list);
        System.out.println("==============");
        printEvenNumbers(list);

    }

    private static void printOddNumbers(List<Integer> list) {
        list.stream().filter(action -> action % 2 != 0)
                .forEach(action -> System.out.println(action));
    }

    private static void printEvenNumbers(List<Integer> list) {
        list.stream().filter(action -> action % 2 == 0)
                .forEach(action -> System.out.println(action));
    }
}
