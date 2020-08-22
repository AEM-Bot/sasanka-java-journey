package com.company;

import java.math.BigDecimal;

public class BiNumberRunner {
    public static void main(String[] args) {
//        int eight = 010;
//        System.out.println(eight);
//        int sixteen = 0x10;
//        System.out.println(sixteen);

        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doubleNumbers();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

        //BigDecimal is immutable (Class in Java)--> only assign value once and cannot be changed
        //use string as paramter for accurate values --> constructor always use string
        BigDecimal numberBig = new BigDecimal("34.5678");
        BigDecimal numberBig2 = new BigDecimal("34.222");
        System.out.println(numberBig.add(numberBig2));

        BigDecimal number = new BigDecimal("11.5");
        BigDecimal number2 = new BigDecimal("23.555");
        System.out.println(number.add(number2));
        int i =5;
        System.out.println(number.add(new BigDecimal(i)));

    }
}
