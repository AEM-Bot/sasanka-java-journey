package com.company;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        //same data type for multiple values
//        int[] marks = {50, 60, 70};
//        int sum = 0;
//        for (int mark : marks) {
//            System.out.println(mark);
//            sum = sum + mark;
//        }
//        System.out.println(sum);
//
//        System.out.println(marks[0]);
//
//        int[] marks2 = new int[5];
//        //adding manually elements values inside array
//        marks2[0] = 1;
//
//        System.out.println(marks.length);

        //create marks array with 8 elements
        //loop through and print elements in the order

        int[] marks = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //foreach loop is enhanced for loop
        for (int mark : marks) {
            System.out.println(mark);
        }

        //Person[] persons = new Person[5]; //person object
        System.out.println(Arrays.toString(marks));


        Arrays.fill(marks, 100);
        System.out.println(Arrays.toString(marks));

        int[] array1= {1,2,3};
        int[] array2 = {1,2,3};

        System.out.println(Arrays.equals(array1,array2));

    }
}
