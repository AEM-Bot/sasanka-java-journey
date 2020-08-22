package com.company;

public class MyChar {

    private char c;

    public MyChar(char c) {
        this.c = c;
    }

    public static void printLowerCaseAlphabets() {
//        for (int i = 97; i <= 122; i++) {
//            System.out.print((char) i + "\t");
//        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }
    }

    public static void printUpperCaseAlphabets() {
//        for (int i = 65; i <= 90; i++) {
//            System.out.print((char) i + "\t");
//        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }

    public boolean isVowel() {
        if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U')
            return true;
        return false;
    }

    public boolean isNumber() {
        if (Character.isDigit(c))
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if (Character.isLetter(c))
            return true;
        return false;
    }

//    public void printLowerCaseAlphabets() {
//        if (isAlphabet())
//            System.out.println("Lower Case Alphabet " + Character.toLowerCase(c));
//        else System.out.println("Not an Alphabet");
//
//    }
//
//    public void printUpperCaseAlphabets() {
//        if (isAlphabet())
//            System.out.println("Upper Case Alphabet " + Character.toUpperCase(c));
//        else System.out.println("Not an Alphabet");
//    }

    public boolean isConsonant() {
        if (!isVowel() && isAlphabet())
            return true;
        return false;
    }

    public char getC() {
        return c;
    }
}
