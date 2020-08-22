package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class StudentRunner {

    public static void main(String[] args) {

        //  Student student = new Student("sasanka", new int[]{100, 95, 99, 100});
        Student student = new Student("Sasanka", 100, 95, 99, 100);

        //variable arguments --should be the last parameter/argument

        // Student student1 = new Student("test",90,100,90); //--variable arguments


        int numer = student.getNumberOfMarks();
        System.out.println(numer);

        int sum = student.getTotalSumOfMarks();
        System.out.println(sum);

        int maximumMark = student.getMaximumMark();
        System.out.println(maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println(minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println(average);


        System.out.println(student);
        student.addNewMark(35);


        //Limitations of Array::
        //deleting and adding elements in array is too difficult and complex
        //this is resolved with ArratList

        //student.reomveMark(45);

        student.print(1, 2, 3); //Variable arguments example
        student.print(1, 2);

        //Diamond --> Generics decides which goes into the Arraylist
        //<> Types --> Int String Etc...
        //ArrayList is part of Collections class
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Apple");
        arrayList.add("Ball");
        arrayList.add("Hello");
        System.out.println(arrayList);

        arrayList.remove("Hello");

        System.out.println(arrayList);

        System.out.println(student);

        student.removeMark(3);

        System.out.println(student);

    }
}
