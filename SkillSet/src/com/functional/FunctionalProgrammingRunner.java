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
        list.add("Banana");
        list.add("Cat");
        list.add("Dog");

        printBasic(list);
        System.out.println("======================");
        printWithFP(list);
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
}
