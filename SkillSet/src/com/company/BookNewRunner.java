package com.company;

public class BookNewRunner {
    public static void main(String[] args) {

        BookNew bookNew = new BookNew(123, "OOPS", "Sasanka");

        System.out.println(bookNew);

        bookNew.addReview(
                new Review(10, "Great Book", 5));

       // System.out.println(bookNew);

        bookNew.addReview(new Review(101,"Awesome",5));

        System.out.println(bookNew);
    }
}
