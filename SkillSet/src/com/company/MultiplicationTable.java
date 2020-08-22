package com.company;

public class MultiplicationTable {
    void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }

    void print(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", number, i, number * i).println();
        }
    }
}
