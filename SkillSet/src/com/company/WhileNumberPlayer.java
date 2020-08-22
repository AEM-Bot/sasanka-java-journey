package com.company;

public class WhileNumberPlayer {
    private int number;

    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        while (i * i <= number) {
            System.out.print(i * i + "\t");
            i++;
        }
        System.out.println();

    }

    public void printCubesUptoLimit() {
        int i = 1;
        while (i * i * i <= number) {
            System.out.print(i * i * i + "\t");
            i++;
        }

    }
}
