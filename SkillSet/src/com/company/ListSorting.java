package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(123);
        numbers.add(12);
        numbers.add(3);
        numbers.add(45);

        System.out.println(numbers);

        //Popular way of sorting
        Collections.sort(numbers);
        System.out.println(numbers);



    }
}
