package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {

    private String name;

    //private int[] listOfMarks;

    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    //
//    public Student(String name, int[] listOfMarks) {
//        this.name = name;
//        this.listOfMarks = listOfMarks;
//    }
    public Student(String name, int... listOfMarks) {
        this.name = name;
        // this.listOfMarks = listOfMarks;
        for (int mark : listOfMarks) {
            this.listOfMarks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : listOfMarks) {
            sum += mark;
        }
        return sum;
    }


    public int getMaximumMark() {
//        Arrays.sort(listOfMarks);
//        return listOfMarks[listOfMarks.size() - 1];
//        int maximumMark = 0;
//        for (int mark : listOfMarks) {
//            if (mark > maximumMark) {
//                maximumMark = mark;
//            }
//        }
//        return maximumMark;
        return Collections.max(listOfMarks);
    }

    public int getMinimumMark() {
        // Arrays.sort(listOfMarks);
        //return listOfMarks[0];
//        int minimumMark = Integer.MAX_VALUE;
//        for (int mark : listOfMarks) {
//            if (mark < minimumMark) {
//                minimumMark = mark;
//            }
//        }
        return Collections.min(listOfMarks);
    }

    public BigDecimal getAverageMarks() {
        BigDecimal average;
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public void print(int... values) {
        System.out.println(Arrays.toString(values));
    }

    public void addNewMark(int mark) {
        listOfMarks.add(mark);

    }

    public void removeMark(int index) {
        listOfMarks.remove(index);

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", listOfMarks=" + listOfMarks +
                '}';
    }
}
