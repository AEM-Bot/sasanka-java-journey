package com.functional;

import java.util.ArrayList;
import java.util.List;

/*
    Functional Programming are first class citizens
 */
public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bat");
        list.add("Cat");
        list.add("Dog");

        printBasic(list);
        System.out.println("======================");

        printWithFP(list);
        System.out.println("========================");

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        printNumbersWithFP(numberList);

        System.out.println("=====================");

        printNumbersIncrementWithFP(numberList);

        System.out.println("==================");

        printBasicWithFilter(list);

        System.out.println("============");

        printBasicWithFilerUsingFP(list);
    }

    private static void printBasic(List<String> list) {
        for (String listItems : list) {
            System.out.println(listItems);
        }
    }

    private static void printWithFP(List<String> list) {
        //What is stream --> It makes stream of values
        //Below is an example of lambda function
        list.stream().forEach
                (element -> System.out.println(element));
    }

    private static void printNumbersWithFP(List<Integer> integerList) {
        integerList.stream().forEach(action -> System.out.println(action));
    }

    private static void printNumbersIncrementWithFP(List<Integer> integerList) {
        integerList.stream().forEach(action -> System.out.println(action + 1));
    }

    //Without Functional Programming
    private static void printBasicWithFilter(List<String> list) {
        for (String listItems : list) {
            if (listItems.endsWith("at")) {
                System.out.println(listItems);
            }
        }
    }

    /*
        with functional programming --> We dont loop over the elements
        what should be done with each element
     */
    private static void printBasicWithFilerUsingFP(List<String> list) {
        list.stream().filter(action -> action.endsWith("at"))
                .forEach(
                        action -> System.out.println(action)
                );
    }
}
