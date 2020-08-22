package com.company;

import java.util.Arrays;

public class StringArrayRunner {

    public static void main(String[] args) {

        StringArray stringArray = new StringArray();

        System.out.println(stringArray.longestString());

        System.out.println(Arrays.toString(stringArray.weekBackwards()));
    }
}
