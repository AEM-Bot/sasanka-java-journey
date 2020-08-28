package com.functional;

import java.util.ArrayList;
import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(13);
        numbers.add(3);
        numbers.add(15);

        numberSum(numbers);
        System.out.println("=======");

        oddNumbers(numbers);

        System.out.println("========");

        numberOddSum(numbers);
    }

    /*
        using functional programming we avoid mutation of variables
        ex: int sum=0, sum+=number etc logic wont be in functional programming
        We define What to do --> It automatically knows how to do
     */
    private static void numberSum(List<Integer> integerList) {
        int sum = integerList.stream().reduce(
                0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
    }

    private static void numberOddSum(List<Integer> integerList) {
        int sum = integerList.stream()
                .filter(action -> action % 2 != 0)
                .reduce(
                        0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
    }

    private static void oddNumbers(List<Integer> integerList) {
        integerList.stream().
                filter(action -> action % 2 != 0).
                forEach(action -> System.out.println(action));
    }
}
