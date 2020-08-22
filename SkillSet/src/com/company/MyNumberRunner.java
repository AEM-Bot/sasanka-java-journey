package com.company;

public class MyNumberRunner {
    public static void main(String[] args) {

        MyNumber number = new MyNumber(5);

        System.out.println(number.isPrime());

        int sum = number.sumUptoN();

        int sumOfDivisors = number.sumOfDivisors();

        number.printANumberTriangle();

//        for (int i=1; i <=5; i++){
//            for (int j =1; j <=i; j++)
//            System.out.print(j + "\t");
//            System.out.println();
//        }
    }
}
