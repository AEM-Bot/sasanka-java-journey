package com.company;

public class MyNumber {

    private int myNumber;

    public MyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= myNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;

    }

    public int sumOfDivisors() {
        int sumDivisor = 0;
        for (int i = 2; i < myNumber; i++) {
            if (myNumber % i == 0) {
                sumDivisor += i;
            }
        }
        System.out.println(sumDivisor);
        return sumDivisor;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= myNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();

        }
    }

    public boolean isPrime() {
//        if ((myNumber == 2) || (myNumber == 3) ||
//                !((myNumber % 2 == 0) || (myNumber % 3 == 0))) {
//            System.out.println("true");
//            return true;
//        } else {
//            System.out.println("false");
//            return false;
//        }
        //simplified version to above --> Enterprise Level
        for (int i = 2; i <= myNumber - 1; i++) {

            if (myNumber < 2) { //guard condition
                return false;
            }
            if (myNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
