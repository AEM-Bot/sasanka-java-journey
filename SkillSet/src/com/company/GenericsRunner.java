package com.company;

import java.util.List;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();

        list.addElement("Element1");
        list.addElement("Element2");
        System.out.println(list);
        String value = list.get(0);
        System.out.println(value);
        MyCustomList<Integer> list2 = new MyCustomList<>();

        //throws error because only accepted Strings --Without Generics Implemented
        //for Custom Classes
//        list2.addElement(Integer.valueOf(5));
//        list2.addElement(Integer.valueOf(3));

        list2.addElement(5);
        list2.addElement(10);
        Integer number = list2.get(0);
        System.out.println(list2);
        System.out.println(number);
    }
}
