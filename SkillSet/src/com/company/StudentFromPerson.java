package com.company;

public class StudentFromPerson extends PersonNew {

    public StudentFromPerson(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    private String collegeName;

    private int year;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
