package com.company;

import java.util.ArrayList;

public class BookNew {

    private int id;
    private String name;
    private String author;

    private ArrayList<Review> review = new ArrayList<Review>();

    public BookNew(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.review.add(review);

    }

    @Override
    public String toString() {
        return "BookNew{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
