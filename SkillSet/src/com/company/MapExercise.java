package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before";

        Map<Character, Integer> occurences = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char character : characters) {
            Integer integer = occurences.get(character);
            if (integer == null) {
                occurences.put(character, 1);
            } else {
                occurences.put(character, integer + 1);
            }
        }
        System.out.println(occurences);

        //Occurences of String
        Map<String, Integer> stringOccurences = new HashMap<>();

//        String dotsRemovedString = str.replace(".", "");
//
//        String[] words = dotsRemovedString.split(" ");

        String[] words = str.replace(".", "").split(" ");
        for (String word : words) {
            Integer integer = stringOccurences.get(word);
            if (integer == null) {
                stringOccurences.put(word, 1);
            } else {
                stringOccurences.put(word, integer + 1);
            }
        }
        System.out.println(stringOccurences);
    }
}
