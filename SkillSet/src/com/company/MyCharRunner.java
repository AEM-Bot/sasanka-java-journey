package com.company;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('b');
        System.out.println("Vowel Condition " + "Given Character is :" + myChar.getC() + myChar.isVowel());
        System.out.println("Consonant Condition " + "Given Character is :" + myChar.getC() + myChar.isConsonant());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
//        myChar.printLowerCaseAlphabets();
//        myChar.printUpperCaseAlphabets();
        MyChar.printLowerCaseAlphabets(); //static methods dont need an object
        System.out.println();
        MyChar.printUpperCaseAlphabets(); //static methods dont need an object

    }
}
