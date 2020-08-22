package com.company;

public class BookRunner {

    public static void main(String[] args) {
        Book artOfProgram = new Book(100);
        Book effectiveJava = new Book(200);
        Book cleanCode = new Book(300);

        artOfProgram.artOfComputerProgramming();
        effectiveJava.effectiveJava();
        cleanCode.cleanCode();

       // artOfProgram.setNoOfCopies(100);
        artOfProgram.increaseNoOfCopies(20);
        artOfProgram.decreaseNoOfCopies(10);
        System.out.println("Art of Program Copies: " + artOfProgram.getNoOfCopies());
        effectiveJava.setNoOfCopies(200);
        effectiveJava.increaseNoOfCopies(50);
        System.out.println("Effective Java Copies: " + effectiveJava.getNoOfCopies());
        cleanCode.setNoOfCopies(300);
        cleanCode.increaseNoOfCopies(70);
        System.out.println("Clean code Copies: " + cleanCode.getNoOfCopies());
    }
}
