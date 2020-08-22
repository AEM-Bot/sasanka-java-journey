package com.company;

public class WrapperRunner {
    public static void main(String[] args) {
        //Wrapper classes are final and immutable
        //int --> Integer class (wrapper class)
        //boolean --> Boolean class (wrapper class)
        Integer integer = new Integer(5); //should not be used in real time beacuse of memory leaks

        System.out.println(integer);

        Integer integer1 = Integer.valueOf(5);
        System.out.println(integer1);

        Integer integer2 = Integer.valueOf("1234"); //should be used in real tine
        System.out.println(integer2);




    }
}
