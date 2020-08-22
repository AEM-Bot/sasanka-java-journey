package com.company;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

//    private String principal;
//
//    private String interest;
//
//    public SimpleInterestCalculator(String principal, String interest) {
//        this.principal = principal;
//        this.interest = interest;
//    }
//    public BigDecimal calculateTotalValue(int noOfYears){
//
//        return (new BigDecimal(principal).
//                add(new BigDecimal(principal).
//                        multiply(new BigDecimal(interest).
//                                multiply(new BigDecimal(noOfYears)))));
//    } --> my basic solution

    BigDecimal principal;
    BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));//convert to percentage as interest is 7.5%
    }
    //principal = 10000
    //interest = 10.5/100

    public BigDecimal calculateTotalValue(int noOfYears) {

        return (principal.
                add(principal.
                        multiply(interest).multiply(new BigDecimal(noOfYears))
                ));
    }
    public String getMyString(String name){
        System.out.println("Your Name is :" + name);
        return name;

    }

}
