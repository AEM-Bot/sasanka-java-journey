package com.functional;

import java.util.ArrayList;
import java.util.List;

public class MethodsReferencesRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static boolean evenNumbers(Integer number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(Integer number1, Integer number2) {
        return Integer.compare(number1, number2);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ant");
        list.add("Bat");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(12);
        numbers.add(34);
        numbers.add(53);

        //using lambdas
        list.stream()
                .map(s -> s.length())
                .forEach(e -> System.out.println(e));

        //method reference --> sout here
        list.stream()
                .map(s -> s.length())
                .forEach(System.out::println);

        //using custom implementation of method
        list.stream()
                .map(String::length)
                .forEach(MethodsReferencesRunner::print);

        System.out.println(numbers
                .stream()
                .filter(MethodsReferencesRunner::evenNumbers)
                .max(MethodsReferencesRunner::compareNumbers)
                .orElse(0));

        System.out.println(numbers
                .stream()
                .filter(MethodsReferencesRunner::evenNumbers)
                .max(Integer::compare)
                .orElse(0));
    }
}
