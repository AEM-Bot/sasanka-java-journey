package com.company;

public class Book {

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    void artOfComputerProgramming() {
        System.out.println("Art Of Computer Programming");
    }

    void effectiveJava() {
        System.out.println("Effective Java");
    }

    void cleanCode() {
        System.out.println("Clean Code");
    }

    public void increaseNoOfCopies(int increaseCopies) {
        //this.noOfCopies = this.noOfCopies + increaseCopies;
        setNoOfCopies(this.noOfCopies + increaseCopies);
    }

    public void decreaseNoOfCopies(int decreaseCopies) {
        //this.noOfCopies = this.noOfCopies - decreaseCopies;
        setNoOfCopies(this.noOfCopies - decreaseCopies);
    }
}

