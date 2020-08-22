package com.company;

//primitive data types
public class BiNumber {

    //exact accuracy must use BigDecimal --> never use double or float

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    private int number1;
    private int number2;

    public int add() {
        return number1 + number2;
    }

    public int multiply(){
        return number1 * number2;
    }
//    public void doubleNumbers(){
//        double double1 = (double)number1;
//        double double2 = (double)number2;
//        System.out.println("number 1 Doubled is : " + double1);
//        System.out.println("Number 2 Doubled is : " + double2);
//    }
    public void doubleNumbers(){
       number1 = number1*2;
       number2 = number2*2;
//        System.out.println(number1);
//        System.out.println(number2);
    }
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
