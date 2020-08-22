package com.company;

import java.math.BigDecimal;

public class SimpleInterestRunner {
    public static void main(String[] args) {

        SimpleInterestCalculator calculator =
                new SimpleInterestCalculator("4500", "7.5");

        BigDecimal totalValue = calculator.calculateTotalValue(5);

        String myTestString = calculator.getMyString("sasanka");

        System.out.println(totalValue);

        SimpleInterestCalculator calculator1 =
                new SimpleInterestCalculator("4500", "7.5");

        BigDecimal totalValue2 = calculator1.calculateTotalValue(5);

        System.out.println(totalValue2);
    }
}
