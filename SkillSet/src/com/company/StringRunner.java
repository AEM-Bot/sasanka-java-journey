package com.company;

public class StringRunner {
    public static void main(String[] args) {
        /*
            String is a Special Class in Java
            No need to declare new String () etc..
            Inbuild methods like length(), charAt(int index),
            toUpperCase, subString(), toLowerCase() .....
         */
        String str = "Test"; //str is an object --> Reference Type
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));

        String sampleString = "This is Sample String";
        System.out.println(sampleString.length());
        System.out.println(sampleString.substring(5));
        System.out.println(sampleString.substring(5, 21)); //if index is out of range exception will throw
        System.out.println(sampleString.substring(5, sampleString.length()));

        String someString = "This is a lot of text again. ";
        for (int i = 0; i < someString.length(); i++) {
            System.out.println(someString.charAt(i));
        }
        System.out.println(someString.indexOf("lot"));
        System.out.println(someString.indexOf('l'));
        System.out.println(someString.lastIndexOf('l'));

        if (someString.contains("again")){
            System.out.println("Yes");
        }
         if (someString.startsWith("This")){
            System.out.println("Yes");
        }

        System.out.println(someString.endsWith("again"));

        System.out.println(someString.isEmpty());

        System.out.println(someString.equals(sampleString));

        System.out.println(someString.toUpperCase());

        String immutableString = "Sasanka"; //this is always same. once instance is assigned then it will be stored at same memory
        System.out.println(immutableString.concat(" is awesome developer"));


        System.out.println(someString);
        System.out.println(someString.trim());

        System.out.println(String.join(",","A","B"));

        System.out.println("abcd".replace('a','z'));

        //String Buffer and String Builder --> because String is immutable
        StringBuffer sb = new StringBuffer("Test");
        //StringBuffer is mutable so can change value --> synchronous multi threading -thread safe
        sb.append(123);
        System.out.println(sb);

        //Single threads -- mostly same as stringbuffer
        StringBuilder stringBuilder = new StringBuilder("Test");
        System.out.println(stringBuilder.append("hello"));
        System.out.println(stringBuilder);


    }
}
